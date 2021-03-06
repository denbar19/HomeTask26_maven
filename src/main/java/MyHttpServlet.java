import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("MyHttpServlet")
public class MyHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Map<String, String[]> p2 = req.getParameterMap();
        StringBuilder stringResponse = new StringBuilder();
        stringResponse.append("<body>");
        stringResponse.append("<h6>");
        stringResponse.append("<ol>");
        for (Map.Entry<String,String[]> entry : p2.entrySet()) {
            stringResponse.append("<li>");
            stringResponse.append(entry.getKey());
            stringResponse.append(" : ");
            String[] arr = entry.getValue();
            for (String s : arr) {
                if (arr.length == 1) {
                    stringResponse.append(s);
                } else {
                    stringResponse.append(s).append(", ");
                    stringResponse.deleteCharAt(arr.length - 1);
                }
            }
            stringResponse.append("</li>");
        }
        stringResponse.append("</ol>");
        stringResponse.append("</h6>");
        stringResponse.append("</body>");
        resp.getWriter().println(stringResponse.toString());
    }
}
