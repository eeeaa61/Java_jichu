import java.util.Scanner;
public class xiti1{
	public static void main(String[]arge){
		Scanner input=new Scanner(System.in);
		System.out.print("需要计算第几人:");
		int r=input.nextInt();
		System.out.print("第一人的年龄:");
		int n=input.nextInt();
		for(int y=1;y<=r-1;y++){
			n=n+2;
		}
		System.out.print("他的年龄是"+n);
		System.out.println("岁");
	}
}