package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class BookClassifierTestSuite {

    @Test
    public void testBookClassifierAdapter() {
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("xyz", "xyz", 1995, "xyz");
        Book book2 = new Book("xyz", "xyz", 2000, "xyz");
        Book book3 = new Book("xyz", "xyz", 2010, "xyz");
        Book book4 = new Book("xyz", "xyz", 2005, "xyz");
        Book book5 = new Book("xyz", "xyz", 2015, "xyz");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        System.out.println(medianAdapter.publicationYearMedian(books));
        assertEquals(2005,medianAdapter.publicationYearMedian(books));
    }
}
