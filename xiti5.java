public class xiti5{
	public static void main(String[]args){
		System.out.print("����abcd=(ab+cd)2���ʵ���λ����:");
		for(int x=1000;x<=9999;x++){
			int a,b;
			a=x/100;
			b=x%100;
			if(x==(a+b)*(a+b)){
				System.out.print(x+"\t");
			}
		}
	}
}