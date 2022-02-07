<%@page import="modele.Globale"%>
<%@page import="java.util.Vector"%>
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
                                        <li class="nav-item">
						<a href="recherche" class="nav-link"><span class="pcoded-micon"><i class="feather icon-home"></i></span><span class="pcoded-mtext">Recherche avancee</span></a>
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
						<%
						Vector<Globale> a = (Vector)request.getAttribute("liste");     
					 %>
				   <!-- partial -->
				   <div class="main-panel">
					 <div class="content-wrapper">
					   <div class="row">            
						 <div class="col-lg-12 grid-margin stretch-card">
						   <div class="card">
							 <div class="card-body">
							   <div class="table-responsive">
								 <% if(a.size()==0) { %>
									 <p>Aucun contenu.</p>
								 <% } else { %>
								 <table class="table table-striped">
								   <thead>
									 <tr>
									   <th>
										 Type
									   </th>
									   <th>
										 Date d`ecriture
									   </th>
									   <th>
										 Lieu
									   </th>
									   <th>
										 Auteur
									   </th>
									   <th>
										 Description
									   </th>
										<th>
										 Contenu
									   </th>
										<th>
										 Date de Debut
									   </th>
										<th>
										 Date Fin
									   </th>
									   <th>
										 Fichier si existe
									   </th>
									 </tr>
								   </thead>
								   
								   <tbody>
									 <% for(int i=0;i<a.size();i++){%>   
									 <tr>
									   
									   <td>
										 <%if(a.get(i).getNom()!=null){ %>
										 <%= a.get(i).getNom() %>
										 <% } %>
										 <%if(a.get(i).getNom()==null)
										 {
										 out.print("     "); 
										 }
										 %>
										 
									   </td>
				  
									   <td>
										   <%if(a.get(i).getDateEcrit()!=null){ %>
										 <%= a.get(i).getDateEcrit() %>
										 <% } %>
										 <%if(a.get(i).getDateEcrit()==null)
										 {
										 out.print("   "); 
										 }
										 %>
									   </td>
									   <td>
										   <%if(a.get(i).getLieu()!=null){ %>
										 <%= a.get(i).getLieu() %>
										 <% } %>
										 <%if(a.get(i).getLieu()==null)
										 {
										 out.print("     "); 
										 }
										 %>
									   </td>
									   <td>
										 
										 <%if(a.get(i).getNomAdmin()!=null){ %>
										 <%= a.get(i).getNomAdmin() %>
										 <% } %>
										 <%if(a.get(i).getNomAdmin()==null)
										 {
										 out.print("    "); 
										 }
										 %>
									   </td>
									   <td>
										 
										  <%if(a.get(i).getDescription()!=null){ %>
										 <%= a.get(i).getDescription() %>
										 <% } %>
										 <%if(a.get(i).getDescription()==null)
										 {
										 out.print("   "); 
										 }
										 %>
									   </td>
									   <td>
										 
										  <%if(a.get(i).getContenu()!=null){ %>
										 <%= a.get(i).getContenu() %>
										 <% } %>
										 <%if(a.get(i).getContenu()==null)
										 {
										 out.print("     "); 
										 }
										 %>
									   </td>
									   <td>
										 
										 <%if(a.get(i).getDateDebut()!=null){ %>
										 <%= a.get(i).getDateDebut() %>
										 <% } %>
										 <%if(a.get(i).getDateDebut()==null)
										 {
										 out.print("  "); 
										 }
										 %>
										 
									   </td>
									   <td>
										 <%if(a.get(i).getDateFin()!=null){ %>
										 <%= a.get(i).getDateFin() %>
										 <% } %>
										 <%if(a.get(i).getDateFin()==null)
										 {
										 out.print("   "); 
										 }
										 %>
										 
									   </td>
									   <td>
										   <%if(a.get(i).getPathFichier()!=null){ %>
								   <a href="Download?fichier=<%=a.get(i).getPathFichier()%>">
										 <%= a.get(i).getPathFichier() %>
								   </a>
								   <% } %>
										 <%if(a.get(i).getPathFichier()==null)
										 {
										 out.print("    "); 
										 }
										 
			 
										 %>
									   </td>
									 </tr>
									 <%} %>
								   </tbody>
								 </table>
								 <% } %>
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
