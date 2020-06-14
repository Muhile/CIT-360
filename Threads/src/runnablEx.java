class runnablEx implements Runnable {
    private Thread t;
    private String food;

    runnablEx( String name) {
        food = name;
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Thank you for choosing Pizza King! Your " +  food + " order is in and will be out shortly.");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Gathering ingredients for " +  food + "." );

    }

    public void run() {
        System.out.println("Combining " +  food + " ingredients.");
        try {
            for(int i = 1; i > 0; i--) {
                System.out.println("Baking " + food + "." );

                Thread.sleep(100);
            }
        }catch (InterruptedException e) {
            System.out.println("Making" +  food + " interrupted by the kids.");
        }
        System.out.println("You're order of " +  food + " is ready!");
    }

    public void start () {
        System.out.println("Prepping ingredients for your " +  food + "." );
        if (t == null) {
            t = new Thread (this, food);
            t.start ();
        }
    }
}

