class Base{
	int i=99;
	void a(){
		System.out.println("sa");
	}
	Base(){
		a();
	}
}
public class Bs extends Base{
	int i=-1;
	public static void main(String argv[]){
		Base b=new Bs();
		System.out.println(b.i);
		b.a();
	}void a(){
		System.out.println("sd");
	}
}
