// abstraction method, class, var

abstract class abstract1{
	abstract void abs1();
}
// we can not do two times extends in one class it means not able to multipal inheritance
class abstract2 extends abstract1{
	void abs1(){
		System.out.println("this is a abstract two...!");
	}
}
public class abstrac{
	public static void main(String args[])
	{
		abstract2 ab = new abstract2();
		ab.abs1();

	}
}