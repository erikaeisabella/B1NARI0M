<%-- 
    Document   : pagina_adm
    Created on : 01/05/2017, 16:49:24
    Author     : Antônio Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Página Admin</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome-4.7.0/css/font-awesome.css">
        <link rel="icon" href="img/Sem-Título-2.png" type="image/x-icon" />
        <style>
            li,a,h2, b{
                color: white;
            }
            body{
                background: black;
            }
        </style>
    </head>
    <body id="body">
        <!-- HEADER -->
        <header id="header" class="col-xs-* col-sm-* col-md-* col-lg-*">
            <div id="dHeader" class="col-xs-* col-sm-* col-md-* col-lg-*">
                <a href="logout.jsp">Sair</a>
            </div>
        </header>
        <!-- MENU LATERAL -->
        <div class="container-fluid">
            <div class="row content">
                <div class="col-sm-3 sidenav">
                    <h2>Logo</h2>
                    <ul class="nav nav-pills nav-stacked">
                        <li class="active"><a href="#section1">Painel Administrativo</a></li>
                        <li><a href="#section2"> Visão Geral </a></li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                Cliente
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"></a></li>
                                <li><a href="#"></a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                Usuario
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"></a></li>
                                <li><a href="#"></a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                Menu
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"></a></li>
                                <li><a href="#"></a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                Perfil
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"></a></li>
                                <li><a href="#"></a></li>
                            </ul>
                        </li>
                    </ul>
                    <br>
                </div>
                <br>
                <!-- NABEGAÇÃO CENTRAL -->
                <div class="col-sm-9">
                    <div class="page-header">
                        <div class="text-center"><b>VISÃO GERAL</b></div>
                    </div>
                    <br>
                    <!-- QUADROS -->
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="well">
                                <i class="fa fa-arrow-right fa-1x fa-pull-right"></i>
                                <h4 class="text-left">Abertos</h4>
                                <p>Código JSP apresenta ABERTOS</p> 
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="well">
                                <i class="fa fa-spinner fa-1x fa-spin fa-pull-right"></i>
                                <h4 class="text-left">Em Andamento</h4>
                                <p>Código JSP apresenta EM ANDAMENTO</p> 
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="well">
                                <i class="fa fa-times fa-1x fa-pull-right"></i>
                                <h4 class="text-left">Cancelados</h4>
                                <p>Código JSP apresenta Cancelados</p> 
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="well">
                                <i class="fa fa-check fa-1x fa-pull-right"></i>
                                <h4 class="text-left">Concluidos</h4>
                                <p>Código JSP apresenta os concluidos</p> 
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="well">
                                <h4>TOTAL CHAMADOS: Código JSP</h4> 
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
