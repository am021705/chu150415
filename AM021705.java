import java.util.*;

class AM021705
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);

		int a,b,c;
		double s,num1,num2;

		System.out.printf("�п�Ja : ");
		a = input.nextInt();
		System.out.printf("�п�Jb : ");
		b = input.nextInt();
		System.out.printf("�п�Jc : ");
		c = input.nextInt();


		//s=Math.pow((b*b-4*a*c),0.5);
		num1=a+b;
		num2=a+c;


		System.out.printf("���׬� : " + num1 + " �M " + num2);
		
	}
}