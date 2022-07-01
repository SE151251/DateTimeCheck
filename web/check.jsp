<%-- 
    Document   : check
    Created on : Jun 16, 2022, 9:43:39 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATE TIME CHECK</title>
    </head>
    <body style="background-color: whitesmoke">
        <div style="margin-left: 35%; margin-top: 80px">
            <h1 style="margin-left: 0px; margin-bottom: 30px; font-size: 50px; font-weight: bold; color: blue">DATE TIME CHECK</h1>
        <form action="TestServlet" style="margin-left: 25px">
            <table style="border: 3px solid deepskyblue; padding: 30px">
                <tr>
                            <td style="font-weight: bold; font-size: 30px">DAY: </td>
                            <td><input style="width: 200px; height: 30px" type="text" name="day" value="" placeholder="Input DAY"/></td>
			</tr> 
                         <tr>
                            <td style="font-weight: bold; font-size: 30px">MONTH: </td>
                            <td><input style="width: 200px; height: 30px"  type="text" name="month" value="" placeholder="Input MONTH" /></td>
			</tr>  
                         <tr>
                            <td style="font-weight: bold; font-size: 30px">YEAR: </td>
                            <td><input style="width: 200px; height: 30px" type="text" name="year" value="" placeholder="Input YEAR" /></td>
			</tr>  
                        <tr>
                            <td></td>
                            <td><input style="width: 100px; height: 30px; margin-top: 30px; background-color: deepskyblue" type="submit" value="CHECK"/></td>
			</tr> 
                        <tr>
                            <td style="font-weight: bold; font-size: 30px">Result: </td>
                            <td><p style="font-weight: bold; font-size: 30px; color: red"><c:out value="${result}"/></p></td>
			</tr>
                    
            </table>  
            </form>
                        </div>
    </body>
</html>
