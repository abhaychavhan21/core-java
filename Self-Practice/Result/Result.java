class Grade{
	public static void main(String[]args){
		int marks =35;
		
		
		if(marks>=35 && marks<=100){
			System.out.println("Pass");

		}else if(marks>100 || marks<1){
			System.out.println("invalid");
		}

		else{
			System.out.println("Fail");
		}
	}
}