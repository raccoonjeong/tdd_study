package more;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.*;
import org.springframework.mock.web.*;

public class EmployeeSearchServletTest {
	
	@Test
	public void testSearchByEmpid() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();
		
		request.addParameter("empid", "5874");
		
		SearchBiz biz = mock(SearchBiz.class); // 설계가 잘 됐다면 인터페이스여야 함
		Employee expectedEmployee = new Employee("박성철", "5874", "fupfin", "회장");
		when(biz.getEmployeeByEmpid(anyString())).thenReturn(expectedEmployee);
		
		EmployeeSearchServlet searchServlet = new EmployeeSearchServlet();
		searchServlet.setModel(biz);
		searchServlet.service(request, response);
		
		Employee employee = (Employee)request.getAttribute("employee");
//		assertEquals("박성철", employee.getName());
//		assertEquals("5874", employee.getEmpId());
//		assertEquals("fupfin", employee.getId());
//		assertEquals("회장", employee.getPosition());
	
		assertEquals("객체비교", expectedEmployee, employee);
		assertEquals("/SearchResult.jsp", response.getForwardedUrl());
		
	}
	

}
