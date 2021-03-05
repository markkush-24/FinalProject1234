<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На
                главную</a></td>
            <td><a href="/all-students">Назад</a></td>
        </tr>
    </table>
</div>

<div class="student_list_container">
    <h3>Отображена успеваемость для следующего студента:</h3>

    <table cellspacing="0">
        <tr>
            <td><table border="1" cellspacing="0" cellpadding="3"
                       style="font-size: small; line-height: 25px; border-color: #D1EEEE">
                <tr bgcolor="#DCDCDC" align="left" style="border-color: #838B83">
                    <th width="100px">Фамилия</th>
                    <th width="230px">Имя</th>
                    <th width="270px">Группа</th>
                    <th width="220px">Дата поступления</th>
                </tr>
                <tr align="left">
                    <td>ЛЫТВ</td>
                    <td>ЛЫТВ</td>
                    <td>ЫДЛВ</td>
                    <td>ФЫДВЛТ</td>
                </tr>
            </table></td>
        </tr>
        <tr>
            <td><table>
                <tr>
                    <td style="padding: 50px 0 0 0"><table border="1"
                                                           cellspacing="0" cellpadding="3"
                                                           style="font-size: small; line-height: 100px; border-color: #D1EEEE">
                        <tr bgcolor="#DCDCDC" align="left" style="border-color: #838B83">
                            <th width="250px">Дисциплина</th>
                            <th width="100px">Оценка</th>
                        </tr>

                        <tr align="left">
                            <td>ЛФЫВ</td>
                            <td>ДЫВ</td>
                        </tr>


                    </table>

                        <input type="hidden" name="id" value="${student.id }">
                    <td style="padding: 50px 0 0 30px" valign="top"><table
                            style="width: 450px" cellpadding="0" cellspacing="0">
                        <tr align="right">
                            <td width="160px" style="font-size: larger; font-weight: 700;">Выбрать
                                семестр</td>
                            <td style="padding-left: 10px"><select id="opening_list"
                                                                   style="width: 160px">
                                <option value="${term.id }">Семестр 3</option>

                            </select></td>
                            <td style="padding-left: 10px"><input type="submit"
                                                                  value="Выбрать" id="button" style="width: 100px"></td>
                        </tr>
                        <tr style="line-height: 100px">
                            <td colspan="3"><big>Средняя оценка за семестр: ДЫЬЛВ
                                балла</big></td>
                        </tr>
                    </table></td>

            </table></td>
        </tr>
    </table>

</div>
