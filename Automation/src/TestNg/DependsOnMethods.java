package TestNg;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void login() {
	 System.out.println("Logged in succesfully");
    }

   @Test
  public void search() {
	 System.out.println("Product Found");
 }
 
   @Test
 public void select() {
	 System.out.println("Product has been verified");
 }
   
   @Test
   public void addToCart() {
	   System.out.println("Payment made successfully");
   }
   

}
