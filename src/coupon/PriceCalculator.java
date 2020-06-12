package coupon;

public class PriceCalculator {
	public int getOrderPrice(Item item, ICoupon coupon) {
		// 쿠폰이 유효하고 적용 가능하면
		if(coupon.isValid() && coupon.isAppliable(item)) {
			return (int)(item.getPrice()*getDiscountRate(coupon.getDiscountPercent()));
		}
		return item.getPrice();
	}
	private double getDiscountRate(int percent) {
		return (100 - percent) / 100d;
	}

}
