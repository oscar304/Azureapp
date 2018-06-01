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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dev. Oscar Díaz Cava</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"js/tabs.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Handlee\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"media/logo.ico\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" class=\"section\">\n");
      out.write("            <img alt=\"\" class=\"img-circle\" src=\"media/foto-perfil/foto-1.jpg\">\n");
      out.write("            <p>Oscar Andrés Díaz Cava</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'London')\">Proyectos</button>\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'Paris')\">Experiencia</button>\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'Tokyo')\">Respaldo</button>\n");
      out.write("                <button class=\"tablinks\" onclick=\"closeCity(event, 'Cerrar')\">Cerrar</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"London\" class=\"tabcontent\">\n");
      out.write("                <h3>Proyecto Empresarial SAP - Ferreycorp</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>Migración de procesos de negocios en solution manager de SAP</p>\n");
      out.write("                <h3>Lenguaje de programación para niños - KLEV</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>Para mi trabajo de tesis para obtener el grado de Bachiller, propuse junto con mi pareja de tesis, el señor\n");
      out.write("                    Christian Valencia, un lenguaje de programación basado en formas y números, para desarrollar las capacidades \n");
      out.write("                    cognitivas de niños a nivel primario.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"Paris\" class=\"tabcontent\">\n");
      out.write("                <h3>Practicante Profesional - FERREYROS</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>Re-diseño y mejora de procesos de negocio en el área de repuestos.\n");
      out.write("                    <br/>Implementación de procesos documentados en Solution Manager de SAP.\n");
      out.write("                    <br/>Control de gestión de cambios durante el trayecto del proyecto de excelencia empresarial SAP.</p>\n");
      out.write("                <h3>Practicante Pre-profesional - ENGIE ENERGÍA PERÚ S.A.</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>Apoyo en la supervisión de actividades de instalación y/o configuración de componentes tecnológicos por parte de contratistas.\n");
      out.write("                    <br/>Apoyo en la gestión (orden, clasificación, inventario) de los almacenes TIC (San Isidro e Ilo21).\n");
      out.write("                    <br/>Apoyo en la ejecución del presupuesto de Operaciones TIC.\n");
      out.write("                    <br/>Apoyo en el mantenimiento de aplicaciones (PCSistel, PowerBI, PoweApps, Appsheet).\n");
      out.write("                    <br/>Generación y seguimiento de SOLPEDS y OC en SAP.</p>\n");
      out.write("                <h3>Practicante Pre-profesional - UNIVERSIDAD DE LIMA</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>Desarrollo de aplicaciones en lenguaje GUPTA - CENTOS.\n");
      out.write("                    <br/>Manejo de base de datos en IBM DB2.\n");
      out.write("                    <br/>Desarrollo de interfaces web con IBM Rational Software Architect.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"Tokyo\" class=\"tabcontent\">\n");
      out.write("                <h3>Ing. Pablo Herrera</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>\n");
      out.write("                    <br/>Cargo: Gerente de Soluciones Digitales\n");
      out.write("                    <br/>Telef: 6167979 / 947434850\n");
      out.write("                    <br/>Anexo: 7585\n");
      out.write("                </p>\n");
      out.write("                <h3>Ing. Rivera Talavera Leon Gonzalo</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>\n");
      out.write("                    <br/>Cargo: Analista de DUIS\n");
      out.write("                    <br/>Telef: 4376767\n");
      out.write("                    <br/>Anexo: 31327\n");
      out.write("                </p>\n");
      out.write("                <h3>Ing. Pablo Herrera</h3>\n");
      out.write("                <hr/>\n");
      out.write("                <p>\n");
      out.write("                    <br/>Dr. Ramírez Gastón - Vicerector de la facultad de derecho\n");
      out.write("                    <br/>Telef: 437-6767\n");
      out.write("                    <br/>Anexo: 1610\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- header end -->\n");
      out.write("\n");
      out.write("        <!-- About Me section start -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h1><span>Acerca de mí</span></h1>\n");
      out.write("            <p>\n");
      out.write("                Hola mi nombre es <strong>Oscar Díaz</strong>, soy Bachiller de la carrera de Ingeniería de sistemas en la Universidad de Lima. El programar me a cambiado la vida. No es solo acerca de las aplicaciones. El aprender a programar me ha permitido desarrollar <i>habilidades para resolver problemas</i> y a comunicarme con otras personas a nivel técnico y organizacional. Tengo experiencia desarrollando páginas web nativas, así como aplicaciones móviles en android. Todo lo aprendí en mi universidad y en <strong>SoloLearn</strong> una página que te motiva a seguir aprendiendo. Estoy interesado en formar parte de cualquier proyecto de transformación digital y soluciones en la nube.\n");
      out.write("            </p>\n");
      out.write("            <p class=\"quote\">\"Declara variables, no la guerra\"</p>\n");
      out.write("        </div>\n");
      out.write("        <!-- About Me section end -->\n");
      out.write("\n");
      out.write("        <!-- My Schedule section start -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h1><span>Mi horario</span></h1>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Día</th>\n");
      out.write("                    <th>Lunes</th>\n");
      out.write("                    <th>Martes</th>\n");
      out.write("                    <th>Miercoles</th>\n");
      out.write("                    <th>Jueves</th>\n");
      out.write("                    <th>Viernes</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>06:00-07:30</td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>08:00-12:00</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>12:00-12:45</td>\n");
      out.write("                    <td class=\"selected\">Almuerzo</td>\n");
      out.write("                    <td class=\"selected\">Almuerzo</td>\n");
      out.write("                    <td class=\"selected\">Almuerzo</td>\n");
      out.write("                    <td class=\"selected\">Almuerzo</td>\n");
      out.write("                    <td class=\"selected\">Almuerzo</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>13:00-16:30</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                    <td class=\"selected\">Ferreyros</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>16:30-17:45</td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>18:00-19:15</td>\n");
      out.write("                    <td class=\"selected\">Gimnasio</td>\n");
      out.write("                    <td class=\"selected\">Gimnasio</td>\n");
      out.write("                    <td class=\"selected\">Gimnasio</td>\n");
      out.write("                    <td class=\"selected\">Gimnasio</td>\n");
      out.write("                    <td class=\"selected\">Gimnasio</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>19:15-19:45</td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>19:45-20:15</td>\n");
      out.write("                    <td class=\"selected\">Pasear mascota</td>\n");
      out.write("                    <td class=\"selected\">Pasear mascota</td>\n");
      out.write("                    <td class=\"selected\">Pasear mascota</td>\n");
      out.write("                    <td class=\"selected\">Pasear mascota</td>\n");
      out.write("                    <td class=\"selected\">Pasear mascota</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <!-- My Schedule section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- My Skills section start -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h1><span>Mis conocimientos</span></h1>\n");
      out.write("            <ul>\n");
      out.write("                <li>HTML <br />\n");
      out.write("                    <progress min=\"0\" max=\"100\" value=\"80\"></progress>\n");
      out.write("                </li>\n");
      out.write("                <li>JavaScript <br />\n");
      out.write("                    <progress min=\"0\" max=\"100\" value=\"50\"></progress>\n");
      out.write("                </li>\n");
      out.write("                <li>Java 8 <br />\n");
      out.write("                    <progress min=\"0\" max=\"100\" value=\"50\"></progress>\n");
      out.write("                </li>\n");
      out.write("                <li>Python <br />\n");
      out.write("                    <progress min=\"0\" max=\"100\" value=\"40\"></progress>\n");
      out.write("                </li>\n");
      out.write("                <li>Ruby <br />\n");
      out.write("                    <progress min=\"0\" max=\"100\" value=\"40\"></progress>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- My Skills section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Media section start -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h1><span>Mi canal de Youtube</span></h1>\n");
      out.write("            <iframe height=\"150\" width=\"300\" src=\"https://www.youtube.com/embed/Q6_5InVJZ88\" allowfullscreen frameborder=\"0\"></iframe>\n");
      out.write("        </div>\n");
      out.write("        <!-- Media section end -->\n");
      out.write("\n");
      out.write("        <!-- Form section start -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h1><span>Contacta conmigo</span></h1>\n");
      out.write("\n");
      out.write("            <svg class=\"face\" height=\"100\" width=\"100\">\n");
      out.write("            <circle cx=\"50\" cy=\"50\" r=\"50\" fill=\"#FDD835\"/>\n");
      out.write("            <circle cx=\"30\" cy=\"30\" r=\"10\" fill=\"#FFFFFF\"/>\n");
      out.write("            <circle cx=\"70\" cy=\"30\" r=\"10\" fill=\"#FFFFFF\"/>\n");
      out.write("            <circle cx=\"30\" cy=\"30\" r=\"5\" fill=\"#000000\"/>\n");
      out.write("            <circle cx=\"70\" cy=\"30\" r=\"5\" fill=\"#000000\"/>\n");
      out.write("            <path d=\"M 30 70 q 20 20 40 0\" stroke=\"#FFFFFF\" stroke-width=\"5\" fill=\"none\" />\n");
      out.write("            </svg>\n");
      out.write("\n");
      out.write("            <form method=\"post\" action=\"RegistroServlet\">\n");
      out.write("                <input id=\"name\" name=\"name\" placeholder=\"Nombre\" type=\"text\" maxlength=\"25\" required /><br/>\n");
      out.write("                <input id=\"email\" name=\"email\" placeholder=\"Correo\" type=\"email\" maxlength=\"75\" required /><br/>\n");
      out.write("                <textarea onkeyup=\"textCounter(this, 'counter', 300);\" id=\"message\" name=\"message\" placeholder=\"Mensaje\" maxlength=\"300\" required ></textarea>\n");
      out.write("                <input disabled  maxlength=\"3\" size=\"3\" value=300 id=\"counter\">\n");
      out.write("                <input type=\"submit\" value=\"ENVIAR\" class=\"submit\" />                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!-- Form section end -->\n");
      out.write("\n");
      out.write("        <!-- Contacts section start -->\n");
      out.write("        <div class=\"section\" id=\"contacts\">\n");
      out.write("            <h1><span>Sígueme en</span></h1>\n");
      out.write("            <div>\n");
      out.write("                <a href=\"https://www.sololearn.com/Profile/8420788\" target=\"_blank\">\n");
      out.write("                    <img alt=\"SoloLearn\" src=\"https://www.sololearn.com/Uploads/icons/sololearn.png\" />\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img alt=\"Facebook\" src=\"https://www.sololearn.com/Uploads/icons/facebook.png\"/>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"https://twitter.com/DeclareVarNoWar\" target=\"_blank\">\n");
      out.write("                    <img alt=\"Twitter\" src=\"https://www.sololearn.com/Uploads/icons/twitter.png\" />\n");
      out.write("                </a>\n");
      out.write("                <a href=\"https://www.linkedin.com/in/oscar-andres-d%C3%ADaz-cava-587668b7/\" target=\"_blank\">\n");
      out.write("                    <img alt=\"Twitter\" src=\"media/linkedin-icon.png\" />\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Contacts section end -->\n");
      out.write("\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            &copy; 2018 My CV. Todos los derechos reservados.\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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