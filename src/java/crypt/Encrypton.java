/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypt;

import static crypt.AESImplement.createAESKey;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.SecretKey;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
//import crypt.RSAImplement.java;

/**
 *
 * @author anton
 */
@WebServlet(name = "Encrypton", urlPatterns = {"/Encrypton"})
public class Encrypton extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void errorHandler(HttpServletRequest request, HttpServletResponse response, String err)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Encrypton</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {

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
        response.setContentType("text/html;charset=UTF-8");
        String destination = "result.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
        try (PrintWriter out = response.getWriter()) {

            String text = request.getParameter("datum");
            // Mode : True => Encrypt and False => Decrypt
            String algo = request.getParameter("algo");

//            if(algo.equals("Symmetric")){
//                
//                if(mode == true){ // Encryption 
//                    
//                }
//            }
//            else 
           
                if (algo.equals("Asymmetric")) { // Encryption
                    byte[] encrypted;
                    try {
                        
                        KeyPair k = RSAImplement.generateRSAKkeyPair();
                        
                        encrypted = RSAImplement.do_RSAEncryption(text, k.getPrivate());
                        request.setAttribute("topic", "Asymmetric RSA Encryption");

                        String decrypted = RSAImplement.do_RSADecryption(encrypted,k.getPublic());
                        request.setAttribute("encrypted", "Encrypted Data : "+encrypted);
                        request.setAttribute("public",  "Public Key : "+DatatypeConverter.printHexBinary(k.getPublic().getEncoded()));
                        request.setAttribute("private", "Private key : "+DatatypeConverter.printHexBinary(k.getPrivate().getEncoded()));
                        request.setAttribute("decrypted", "Decrypted Data : "+decrypted);
                        requestDispatcher.forward(request, response);
//                        out.println("encrypted : "+ encrypted);
//                        out.println("private : "+ k.getPrivate().toString());
//                        out.println("public : "+ k.getPublic().toString());
//                        out.println("mode : "+ mode);
//                        
                    } catch (Exception e) {
                        out.println(e.getStackTrace());
                    }
                }
                else{
                    try{
                    SecretKey Symmetrickey = AESImplement.createAESKey();
                    
                    request.setAttribute("topic", "Symmetric AES Encryption");
                    request.setAttribute("public","Symmetric Key : "+DatatypeConverter.printHexBinary(Symmetrickey.getEncoded()));
  
                    byte[] initializationVector= AESImplement.createInitializationVector();
 
                    request.setAttribute("private", "Initialization Vector :" + DatatypeConverter.printHexBinary(initializationVector));

                    byte[] encrypted= AESImplement.do_AESEncryption(text, Symmetrickey, initializationVector);
  
                    request.setAttribute("encrypted","Encrypted Data : "+DatatypeConverter.printHexBinary(encrypted));
 
                    String decryptedText = AESImplement.do_AESDecryption(encrypted,Symmetrickey,initializationVector);
  
                    request.setAttribute("decrypted","Decrypted Data : "+decryptedText);
                    
                    requestDispatcher.forward(request, response);

                }catch(Exception e){
                    out.println(e.getStackTrace());

                }
                }  
        }catch(Exception e){

                }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Encryption / Decryption handler";
    }// </editor-fold>

}
