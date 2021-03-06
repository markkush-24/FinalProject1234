<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="right" style="position: fixed; right: 20px; bottom: 0px;">
    <p>Тестовые аккаунты: "admin / password" , "student / password"</p>
    <p>Аккаунт "admin" поддерживает обе роли</p>
</div>

<div class="login_form_container">
    <form action="/login" method="post">

        <table id="login_table">
            <tr>
                <td colspan="2" class="caption">Вход</td>
            </tr>
            <tr>
                <td>Имя:</td>
                <td><input type="text" name="username" class="text" value="" /></td>
            </tr>
            <tr>
                <td>Пароль:</td>
                <td><input type="password" name="password" class="text" /></td>
            </tr>
            <tr>
                <td>Выбрать роль:</td>
                <td><select name="role" id="opening_list">
                    <option value="1">Администратор</option>
                    <option value="2">Учитель</option>
                    <option value="3">Студент</option>
                </select></td>
            </tr>
            <tr height="60">
                <td>&nbsp</td>
                <td><input type="submit" value="войти" id="button"></td>
            </tr>
        </table>
<c:choose>
        <c:when test="${message == 1}">
            <table id="table_for_error_message">
                <tr>
                    Не верно введены данные!
                </tr>
            </table>
        </c:when>
</c:choose>
    </form>
</div>