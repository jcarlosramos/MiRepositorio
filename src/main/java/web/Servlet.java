package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        
        String musicas[] = request.getParameterValues("musica")!=null ? request.getParameterValues("musica") : new String[0];
        
        String comentarios = request.getParameter("comentarios");
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parámetros procesados por el Servlet</h1>");
        
        out.println("<table border='1'>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Usuario");
        out.println("</td>");
        out.println("<td>");
        out.println(usuario);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Password");
        out.println("</td>");
        out.println("<td>");
        out.println(password);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Tecnologías");
        out.println("</td>");
        out.println("<td>");
        
        for(int i=0; i<tecnologias.length; i++){
            out.println(tecnologias[i]);
            if(i!=tecnologias.length-1) out.println(" / ");
        }
        
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Género");
        out.println("</td>");
        out.println("<td>");
        out.println(genero);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Ocupación");
        out.println("</td>");
        out.println("<td>");
        
        switch(ocupacion){
            case "1": ocupacion = "Profesor"; break;
            case "2": ocupacion = "Ingeniero"; break;
            case "3": ocupacion = "Jubilado"; break;
            case "4": ocupacion = "Otro"; break;
        }
        
        out.println(ocupacion);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Música Favorita");
        out.println("</td>");
        out.println("<td>");
        
        for(int i=0; i<musicas.length; i++){
            out.println(musicas[i]);
            if(i!=musicas.length-1) out.println(" / ");
        }
        
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Comentarios");
        out.println("</td>");
        out.println("<td>");
        out.println(comentarios.equals("Escribir un texto") ? "" : comentarios);
        out.println("</td>");
        out.println("</tr>");
        
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
