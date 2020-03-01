package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Category category= new Category("bajki");
       Category category1= new Category("horror");
       Category category2= new Category("kryminaly");

       Author author=new Author("Boleslaw","Prus");
       Author author1=new Author("Zbigniew", "Malicki");
       Author author2= new Author("Zocha", "Pitocha");

        Book book1 = new Book("Zaraza", author, category);
        Book book2 = new Book("Dawno temu", author1, category1);
        Book book3 = new Book("Zdrada", author2, category2);


        List<Book> bookList=new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        ObjectMapper objectMapper=new ObjectMapper();


        try {
            objectMapper.writeValue(new File("Listaksiazek.json"), bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
