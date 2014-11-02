$(document).ready(function() {
	$('.progress-bar').hide();
	
	
	
	
	//	initialize popover
	$('[data-toggle=popover]').popover({
		html : true,
		content : function() {
			return $('#popover-content').html();
		},
	});

	//cancel a popover	  
	$('body').on('click', '#hidePopOver', function(e) {
		$('[data-toggle=popover]').popover('hide');
	});

	//	***** Post *****

	$('body').on('click', '#postMsg', function(e) {
		e.preventDefault();
		$('.progress-bar').show();
		 $('.progress-bar').css('width', 80+'%').attr('aria-valuenow', 80);    
		var msgCont = $('.popover [name="msgContent"]').val();
		var jData = JSON.stringify({"msgContent":msgCont});
		$.ajax({
			url : 'postMessgae',
			type : 'POST',
			contentType : "application/json",
			dataType : 'json',
			data : jData,
			success : function(m) {
				$('.progress-bar').css('width', 100+'%').attr('aria-valuenow', 100); 
			},
			error : function(request, status, error) {
				alert('error ' + request.responseText);
			},
		});
		
		return false; // keeps the page from not refreshing 

	});
});