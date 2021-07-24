class Quest implements Runnable{
    public void run() {
        for(int i=0;i<20;i++){
           try{

            System.out.println(i);
            Thread.sleep(2000);
           }
           catch(Exception e){
               System.out.println("error" + e);
           }
        }
    }

    public static void main(String args[]){
        Ques thret= new Ques();
        Thread a= new Thread(thret);
        a.start();
    }
}