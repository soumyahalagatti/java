package Test;

interface Parent
{
	void m1();
}
class Demo implements Parent {

	public void m1() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Demo bb = new Demo();
		bb.m1();
	}

}
	

