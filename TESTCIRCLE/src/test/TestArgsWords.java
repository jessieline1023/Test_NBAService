package test;

import java.util.HashMap;
import java.util.Map;

public class TestArgsWords {
private static final Integer ONE = new Integer(1);
public static void main(String[] args){
	Map m = new HashMap();
	for(int i = 0; i< args.length; i++){
		Integer freq = (Integer) m.get(args[i]);
		m.put(args[i],(freq == null? ONE: new Integer(freq+i)));
	}
	System.out.println(m);
	
}


}
