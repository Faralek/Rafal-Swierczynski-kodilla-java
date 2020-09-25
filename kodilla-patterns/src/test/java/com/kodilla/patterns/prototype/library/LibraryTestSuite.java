package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        //creating the bookList for library
        Library library = new Library("Biblioteka");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.addBook(new Book("Book" + n, "Charles", LocalDate.of(1993, 1, 20))));

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Bilbioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Bilbioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //Then

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(library.getBooks(), Objects.requireNonNull(clonedLibrary).getBooks());
        Assert.assertEquals(library.getBooks(), Objects.requireNonNull(deepClonedLibrary).getBooks());

    }
}
