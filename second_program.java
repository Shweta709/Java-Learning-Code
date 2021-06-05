//Adding Two number using class and method


public class second_program {
	 static int x=30;
	int y=20;
	
	void add(){
		 x = x +10;
		 y = y +30;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		second_program object =new second_program();
		System.out.println(x+ " " +object.y);
		object.add();
		System.out.println(x+ " " +object.y);
		object.add();
		System.out.println(x+ " " +object.y);
		second_program object1=new second_program();
		System.out.println("X="+x+ "\tY= " +object.y);
		object1.add();
		System.out.println(x+ " " +object1.y);
		object1.add();
		System.out.println(x+ " " +object1.y);
		
		
	}

}
