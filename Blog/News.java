import java.util.Date;
import java.io.*;

class News extends Post{
	String source;
	
	public News(String title, String content, String source){
		super(title, content);
		this.source = source;
		}
	
	public void show(){
		System.out.println(super.title.toUpperCase());
		System.out.println("Publicado em: " + super.date.toGMTString());
		System.out.println(super.content);
		System.out.println("Fonte: " + this.source);
		System.out.println("Likes: " + super.likes);
		System.out.println("Dislikes: " + super.dislikes);		
		}

	}
