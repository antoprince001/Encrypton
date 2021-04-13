package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Encrypton !</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.2/css/bulma.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/index.css\">\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <section class=\"section\">\n");
      out.write("      <center>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1 class=\"title\">\n");
      out.write("        Encrypton \n");
      out.write("      </h1>\n");
      out.write("      <p class=\"subtitle\">\n");
      out.write("        Welcome to  <strong>Encrypton !! </strong>\n");
      out.write("      </p><br><br><br>\n");
      out.write("    </div>\n");
      out.write("         <form method=\"POST\">\n");
      out.write("            \n");
      out.write("             <label for=\"datum\">Enter Text :</label><br>\n");
      out.write("             <textarea name=\"datum\" id=\"datum\" rows=\"4\" cols=\"50\"></textarea>\n");
      out.write("             <br><br>\n");
      out.write("             <label for=\"datum\">Select Mode :</label><br>\n");
      out.write("             <div class=\"control\">\n");
      out.write("                <label class=\"radio\">\n");
      out.write("                     <input type=\"radio\" name=\"mode\">\n");
      out.write("                            Encrypt\n");
      out.write("                </label>\n");
      out.write("                <label class=\"radio\">\n");
      out.write("                    <input type=\"radio\" name=\"mode\">\n");
      out.write("                            Decrypt\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("             <label for=\"datum\">Select Algorithm :</label><br>\n");
      out.write("             <div class=\"select\">\n");
      out.write("                <select>\n");
      out.write("                    <option>Symmetric</option>\n");
      out.write("                    <option>Asymmetric</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("     </center>\n");
      out.write("  </section>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("  \n");
      out.write("      \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
