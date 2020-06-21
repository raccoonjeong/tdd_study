package more;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class EmployeeSearchServlet extends HttpServlet{
	private SearchBiz searchBiz;
	
	public void setModel(SearchBiz biz) {
		this.searchBiz = biz;
	}
	
	protected void service(MockHttpServletRequest request, MockHttpServletResponse response) 
		throws ServletException, IOException {
		
		// SearchBiz searchBiz = new SearchBiz(); 결합도가 너무 높음!
		Employee employee = this.searchBiz.getEmployeeByEmpid(
				request.getParameter("empid"));
		
		request.setAttribute("employee", employee);
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/SearchResult.jsp");
		dispatcher.forward(request, response);
	}

}
