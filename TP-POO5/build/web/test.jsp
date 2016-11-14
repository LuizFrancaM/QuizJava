<%-- 
    Document   : test
    Created on : Nov 11, 2016, 8:30:57 AM
    Author     : Fatec
--%>

<%@page import="java.util.Collections"%>
<%@page import="br.com.fatecpg.quiz.Quiz"%>
<%@page import="br.com.fatecpg.quiz.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste - TP5 - POO</title>
    </head>
    <body>
        <h1>WebQuiz</h1>
        <h2>Teste</h2>
        
        <hr>
        <form action="home.jsp">
            <%ArrayList<Question> test = Quiz.getTest();
            Collections.shuffle(test);
            for(Question q: Quiz.getTest()){ %>
            <h3>Questão <%= test.indexOf(q) + 1%>:<br>
                <%=q.getQuestion() %></h3>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[0]%>"/>
            <%= q.getAlternative()[0] %>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[1]%>"/>
            <%= q.getAlternative()[1] %>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[2]%>"/>
            <%= q.getAlternative()[2] %>
            <input type="radio" name="<%= test.indexOf(q)%>"
                   value="<%= q.getAlternative()[3]%>"/>
            <%= q.getAlternative()[3] %>
            <hr>
            <%}%>
            <input type="submit" name="user-test" value="Confirmar">
        </form>
    </body>
</html>
