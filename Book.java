import java.util.Scanner;
class Book{
	String name, author;
	int price,page_num;
	
	Book(String name, String author, int price, int page_num){
		this.name=name;
		this.author=author;
		this.price=price;
		this.page_num=page_num;
	}

	String toStrings(){
		String name,author,price,page_num;
		name="Book name: "+this.name+"\n";
		author="Author name: "+this.author+"\n";
		price="Price: "+this.price+"\n";
		page_num="Number of pages: "+this.page_num+"\n";

		return (name+author+price+page_num);
	}

	public static void main(String args[]){
		int n;
		String name,author;
		int price,page_num;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of books:");
		n=sc.nextInt();

		Book b[]=new Book[n];

		for (int i=0;i<n;i++){
			System.out.println("Enter name of book:");
			sc.nextLine();
			name=sc.nextLine();
			
			System.out.println("Enter author of a book:");
			author=sc.nextLine();

			System.out.println("Enter the price of book:");
			price=sc.nextInt();

			System.out.println("Enter the no. of pages of book:");
			page_num=sc.nextInt();

			b[i]=new Book(name,author,price,page_num);
		}

		System.out.println("Book Details:");
		for(int i=0;i<n;i++){
			System.out.println("Book "+(i+1)+" :\n"+b[i].toStrings());
		}
	}
}