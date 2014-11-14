
<!DOCTYPE html>
<html lang="en">
<style type="text/css">
@import
	url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,900|Oswald)

</style>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!--  <link rel="icon" href="../../favicon.ico"> -->

<title>Slatly</title>

<!-- Bootstrap core CSS -->
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">



<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resources/template/js/userConsole.js"></script>


<!-- Custom styles for this template -->
<link href="resources/template/css/navbar-fixed-top.css"
	rel="stylesheet">
<link href="resources/template/css/addon/font-awwsome-4_2_0.css"
	rel="stylesheet">
<link href="resources/template/css/addon/social-buttons-3.css"
	rel="stylesheet">
<link href="resources/template/css/userConsole.css" rel="stylesheet">
<link href="http://bootswatch.com/flatly/bootstrap.css" type="text/css">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!-- <script src="resources/bootstrap/js/ie-emulation-modes-warning.js"></script> -->



<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top " role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>

			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><span class="glyphicon glyphicon-th"></span>
							<span class="caret"></span> </a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">Profile</a></li>
							<li><a href="#">Settings</a></li>
							<li><a href="#">Help</a></li>
							<li class="divider"></li>
							<li><a href="j_spring_security_logout">Log Out</a></li>
						</ul></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<div class="container">

		<div class="row">


			<div id="left-content" class="col-xs-12 col-md-3">
				<div class="panel status panel-default">
					<div class="panel-heading panel-hight">
						<h1 class="panel-title text-center">
				
						</h1>
					</div>
					<div class="panel-body panel-hight">
						<!-- <span>Location</span> -->
						<div >
							<ul class="list-inline">
								<li><a href="#"><span class="glyphicon glyphicon-user"></span>
										2</a></li>

								<li><a href="#" data-placement="bottom"
									data-toggle="popover" data-title="Open your mind"
									data-container="body" type="button" data-html="true"> <span
										class="glyphicon glyphicon-plus"></span></a></li>
							</ul>
						</div>
					</div>
				</div>

				<div id="connect-with">
					<div id="facebook-connect"
						class="panel panel-default soft-background">
						<form>
							<div class="text-center padding">Dont be a stranger</div>
							<div class="text-center padding-bottom">
								<button type="button" class="btn btn-facebook btn-info">
									Connect with Facebook</button>
							</div>
						</form>
					</div>
				</div>
			</div>


			<div id="main-content" class="col-xs-12 col-md-6">
				<div id="post-msg-panel" class="panel panel-default post-background">
					<form id="formMsg" method="post"
						class="form-horizontal align-form-left" role="form">
						<label></label>
						<div class="center-form-section padding-bottom">
							<textarea id="msgContent" class="form-control" name="msgContent"
								rows="1" placeholder="Share somthing..."></textarea>
						</div>

						<div id="form-hide-section">
							<ul id="post-options" class="list-inline" >
								<li><a><span style="color:white;" class="glyphicon glyphicon-picture"></span>
										Photo</a></li>
								<li><a><span style="color:white;" class="glyphicon glyphicon-facetime-video"></span>
										Video</a></li>
								<li><a><span class="glyphicon glyphicon-list-alt"></span>
										Article</a></li>

							</ul>
							<ul class="list-inline" style="width: 100%;">
								<li><input id="postMsg"
									class="form-control btn btn-primary" type="submit" />
								<li>
							</ul>

							<div class="progress center-form-section">
								<div class="progress-bar" role="progressbar" aria-valuenow="60"
									aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>
							</div>
						</div>

					</form>
				</div>
				
				<!-- posts -->

				<div id="posts">
					<div id="single-post" class="panel panel-default soft-background post" style="min-height: 150px;">
						<div id=message-content></div>
						<p>
						<img style="float:left;margin:0 5px 0 0;" src="resources/images/avatars/avatar.jpeg" alt=""/>
						bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
						</p>
							

					</div>

				</div>





			</div>

			<div id="right-content" class="col-xs-12 col-md-3"></div>











			<!-- 			<div class="col-xs-6 col-md-3">

				<div class="panel status panel-default">
					<div class="panel-heading">
						<h1 class="panel-title text-center">
							<a href="#">25</a>
						</h1>
					</div>
					<div class="panel-body">
						<span>Location</span>
						<div class="pull-right">
							<ul class="list-inline">
								<li><a href="#"><span class="glyphicon glyphicon-user"></span>
										2</a></li>

								<li><a href="#" data-placement="bottom"
									data-toggle="popover" data-title="Open your mind"
									data-container="body" type="button" data-html="true"> <span
										class="glyphicon glyphicon-plus"></span></a></li>
							</ul>
						</div>
					</div>
				</div>

			</div>
			<div class="col-xs-6 col-md-3">

				<div class="panel status panel-default">
					<div class="panel-heading">
						<h1 class="panel-title text-center">
							<a href="#">17</a>
						</h1>
					</div>
					<div class="panel-body ">
						<span>Mood</span>
						<div class="pull-right">
							<ul class="list-inline">
								<li><a href="#"><span class="glyphicon glyphicon-user"></span>
										1</a></li>
								<li><a href="#" data-placement="bottom"
									data-toggle="popover" data-title="Open your mind"
									data-container="body" type="button" data-html="true"> <span
										class="glyphicon glyphicon-plus"></span></a></li>
							</ul>
						</div>
					</div>

				</div>

			</div>
			<div class="col-xs-6 col-md-3">

				<div class="panel status panel-default">
					<div class="panel-heading">
						<h1 class="panel-title text-center">
							<a href="#">2</a>
						</h1>
					</div>
					<div class="panel-body ">
						<span>Interests</span>
						<div class="pull-right">
							<ul class="list-inline">
								<li><a href="#"><span class="glyphicon glyphicon-user"></span>
										7</a></li>
								<li><a href="#" data-placement="bottom"
									data-toggle="popover" data-title="Open your mind"
									data-container="body" type="button" data-html="true"> <span
										class="glyphicon glyphicon-plus"></span></a></li>
							</ul>
						</div>
					</div>
				</div>


			</div>
			<div class="col-xs-6 col-md-3">

				<div class="panel status panel-default">
					<div class="panel-heading">
						<h1 class="panel-title text-center">
							<a href="#">18</a>
						</h1>
					</div>
					<div class="panel-body ">
						<span>Free Style</span>
						<div class="pull-right">
							<ul class="list-inline">
								<li><a href="#"><span class="glyphicon glyphicon-user"></span>
										12</a></li>
								<li><a href="#" data-placement="bottom"
									data-toggle="popover" data-title="Open your mind"
									data-container="body" type="button" data-html="true"> <span
										class="glyphicon glyphicon-plus"></span></a></li>
							</ul>
						</div>
					</div>
				</div>


			</div> -->

			<!-- 			<div id="popover-content" class="hide popover-max-with">
				<div class="pop-internal-content">
					<form id="formMsg" method="post" class="form-horizontal" role="form">
						<div class="form-group">
							<label></label> 
							<textarea class="form-control" name="msgContent" rows="8"
								placeholder="Share somthing..."></textarea>
						</div>

						<div class="form-group">
							<ul class="list-inline">
								<li><a><span class="glyphicon glyphicon-picture"></span>
										Photo</a></li>
								<li><a><span class="glyphicon glyphicon-facetime-video"></span>
										Video</a></li>
								<li><a><span class="glyphicon glyphicon-list-alt"></span>
										Article</a></li>

							</ul>
						</div>
						<div class="form-group">
							<ul id="popover-form-buttons" class="list-inline"
								style="width: 100%;">
								<li><input id="postMsg"
										class="form-control btn btn-primary" type="submit"/>
								<li>
								<li><button id="hidePopOver"
										class="form-control btn btn-default">Cancel</button>
										</li>
							</ul>
						</div>


					</form>


<div class="progress">
  <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
  </div>
</div>

				</div>
			</div> -->
		</div>

	</div>

	<hr>
</body>
</html>