package com.klu.exp6.controller;

import com.klu.exp6.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    List<Book> bookList = new ArrayList<>();

    // 1. /welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library";
    }

    // 2. /count
    @GetMapping("/count")
    public int getCount() {
        return 50;
    }

    // 3. /price
    @GetMapping("/price")
    public double getPrice() {
        return 499.99;
    }

    // 4. /books
    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList("Java", "Spring", "Python", "AI");
    }

    // 5. /books/{id}
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book ID: " + id;
    }

    // 6. /search?title=
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Book searched: " + title;
    }

    // 7. /authors/{name}
    @GetMapping("/authors/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Author Name: " + name;
    }

    // 8. /addbook
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book Added Successfully";
    }

    // 9. /viewbooks
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}
