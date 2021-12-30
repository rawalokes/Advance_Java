package ProducerConsumer;

public class Producer extends Thread{
    Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }
public void run(){

        int i=1;
        while (true){
            try{
                Thread.sleep(2000);
                queue.put(i++);

            }catch (Exception e){}
        }

    }
}
