import java.util.Scanner;

public class PurchasePC {

	public static void main(String[] args) {
		MyPC AliPC = new MyPC();
		AliPC.setPrice(500000000);
		Scanner sc = new Scanner(System.in);
		System.out.println("peles enter");
		int studentID=sc.nextInt();
		AliPC.cashonHand = studentID;
		AliPC.setDiscount(AliPC.SetDiscountMethod());
		sc.close();
		System.out.println("price = "+ AliPC.getPrice());
		System.out.println("Sum of "+ AliPC.cashonHand +" and "+ AliPC.getDiscount() +" = "+ AliPC.getPrice() );
		System.out.println("Discount = "+ AliPC.getDiscount());
		
		System.out.println("My name is ali almasabi and my student id is "+ AliPC.cashonHand);

	}

}
