import java.util.Scanner;
public class ji_ou_pan_duan{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ�жϵ�����:");
		int shu=input.nextInt();
		if(shu%2==0){
			System.out.println("����ż��");
		}
		else{
			System.out.println("��������");
		}
	}
}