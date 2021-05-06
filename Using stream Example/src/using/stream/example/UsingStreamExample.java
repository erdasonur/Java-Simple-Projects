/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using.stream.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onure
 */
public class UsingStreamExample {

    public static void main(String[] args) {
        List<Book> bookList = getBooks();
        //parallelStream can be used for performance when we have big data
        bookList.stream().filter( book -> {
            return book.getAuthor().startsWith("J");
        }).filter( book -> {
            return book.getName().startsWith("L");
        }).forEach(System.out::println);
        
    }
    
    public static List getBooks() {
        List<Book> books = new ArrayList();
        books.add(new Book("Apple","Jack"));
        books.add(new Book("Life", "John"));
        books.add(new Book("Journey", "Janie"));
        books.add(new Book("Peach", "Mike"));
        books.add(new Book("Forest", "Jacob"));
        books.add(new Book("Learning", "Jacob"));
        books.add(new Book("Summer", "Alan"));
        return books;
        
    }
}
