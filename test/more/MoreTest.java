package more;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoreTest {
	@Test
	public void test() {
		Attendee attendee = new Attendee();
		attendee.add("백");
		assertEquals("백", attendee.get(1));
	}

}
