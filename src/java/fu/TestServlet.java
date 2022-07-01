/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/TestServlet"})
public class TestServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        try {
           String day = request.getParameter("day");
           String month = request.getParameter("month");
           String year = request.getParameter("year");
           boolean check = checkDayMonthYear(day,month,year);
           if(check==true){
               request.setAttribute("result", "Correct");
           }else{
             request.setAttribute("result", "Incorrect");  
           }
        }catch(Exception e){
            System.out.println("Error!");
        } finally{
            request.getRequestDispatcher("check.jsp").forward(request, response);
        }
    }
    public static boolean isLeap(int y){
        boolean result=false;
        if((y%400==0) || ((y%4==0) && (y%100!=0)))result =true;
        return result;
    }
    public static boolean valid(int d, int m, int y) {
        if (y < 1000 || y>3000 || m < 0 || m > 12 || d < 0 || d > 31) {
            return false;
        } else {
            int maxD = 31;
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                maxD = 30;
            } else if (m == 2) {
                if (isLeap(y)) {
                    maxD = 29;
                } else {
                    maxD = 28;
                }
            }
            return d <= maxD;
        }

    }
    // Hàm viết test case kiểm tra ngày tháng năm hợp lệ.
    public static boolean checkDayMonthYear(String day, String month, String year) {
        if (day.trim().isEmpty() || month.trim().isEmpty() || year.trim().isEmpty()) {
            return false;
        } else {
            try {               
                int d = Integer.parseInt(day);
                int m = Integer.parseInt(month);
                int y = Integer.parseInt(year);
                if (!valid(d, m, y)) {
                    return false;
                }
                else{
                    return true;
                }               
            } catch (Exception e) {
                return false;
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
