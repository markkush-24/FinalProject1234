<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На
                главную</a></td>
            <td><a href="/semestr">Назад</a></td>
        </tr>
    </table>
</div>

<div class="terms_list_container">


    <div class="main_line">

        Для создания семестра заполните следующие данные и нажмите кнопку "Создать".

    </div>





    <table class="under_main_table" style="font-family: cursive;">
        <tr>
            <td width="210px">Длительность (в неделях)</td>
            <td><input type="text" name="duration" class="text"
                       id="text" placeholder="24"></td>
        </tr>

        <tr>
            <td style="padding-top: 30px" valign="top">Дисциплины в семестре</td>
            <td style="padding-top: 30px">
                <form action="/create-semestr" method="post">
                <table>
                    <tr>
                        <td style="padding: 0"><select multiple size="8" name="newSemestr"
                                                       id="multi_list" multiple="multiple" >

                            <option>ЛФЫТВ</option>

                        </select></td>
                    </tr>

                    <tr>
                        <td style="padding-top: 20px">

                            <input type="submit" value="Создать" id="button">
                        </td>
                    </tr>
                </table>
                </form>

            </td>
        </tr>
    </table>


</div>