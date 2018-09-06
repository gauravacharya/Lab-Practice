import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveStudent {
public static void main(String[] args) {
	List<Student> list = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of students record want to save : ");
	int count = sc.nextInt();
	System.out.println("Enter student details : ");
	for(int i=0;i<count;i++) {
		System.out.println("Enter student no. : " + i);
		String firstname = sc.next();
		String lastname = sc.next();
		String address = sc.next();
		int phymarks = sc.nextInt();
		int chemmarks = sc.nextInt();
		int mathmarks = sc.nextInt();
		int perc = calculate(phymarks,chemmarks,mathmarks);
		list.add(new Student(firstname, lastname, address, perc));
	}
	
	for(Student student : list) {
		System.out.println(student.getFirstname()+ student.getMarks());
	}
	
}

private static int calculate(int phymarks, int chemmarks, int mathmarks) {
	
	return 56;
}
}
