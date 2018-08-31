import java.io.*;
import java.utils.*;

public class TestClass{

	public static void main(String args[]){
		
		TestClass testObj = new TestClass();
		harryCode();
		testObj.kaneCode();
		
	}

	private static void harryCode(){
		System.out.println("This is Harry Changes");
	}

	private void kaneCode(){
		System.out.println("calling through Object, This is Kane Changes");
	}
}
