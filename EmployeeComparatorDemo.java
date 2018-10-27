//Write a Comparator in Java to compare two employees based upon there name, departments and age?
import java.util.*;

public class EmployeeComparatorDemo {

	public static void main(String args[]){
		new EmployeeComparatorDemo().sortEmployeeList();
	}

	private void sortEmployeeList(){

		List<Employee> inputList = new ArrayList<>();
		inputList.add(new Employee("A", "X", 30));
		inputList.add(new Employee("A", "Y", 30));
		inputList.add(new Employee("A", "X", 40));
		inputList.add(new Employee("A", "Y", 40));
		inputList.add(new Employee("A", "X", 50));
		inputList.add(new Employee("A", "Y", 50));

		System.out.println("inputList:"+inputList);

		Collections.sort(inputList, new EmployeeComparator());
		System.out.println("outputList:"+inputList);
	}

	private class EmployeeComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2){
			int result = e1.name.compareTo(e2.name);

			if(result==0){
				result = e1.dept.compareTo(e2.dept);
				if(result==0){
					if(e1.age >  e2.age){
						result = 1;
					}else if(e1.age <  e2.age){
						result = -1;
					}else{
						result = 0;
					}
				}
			}

			return result;
		}
	}

	private class Employee {
		String name;
		String dept;
		int age;

		Employee(String name, String dept, int age){
			super();
			this.name = name;
			this.dept = dept;
			this.age = age;
		}

		@Override
		public String toString(){
			return "name:"+name+", dept:"+dept+", age:"+age;
		}
	}
}

