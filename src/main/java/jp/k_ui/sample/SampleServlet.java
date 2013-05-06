package jp.k_ui.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * a sample http servlet.
 * 
 * <p>
 * Do not use {@link WebServlet} for reusability. The deployment infomation is
 * defined by {@link SampleServletContextListener}
 */
// @WebServlet
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.getWriter().append("<p>hello, foo").close();
	}
}
