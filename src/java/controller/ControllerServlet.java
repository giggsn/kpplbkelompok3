/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sau-mfh
 */
@WebServlet(name = "ControllerServlet", 
        urlPatterns = 
                {//doGet, 
            "/menuUtama", 
            "/workspaceKaryawan", 
            "/workspaceSekkajur", 
            "/suratSurveydanData", 
            "/statusSurat",
            "/dummy",
           "/suratKeteranganLulus",
           "/suratKeteranganMahasiswa",
           "/suratSurveydanDataAbi",
           "/membuatSurat",
           "/statusSurat",
            //doPost
            "/buatSurat",
            "/editSurat" })
public class ControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String userPath = request.getServletPath();
        
        switch (userPath) {
            //hanya dummy untuk pembagian user
            case "/dummy":
                userPath="/dummy";
                break;
            //tampilkan page menu_utama
            case "/menuUtama":
                userPath="/menu_utama";
                break;
            //membuat surat
            case "/membuatSurat":
                userPath="/membuat_surat";
                break;
            //status surat
            case "/statusSurat":
                userPath="/status_surat";
                break;
            //tampilkan page workspace
            case "/workspaceKaryawan":
                userPath="/workspace_karyawantu";
                break; 
            case "/workspaceSekkajur":
                userPath="/workspace_sekkajur";
                break;
            //tampilkan form surat
            case "/suratSurveydanData":
                userPath="/surat_surveydanambildata";
                break;
            case "/suratKeteranganLulus":
                userPath="/surat_keterangan_lulus";
                break;
            case "/suratKeteranganMahasiswa":
                userPath="/surat_keterangan_mahasiswa";
                break;
            case "/suratSurveydanDataAbi":
                userPath="/surat_survey_dan_pengambilan_data";
                break;
        }
        
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
