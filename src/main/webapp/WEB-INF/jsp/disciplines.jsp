
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На главную</a></td>
        </tr>
    </table>
</div>

<div class="disciplines_List_container">
    <div style="padding-left: 30px; font-size: larger; height: 60px">Список
        дисциплин
    </div>

    <table>
        <tr>
            <td style="padding-left: 30px; width: 430px;">
                <table
                        cellspacing="0" cellpadding="3" id="small_font_100_380" border="1">
                    <tr bgcolor="#DCDCDC" align="left" style="border-color: #8B8989;">
                        <th></th>
                        <th width="320px">Наименование дисциплины</th>
                    </tr>

                    <c:forEach items="${disciplines}" var="d">
                    <tr>
                        <td align="right"><input type="checkbox" value="${d.id}"></td>
                        <td align="left">${d.discipline}</td>
                    </tr>
                    </c:forEach>
                    <tr>
                        <td align="right"><input type="checkbox"></td>
                        <td align="left">Физика</td>
                    </tr>
                    <tr>
                        <td align="right"><input type="checkbox"></td>
                        <td align="left">Геометрия</td>
                    </tr>


                </table>
            </td>

            <td valign="top" align="left" style="padding: 0">
                <table cellspacing="0">

                    <tr>
                        <form method="get" action="/discipline-create">


                        <td style="padding-bottom: 20px; padding-top: 0"><input
                                type="submit" id="button_long_name"
                                value="Создать дисциплину..."></td>
                        </form>
                    </tr>

                    <tr>
                        <td style="padding-bottom: 20px"><input onclick="modifyDiscipline()" type="submit"
                                                                id="button_long_name"
                                                                value="Модифицировать выбранную дисциплину..."></td>
                    </tr>

                    <tr>
                        <td style="padding-bottom: 20px"><input onclick="deleteDisciplines()" type="submit"
                                                                id="button_long_name"
                                                                value="Удалить выбранную дисциплину..."></td>
                    </tr>

                </table>
            </td>
        </tr>
    </table>

</div>

<form action="/disciplines" method="post" id="deleteDiscForm">
<input type="hidden" id="deleteDiscHidden" name="deleteDiscHidden">
</form>

<form action="/discipline-modify" method="get" id="modifyDiscForm">
    <input type="hidden" id="modifyDiscHidden" name="modifyDiscHidden">
</form>