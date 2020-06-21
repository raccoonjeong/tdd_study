package more;

import java.util.ArrayList;
import java.util.List;

public class Attendee {

	private List<String> attendeeList = new ArrayList<>();
	
	public void add(String string) {
		attendeeList.add(string);
	}

	public Object get(int i) {
		return attendeeList.get(i-1);
	}

}
