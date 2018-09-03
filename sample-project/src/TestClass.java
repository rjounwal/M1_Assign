import java.io.*;
import java.utils.*;

public class TestClass{

	public static void main(String args[]){
		
		TestClass testObj = new TestClass();
		testObj.harryCode();
		testObj.kaneCode();
		
	}

	private String harryCode(){
		System.out.println("Again with new commit & This is Harry Modified Changes");
		return "calling through object & change method as return type";
	}

	private void kaneCode(){
		System.out.println("calling through Object, This is Kane Changes");
		System.out.println("again kane changes");
	}
}
