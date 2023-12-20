
public class MyPC {
private int Price;
private int discount;
int cashonHand;


public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getDiscount() {
	
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int SetDiscountMethod() {
	if (Price > cashonHand) {
		discount = (Price - cashonHand);
}
	return discount;


}
}
