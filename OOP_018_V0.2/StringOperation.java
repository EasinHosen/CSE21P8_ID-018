
public class StringOperation {
	
	public void charAt(String str) {
		System.out.println("1.charAt() returns Character at a position."+"\nIn this case at position " 
	+  (str.length()-1) + " is: \'" +str.charAt(str.length()-1)+"\'");;
	}
	
	public void chars(String str) {
		System.out.println("\n2.chars() returns the code point value(ASCII) of each characters: ");
		str.chars().forEach(System.out::println);
	}
	
	public void codePointAt(String str) {
		System.out.println("\n3.codePointAt() returns code point value(ASCII) at position a position "
	+ "\nIn this case at position " +(str.length()-1) +" is: \'" +str.codePointAt(str.length()-1)+"\'");
	}
	
	public void codePointBefore(String str) {
		System.out.println("\n4.codePointBefore() returns code point value(ASCII) before a position "
	+"\nIn this case before position " + (str.length()-1) +" is: " +str.codePointBefore((str.length()-1)));
	}
	
	public void codePointCount(String str) {
		System.out.println("\n5.codePointCount() returns the number of unicode code points at a range." 
	+"\nIn this case(0 to end) which is: " +str.codePointCount(0, str.length()));
	}
	
	public void codePoints(String str) {
		System.out.println("\n6.codePoints() returns each char from string as ASCII value." 
	+"\nIn this case: ");
		str.codePoints().forEach(System.out::println);
	}
	
	public void compareTo(String str) {
		System.out.println("\n7.compareTo() compares two string lexicographically."
	+"\nComparing Hello with Hello: " +str.compareTo("Hello"));
	}

	public void compareToIgnoreCase(String str) {
		System.out.println("\n8.compareToIgnoreCase() compares two string lexicographically ignoring Case" 
	+"\nComparing Hello with hello: " +str.compareToIgnoreCase("hello"));
		
	}

	public void concat(String str) {
		System.out.println("\n9.concat() adds new string to the existing string." +
				"\nAdding world after Hello: " + str.concat(" world"));
		
	}

	public void contains(String str) {
		System.out.println("\n10.contains() returns boolean if certain char or pattern exists in the string: "
				+ "\nChecking if A exists in Hello: " + str.contains("A"));
	}

	public void contentEquals(String str) {
		System.out.println("\n11.contentEquals() returns boolean if certain pattern exists in the string: "
				+ "\nChecking if lo exists in Hello: " + str.contains("lo"));
		
	}

	public void describeConstable(String str) {
		System.out.println("\n11.describeConstable() returns: "+str.describeConstable());
		
	}

	public void endsWith(String str) {
		System.out.println("\n12.endsWith() returns: "+ str.endsWith("est"));
		
	}

	public void equalsIgnoreCase(String str) {
		System.out.println("\n13.equalsIgnoreCase() returns: "+ str.equalsIgnoreCase("hello"));
		
	}

	public void getBytes(String str) {
		System.out.println("\n14.getBytes() returns: "+ str.getBytes());
		
	}

	public void getBytes2(String str) {
		System.out.println("\n15.another getBytes() returns: "+ str.getBytes());
		
	}

	public void hashCode(String str) {
		System.out.println("\n16.hashCode() returns: "+str.hashCode());
		
	}

	public void indent(String str) {
		System.out.println("\n17.indent returns: "+str.indent(0));
		
	}

	public void indexOf(String str) {
		System.out.println("\n18.indexOf() returns: "+ str.indexOf("e"));
		
	}

	public void indexOf1(String str) {
		System.out.println("\n19.another indexOf() returns: " + str.indexOf("lo"));
		
	}

	public void intern(String str) {
		System.out.println("\n20.intern() returns: "+ str.intern());
		
	}

	public void isBlank(String str) {
		System.out.println("\n21.isBlank() returns: "+ str.isBlank());
		
	}

	public void isEmpty(String str) {
		System.out.println("\n21.isBlank() returns: "+ str.isEmpty());
		
	}

	public void lastIndexOf(String str) {
		System.out.println("\n21.lastIndexOf() returns: "+ str.lastIndexOf("l"));
		
	}

	public void lastIndexOf1(String str) {
		System.out.println("\n22.another lastIndexOf return: "+ str.lastIndexOf("ll"));
		
	}

	public void length(String str) {
		System.out.println("\n23.Length of the String is: "+str.length());	
		
	}
	
	public void repeat(String str) {
		System.out.println("\n24.repeat() returns: "+ str.repeat(3));
		
	}

	public void replace(String str) {
		System.out.println("\n25.replace() returns: "+ str.replace('e', 'a'));
		
	}

	public void strip(String str) {
		System.out.println("\n26.strip() returns: "+ str.strip());
		
	}

	public void stripIndent(String str) {
		System.out.println("\n27.stripIndent() returns: "+ str.stripIndent());
		
	}

	public void stripLeading(String str) {
		System.out.println("\n28.stripLeading() returns: "+ str.stripLeading());
		
	}

	public void stripTrailing(String str) {
		System.out.println("\n29.stripTrailing() returns: "+ str.stripTrailing());
		
	}

	public void substring(String str) {
		System.out.println("\n30.substring() returns: "+ str.substring(1));
		
	}

	public void toLowerCase(String str) {
		System.out.println("\n31.toLowerCase() returns: "+ str.toLowerCase());
		
	}

	public void toUpperCase(String str) {
		System.out.println("\n32.toUpperCase() returns: "+ str.toUpperCase());
		
	}

	public void trim(String str) {
		System.out.println("\n32.trim() returns: "+ str.trim());
		
	}
	
	

}
