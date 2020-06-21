package more;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void testListEquals_NotSorted_1() {
		// 1. 자바 기본형(primitive type)이나 String이 컬렉션에 들어 있는 경우
		// 기본적으로 컬렉션은 안에 담긴 객체를 열거 형태로 꺼내서 순차적 equals를 하게 됨.
		List<String> listA = new ArrayList<>();
		listA.add("변정훈");
		listA.add("조연희");

		List<String> listB = new ArrayList<>();
		listB.add("변정훈");
		listB.add("조연희");
		
		assertEquals("리스트 비교", listA, listB);
	}
	
	@Test
	public void testListEqual_NotSorted_2() {
		List<Employee> listA = new ArrayList<Employee>();
		listA.add(new Employee("변정훈"));
		listA.add(new Employee("조연희"));

		List<Employee> listB = new ArrayList<Employee>();
		listB.add(new Employee("변정훈"));
		listB.add(new Employee("조연희"));
		
		assertEquals("리스트 비교", listA.toString(), listB.toString());
	}

}
