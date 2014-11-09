$(document).ready(
		
		function() {
			
			
			
			$('.progress').hide();
			$('#form-hide-section').toggle();
			// initialize popover
			//			$('[data-toggle=popover]').popover({
			//				html : true,
			//				content : function() {
			//					return $('#popover-content').html();
			//				},
			//			});

			// cancel a popover
			//			$('body').on('click', '#hidePopOver', function(e) {
			//				$('[data-toggle=popover]').popover('hide');
			//			});

			// **** Text area Focus****
			$('#msgContent').focus(function() {
				if ($("#msgContent").val().length == 0) {
					$('#msgContent').attr('rows', '3');
					$('#form-hide-section').toggle();
					$('#postMsg').prop('disabled', true);
				}

			});

			$('#msgContent').focusout(function() {
				if ($("#msgContent").val().length == 0) {
					$('#msgContent').attr('rows', '1');
					$('#form-hide-section').toggle();
					$('#msgContent').val("");
					$('#postMsg').prop('disabled', true);
				}
			});
			
			$("#msgContent").on('change keyup paste', function() {
				if ($("#msgContent").val().length == 0) {
					$('#postMsg').prop('disabled', true);
				}else{
					$('#postMsg').prop('disabled', false);
				}
			});

			// ***** Post *****

			$('body').on(
					'click',
					'#postMsg',
					function(e) {
						e.preventDefault();
						$('.progress').show();
						$('.progress-bar').css('width', 80 + '%').attr(
								'aria-valuenow', 80);
						var msgCont = $('#msgContent').val();
						var jData = JSON.stringify({
							"msgContent" : msgCont
						});
						$.ajax({
							url : 'postMessgae',
							type : 'POST',
							contentType : "application/json",
							dataType : 'json',
							data : jData,
							success : function(m) {
								$('.progress-bar').css('width', 100 + '%')
										.attr('aria-valuenow', 100);

								setTimeout(function() {

									$('.progress-bar').css('width', 0 + '%')
											.attr('aria-valuenow', 0);
									$('.progress').hide();
									$('#msgContent').val("");
									$('#msgContent').attr('rows', '1');
									//									$('.popover').popover('hide');
									$('#form-hide-section').hide();
								}, 1000);
								$('#postMsg').prop('disabled', true);
							},
							error : function(request, status, error) {
								alert('error ' + request.responseText);
							},
						});

						return false; // keeps the page from not refreshing 

					});
		});