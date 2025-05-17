package Day1;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		int a=10 , b=20 , temp;
		System.out.println("Before Swap" +"\na="+ a+"\nb="+ b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap" +"\na="+ a+"\nb="+ b);
	}

}
