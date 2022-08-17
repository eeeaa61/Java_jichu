import java.util.Scanner;
public class ji_ou_pan_duan{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入需要判断的数字:");
		int shu=input.nextInt();
		if(shu%2==0){
			System.out.println("这是偶数");
		}
		else{
			System.out.println("这是奇数");
		}
	}
}