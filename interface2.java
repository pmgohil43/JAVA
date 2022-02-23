interface inter{
	void name();
}
class a implements inter{
	public void name(){
		System.out.println("interface implement here...");
	}
}
class interface2{
	public static void main(String[] args){
		a a1 = new a();
		a1.name();
	}
}