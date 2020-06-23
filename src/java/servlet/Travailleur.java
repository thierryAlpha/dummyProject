/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author L512
 */
public class Travailleur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private boolean toSave = false;
    private String  page = "";
        
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Travailleur</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Travailleur at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
        
        ServletContext context = this.getServletContext(); 
        HttpSession session;
        session = request.getSession(); 
        
        
        String action = (String)session.getAttribute("action");
        String data = (String)session.getAttribute("categorie");  
        
        if( toSave == true){
           
        beans.personnel.Travailleur travailleur = new beans.personnel.Travailleur();       

        /* Recuperation de la datecourante */
        
        DateTime dt = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm:ss" );
        String date = dt.toString( formatter );
        
        travailleur.setNom((String)         session.getAttribute("nom"));
        travailleur.setPrenom((String)      session.getAttribute("prenom"));
        travailleur.setAdresse((String)     session.getAttribute("adresse"));

        travailleur.setDate(date);
        travailleur.setTelephonne((String)  session.getAttribute("telephonne"));
        travailleur.setDepartement((String) session.getAttribute("departement"));
        travailleur.setPoste((String)       session.getAttribute("poste"));
        travailleur.setDebutContrat((Date)  session.getAttribute("debutContrat"));
        travailleur.setFinContrat((Date)    session.getAttribute("finContrat"));
        travailleur.setSalaire((double)     session.getAttribute("salaire"));
        travailleur.setPrimeRation((double) session.getAttribute("primeRation"));
        travailleur.setPrimeVoyage((double) session.getAttribute("primeVoyage"));
        travailleur.setMarie((boolean)      session.getAttribute("marie"));
        travailleur.setVeuf((boolean)       session.getAttribute("veuf"));
        travailleur.setCelibataire((boolean)session.getAttribute("celibataire"));
        travailleur.setEnfant((int)         session.getAttribute("enfant"));
        
       if( travailleur.createTravailleur()){
        
        page = "pageCorrect";       
        context.getRequestDispatcher("/WEB-INF/"+page+".jsp").forward( request, response );       
        
         }else{
           page = "errorPage";
           context.getRequestDispatcher("/WEB-INF/"+page+".jsp").forward( request, response );
        } 
       
       // forward la page de saisie
        
       page = "Travailleur";
       context.getRequestDispatcher("/WEB-INF/"+page+".jsp").forward( request, response );  
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
        processRequest(request, response);
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
