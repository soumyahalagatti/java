package scsfgd;

public class Demo4 {
	int a =10;
	int b =20;

   void	add(int a , int b)
	{
		System.out.println("Hello" +(this.a+this.b));
		System.out.println("Hello" +(a+b));
	}
	 public static void main(String[] args) {
			Demo4 ff = new Demo4();
		   ff.add(2, 3);
		}
}
