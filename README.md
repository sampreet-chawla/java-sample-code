# java-sample-code
Java sample code for Azavea job application 

### Concept under test
Java Lambda expression and Steam API in Java 8 and above

#### About WebPagination
WebPagination.java demonstrates the pagination and sorting functionality of Java objects acheived with the use of Java Lambda expression and Steam API in Java 8 and above. For the sake of simplicity, Lists of Strings are used for a mock representation of objects. 

Function under test - fetchItemsToDisplay()

Inputs -   
1. List<List<String>> items - a 2D List of Strings in the format Item name, relevance and price. Sample Item - {"item1","10","15.01"} 
2. int sortParameter - 0, 1 or 2 to sort by Item name, relevance or price respectively. 
3. int sortOrder - 0 for ascending and 1 for descending respectively. 
4. int itemsPerPage - How many items can be displayed at the maximum in a page
5. int pageNumber - The page number starting with 0 for the first page

Output - 
List of item names in desired sort order with the sort parameter as per the specified page number and number of items in a page.

Minimum requirements - JDK 8 Installaed

To compile the file - 
```java
javac com/basic/WebPagination.java
```
A class file is generated within the com/basic folder

To run the file - 
```java
java com.basic.WebPagination
```

Program Output - 

```

Web Pagination Demonstration - using Java Lambda expression and Steam API in Java 8+
*****************************************************


Item name, Relevance and Price

Sample Input:
[[item1, 10, 15.01], [item2, 3, 4.99], [item3, 17, 8.66]]


Sample Output with number of items per page as 2

*****************************************************
Ascending by name, page 0: [item1, item2]
Ascending by name, page 1: [item3]
Descending by name, page 0: [item3, item2]
Descending by name, page 1: [item1]
Ascending by relevance, page 0: [item2, item1]
Ascending by relevance, page 1: [item3]
Descending by relevance, page 0: [item3, item1]
Descending by relevance, page 1: [item2]
Ascending by price, page 0: [item2, item3]
Ascending by price, page 1: [item1]
Descending by price, page 0: [item1, item3]
Descending by price, page 1: [item2]
*****************************************************

```
