
<!DOCTYPE html>
<html lang="en">
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

<!-- Custom styles for this template -->
<link href="resources/template/css/navbar-fixed-top.css"
	rel="stylesheet">
<link href="resources/template/css/addon/font-awwsome-4_2_0.css"
	rel="stylesheet">		
<link href="resources/template/css/addon/social-buttons-3.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="resources/bootstrap/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<span class="navbar-brand"><strong>SLAT.LY</strong></span>
			</div>

			<!--/.nav-collapse -->
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="text-center">

<div class="alert alert-info" role="alert">Wait, You will need to<strong> sign in</strong> first</div>
			</div>

		</div>


		<div class="row" style="margin-top: 50px;">
		
		
		<div class="col-md-4 col-md-push-4">
		<div class="jumbotron">
		<form  role="login" action="j_spring_security_check" method="post">
							<div class="form-group">
							<label></label>
								<input type="email" class="form-control" placeholder="Email" id="j_username" name="j_username">
								</div>
								<div class="form-group">
								<label></label>
								<input type="password" class="form-control" id="j_password" name="j_password" 
									placeholder="Password">
							</div>
							<button type="submit" class="btn btn-primary">Sign In</button>
							<a style="padding-left: 10px;">Ooops, forgot password!</a>
		</form>
		</div>
		</div>
		
		</div>


	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<!--     <script src="resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script> -->
</body>
</html>