 class Calculator{
 
	interface FunctionalInterface1{
		float operation(int a, int b);
	}
	public static void main(String[] args){
 
		FunctionalInterface1 add = (int a, int b) -> (a+b);
		FunctionalInterface1 difference = (int a, int b) -> (a-b);
		FunctionalInterface1 product = (int a, int b) -> (a*b);
		FunctionalInterface1 safeDivision = (int a, int b) ->{
			if(b != 0)
				return a/b;
			else
				return 0;
		};
		System.out.println(add.operation(5,8));
		System.out.println(difference.operation(8,5));
		System.out.println(product.operation(5,8));
		System.out.println(safeDivision.operation(8,5));
 
	}
}			