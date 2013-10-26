
<%@page import="twtter.ThreadTwitter"%>
<%@page import="twtter.Twtter"%>
<%@page import="model.Twitter"%>
<%@page import="dao.TwitterDaoImpl"%>
<%@page import="dao.TwitterDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <link rel="shortcut icon" href="imagem/e-logistica.gif" type="image/x-icon">
    <link rel="stylesheet" type="text/css" media="all" href="bootstrap/css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" media="all" href="bootstrap/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" type="text/css" media="all" href="bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" media="all" href="bootstrap/css/bootstrap.min.css" />
    <body>
        <div class="navbar navbar-fixed-top responsive-utilities">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">

                    </a>
                    <a class="brand" href="#">@CafeUnoesc
                    </a>

                    <div class="nav-collapse">
                        <ul class="nav">
                            <li class="active"><a href="#" target="">Home</a></li>
                        </ul>

                    </div>
                    <div class="btn-group pull-left">
                        <form  target="#" id="onoff" name="onoff" method="POST" action="AtivaDesativaServlet">
                            <input class="btn btn-warning"type="submit" value="Ativar" id="onn" name="onn">
                            <input class="btn btn-inverse" type="submit" value="Desativar" id="onn" name="onn">
                        </form>
                    </div>

                </div>
            </div>

        </div><br /><br /><br /><br />

        <%
            TwitterDAO ttDAO = new TwitterDaoImpl();
            for (Twitter tt : ttDAO.getTwitters()) {
                out.print("<div class='alert-error'>@" + tt.getUsuario() + " mencionou o seguinte TT: '");
                out.print(tt.getText() + "'</div>");
            }
        %>

        <script src="js/buscaTwiter.js"></script>
        <script src="js/jquery.js"></script>

    </body>
</html>