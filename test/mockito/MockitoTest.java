package mockito;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MockitoTest {
	public List mockedList;
	
	@Before
	public void setup() {
		mockedList = mock(List.class);
	}

	@Test
	public void test1() {
		// Mock 객체를 사용한다.
		mockedList.add("item");
		mockedList.clear();
		
		// 검증
		verify(mockedList).add("item");
		verify(mockedList).clear();
	}
	
	@Test
	public void test2() {
		// Stub 만들기
		when(mockedList.get(0)).thenReturn("item");
		when(mockedList.size()).thenReturn(1);
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.size());
		System.out.println(mockedList.get(2));
		System.out.println(mockedList.get(1));
	}
	
	@Test
	public void test3() {
		List mockedList = mock(List.class);
		mockedList.add("item");
		verify(mockedList).add("item");
		verify(mockedList, times(1)).add("item");

		verify(mockedList, times(2)).add("box");
		
		verify(mockedList, never()).add("car");
		
		verify(mockedList, atLeastOnce()).removeAll(mockedList);
		verify(mockedList, atLeast(2)).size();
		verify(mockedList, atMost(5)).add("box");
		
	}
	
	@Test
	public void test4() {
		List mockedList = mock(List.class);
		System.out.println(mockedList.size());
		verify(mockedList).size();
	}
	
}
