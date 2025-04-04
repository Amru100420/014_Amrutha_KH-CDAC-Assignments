class Reverse{
	public static void main(String args[]){
		int a[] = {1, 2, 3, 4, 5}; 
		int r[] = new int[5];
        System.out.println("before reverse array: ");
        for (int i = 0; i <5; i++) 
		{ 
            System.out.print(a[i] + ",");
		}
		System.out.println();
		for (int i = 0; i <5; i++) 
		{ 
			r[i]=a[i];
		}
		
		System.out.println("After reverse array:");
		for (int i = 4; i >=0; i--) 
		{ 
            System.out.print(r[i] + ",");
		}
	}
	
}