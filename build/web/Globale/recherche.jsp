
<!DOCTYPE html>
<html lang="en">

<head>

	<title>Bienvenue</title>

	<!-- Meta -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="description" content="Flash Able Bootstrap admin template made using Bootstrap 4 and it has huge amount of ready made feature, UI components, pages which completely fulfills any dashboard needs." />
	<meta name="keywords"
		content="admin templates, bootstrap admin templates, bootstrap 4, dashboard, dashboard templets, sass admin templets, html admin templates, responsive, bootstrap admin templates free download,premium bootstrap admin templates, Flash Able, Flash Able bootstrap admin template">
	<meta name="author" content="Codedthemes" />

	<!-- Favicon icon -->
	<link rel="icon" href="../assets/images/favicon.ico" type="image/x-icon">
	<!-- fontawesome icon -->
	<link rel="stylesheet" href="../assets/fonts/fontawesome/css/fontawesome-all.min.css">
	<!-- animation css -->
	<link rel="stylesheet" href="../assets/plugins/animation/css/animate.min.css">

	<!-- vendor css -->
	<link rel="stylesheet" href="../assets/css/style.css">
</head>

<body class="">
	<!-- [ Pre-loader ] start -->
	<div class="loader-bg">
		<div class="loader-track">
			<div class="loader-fill"></div>
		</div>
	</div>
	<!-- [ Pre-loader ] End -->

	<!-- [ navigation menu ] start -->
	<nav class="pcoded-navbar menupos-fixed menu-light brand-blue ">
		<div class="navbar-wrapper ">
			<div class="navbar-brand header-logo">
				<a href="listeGlobale" class="b-brand">
					<img src="../assets/images/logo.svg" alt="" class="logo images">
					<img src="../assets/images/logo-icon.svg" alt="" class="logo-thumb images">
				</a>
				<a class="mobile-menu" id="mobile-collapse" href="#!"><span></span></a>
			</div>
			<div class="navbar-content scroll-div">
				<ul class="nav pcoded-inner-navbar">
					<li class="nav-item pcoded-menu-caption">
						<label>Navigation</label>
					</li>
					<li class="nav-item">
						<a href="listeGlobale" class="nav-link"><span class="pcoded-micon"><i class="feather icon-home"></i></span><span class="pcoded-mtext">Liste globale</span></a>
					</li>
					<li class="nav-item pcoded-menu-caption">
						<label>Liste</label>
					</li>
					<li class="nav-item pcoded-hasmenu">
						<a href="#!" class="nav-link"><span class="pcoded-micon"><i class="feather icon-box"></i></span><span class="pcoded-mtext">Liste</span></a>
						<ul class="pcoded-submenu">
							<li class=""><a href="listePv" class="">Pv</a></li>
							<li class=""><a href="listeMission" class="">Rapport de mission</a></li>
							<li class=""><a href="listeEvenement" class="">Evenement</a></li>
							<li class=""><a href="listeNote" class="">Note interne</a></li>
						</ul>
					</li>

					<li class="nav-item"><a href="deconnecter" class="nav-link"><span class="pcoded-micon"><i class="feather icon-power"></i></span><span class="pcoded-mtext">Deconnexion</span></a></li>
				</ul>
				
			</div>
		</div>
	</nav>
	<!-- [ navigation menu ] end -->
	
	<!-- [ Header ] start -->
	<header class="navbar pcoded-header navbar-expand-lg navbar-light headerpos-fixed">
		<div class="m-header">
			<a class="mobile-menu" id="mobile-collapse1" href="#!"><span></span></a>
			<a href="index.html" class="b-brand">
				<img src="../assets/images/logo.svg" alt="" class="logo images">
				<img src="../assets/images/logo-icon.svg" alt="" class="logo-thumb images">
			</a>
		</div>
		
		
	</header>
	<!-- [ Header ] end -->

	<!-- [ Main Content ] start -->
	<div class="pcoded-main-container">
        <div class="pcoded-wrapper">
            <div class="pcoded-content">
                <div class="pcoded-inner-content">
                    <div class="main-body">
						<div class="content-wrapper">
							<div class="row">            
							  <div class="col-lg-12 grid-margin stretch-card">
								<div class="card">
								  <div class="card-body">
									  <form class="pt-3" action="resultat" method="POST">
								  <div class="form-group">
									<input type="text" name = "Globale.Nom" class="form-control form-control-lg" id="exampleInputEmail1" placeholder="Type">
								  </div>
								  <div class="form-group">
									<input type="text" name = "Globale.Lieu" class="form-control form-control-lg" id="exampleInputPassword1" placeholder="Lieu">
								  </div>
								   <div class="form-group">
									<input type="text" name = "Globale.NomAdmin" class="form-control form-control-lg" id="exampleInputPassword1" placeholder="Auteur">
								  </div>
								  <div class="mt-3">
									 <button type="submit" class="btn btn-outline-primary">RECHERCHER</button>
								  </div>
								</form>
								  </div>
								</div>
							  </div>
							</div>
						  </div>
					</div>
				</div>
			</div>
		</div>
	</div>

						
	<!-- [ Main Content ] end -->



	<!-- Required Js -->
	<script src="../assets/js/vendor-all.min.js"></script>
	<script src="../assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script src="../assets/js/pcoded.min.js"></script>

</body>

</html>
