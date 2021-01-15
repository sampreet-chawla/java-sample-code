package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * WebPagination.java demonstrates the pagination and sorting 
 * functionality of Java objects achieved with the use of Java Lambda expression and 
 * Steam API in Java 8 and above. For the sake of simplicity, 
 * Lists of Strings are used for a mock representation of objects.
 * 
 * @author Sampreet Chawla
 * @version 1.0
 * @since Java 8
 */
public class WebPagination {
	

	    /**
	     * Functionality - 
	     * 
	     * Complete the 'fetchItemsToDisplay' function below.
	     *
	     * The function is expected to return a STRING_ARRAY.
	     * The function accepts following parameters:
	     *  1. 2D_STRING_ARRAY items
	     *  2. INTEGER sortParameter
	     *  3. INTEGER sortOrder
	     *  4. INTEGER itemsPerPage
	     *  5. INTEGER pageNumber
	     */

	    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {

	    	return items.stream()
	    		.sorted( (List<String> list1, List<String> list2) -> {
	    			// To sort in ascending order, multiply by 1, 
	    			// and to sort in descending order, multiply by -1.
	    			int multiplyByValue = sortOrder == 0 ? 1 : -1;
	    			switch(sortParameter) {
	    				case 0: return list1.get(0).compareTo(list2.get(0)) * multiplyByValue;
	    				case 1: return Integer.valueOf(list1.get(1)).compareTo(Integer.valueOf(list2.get(1))) * multiplyByValue;
	    				case 2: return Float.valueOf(list1.get(2)).compareTo(Float.valueOf(list2.get(2))) * multiplyByValue;
	    				default: return list1.get(0).compareTo(list2.get(0)) * multiplyByValue;
	    			}
	    		})
	    		.skip(pageNumber * itemsPerPage)
	    		.limit(itemsPerPage)
	    		.map( (List<String> list) -> list.get(0))
	    		.collect(Collectors.toList());	    		

	    }
	    
	    /**
	     * The main method to test the fetchItemsToDisplay() method.
	     * 
	     * @param args Arguments if any (no arguments are required for this program)
	     */
	    public static void main(String[] args) {
	    	List<List<String>> items = new ArrayList<>();
	    	items.add(new ArrayList<>(Arrays.asList("item1","10","15.01")));
	    	items.add(new ArrayList<>(Arrays.asList("item2","3","4.99")));
	    	items.add(new ArrayList<>(Arrays.asList("item3","17","8.66")));
	    	
	    	System.out.println("\n\nWeb Pagination Demonstration \nUsing Java Lambda expression and Steam API in Java 8+");
	    	System.out.println("*****************************************************");
	    	
	    	System.out.println("\nItem name, Relevance and Price");
	    	System.out.println("\nSample Input: \n" + items);
	    	System.out.println("\n\nSample Output with number of items per page as 2\n");
	    	System.out.println("*****************************************************");
	    	
	    	System.out.println("Ascending by name, page 0: " + fetchItemsToDisplay(items, 0, 0, 2, 0));
	    	System.out.println("Ascending by name, page 1: " + fetchItemsToDisplay(items, 0, 0, 2, 1));
	    	System.out.println("Descending by name, page 0: " + fetchItemsToDisplay(items, 0, 1, 2, 0));
	    	System.out.println("Descending by name, page 1: " + fetchItemsToDisplay(items, 0, 1, 2, 1));
	    	
	    	System.out.println("Ascending by relevance, page 0: " + fetchItemsToDisplay(items, 1, 0, 2, 0));
	    	System.out.println("Ascending by relevance, page 1: " + fetchItemsToDisplay(items, 1, 0, 2, 1));
	    	System.out.println("Descending by relevance, page 0: " + fetchItemsToDisplay(items, 1, 1, 2, 0));
	    	System.out.println("Descending by relevance, page 1: " + fetchItemsToDisplay(items, 1, 1, 2, 1));
	    	
	    	System.out.println("Ascending by price, page 0: " + fetchItemsToDisplay(items, 2, 0, 2, 0));
	    	System.out.println("Ascending by price, page 1: " + fetchItemsToDisplay(items, 2, 0, 2, 1));
	    	System.out.println("Descending by price, page 0: " + fetchItemsToDisplay(items, 2, 1, 2, 0));
	    	System.out.println("Descending by price, page 1: " + fetchItemsToDisplay(items, 2, 1, 2, 1));
	    	
	    	System.out.println("*****************************************************");
		}


}
