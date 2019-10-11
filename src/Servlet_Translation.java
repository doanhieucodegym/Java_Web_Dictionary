import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet_Translation",urlPatterns ="/translate")
public class Servlet_Translation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary =new HashMap<>();
        dictionary.put("hello","Xin chao");
        dictionary.put("good","tot");
        dictionary.put("book","sach");
        dictionary.put("computer","May tinh");
        String search = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result =dictionary.get(search);
        // tra ve ket qua  cua  hasmap
        if(result != null){
            writer.println("world:"+search+"</br>");
            writer.println("Result :" +result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
