package Test;

class parent
{
	private int a;
	public int getA(){
		return a;
	}
public void setA(int a) {
this.a = a;
	}
}
class Xyz extends parent
{
	public static void main(String[] args) {
		Xyz bb = new Xyz();		
        bb.setA(8);
        int ss= bb.getA();
        System.out.println(ss);
	}
}