import javax.servlet.*;
import java.io.IOException;


public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("in init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("in get servlet config");
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
           throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        System.out.println("in get servlet info");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("in destroy");
    }
}
