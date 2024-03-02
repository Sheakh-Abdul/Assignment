import java.util.*;
class Book{
	int  k=0, a,q=0,b=0;
	int userId[]= new int[6];
	int bookIndex[]= new int[10];
	int bookNum[]={2,3,2,1}, bookId[]={201,220,230,240};
	String title []= {"java Programming", "Let Us C","The C++ Programming Language","Head First Python"};
	String auther []= {"john", "Yashavant Kanetkar","Bjarne Stroustrup","Paul Barry"};
	String isAvailable []={"Available","Not Available"};
	


	void available(){
		System.out.println("Available Books:");
		for (int i=0;i<bookId.length ; i++) {
			if (bookNum[i]==0){
				k=1;
			}
			System.out.println("Book ID: "+ bookId[i]+", Title: "+title[i]+", Auther: "+auther[i]+", Availablity: "+bookNum[i]+" Books is "+isAvailable[k]);
		}		
	}
	void borrowedBook(){
		System.out.println("Borrowed Books:");
		for (int i=0;i<userId.length  ; i++) {
			int j = bookIndex[i];
			System.out.println(i+1 +". Book ID: "+ bookId[j]+", Title: "+title[j]+", Auther: "+auther[j]+"\nThis Books is borrowed to user "+userId[i]);
			
		}
		
	}

	void brrowBook(){
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter your user ID: ");
		userId[q] = sc.nextInt();
		q++;
		int i,n=0;

		System.out.print("\nEnter the book ID you want to borrow: ");
		a = sc.nextInt();
		for (i=0;i<bookId.length ; i++){
			if(a == bookId[i] && bookNum[i]>0){
				bookNum[i]= bookNum[i] -1;
				n=1;
				bookIndex[b]=i;
				b++;
			}
	}
		if (n==1)
			System.out.println("Book borrowed successfully!");
					
		else 
			System.out.println("Soory, This Book is not Available!");
			
	}

	void returnBook(){
		Scanner sc = new Scanner (System.in);
		int i,s,n=0,h=0;
		System.out.print("\nEnter your user ID: ");
		s = sc.nextInt();
		
		for (i=0; i<userId.length; i++){
			if (s==userId[i]){
				h++;
				break;
			}
		}
		if (h!=1)
			System.out.println("Please Enter Correct UserId!");
		else 
		{System.out.print("\nEnter the book ID you want to return: ");
				a = sc.nextInt();
				if (h==1)
				{for (i=0;i<bookId.length ; i++){
							//System.out.println(bookId[i]+" length "+ bookId.length);
							if(a == bookId[i]){
								bookNum[i]= bookNum[i] + 1;
								n=1;

							}
					}}}
		if (n==1)
			System.out.println("Book returned successfully!");
			
		
		else 
			System.out.println("Soory, This Book is not Available!\nPlease Enter Correct book ID!");
	}

	static int display(){
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("\nWelcome to the Virtual Management System!\n\n1. Borrow a Book\n2. Return a Book\n3. Display Available Books\n4. Display Borrowed Books\n5. Exit");
		n = sc.nextInt();
		return n;
	}


	public static void main(String[] args) {
		Book b1 = new Book();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your choice: ");
		// n = sc.nextInt();
		int i=0;
		while (i!=5){
			i =display();
			switch (i){
				case 1:{
					b1.brrowBook();

					break;
				}

				case 2:{
					b1.returnBook();
					break;
				}

				case 3:{
					b1.available();
					break;
				}

				case 4:{
					b1.borrowedBook();
					break;
				} 

				default:{
					System.out.print("Exiting Virtual Library Management System.\nThank you!\n");
					break;
				}
				

		}
		}
			}
		
	}
