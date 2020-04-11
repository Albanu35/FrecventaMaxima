import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListsCreate {
	public static void prettyPrintArrayList(ArrayList<String> values,
            String delim, String message) {
System.out.print(message);
for(int i=0; i<values.size(); i++) {
System.out.print(values.get(i) + delim);
}
System.out.println();
}

	public static void main(String[] args) {
		ArrayList<Double> realValues = new ArrayList<Double>();
		realValues.add(0, Double.valueOf(10.5));
		realValues.add(0, Double.valueOf(0));
		realValues.add(0, Double.valueOf(-14.9));
		realValues.add(Double.valueOf(5.23));
		
	System.out.println(	"Dimensiunea colectie este: " + realValues.size());
		
		double firstValue = realValues.get(0);
		double thirdName = realValues.get(2);
		 
		System.out.println("The collection contains the following elements, in order:");
		// Notice we can print the whole array using the object name!
		System.out.println(realValues);
		
		System.out.println(firstValue + " " + thirdName); 
		
		System.out.println("Collection contains \"10.5\"? Answer: " + realValues.contains(10.5));

		System.out.println(realValues.indexOf(-14.9));
		
		realValues.remove(1);
		
		System.out.println(realValues);
		
		realValues.clear();
		System.out.println(realValues);
		
		ArrayList<String> names = 
			    new ArrayList<String>(Arrays.asList("John", "Lucy", "Anna", "Kelly", "Dean", "Lucy"));
			 
			  prettyPrintArrayList(names, ", ", "Names: ");
			 
			  int indexToSet = 3; //could be read from input
			  String elementToSet = "Angela"; //could be read from input
			  
			  if (indexToSet < names.size() && indexToSet >= 0) {
				  names.set(indexToSet, elementToSet);
			  }
			  prettyPrintArrayList(names, ", ", "Names: ");
	}
	

}
