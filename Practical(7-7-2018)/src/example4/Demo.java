package example4;

public class Demo {

	public Object m1()
	{
		System.out.println("m1---");
		return "cjc";
	}
	public static void main(String[] args) {
		
		Demo d = new Demo();
		Object o = d.m1();
		System.out.println(o);
		
		//String s = d.m1();		//CE
		System.out.println("========");
		String s = (String) d.m1();
		//System.out.println(null);
		System.out.println(s);
		//System.out.println(System);
		System.out.println(System.class);
	}
	
}
