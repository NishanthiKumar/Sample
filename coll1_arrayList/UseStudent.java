package coll1_arrayList;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student std1=new Student("Nisha",20,123,18000,false);
		
		Student std2=new Student("Sasi",22,124,36000,true);
		
		Student std3=new Student("Karthi",19,125,25000,true);
		
		Student std4=new Student("Bharathi",21,126,13000,false);
		
		Student std5=new Student("Sathish",26,127,19000,true);
		
		
		ArrayList<Student> studentDetails=new ArrayList<>();
		studentDetails.add(std1);
		studentDetails.add(std2);
		studentDetails.add(std3);
		studentDetails.add(std4);
		studentDetails.add(std5);
		
		
		for(Student s:studentDetails) {
			System.out.println(s.getAge());
		}
		
		/*for(int i=0;i<studentDetails.size();i++) {
			System.out.println(studentDetails.get(i).name);
		}*/
		//studentDetails.forEach(x -> System.out.println(x));
		
		studentDetails.forEach(x ->{
			if(x.getAge()>18){
				System.out.println(x.getName());
				}
			});
		
		ArrayList<Student> female=new ArrayList<>();
		for(Student s:studentDetails) {
			if(s.getIsMale()==false) {
				female.add(s);
			}
		}
	//	female.forEach(x -> System.out.println(x.name));
		
		
	}

}
