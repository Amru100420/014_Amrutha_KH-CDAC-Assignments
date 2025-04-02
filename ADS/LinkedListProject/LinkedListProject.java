import java.util.*;

public class LinkedListProject{
	Node start;
	static class Node{
		String name,phone;
		Node next;
	    Node(String name,String phone){			
			this.name=name;
			this.phone=phone;
			this.next=null;
		}
	}
		
	void addContact(String name, String phone){
		Node new_node = new Node(name, phone);
		
		if(start == null){
			start = new_node;
		}else{
			new_node.next = start;
			start = new_node;
		}
	}
	
	
	void removeContact(String name){
		
		if(start == null){
			System.out.println("No contacts available.");
			return;
		}
		
		Node temp = start, pre = null;
		if(start.name.equals(name)){
			start = temp.next;
			System.out.println("Contact removed: " + name);
			return;
		}
		while(temp != null && !temp.name.equals(name)){
			pre = temp;
			temp = temp.next;
		}
		if(temp == null){
			System.out.println("Contact not found.");
			return;
		}
		pre.next = temp.next;
		System.out.println("Contact removed: " + name);
		
	}
	
	
	void searchContact(String name){
		boolean found = false;
		Node temp = start;
		while(temp != null){
			if(temp.name.equals(name)){
				System.out.println("Contact found: " + temp.name + ", " + temp.phone);
			found = true;
			break;
			}
			temp = temp.next;
		}
		if(!found){
		System.out.println("Contact not found.");
		}
	}
	
	
	
	
	
	void displayContacts(){
		Node temp = start;
		
		if(temp == null){
			System.out.println("No Contacts, Please add your Contacts.");
		}else{
		System.out.println("Contact List:");
		while(temp != null){
			System.out.println(temp.name + "," + temp.phone);
			temp = temp.next;
		}
		
		
		} 
	}
	public static void main(String args[]){
		LinkedListProject LLP=new LinkedListProject();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("-----------------");
			System.out.println("This is a contact management system!!");
			System.out.println("1.Add Contact\n2.Remove Contact by name.\n3.Search Contact by name.\n4.Display all contacts in the list\n5.Exit");
			System.out.print("-----------------\nPlease enter your choice: ");
			int ch=sc.nextInt();
			sc.nextLine();
			switch (ch){
				case (1): 
				System.out.print("Enter name: ");
				String name=sc.nextLine();
				System.out.print("Enter number: ");
				String phone=sc.nextLine();
				LLP.addContact(name, phone);
				System.out.println("Contact added: " + name + ", " + phone);
				break;
				case (2): 
				System.out.print("Enter name : ");
				String name1 = sc.nextLine();
				LLP.removeContact(name1);
				break;
				case (3): 
				System.out.print("Enter name : ");
				String name2 = sc.nextLine();
				LLP.searchContact(name2);
				break;
				case (4): 
				LLP.displayContacts();
				break;
				case (5):System.out.println("ThankYou for visiting!!!!");
				System.exit(0);
				default:
				System.out.println("Wrong choice!!!!\nPlease try different choice");
			}
		}
	}
}
 
