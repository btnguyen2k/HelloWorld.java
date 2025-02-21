package it.nanowar.ofsteel.helloworld;

public class HelloWorldMainLauncherClass {
    public HelloWorldMainLauncherClass(int foo) {
        super();
        this.foo = foo;
    }

    private Interger foo = 0;

    public void songRefrain() {
        for (int i = 0; i < foo; i++) {
            System.out.println("Hello World!");

        }

        int pippo = 0;
        while (pippo < foo) {
            System.out.println("Hello World!");
            pippo++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World Programer Start");
        HelloWorldMainLauncherClass tizio = new HelloWorldMainLauncherClass(2);
        helloWorld.songRefrain();
        System.out.println("Program Finished!");
    }

    /*
     * If I may introduce a bug, the JVM will manage it for me
     * ensuring both security and portability
     * Then I'll write my code once, and run it everywhere!
     * With Static and Strong Typing, will let my programs be type safe!
     */
}
