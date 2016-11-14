<%-- 
    Document   : index
    Created on : Nov 11, 2016, 8:30:48 AM
    Author     : Fatec
--%>

<%@page import="br.com.fatecpg.quiz.Quiz"%>
<%@page import="br.com.fatecpg.quiz.Usuario"%>
<%@page import="br.com.fatecpg.quiz.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    double ultNota =0;
    double media = 0;
    String nome = "";
    if (request.getParameter("começar") != null) {
        /*String nome = request.getParameter("nome");
        double ultN =0;
        double media = 0;
        for (Usuario u : Database.getUsuarios() ){
            if (!(u.getNome().equals(nome))){
            u.setId(Database.getUsuarios().size());
            u.setNome(request.getParameter("nome"));
            u.setSoma(0);
            u.setMedia(0);
            u.setUltimaNota(0);
            Database.getUsuarios().add(u);
            System.out.println(Database.getUsuarios().toString());
            response.sendRedirect(request.getRequestURI());
            }
        }
    }*/
        nome = request.getParameter("nome");
        }
        if(request.getParameter("user-test") != null){
            String[] answers = {
                request.getParameter("0")
                ,request.getParameter("1")
                ,request.getParameter("2")
                ,request.getParameter("3")
                ,request.getParameter("4")
                ,request.getParameter("5")
                ,request.getParameter("6")
                ,request.getParameter("7")
                ,request.getParameter("8")
                ,request.getParameter("9")
            };
            Quiz.validateTest(answers);
            ultNota = Quiz.getLastGrade();
            media = Quiz.getGradesAverage();
        }
        
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Quiz - TP5 - POO</title>
    </head>
    <body>
        <h1>Web Quiz</h1>
        <center><h2>Usuário: <%= nome %></h2></center>
        <hr><h3>Última Nota</h3>
           <%= ultNota + "%"%>
        <hr><h3>Média</h3>
           <%= media + "%"%>
        </hr>
        <a href="test.jsp">
            <button>Inciar Teste</button>
        </a>
    </body>
</html>
