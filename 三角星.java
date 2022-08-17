public class 三角星{
	public static void main(String[]args){
		for(int a=1,f=1; a<=10;a++,f++){
			for(int s=1;s<=10-a;s++){
				System.out.print(" ");
			}
			for(int d=2;d<=a+f;d++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//int s=10;
//		for(int a=0;a<=s;a++){
//			System.out.println("");
//			for(int c=0;c<=(s-a);c++){
//				System.out.print(" ");
//			}
//			for(int b=0;b<=(a*2);b++){
//				System.out.print("*");
//			}
//		}


//int s=10;
//		for(int a=0;a<=s;a++){
//			System.out.println("");
//			for(int c=0;c<=(s-a);c++){
//				System.out.print(" ");
//			}
//			for(int b=0;b<=a;b++){
//				System.out.print("* ");
//			}
//		}