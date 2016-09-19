import java.util.*;

class AB{
	
}

class A extends AB{

}
class B extends AB {
	
}

public class collection1 {
	
	public static void main(String[] args){
		
		HashSet<Object> hs = new HashSet<Object>();
		
		A a= new A();
		B b =new B();
		A aa= new A();
		B bb =new B();
		
		hs.add(a);
		hs.add(b);
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()){
			
			Object obj = it.next();
			AB ab = (AB)obj;
			System.out.println(ab);
			
			
			
		}
		
		Hashtable<String,AB> ht = new Hashtable<String,AB>();
		
		ht.put("EF",aa);
		ht.put("AC", bb);
		
		Enumeration<String> enu = ht.keys();
		
		while(enu.hasMoreElements()){
			String name = (String)enu.nextElement();
			System.out.println(name);
			
			
		}
		
		
		
		
	
		
	}
	
	

}
