import java.util.Scanner;
public class xiti1{
	public static void main(String[]arge){
		Scanner input=new Scanner(System.in);
		System.out.print("��Ҫ����ڼ���:");
		int r=input.nextInt();
		System.out.print("��һ�˵�����:");
		int n=input.nextInt();
		for(int y=1;y<=r-1;y++){
			n=n+2;
		}
		System.out.print("����������"+n);
		System.out.println("��");
	}
}