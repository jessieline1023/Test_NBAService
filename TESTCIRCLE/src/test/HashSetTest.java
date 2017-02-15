package test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
  public static void main(String[] args){
	  Collection c = new HashSet();
	  c.add(new Name("f1","l1"));
	  c.add(new Name("f2","l2"));
	  c.add(new Name("f3","l3"));
	  Iterator i = c.iterator();
	  while(i.hasNext()){
		  Name n = (Name) i.next();
		  System.out.println(n.getFirstName());
	  }

	  
	  Collection t = new HashSet();
	  t.add(new Name("fff1","lll1"));						
	  t.add(new Name("f2","l2"));	  
	  t.add(new Name("fff3","lll3"));	
	  for(Iterator j = t.iterator(); j.hasNext();){
		  Name name2 = (Name)j.next();
		  if(name2.getFirstName().length()<3){
		  j.remove();
		  }
	  }
	  
	  System.out.println(t);
	  
	  
  }
}
