package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
public class Application {
    
	public void greet(){
		List<String> mylist=new ArrayList<>();
		mylist.add("sdf");
		for(String myString:mylist){
			System.out.println(myString);
		}
	}
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
    }
}