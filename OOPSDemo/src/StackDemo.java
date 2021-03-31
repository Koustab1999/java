import java.util.Stack;

import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;
public class StackDemo {

	public static void main(String[] args)
	{
Stack<String> s =new Stack<String>();
s.push("Java");
s.push("C++");
s.push("C#");
s.push("Python");
System.out.println(s);
s.pop();					// Last in first out 
System.out.println(s);

/* Iterator<String> itr=s.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
	}
System.out.println("Peek:"+s.peek());
	}*/

}
}

