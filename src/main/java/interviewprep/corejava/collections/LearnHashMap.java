package interviewprep.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LearnHashMap {

	public static void main(String[] args) {
		Map<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1, "Selenium");
		hmap.put(2, "TestNG");
		hmap.put(3, "Cucumber");
		hmap.put(4, "Junit");
		
		for(Map.Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		for(Integer key : hmap.keySet()) {
			System.out.println(hmap.get(key));
		}
		
		Iterator<Map.Entry<Integer,String>> iterator = hmap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
