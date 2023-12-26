
public class AliPC {
	private static int Price;
	private int discount;
	private int cashAvailable;


	public void setPrice(int price) {
		Price = price;
	}
	public void setCashAvailable(int cashAvailable) {
		this.cashAvailable = cashAvailable;
	}
	public void setDiscount(int price ,int cashAvailable) {
		if (price > cashAvailable) {
			discount = (price - cashAvailable);
		}
	}

	public int getPrice() {
		return Price;
	}
	public int getCashAvailable() {
		return cashAvailable;
	}
	public int getDiscount() {
		return discount;
	}
	
}
