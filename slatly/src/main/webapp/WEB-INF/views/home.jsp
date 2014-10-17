
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!--  <link rel="icon" href="../../favicon.ico"> -->

<title>Fixed Top Navbar Example for Bootstrap</title>

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
				<a class="navbar-brand" href="#">Project name</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li>
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="email" class="form-control" placeholder="Email">
								<input type="password" class="form-control"
									placeholder="Password">
							</div>
							<button type="submit" class="btn btn-primary">Sign In</button>
						</form>
					</li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="text-center">
				<h1>Join the world's largest professional network.</h1>
			</div>

		</div>


		<div class="row">
			<div class="col-lg-6 ">
				<!-- Main component for a primary marketing message or call to action -->
				<div class="jumbotron">
					<h1>Navbar example</h1>
					<p>This example is a quick exercise to illustrate how the
						default, static and fixed to top navbar work. It includes the
						responsive CSS and HTML, so it also adapts to your viewport and
						device.</p>
					<p>To see the difference between static and fixed top navbars,
						just scroll.</p>
					<p>
						<a class="btn btn-lg btn-primary" href="../../components/#navbar"
							role="button">View navbar docs &raquo;</a>
					</p>
				</div>
			</div>

			<div class="col-lg-5 col-lg-push-1">

				<div>
					<h3>Start Now - It's Free.</h3>
					<h4>Registration takes less than 2 minutes.</h4>


				</div>

				<form role="form">
					<div class="form-group">
						<input type="email" class="form-control" placeholder="Email"
							id="exampleInputEmail1" />
					</div>
					<div class="form-group">
						<label></label> <input type="password" placeholder="Password"
							class="form-control" id="exampleInputPassword1" />
					</div>

					<button type="submit" class="btn btn-primary">Sign Up</button>
				</form>
				<hr>
				<button class="btn btn-facebook"><i class="fa fa-facebook"></i> | Connect with Facebook</button>
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