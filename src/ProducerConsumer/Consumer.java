package ProducerConsumer;

import java.util.ArrayList;

public class Consumer extends Thread{
    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }
    public void run(){
        while (true){

            try {

                queue.get();
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
