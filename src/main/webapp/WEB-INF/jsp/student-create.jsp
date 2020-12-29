<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<div class="link_container">
    <table>
        <tr>
            <td><a href="">На главную</a></td>
            <td><a href="">Назад</a></td>
        </tr>
    </table>
</div>

<div class="student_creating_container ">

    <div class="main_line">

        Для создания студетна заполните все поля и нажмите кнопку "Создать".


    </div>

    <table cellpadding="4">

        <tr>
            <td width="115px" align="right">Фамилия</td>
            <td><input type="text" class="text"
                       value="ЛОДЛ"></td>
        </tr>

        <tr>
            <td align="right">Имя</td>
            <td><input type="text" class="text"
                       value="ЛТ"></td>
        </tr>

        <tr>
            <td align="right">Группа</td>
            <td><input type="text" class="text"
                       value="ЛОЛ"></td>
        </tr>

        <tr>
            <td align="right">Дата поступления</td>
            <td><input type="text" class="text"
                       value="ЛОДЛ"></td>
        </tr>

        <tr>
            <td>&nbsp;</td>

            <td style="padding-left: 6px" height="80px">

                <input type="submit" value="Создать" id="button">
            </td>
        </tr>

    </table>


</div>
