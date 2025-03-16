class Example {
	int num; 

	Example(){ 
		this.num = 10; 
		System.out.println(num);
    }
	Example (int n){ 
		this(); 
		this.num= n;
	}
	void display() { 
		System.out.println("Number=" +num); 
	} 
}
class ExampleDemo {
	public static void main(String args[]){ 
	Example el= new Example(); 
	el.display(); 
	Example e2= new Example(5); 
	e2.display();
	}
}