package coupon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
	
	@Test
	public void testAddCoupon() throws Exception {
		User user = new User("area88");
		assertEquals("쿠폰 수령 전", 0, user.getTotalCouponCount());
		
		ICoupon coupon = new DummyCoupon(); 
				
		user.addCoupon(coupon);
		assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount());
	}
	
	@Test
	public void testGetLastOccupiedCoupon() throws Exception {
		User user = new User("area88");
		ICoupon eventCoupon = new StubCoupon();
		user.addCoupon(eventCoupon);
		ICoupon lastCoupon = user.getLastOccupiedCoupon();
		
		assertEquals("쿠폰 할인율", 7, lastCoupon.getDiscountPercent());
		assertEquals("쿠폰 이름", "VIP 고객 한가위 감사쿠폰", lastCoupon.getName());
	}
	
	// 할인 적용이 되는 아이템 테스트
	@Test
	public void testGetOrderPrice_discountableItme() throws Exception {
		PriceCalculator calculator = new PriceCalculator();
		// new Item(이름, 카테고리, 가격)
		Item item = new Item("LightSavor", "부엌칼", 100000);
		ICoupon coupon = new StubCoupon();
		assertEquals("쿠폰으로 인해 할인된 가격", 93000, calculator.getOrderPrice(item, coupon));
	}
	
	// 할인 적용이 안되는 아이템 테스트 <-- 페이크객체 써서 해결해야됨. 귀찮아서 실습안할란다
	@Test
	public void testGetOrderPrice_undiscountableItme() throws Exception {
		PriceCalculator calculator = new PriceCalculator();
		Item item = new Item("R2D2", "알람시계", 20000);
		ICoupon coupon = new StubCoupon();
		
		assertEquals("쿠폰 적용 안되는 아이템", 20000, calculator.getOrderPrice(item, coupon));
	}
	
	
	
}
