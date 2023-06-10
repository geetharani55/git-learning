package basic;
public class Sum
{
	public static void main(String[] kk)
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
//java print
		System.out.printf("Sum of c is "+c+"\n");
//c  print
		System.out.printf("Sum of c is %d \n",c);
//Sum of two integers is 30
		
	
//1. .30.
//java print
		System.out.println("."+c+".");
//c print
		System.out.printf(".%d.\n",c);
	
//2. 10 20 30
//java print
		System.out.println(a+" "+b+" "+c);
//c print
		System.out.printf("%d %d %d\n",a,b,c);

		
//3. sum value is 30
//java print
		System.out.println("sum value is "+c);
//c
		System.out.printf("sum value is %d\n",c);

		
//4.10 20 30 30 20 10
//java print
		System.out.println(a+" "+b+" "+c+" "+c+" "+b+" "+a);
//c
		 System.out.printf("%d %d %d %d %d %d \n",a,b,c,c,b,a);
	
//5.a=10 b=20 c=30
// java print
		System.out.println("a"+"="+a+" "+"b"+"="+b+" "+"c"+"="+c);
//c print
		System.out.printf("a=%d b=%d c=%d\n",a,b,c);
		
	
//6.a=a b=b c=cc
//java print
		System.out.println("a"+"="+"a"+" "+"b"+"="+"b"+" "+"c"+"="+"c"+"c");
//c print
		System.out.printf("a=a b=b c=cc \n");
		
	
//7.10=10 20=20 30=30
//java print
		System.out.println(a+"="+a+" "+b+"="+b+" "+c+"="+c);
//c print
		System.out.printf("%d=%d %d=%d %d=%d \n",a,a,b,b,c,c);
		
		
//8.10=a 20=b 30=c
//java print
		System.out.println(a+"="+"a"+" "+b+"="+"b"+" "+c+"="+"c");
//c print
		System.out.printf("%d=a %d=b %d=c \n",a,b,c);
	
		
//9.10=30 b=10 c=a b a a=10
//java print
		System.out.println(a+"="+c+" "+"b"+"="+a+" "+"c"+"="+"a"+" "+"b"+"a"+" "+"a"+"="+a);
//c print
		System.out.printf("%d=%d b=%d c=a b a a=%d \n",a,c,a,a);
		
		
//10. a b c=c 30=20=10 10 20 20
//java printf
		System.out.println("a"+" "+"b"+" "+"c"+"="+"c"+" "+c+"="+b+"="+a+" "+a+" "+b+" "+b);
//c print
		System.out.printf("a b c=c %d=%d=%d %d %d %d \n",c,b,a,a,b,b);

		
	}
}
