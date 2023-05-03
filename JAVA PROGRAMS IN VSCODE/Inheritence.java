class Base_Model{
    public Base_Model(){
        System.out.println("This is the CONSTRUCTOR of BASE Class");
    }
    public void model_Name() {
        System.out.println("This is the Base Model of the MOBILE DEVICE.");
    }
} 
class New_Model extends Base_Model{
    public New_Model(){
        System.out.println("This is the CONSTRUCTOR of DERIVED Class");
    }
    public void model_Name() {
        System.out.println("This is the New Model of the MOBILE DEVICE.");
    }
}
public class Inheritence {
	public static void main(String[] args) {
		// Base_Model nokia = new Base_Model();
        // Base_Model a = new New_Model();
        New_Model b = new New_Model();
		// nokia.model_Name();
	}

}


