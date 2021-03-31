import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> al =new ArrayList<String>();
		
		al.add("Jim");
		al.add("Jerry");
		al.add("John");
		al.add(1,"Jive");
	
		System.out.println("element at 2nd position: "+al.get(2));
		ListIterator<String> itr =al.listIterator();
	
		System.out.println("traversing elements in forward direction...");
		while(itr.hasNext())      // list iterator methods of next data 
		{
			System.out.println(itr.next());
		}
		System.out.println("traversing elements in backward direction...");
		while(itr.hasPrevious())		//// list iterator methods for previous data
		{
			System.out.println(itr.previous());
		}
	}

}
