package buy.model.vo;

public class Payment {
	
	public int paymentNO;
	public String userId;
	public int payment_OK_NO;
	public int price;
	public String product_state;
	public String user_state;
	
	public Payment() {
		
	}

	public Payment(int paymentNO, String userId, int payment_OK_NO, int price, String product_state,
			String user_state) {
		super();
		this.paymentNO = paymentNO;
		this.userId = userId;
		this.payment_OK_NO = payment_OK_NO;
		this.price = price;
		this.product_state = product_state;
		this.user_state = user_state;
	}

	public int getPaymentNO() {
		return paymentNO;
	}

	public void setPaymentNO(int paymentNO) {
		this.paymentNO = paymentNO;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPayment_OK_NO() {
		return payment_OK_NO;
	}

	public void setPayment_OK_NO(int payment_OK_NO) {
		this.payment_OK_NO = payment_OK_NO;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProduct_state() {
		return product_state;
	}

	public void setProduct_state(String product_state) {
		this.product_state = product_state;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	@Override
	public String toString() {
		return "Payment [paymentNO=" + paymentNO + ", userId=" + userId + ", payment_OK_NO=" + payment_OK_NO
				+ ", price=" + price + ", product_state=" + product_state + ", user_state=" + user_state + "]";
	}
	
	
}
