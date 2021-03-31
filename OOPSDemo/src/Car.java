
//public class CarComposition {
	public class Car
	{
	    //final will make sure engine is initialized
	    private final Engine engine;  
	    String nameOfCar;
	    String modell;
	    
	    public Car(String nameOfCar, String modell)
	    {
	       engine  = new Engine("POWERHIGH", "ABC");
	       this.nameOfCar = nameOfCar;
	       this.modell = modell;
	    }
	    
	    public void showAlldetails()
	    {
	        System.out.println("Name of Car ="+nameOfCar);
	        System.out.println("Name of Model ="+modell);
	        System.out.println("Engine used in Car ="+engine.typeOfEngine);
	        System.out.println("Engine name of Car ="+engine.nameOfEngine);
	    }
	    
	}
	class Engine 
	{
	    String typeOfEngine;
	    String nameOfEngine;
	    
	    Engine(String typeOfEngine, String nameOfEngine)
	    {
	        this.typeOfEngine = typeOfEngine;
	        this.nameOfEngine = nameOfEngine;
	    }
	}
	class ShowRoom
	{
	    public static void main(String arg[])
	    {
	        Car car = new Car("BMW", "5X");
	        car.showAlldetails();
	    }
	}

