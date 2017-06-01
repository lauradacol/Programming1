import java.util.Date;
import java.io.*;

class ProductReview extends Post implements Evaluable{
	int stars;
	
	public ProductReview(String title, String content){
		super(title, content);		
		Date date = new Date();
		}	
	
	public void show(){
		System.out.println(super.title.toUpperCase());
		System.out.println("Publicado em: " + super.date);
		System.out.println(super.content);
		System.out.println("Stars: " + this.stars);
		System.out.println("Likes: " + super.likes);
		System.out.println("Dislikes: " + super.dislikes);		
		}
	
	public boolean testaEvaluate(int stars){
		if(stars > 10 || stars < 0){
			return false;
			}
		
		else{
			return true;
			}		
		}
		
	public void evaluate(int stars){
		this.stars = stars;
		}
	
	}