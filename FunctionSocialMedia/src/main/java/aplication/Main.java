package aplication;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment01 = new Comment("Have a nice trip!");
        Comment comment02 = new Comment("Wow that's awesome!");
        Post post01 = new Post(sdf.parse("28/05/2024 12:04:02"), "Traveling to New York", "I'm nice guys!", 12);
        post01.addComment(comment01);
        post01.addComment(comment02);

        System.out.println(post01);
    }
}