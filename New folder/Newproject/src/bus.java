
public abstract class bus {

	abstract void wheels() ;
	public static void main(String args[]) {
		
		bus b = new access();
		b.wheels();
	}
}
class access extends bus{
		void wheels() {
			System.out.println("bus has 4 wheels");
		}
	
	
		}	
