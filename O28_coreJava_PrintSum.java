package corejava_assignments;

class Complex{
	int real;
	int img;

public Complex(int real ,int img){
	this.real = real;
	this.img =img;
}
public void print(){
	System.out.println(real+" "+img);
	}
public static Complex add(Complex c ,Complex c1){
	Complex a = new Complex (0,0);

	a.img = c.img + c1.img;
	a.real = c.real + c1.real;
	
		return a;
	}
}

public class O28_coreJava_PrintSum {
	public static void main(String[] args) {
		
	Complex c = new Complex (10,20);
	Complex c1 = new Complex(20,30);

	c.print();
	c1.print();	

	Complex c2 = Complex.add(c,c1);
	c2.print();
		
	}
}
