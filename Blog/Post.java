import java.util.Date;
import java.io.*;

class Post{
	String title;
	Date date;
	String content;	
	int likes;
	int dislikes;
	
	public Post(String title, String content){
		this.title = title;
		this.content = content;
		Date date = new Date();
		}
		
	public void show(){
		System.out.println(this.title.toUpperCase());
		System.out.println("Publicado em: " + this.date);
		System.out.println(this.content);
		System.out.println("Likes: " + this.likes);
		System.out.println("Dislikes: " + this.dislikes);		
		}
	
	public void like(){
		this.likes += 1;
		}
	
	public void dislikes(){
		this.dislikes += 1;
		}
	
	}
