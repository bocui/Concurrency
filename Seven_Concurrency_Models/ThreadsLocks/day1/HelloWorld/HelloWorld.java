public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
	Thread myThread = new Thread() {
	    public void run() {
		System.out.println("Hello from new thread");
	    }
	};
	myThread.start();
        // The main thread sleep 10s. 
	// Under this case(sleep): "Hello from new thread" always come first.
	Thread.sleep(10000);
	//Thread.yield();
	System.out.println("Hello from main thread");
	myThread.join();
    }
}
