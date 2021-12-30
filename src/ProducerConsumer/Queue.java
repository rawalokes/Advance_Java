package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    int x;
//    boolean status=false;
    int sema=0;
    int check=2;
   synchronized public void put(int i) throws InterruptedException {

       if(sema==check){
           wait();
       }
       else {
           x = i;
           System.out.println("producer :" + i);
           sema++;
           notify();
//           chk++;
//           System.out.println("check "+chk);
//           if (chk==2){
//               status=true;
//               notify();
//           }

       }
    }

    synchronized public void get() throws InterruptedException {
       if (sema==0){
           wait();
       }
       else {
           System.out.println("Consume :"+x);
           sema++;
           notify();
       }


    }
}
