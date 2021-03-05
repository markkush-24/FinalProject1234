<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На
                главную</a></td>
        </tr>
    </table>

</div>
<div class="terms_list_container">
    <table cellspacing="0" style="margin-top: 20px">


        <tr>

            <td style="font-size: large;">Выбрать семестр</td>


            <td style="padding-left: 50px"><select
                    id="opening_list">
                <c:forEach items="${semestrs}" var="s">  <option name="selected" value="${s.id}" >${s.name}</option></c:forEach>
            </select></td>

            <form>
            <td style="padding-left: 20px"><input onclick="SelectSemestrDisc()" type="submit"
                                                  value="Выбрать" id="button"></td>
            </form>
        </tr>



        <tr height="80px" style="font-size: large; font-weight: bold;">
            <td colspan="3">Длительность семестра: 24 недели</td>
        </tr>

        <tr style="font-size: large;">
            <td colspan="3">Список дисциплин семестра</td>
        </tr>
    </table>

    <table style="margin-top: 20px">
        <tr>
            <td style="padding: 0" width="450px"><table cellspacing="0"
                                                        cellpadding="3" id="small_font_100_380" border="1px">
                <tr bgcolor="#DCDCDC" align="left" style="border-color: #8B8989;">
                    <th>Наименование дисциплины</th>
                </tr>
                <c:forEach items="${disciplines}" var="d">
                <tr>
                    <td>${d.discipline}</td>
                </tr>
                </c:forEach>
            </table></td>

            <td align="left" valign="top" style="padding: 0">

						<table cellspacing="0">

                <tr>
                    <form method="get" action="create-semestr">
                    <td style="padding-bottom: 20px; padding-top: 0"><input
                            type="submit" id="button_long_name" value="Создать семестр..."></td>
                    </form>
                </tr>



                <tr>
                    <td style="padding-bottom: 20px"><input type="button" id="button_long_name"
                                                            value="Модифицировать текущий семестр..."></td>
                </tr>


                <tr>
                    <td style="padding-bottom: 20px"><input type="button"
                                                            id="button_long_name" value="Удалить текущий семестр..."></td>
                </tr>
            </table>
            </td>
    </table>
</div>

<form action="/semestr" method="get" id="selectSemestrDiscForm">
<input type="hidden" id="selectSemestrDiscHidden" name="selectSemestrDiscHidden">
</form>