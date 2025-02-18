package java_git_practice1;

import java.util.HashMap;

public class Lec6_HashMap_practice1 {
	public static void main(String[] args) {
		// HashMap is not fix we can add and remove any data in HashMap.
		// Syntax HashMap<String,String>variable=new HashMap<String,String>();
		//Store 5 StudentID and name use in HashMap.
		HashMap<Integer,String>StudentID=new HashMap<Integer,String>();
		StudentID.put(1001, "Khalid");
		StudentID.put(1002, "Jhone");
		StudentID.put(1003, "Bikash");
		StudentID.put(1004, "Barua");
		StudentID.put(1005, "David");
		StudentID.put(1006, "Ismail");
		StudentID.put(1007, "Tanim");
		StudentID.put(1008, "Tahim");
		
		//Access data
		StudentID.get(1008);
		//System.out.println(StudentID.get(1008));
		//Remove data
		StudentID.remove(1007);
		//Clear data (we do not use)
		//StudentID.clear
		//Size of data
		System.out.println(StudentID.size());
		System.out.println(StudentID);
		
		
		

	}


}
