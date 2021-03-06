<%-- 
    Document   : index
    Created on : 28/05/2018, 01:16:17 PM
    Author     : odiaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dev. Oscar Díaz Cava</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/tabs.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Handlee" rel="stylesheet">
        <link rel="shortcut icon" href="media/logo.ico" />
    </head>
    <body>
        <div id="header" class="section">
            <img alt="" class="img-circle" src="media/foto-perfil/foto-1.jpg">
            <p>Oscar Andrés Díaz Cava</p>
        </div>
        <div class="section">
            <div class="tab">
                <button class="tablinks" onclick="openCity(event, 'London')">Proyectos</button>
                <button class="tablinks" onclick="openCity(event, 'Paris')">Experiencia</button>
                <button class="tablinks" onclick="openCity(event, 'Tokyo')">Respaldo</button>
                <button class="tablinks" onclick="closeCity(event, 'Cerrar')">Cerrar</button>
            </div>

            <div id="London" class="tabcontent">
                <h3>Proyecto Empresarial SAP - Ferreycorp</h3>
                <hr/>
                <p>Migración de procesos de negocios en solution manager de SAP</p>
                <h3>Lenguaje de programación para niños - KLEV</h3>
                <hr/>
                <p>Para mi trabajo de tesis para obtener el grado de Bachiller, propuse junto con mi pareja de tesis, el señor
                    Christian Valencia, un lenguaje de programación basado en formas y números, para desarrollar las capacidades 
                    cognitivas de niños a nivel primario.</p>
            </div>

            <div id="Paris" class="tabcontent">
                <h3>Practicante Profesional - FERREYROS</h3>
                <hr/>
                <p>Re-diseño y mejora de procesos de negocio en el área de repuestos.
                    <br/>Implementación de procesos documentados en Solution Manager de SAP.
                    <br/>Control de gestión de cambios durante el trayecto del proyecto de excelencia empresarial SAP.</p>
                <h3>Practicante Pre-profesional - ENGIE ENERGÍA PERÚ S.A.</h3>
                <hr/>
                <p>Apoyo en la supervisión de actividades de instalación y/o configuración de componentes tecnológicos por parte de contratistas.
                    <br/>Apoyo en la gestión (orden, clasificación, inventario) de los almacenes TIC (San Isidro e Ilo21).
                    <br/>Apoyo en la ejecución del presupuesto de Operaciones TIC.
                    <br/>Apoyo en el mantenimiento de aplicaciones (PCSistel, PowerBI, PoweApps, Appsheet).
                    <br/>Generación y seguimiento de SOLPEDS y OC en SAP.</p>
                <h3>Practicante Pre-profesional - UNIVERSIDAD DE LIMA</h3>
                <hr/>
                <p>Desarrollo de aplicaciones en lenguaje GUPTA - CENTOS.
                    <br/>Manejo de base de datos en IBM DB2.
                    <br/>Desarrollo de interfaces web con IBM Rational Software Architect.</p>
            </div>

            <div id="Tokyo" class="tabcontent">
                <h3>Ing. Pablo Herrera</h3>
                <hr/>
                <p>
                    <br/>Cargo: Gerente de Soluciones Digitales
                    <br/>Telef: 6167979 / 947434850
                    <br/>Anexo: 7585
                </p>
                <h3>Ing. Rivera Talavera Leon Gonzalo</h3>
                <hr/>
                <p>
                    <br/>Cargo: Analista de DUIS
                    <br/>Telef: 4376767
                    <br/>Anexo: 31327
                </p>
                <h3>Ing. Pablo Herrera</h3>
                <hr/>
                <p>
                    <br/>Dr. Ramírez Gastón - Vicerector de la facultad de derecho
                    <br/>Telef: 437-6767
                    <br/>Anexo: 1610
                </p>
            </div>
        </div>
        <!-- header end -->

        <!-- About Me section start -->
        <div class="section">
            <h1><span>Acerca de mí</span></h1>
            <p>
                Hola mi nombre es <strong>Oscar Díaz</strong>, soy Bachiller de la carrera de Ingeniería de sistemas en la Universidad de Lima. El programar me a cambiado la vida. No es solo acerca de las aplicaciones. El aprender a programar me ha permitido desarrollar <i>habilidades para resolver problemas</i> y a comunicarme con otras personas a nivel técnico y organizacional. Tengo experiencia desarrollando páginas web nativas, así como aplicaciones móviles en android. Todo lo aprendí en mi universidad y en <strong>SoloLearn</strong> una página que te motiva a seguir aprendiendo. Estoy interesado en formar parte de cualquier proyecto de transformación digital y soluciones en la nube.
            </p>
            <p class="quote">"Declara variables, no la guerra"</p>
        </div>
        <!-- About Me section end -->

        <!-- My Schedule section start -->
        <div class="section">
            <h1><span>Mi horario</span></h1>
            <table>
                <tr>
                    <th>Día</th>
                    <th>Lunes</th>
                    <th>Martes</th>
                    <th>Miercoles</th>
                    <th>Jueves</th>
                    <th>Viernes</th>
                </tr>
                <tr>
                    <td>06:00-07:30</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>08:00-12:00</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                </tr>
                <tr>
                    <td>12:00-12:45</td>
                    <td class="selected">Almuerzo</td>
                    <td class="selected">Almuerzo</td>
                    <td class="selected">Almuerzo</td>
                    <td class="selected">Almuerzo</td>
                    <td class="selected">Almuerzo</td>
                </tr>
                <tr>
                    <td>13:00-16:30</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                    <td class="selected">Ferreyros</td>
                </tr>
                <tr>
                    <td>16:30-17:45</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>18:00-19:15</td>
                    <td class="selected">Gimnasio</td>
                    <td class="selected">Gimnasio</td>
                    <td class="selected">Gimnasio</td>
                    <td class="selected">Gimnasio</td>
                    <td class="selected">Gimnasio</td>
                </tr>
                <tr>
                    <td>19:15-19:45</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>19:45-20:15</td>
                    <td class="selected">Pasear mascota</td>
                    <td class="selected">Pasear mascota</td>
                    <td class="selected">Pasear mascota</td>
                    <td class="selected">Pasear mascota</td>
                    <td class="selected">Pasear mascota</td>
                </tr>
            </table>
        </div>
        <!-- My Schedule section end -->


        <!-- My Skills section start -->
        <div class="section">
            <h1><span>Mis conocimientos</span></h1>
            <ul>
                <li>HTML <br />
                    <progress min="0" max="100" value="80"></progress>
                </li>
                <li>JavaScript <br />
                    <progress min="0" max="100" value="50"></progress>
                </li>
                <li>Java 8 <br />
                    <progress min="0" max="100" value="50"></progress>
                </li>
                <li>Python <br />
                    <progress min="0" max="100" value="40"></progress>
                </li>
                <li>Ruby <br />
                    <progress min="0" max="100" value="40"></progress>
                </li>
            </ul>

        </div>
        <!-- My Skills section end -->


        <!-- Media section start -->
        <div class="section">
            <h1><span>Mi canal de Youtube</span></h1>
            <iframe height="150" width="300" src="https://www.youtube.com/embed/Q6_5InVJZ88" allowfullscreen frameborder="0"></iframe>
        </div>
        <!-- Media section end -->

        <!-- Form section start -->
        <div class="section">
            <h1><span>Contacta conmigo</span></h1>

            <svg class="face" height="100" width="100">
            <circle cx="50" cy="50" r="50" fill="#FDD835"/>
            <circle cx="30" cy="30" r="10" fill="#FFFFFF"/>
            <circle cx="70" cy="30" r="10" fill="#FFFFFF"/>
            <circle cx="30" cy="30" r="5" fill="#000000"/>
            <circle cx="70" cy="30" r="5" fill="#000000"/>
            <path d="M 30 70 q 20 20 40 0" stroke="#FFFFFF" stroke-width="5" fill="none" />
            </svg>

            <form method="post" action="RegistroServlet">
                <input id="name" name="name" placeholder="Nombre" type="text" maxlength="25" required /><br/>
                <input id="email" name="email" placeholder="Correo" type="email" maxlength="75" required /><br/>
                <textarea onkeyup="textCounter(this, 'counter', 300);" id="message" name="message" placeholder="Mensaje" maxlength="300" required ></textarea>
                <input disabled  maxlength="3" size="3" value=300 id="counter">
                <input type="submit" value="ENVIAR" class="submit" />                
            </form>
        </div>
        <!-- Form section end -->

        <!-- Contacts section start -->
        <div class="section" id="contacts">
            <h1><span>Sígueme en</span></h1>
            <div>
                <a href="https://www.sololearn.com/Profile/8420788" target="_blank">
                    <img alt="SoloLearn" src="https://www.sololearn.com/Uploads/icons/sololearn.png" />
                </a>
                <a href="#">
                    <img alt="Facebook" src="https://www.sololearn.com/Uploads/icons/facebook.png"/>
                </a>
                <a href="https://twitter.com/DeclareVarNoWar" target="_blank">
                    <img alt="Twitter" src="https://www.sololearn.com/Uploads/icons/twitter.png" />
                </a>
                <a href="https://www.linkedin.com/in/oscar-andres-d%C3%ADaz-cava-587668b7/" target="_blank">
                    <img alt="Twitter" src="media/linkedin-icon.png" />
                </a>
            </div>
        </div>
        <!-- Contacts section end -->

        <div class="copyright">
            &copy; 2018 My CV. Todos los derechos reservados.
        </div>
    </body>
</body>
</html>
