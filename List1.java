package doc.xworkz.list;
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) {
		List list = new LinkedList<>();
		//List list =new ArrayList<>();
		list.add("ram");
		list.add("bhim");
        list.add(null);
        list.add("boom");
      ListIterator it = list.listIterator();
        while(it.hasNext()){ 
        String data =(String)it.next();
        System.out.println( data);
                }
       
     /*   Iterator itr =list.iterator();
        while(itr.hasNext()) {
        	String data =(String)itr.next();
        	System.out.println(data);
        }  */
	}
}
