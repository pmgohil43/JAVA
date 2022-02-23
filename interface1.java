// interface
interface interf{//create a interface
	void disp();
}
class a1 implements interf{
	public void disp(){
		System.out.println("It is a interface one...!");
	}
}
public class interface1{
	public static void main(String args[]){
		a1 a = new a1();
		a.disp();
	}
}