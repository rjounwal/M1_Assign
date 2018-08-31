import java.io.*;
import java.utils.*;

public class TestClass{

	public static void main(String args[]){
		
		TestClass testObj = new TestClass();
		testObj.harryCode();
		kaneCode();
		
	}

	private String harryCode(){
		System.out.println("This is Harry Modified Changes");
		return "calling through object & change method as return type";
	}

	private static void kaneCode(){
		System.out.println("This is Kane Changes");
	}
}
