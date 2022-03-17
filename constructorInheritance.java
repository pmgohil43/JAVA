// Constructor Inheritance

interface inter{
	void face();
}
class a implements inter{
	public void face(){
		System.out.println("Interface");
	}
	a(){
		face();
		System.out.println("A Constructor");
	}
}
class b extends a{
	b(){
		System.out.println("B Constructor");
	}
}
public class constructorInheritance{
	public static void main(String[] args){
		b b1 = new b();
		//b.face();// error: non-static method face() cannot be referenced from a static context
	}
}