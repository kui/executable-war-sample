package jp.k_ui.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * a sample http servlet.
 */
public class SampleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.getWriter().append("<p>hello, foo").close();
    }
}
