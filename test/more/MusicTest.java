package more;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MusicTest {
	// 동치비교
	@Test
	public void testEquals_case1() {
		Music musicA = new Music("Better in time", "Leona Lewis");
		Music musicB = musicA;
		assertEquals(musicA, musicB);
	}
	
	@Test
	public void testEquals_case2() {
		Music musicA = new Music("Better in time", "Leona Lewis");
		Music musicB = new Music("Better in time", "Leona Lewis");
		// assertEquals(musicA, musicB);
		assertEquals(musicA.toString(), musicB.toString());
		assertEquals(musicA, musicB);
	}
	
}
