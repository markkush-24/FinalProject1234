
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На
                главную</a></td>
            <td><a href="/disciplines">Назад</a></td>
        </tr>
    </table>
</div>

<div class="student_creating_container ">

    <c:choose>
        <c:when test="${isCreate == 1}">
            <div class="main_line">
                Для того что создать новую дисциплину заполните все поля и нажмите кнопку "Создать"
            </div>
        <form action="/discipline-create" method="post">
        </c:when>
        <c:otherwise>
            <div class="main_line">
                Для того чтобы модифицировать дисциплину введите новое значение поля и нажмите кнопку "Создать"
            </div>
            <form action="/discipline-modify" method="post">
        </c:otherwise>
    </c:choose>

<input type="hidden" value="${discipline.id}" name="idDisc">



    <table style="line-height: 50px">
        <tr>
            <td width="60px">Название</td>
            <td style="padding-left: 30px"><input type="text" name="newDisc"
                                                  maxlength="50" size="35" class="text" value="${discipline.discipline}"></td>
        </tr>


        <tr>
            <td></td>
            <td style="padding-left: 32px" height="50px">
                <c:choose>
                    <c:when test="${isCreate == 1}">
                        <input type="submit" value="Создать" id="button">
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Применить" id="button">
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${message == 1}">
                    </c:when>
                </c:choose>
            </td>
        </tr>
    </table>
    </form>
</div>