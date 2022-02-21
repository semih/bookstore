package com.example.bookapp;

import com.example.bookapp.model.Book;
import com.example.bookapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BookappApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = Book.builder()
                .name("The Lord of the Rings")
                .author("J.R.R. Tolkien")
                .price(10.0)
                .stock(10).build();
        Book book2 = Book.builder()
                .name("Hamlet")
                .author("William Shakespeare")
                .price(11.1)
                .stock(10).build();
        Book book3 = Book.builder()
                .name("Anna Karenina")
                .author("Leo Tolstoy")
                .price(15.5)
                .stock(10).build();
        bookRepository.saveAll(Arrays.asList(book1, book2, book3));
    }
}
