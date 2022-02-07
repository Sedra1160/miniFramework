
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
					<li data-username="dashboard Default Ecommerce CRM Analytics Crypto Project" class="nav-item active">
						<a href="#" class="nav-link "><span class="pcoded-micon"><i class="feather icon-home"></i></span><span class="pcoded-mtext">Gestion Contenu</span></a>
					</li>
					<li class="nav-item">
						<a href="listeAdmin" class="nav-link"><span class="pcoded-micon"><i class="feather icon-file-text"></i></span><span class="pcoded-mtext">Liste</span></a>
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
						<div class="pcoded-main-container">
							<div class="pcoded-wrapper">
								<div class="pcoded-content">
									<div class="pcoded-inner-content">
										<div class="main-body">
											<div class="page-wrapper">
												<div class="row">
													<div class="col-xl-12 col-md-12 col-sm-auto m-b-30">
														<ul class="nav nav-tabs" id="myTab" role="tablist">
															<li class="nav-item">
																<a class="nav-link active show" id="pv-tab" data-toggle="tab" href="#pv" role="tab" aria-controls="home" aria-selected="false">PV</a>
															</li>
															<li class="nav-item">
																<a class="nav-link" id="note-tab" data-toggle="tab" href="#noteinterne" role="tab" aria-controls="profile" aria-selected="true">Note Interne</a>
															</li>
															<li class="nav-item">
																<a class="nav-link" id="evenement-tab" data-toggle="tab" href="#evenement" role="tab" aria-controls="contact" aria-selected="false">Evenement</a>
															</li>
															<li class="nav-item">
																<a class="nav-link" id="rapport-tab" data-toggle="tab" href="#rapport" role="tab" aria-controls="contact" aria-selected="false">Rapport de Mission</a>
															</li>
														</ul>
														<div class="tab-content" id="myTabContent">
															<div class="tab-pane fade active show" id="pv" role="tabpanel" aria-labelledby="pv-tab">
																<form method="POST" action="ajoutPv" enctype="multipart/form-data">
																	<div class="form-group">
																	  <label for="Contenu">Contenu</label>
																	  <textarea class="form-control" id="Contenu" rows="3" placeholder="Le contenu du pv" name="Pv.Contenu"></textarea>
																	</div>
																	<div class="form-group">
																		<label for="Fichier">Fichier</label>
																		<div class="custom-file">
																			<input type="file" class="custom-file-input" id="customFile" name="Pv.PathFichier">
																			<label class="custom-file-label" for="customFile">Choisir un fichier</label>
																		</div>
																	</div>
																	<button class="btn btn-primary mt-3" type="submit">Ajouter</button>
																</form>
															</div>
															<div class="tab-pane fade" id="noteinterne" role="tabpanel" aria-labelledby="note-tab">
																<form method="POST" action="ajoutNote">
																	<div class="form-group">
																		<label for="Contenu">Contenu</label>
																		<textarea class="form-control" id="Contenu" rows="3" placeholder="Le contenu de la note interne" name="NoteInterne.Contenu"></textarea>
																	</div>
																	<button class="btn btn-primary mt-3" type="submit">Ajouter</button>
																</form>
															</div>
															<div class="tab-pane fade" id="evenement" role="tabpanel" aria-labelledby="evenement-tab">
																<form method="POST" action="ajoutEvent" enctype="multipart/form-data">
																	<div class="form-group">
																	  <label for="Lieu">Lieu</label>
																	  <input type="text" class="form-control" placeholder="Lieu" name="Evenement.Lieu">
																	</div>
																	<div class="form-group">
																	  <label for="Description">Description</label>
																	  <textarea class="form-control" id="Description" rows="3" placeholder="La description de l'évènement" name="Evenement.Description"></textarea>
																	</div>
																	<div class="form-group">
																	  <label for="Lieu">Debut de l'évènement</label>
																	  <input type="date" class="form-control" name="Evenement.DateDebut">
																	</div>
																	<div class="form-group">
																	  <label for="Lieu">Fin de l'évènement</label>
																	  <input type="date" class="form-control" name="Evenement.DateFin">
																	</div>
																	<div class="form-group">
																		<label for="Fichier">Fichier ( pas requis )</label>
																		<div class="custom-file">
																			<input type="file" class="custom-file-input" id="customFile" name="Evenement.PathFichier">
																			<label class="custom-file-label" for="customFile">Choisir un fichier</label>
																		</div>
																	</div>
																	<button class="btn btn-primary mt-3" type="submit">Ajouter</button>
																</form>
															</div>
															<div class="tab-pane fade" id="rapport" role="tabpanel" aria-labelledby="rapport-tab">
																<form method="POST" action="ajoutMission">
																	<div class="form-group">
																	  <label for="Lieu">Lieu</label>
																	  <input type="text" class="form-control" placeholder="Lieu" name="Mission.Lieu">
																	</div>
																	<div class="form-group">
																		<label for="Contenu">Contenu</label>
																		<textarea class="form-control" id="Contenu" rows="3" placeholder="Le contenu du rapport de mission" name="Mission.Contenu"></textarea>
																	</div>
																	<button class="btn btn-primary mt-3" type="submit">Ajouter</button>
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
