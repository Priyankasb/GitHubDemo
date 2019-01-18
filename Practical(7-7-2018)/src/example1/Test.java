package example1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testgithub");	
		A a = new A();
		System.out.println(a.x);	//10
		System.out.println(a.y);	//20
		a.m1();						//m1---A
		a.m2();						//m2---A
		
		B b = new B();
		System.out.println(b.x);	//100
		System.out.println(b.y);	//20
		System.out.println(b.z);	//30
		b.m1();						//m1---A
		b.m2();						//m2---B
		b.m3();						//m3---B
		
		A a1 = new B();
		System.out.println(a1.x);	//10
		System.out.println(a1.y);	//20
		a1.m1();					//m1---A
		a1.m2();					//m2---B
	}

}
