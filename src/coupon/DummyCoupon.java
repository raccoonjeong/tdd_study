package coupon;

public class DummyCoupon implements ICoupon {

	@Override
	public String getName() {
		throw new UnsupportedOperationException("호출되지 않을 예정임");
	}

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public int getDiscountPercent() {
		return 0;
	}

	@Override
	public boolean isAppliable(Item item) {
		return false;
	}

	@Override
	public void doExpire() {
	}

}
