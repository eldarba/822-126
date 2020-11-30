package app.core.dao.coupon;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.login.LoginManager;

@Component
public class CouponDao {

	private Map<Long, Coupon> map = new HashMap<Long, Coupon>();
	@Autowired
	private LoginManager loginManager;

	public void addCoupon(Coupon coupon) {
		map.put(coupon.getId(), coupon);
		System.out.println("coupon added");
	}

	public Coupon getCoupon(Long id) {
		return map.get(id);
	}

	public Collection<Coupon> getAllCoupons() {
		return map.values();
	}

	public boolean deleteCoupon(Long id) {
		return map.remove(id) != null;
	}

	public LoginManager getLoginManager() {
		return loginManager;
	}

}
