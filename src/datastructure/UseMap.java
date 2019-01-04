package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> GeneralStore = new ArrayList<String>();
		GeneralStore.add("G-Manager");
		GeneralStore.add("S-Supervisor");
		GeneralStore.add("SecurityAdmin");
		GeneralStore.add("SalesAssociated");
		GeneralStore.add("CustomerCReptv");

		List<String> SuperMarket = new ArrayList<String>();
		SuperMarket.add("Manager");
		SuperMarket.add("ShifManager");
		SuperMarket.add("D-Chief");
		SuperMarket.add("SalesPerson");
		SuperMarket.add("CustomerAssistance");

		Map<String, List<String>> businessField = new HashMap<String, List<String>>();
		businessField.put("Armani exchange", GeneralStore);
		businessField.put("C-Town", SuperMarket);

		System.out.println("OutPrint HashMap with For Each Loop :\n");
		for(Map.Entry<String,List<String>> carrierList : businessField.entrySet()){
			System.out.println(carrierList.getKey()+" >>> "+carrierList.getValue());
		}
		System.out.println("\n........................................\n");
		System.out.println("OutPrint HashMap with Iterator :\n");
		Iterator<Map.Entry<String,List<String>>> it = businessField.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" >>> "+pair.getValue());
		}
	}

}