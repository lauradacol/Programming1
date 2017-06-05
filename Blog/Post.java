import java.util.Date;

import java.io.*;

class Post{
	String title;
	String content;	
	int likes;
	int dislikes;
	Date date = new Date();	
	
	public Post(){}
	
	public Post(String title, String content){
		this.title = title;
		this.content = content;
		}
		
	public void show(){
		System.out.println(this.title.toUpperCase());
		System.out.println("Publicado em: " + date.toGMTString());
		System.out.println(this.content);
		System.out.println("Likes: " + this.likes);
		System.out.println("Dislikes: " + this.dislikes);		
		}
	
	public void like(){
		this.likes += 1;
		}
	
	public void dislike(){
		this.dislikes += 1;
		}
		
	}
