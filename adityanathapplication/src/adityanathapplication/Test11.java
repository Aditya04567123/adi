package adityanathapplication;

import java.util.HashMap;
import java.util.Map;
public class Test11 {
	public static void main(String[] args) {
HashMap<Integer,String>map=new HashMap<>();
map.put(1000,"ABC");
map.put(2000,"DEF");
map.put(3000,"GHI");
for(Map.Entry<Integer,String>e:map.entrySet())
{
	System.out.println("Key:"+e.getKey()+"Value:"+e.getValue());
}
System.out.println("Name of Account Holder which has Id: 2000"+ map.get(1000));

	}
}
