package basic;

public class LearnObject {
	
	//How to create a object
	//className objectName = new constructorOfClass();
	
	
	int num1=34;
	int num2=45;
	public static void main(String[] args) {
		LearnObject learn = new LearnObject();
		int total = learn.num1+learn.num2;
		System.out.println("Total value is "+total);
		
		//Can we create multiple object of same class?
		LearnObject obj = new LearnObject();
		obj.num1=66;
		obj.num2=77;
		int output=obj.num1*obj.num2;
		System.out.println("Output is "+output);
		
		//can we create another class object here? yes
		LearnDataType dataType = new LearnDataType();
		dataType.main(args);
		System.out.println(dataType.mobileBrand); // needs sysout because in DataType class, it's not printed
		dataType.isAvaiable=false; //reassign value
		System.out.println(dataType.isAvaiable); // prints latest value which is the reassigned one
		
		LearnStatic Ls = new LearnStatic();
		Ls.display();// non static so it needs object
		Ls.tvDisplay();
		LearnStatic.tvDisplay();//it's a static method so no need object but need class name
		
	
		
	}

}
