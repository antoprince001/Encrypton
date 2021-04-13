<%-- 
    Document   : home
    Created on : 13 Apr, 2021, 10:34:26 AM
    Author     : anton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Encrypton !</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css">
   
  </head>
  <body>
  <section class="section">
      <center>
    <div class="container">
      <h1 class="title">
        Encrypton 
      </h1>
      <p class="subtitle">
          Tool to understand Encryption Standards
      </p><br>
    </div>
          
   
         <form method="POST" action="/Encrypton/Encrypton">
            
             <label for="datum">Enter Text :</label><br>
             <textarea name="datum" id="datum" rows="4" cols="50"></textarea>
             
            <br><br>
             <label for="algo">Algorithm :</label><br>
             <div class="select">
                <select name="algo">
                    <option>Asymmetric</option>
                    <option>Symmetric</option>
                </select>
            </div>
             <br><br>
          
             <button class="button is-link" type="submit">Submit</button>
        </form>
      
     </center>
  </section>
 
        
  
      
  </body>
</html>