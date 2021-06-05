
public class DataTypes {
	//Primitive :Don't have any reference value. Primitive do not any method.
	//Non-Primitive: Have reference value. Non-Primitive has method.
	
	int age=20;                 //4 bytes
	char name='S';				//2 bytes
	long roll=1000;				//8 bytes
	double rupees=10.13;		//8 bytes
	String str="Shweta";        //6*2=12 bytes	String is the collection of array  of char data types.	
//Total memorary used = 22+22 = 44 bytes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes obj1 = new DataTypes();
		
		System.out.println("name=" +obj1.name+ "\tAge="+obj1.age+"\tRoll-no:"+obj1.roll+"\trRupees:"+obj1.rupees);  //22 bytes
		DataTypes obj2 = new DataTypes();	//22 Bytes
		System.out.println("name=" +obj2.name+ "\tAge="+obj2.age+"\tRoll-no:"+obj2.roll+"\trRupees:"+obj2.rupees);

	}

}
