package example2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		System.out.println(a.x);	//10
		System.out.println(a.y);	//20
		a.m2();						//m2---A
		a.m3();						//m3---A
		
		B b = new B();
		System.out.println(b.x);	//10
		System.out.println(b.y);	//200
		b.m1();						//m1---B
		b.m2();						//m2---A
		b.m3();						//m3---A
		
		C c = new C();
		System.out.println(c.x);	//100
		System.out.println(c.z);	//300
		System.out.println(c.y);	//200
		c.m3();						//m3---C
		c.m4();						//m4---C
		c.m1();						//m1---B
		c.m2();						//m2---A
		
		B b1 = new C();
		System.out.println(b1.y);	//200
		System.out.println(b1.x);	//10
		b1.m1();					//m1---B
		b1.m2();					//m2---A
		b1.m3();					//m3---C
		
		A a1 = new B();
		System.out.println(a1.x);	//10
		System.out.println(a1.y);	//20
		a1.m2();					//m2---A
		a1.m3();					//m3---A
		
		A a2 = new C();
		System.out.println(a2.x);	//10
		System.out.println(a2.y);	//20
		a2.m2();					//m1---A
		a2.m3();					//m3---C
	}

}
