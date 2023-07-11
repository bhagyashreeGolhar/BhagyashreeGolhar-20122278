package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class A
{
	Scanner sc=new Scanner(System.in);
	int isbnno;
	String bookName;
	String author;
	ArrayList<A> bookslist=new ArrayList<>();
	
	public int getIsbnno() {
		return isbnno;
	}

	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	void addBook()
	{
		
		A obj=new A();
			System.out.println("Enter isbn no of book");
			isbnno=sc.nextInt();
			obj.setIsbnno(isbnno);
			System.out.println("Enter Name of the Book");
			bookName=sc.next();
			obj.setBookName(bookName);
			System.out.println("Enter Author of book");
			author=sc.next();
			obj.setAuthor(author);
			bookslist.add(obj);
		
	}
	
	boolean isListEmpty()
	{
		return bookslist.isEmpty();
	}
	
	
	void viewAllBook()
	{
		if(isListEmpty())
		{
			System.out.println("List Is Empty");
		}
		else
		{
			for (A a : bookslist)
			{
				System.out.println(a.isbnno+" "+a.bookName+" "+a.author);
			}
		}
	}
	
	void viewBookByAuther()
	{
		if(isListEmpty())
		{
			System.out.println("List Is Empty");
		}
		else
		{
			System.out.println("Enter the Name of Auther");
			String auth=sc.next();
			for (A a : bookslist)
			{
				if(a.author.equals(auth))
				{
				System.out.println(a.isbnno+" "+a.bookName+" "+a.author);
				}
			}
		}
		
	}
	
	void CounOfBooks()
	{
		System.out.println("Count Of Book is:"+bookslist.size());
	}
	

}
public class Libarary 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		A a1=new A();
		int ch;
		do
		{
			
			System.out.println("1)Add Book /n 2)Display Book Details \n 3) Serach Book By author \n 4) Count No of Books \n 5)Exit");
			System.out.println("Enter Your Choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
					case 1:
						
							a1.addBook();
							break;
					case 2: 
							a1.viewAllBook();
							break;
					case 3: 
							a1.viewBookByAuther();
							break;
					case 4: 
							a1.CounOfBooks();
							break;
					
			}
			
			
			
		}while(ch!=5);
		
	}

}
