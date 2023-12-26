
import java.util.Scanner;

public class PurchasePC extends AliPC {
	public PurchasePC() {
		super();
	}

	public static void main(String[] args) {
		AliPC myPc = new AliPC();
		Scanner sc = new Scanner(System.in);

		myPc.setPrice(8000);
		System.out.println("Ali PC is offered with "+ myPc.getPrice());

		System.out.println("Please enter how much money you have");
		int cashavalible=sc.nextInt();
		myPc.setCashAvailable(cashavalible);

		myPc.setDiscount(myPc.getPrice(), myPc.getCashAvailable());
		sc.close();
		// Thank "java T point" for the loops below.
		final int size = 8;  
        final String msg = " Congrats ";  
          
        // nested for loop to print the upper part of Heart  
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 4 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                    System.out.print('*');  
                } else {  
                    System.out.print(' ');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
          
        // for loop to print the lower part of Heart  
        for (int m = 1; m <= 2 * size; m++) {  
            for (int n = 0; n < m; n++) {  
                System.out.print(' ');  
            }  
   
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                if (m >= 2 && m <= 4) {  
                    int position = n - (4 * size - 2 * m - msg.length()) / 2;  
                    if (position < msg.length() && position >= 0) {  
                        if (m == 3) {  
                            System.out.print(msg.charAt(position));  
                        } else {  
                            System.out.print(' ');  
                        }  
                    }  
                    else {  
                        System.out.print('*');  
                    }  
                }  
                else {  
                    System.out.print('*');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
		System.out.println("Your the customer number 111 you got a discount with "+ myPc.getDiscount()+"$");
    
		System.out.println("The PC price before: "+ myPc.getPrice()+"$"+" || the new price: "+ myPc.getCashAvailable()+"$"+"||400 Discount amount is: "+ myPc.getDiscount()+"$"); 
		}
		
		

	}

	


