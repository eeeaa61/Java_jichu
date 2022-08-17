public class xiti4{
	public static void main(String[]args){
		//int x=0;
		for(int sz=100;sz<=1000;sz++){
			int bw=sz/100;
			int sw=(sz%100)/10;
			int gw=sz%10;
			if((bw+sw+gw)==5){
				//x++;
				System.out.print(sz+"  ");
			}
		}
	//System.out.println("100到1000之间有:"+x+"个数字之和为5的/整数");
	}
}