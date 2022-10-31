package student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface CollectionUtils {
	
	 static List<Student> populateData(){
		 List<Student> stdList = new ArrayList<>();
		// int rollNo, String name, LocalDate dob, Subject subject, double gpa
		 stdList.add(new Student(100, "Deepesh", LocalDate.parse("1997-08-13"), Subject.DBT, 8.9));
		 stdList.add(new Student(101, "Abhishek", LocalDate.parse("1999-08-15"), Subject.DBT,3.9));
		 stdList.add(new Student(100, "Rajnish",LocalDate.parse("1995-01-11"), Subject.ANGULAR, 7.5));
		 stdList.add(new Student(100, "Ashok", LocalDate.parse("1995-05-26"), Subject.DBT, 2.4));
		return stdList;
	}

}
