
public class TestDoctor {

		public static void main(String [] args)
		{
			Specialist spObj = new Specialist("Mary", 1234, "New York", "Medicine");
			spObj.display();
			NonSpecialist nonSpObj = new NonSpecialist("John", 5321,"Sydney");
			nonSpObj.display();
		}
	}
