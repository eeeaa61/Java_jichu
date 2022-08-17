public class xiti3{
	public static void main(String[]args){
		int x=0;
		for(int y=10000;y<=99999;y++){
			if(y%10==6 && y%3==0){
				x++;
			}
		}
		System.out.println("个位数为6且能被3整除的五位数共有:"+x+"个");
	}
}