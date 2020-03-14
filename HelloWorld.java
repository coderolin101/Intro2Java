public class HelloWorld{
	public void test(){
		System.out.println("Non static method Hello");//This needs a class main method to call it
	}
	public static void main(String [] args){
		HelloWorld helloWorldObjects = new HelloWorld();
		System.out.println("Hello World!");
		helloWorldObjects.test();
	}
}
