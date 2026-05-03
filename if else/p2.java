class Demo{
	public static void main(String[]args){
		int unit = 210;
		if(unit<=100){
			System.out.println(unit*5);
		}else if(unit>100 && unit<=200){
			System.out.println((500+(unit-100)*(7)));
		}else if(unit>200){
			System.out.println((1200 + (unit - 200) *(10) ));
		}else{
			System.out.println("ERROR");
}
}
}