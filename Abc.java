package Test;


interface parents4 {
	void m1();
}

class Abc implements parents4 {

	public void m1() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Abc bb = new Abc();
		bb.m1();
	}

}


