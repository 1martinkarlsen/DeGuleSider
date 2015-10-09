<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="Base template" pageEncoding="UTF-8" %>
<%@attribute name="pageName" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>De Gule Sider part2</title>

        <!-- Style -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="Style/Main.css"> <!-- Main (self made) style -->

        <!-- Scripts -->
        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script> <!-- Latest compiled and minified JavaScript -->
    
        <style>
            #section {
                width:350px;
                padding:10px;	 	 
            }
            
            #jsonsection {
                width:550px;
                padding:10px;	 	 
            }
        </style>
    </head>

    <body>    
        <!-- NAVIGATION -->
        <nav class="navbar navbar-default">
            <div class="container-fluid col-lg-10 col-lg-offset-1">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/index.jsp">De Gule Sider</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">Forside</a></li>
                        <li><a href="pages/addPerson.jsp">Add Person</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Documentation<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="JSON.jsp">JSON</a></li>
                                <li><a href="REST.jsp">REST</a></li>
                                <li><a href="errorHandling.jsp">Error handling</a></li>
                                <li><a href="test.jsp">Test</a></li>
                                <li><a href="inheritance.jsp">Inheritance</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="tutorial.jsp">Tutorial</a></li>
                            </ul>
                            <li><a href="WhoDidWhat.jsp">Who did what</a></li>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <!-- CONTENT -->
        <div class="container-fluid">

            <jsp:doBody />

        </div>

        <script src="myjavascripts.js"></script>
    </body>
</html>