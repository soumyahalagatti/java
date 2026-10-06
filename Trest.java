
class Parent {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

public class Trest extends Parent {
	public static void main(String[] args) {
		Trest bb = new Trest();
		bb.setA(8);
		int ss = bb.getA();
		System.out.println(ss);
	}
}