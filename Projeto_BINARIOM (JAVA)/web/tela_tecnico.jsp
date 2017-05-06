<%-- 
    Document   : index
    Created on : 01/05/2017, 15:30:46
    Author     : TestAdministrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>B1NARI0M - Visão Geral</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="img/icon_logo_shurt.png" type="imgage/png">
        <!--==================LINKS CSS==================-->  
        <link rel="stylesheet" type="text/css" href="css/style_telas.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome-4.7.0/css/font-awesome.css">
        <!--==================LINKS JS==================-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
    </head>
    <body id="body">
        <div class="container-fluid">
            <div class="row">
                <!--==================HEADER==================-->
                <header id="headerTecnico" class="headerClass position col-xs-12">
                    <div class="logo"></div><!-- (Só disponível em 768px+ ) -->
                    <h3><i class="fa fa-eye" aria-hidden="true"></i>&nbsp;&nbsp;Visão Geral</h3>
                    <div id="btnOpenMenu" class="position btnMenuClass"><i class="fa fa-chevron-circle-down" aria-hidden="true"></i></div>
                </header>
                <!--==================MENU TOTAL (Resoluções pequenas)==================-->
                <nav id="menuTec-sm" class="menuClass col-xs-12">
                    <div id="btnCloseMenu" class="position btnMenuClass"><i class="fa fa-times-circle-o" aria-hidden="true"></i></div>
                    <i class="position fa fa-user-circle-o"></i><br/><br/>
                    <h4>Gilberto Silva</h4><br/>
                    <h4>Matrícula: </h4><h5>xxxx-xx</h5><br/><br/>
                    <input type="submit" id="btnLogout-sm" class="btnLogout position" value="Logout">

                    <ul type="none" class="position col-xs-12">       
                        <li><i class="fa fa-eye" aria-hidden="true"></i>&nbsp;&nbsp;Visão Geral</li><br/>
                        <li id="liEquipamento-sm"><i class="fa fa-angle-down"></i>&nbsp;&nbsp;Equipamento
                            <!--==================SUBMENU DE EQUIPAMENTO (Resoluções pequenas)==================-->
                            <nav id="subMenuEquipamento-sm" class="position">
                                <ul type="none">
                                    <li class="position">Inserir Equipamento</li>  
                                    <li class="position">Listar Equipamento</li>  
                                </ul>

                            </nav>

                        </li><br/>

                        <li id="upMenu-sm" class="position"><i class="fa fa-angle-up"></i></li>                   
                    </ul>
                </nav>
                <!--==================SECTION==================-->
                <section id="sectionTecnico" class="sectionClass col-xs-12">
                    <div class="row">
                        <!--==================MENU LATERAL (Resoluções maiores)==================-->
                        <nav id="menuTec-lg" class="menuClass position">
                            <div id="btnCloseMenu" class="position btnMenuClass"><i class="fa fa-times-circle-o" aria-hidden="true"></i></div>
                            <i class="position topMenu fa fa-user-circle-o"></i><br/><br/>
                            <h4 class="position topMenu">Gilberto Silva</h4><br/>
                            <h4 class="position topMenu">Matrícula: </h4><h5 class="position topMenu">xxxx-xx</h5><br/><br/>
                            <input type="submit" id="btnLogout-lg" class="btnLogout position" value="Logout">

                            <ul type="none" class="position topMenu col-xs-12">       
                                <li><i class="fa fa-eye" aria-hidden="true"></i>&nbsp;&nbsp;Visão Geral</li><br/>
                                <li id="liEquipamento-lg"><i class="fa fa-angle-down"></i>&nbsp;&nbsp;Equipamento
                                    <!--==================SUBMENU DE EQUIPAMENTO (Resoluções maiores)==================-->
                                    <nav id="subMenuEquipamento-lg" class="menuClass">
                                        <ul type="none">
                                            <li class="position">Inserir Equipamento</li>  
                                            <li class="position">Listar Equipamento</li>  
                                        </ul>

                                    </nav>
                                </li><br/>

                                <li id="upMenu-lg" class="position"><i class="fa fa-angle-up"></i></li>                     
                            </ul>
                        </nav>
                        <!--==================MENU CENTRAL COM DIRECIONAMENTOS DE CHAMADO==================-->
                        <nav id="menuChamado" class="menuClass position col-sm-6 col-sm-offset-5 col-md-9 col-md-offset-3">
                            <div class="row">
                                <ul type="none">
                                    <li class="col-md-2"><i class="glyphicon glyphicon-folder-open" aria-hidden="true"></i>&nbsp;&nbsp;&nbsp;Abertos

                                    </li>
                                    <li class="col-md-3"><i class="glyphicon glyphicon-refresh" aria-hidden="true"></i>&nbsp;&nbsp;&nbsp;Em andamento

                                    </li>
                                    <li class="col-md-2"><i class="glyphicon glyphicon-ok-circle" aria-hidden="true"></i>&nbsp;&nbsp;&nbsp;Concluídos

                                    </li>
                                    <li class="col-md-2"><i class="glyphicon glyphicon-ban-circle" aria-hidden="true"></i>&nbsp;&nbsp;&nbsp;Cancelados

                                    </li>
                                </ul>

                                <h4 class="position">TOTAL: </h4>
                            </div>
                        </nav>
                    </div> 

                </section>
            </div>
        </div>
    </body>
</html>