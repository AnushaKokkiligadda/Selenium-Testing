//method overloading
package func;

public class poly {
	public void add() {
		System.out.println("ntg");
	}
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void add(double g,double y) {
		 double  b1=g+y;
		System.out.println(b1);
		
	}
	public void add(String s1,String s2) {
		String s3=s1+s2;
		System.out.println(s3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly p=new poly();
		p.add();
		p.add(2,4);
		p.add(2.3,5.9);
		p.add("g","y");
		

	}

}
