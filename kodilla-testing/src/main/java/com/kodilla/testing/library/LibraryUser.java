package com.kodilla.testing.library;

import java.util.ArrayList;

public class LibraryUser {
    private final String firstName;
    private final String lastName;
    private final String peselId;
    private final ArrayList<Book> booksInHands = new ArrayList<>();

    public LibraryUser(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }


    public ArrayList<Book> getBooksInHands() {

        return new ArrayList<>(booksInHands);
    }

    public void addABook(Book book) {
        booksInHands.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;

        LibraryUser that = (LibraryUser) o;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return peselId != null ? peselId.equals(that.peselId) : that.peselId == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (peselId != null ? peselId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
