class Main{
    public static void main(String [] args){
        Task t1 = new Task("1st Task");
        Task t2 = new Task("2nd Task");
        Task t3 = new Task("3rd Task");
        Task t4 = new Task("4th Task");
        Task t5 = new Task("5th Task");

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();

    }
}