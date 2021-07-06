package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment1 = sdf.parse("21/06/2018 13:05:44");
		
		Post post1 = new Post(moment1, "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
		post1.addComment(new Comment("Have a nice trip!"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys","See you tomorrow", 5);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1.toString());
		System.out.println(post2.toString());
		
	}

}
