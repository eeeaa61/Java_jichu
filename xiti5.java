public class xiti5{
	public static void main(String[]args){
		System.out.print("具有abcd=(ab+cd)2性质的四位数有:");
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