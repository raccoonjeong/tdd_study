package coupon;

public class User {
	
	private int totalCouponCount;

	public User(String string) {
		// TODO Auto-generated constructor stub
	}

	public Object getTotalCouponCount() {
		// TODO Auto-generated method stub
		return totalCouponCount;
	}

	public void addCoupon(ICoupon coupon) {
		totalCouponCount++;
	}

	public ICoupon getLastOccupiedCoupon() {
		// TODO Auto-generated method stub
		return new StubCoupon();
	}

}
