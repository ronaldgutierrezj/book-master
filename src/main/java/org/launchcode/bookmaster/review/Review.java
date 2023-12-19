package org.launchcode.bookmaster.review;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import org.launchcode.bookmaster.user.User;
import org.launchcode.bookmaster.abstractEntity.AbstractEntity;
import org.launchcode.bookmaster.book.Book;


@Entity
public class Review extends AbstractEntity {

    @ManyToOne
    private Book book;
    @ManyToOne
    private User user;
    private String review;
    private Rating rating;


    public Review(Book book, User user, String review, Rating rating) {
        this.book = book;
        this.user = user;
        this.review = review;
        this.rating = rating;
    }
    public Review(){}

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
