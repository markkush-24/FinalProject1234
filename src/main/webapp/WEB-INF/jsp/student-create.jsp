<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На главную</a></td>
            <td><a href="/all-students">Назад</a></td>
        </tr>
        <form>

        </form>
    </table>
</div>

<div class="student_creating_container ">

    <c:choose>
        <c:when test="${isCreateStud == 1}">
            <div class="main_line">
                Для создания студетна заполните все поля и нажмите кнопку "Создать".
            </div>
        <form action="/student-create" method="post">
        </c:when>

        <c:otherwise>
            <div class="main_line">
                Для того , чтобы модифицировать студента введите новое значение поля и нажмите кнопку "Применить".
            </div>
            <form action="/student-progress" method="post">
        </c:otherwise>
    </c:choose>



<input type="hidden" value="${student.id}" name="idStud">



    <table cellpadding="4">

        <tr>
            <td width="115px" align="right">Фамилия</td>
            <td><input type="text" name="sSername" class="text"
                       value="${student.sername}"></td>
        </tr>

        <tr>
            <td align="right">Имя</td>
            <td><input type="text" name="sName" class="text"
                       value="${student.name}"></td>
        </tr>

        <tr>
            <td align="right">Группа</td>
            <td><input type="text" name="sGroup" class="text"
                       value="${student.group}"></td>
        </tr>

        <tr>
            <td align="right">Дата поступления</td>
            <td><input type="text" name="sDate" class="text"
                       value="${student.date}"></td>
        </tr>

        <tr>
            <td>&nbsp;</td>

            <td style="padding-left: 6px" height="80px">
                <c:choose>
                    <c:when test="${isCreateStud == 1}">
                        <input type="submit" value="Создать" id="button">
                    </c:when>

                    <c:otherwise>
                        <input type="submit" value="Применить" id="button">
                    </c:otherwise>
                </c:choose>


            </td>
        </tr>

    </table>
    </form>


</div>
