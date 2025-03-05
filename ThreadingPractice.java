//public class ThreadingPractice {
//
//        public static void main(String[] args) {
//            MyTask task1 = new MyTask();
//            MyTask task2 = new MyTask();
//
//            task1.start(); // Start first thread
//            task2.start(); // Start second thread
//        }
//    }
//
//   class MyTask extends Thread {
//
//
//       public void run() {
//           for (int i = 1; i <= 5; i++) {
//               System.out.println(Thread.currentThread().getName() + " - Task: " + i);
//               try {
//                   Thread.sleep(500); // Simulate delay
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
//           }
//       }
//   }
//




  class MyTask implements  Runnable
  {
      @Override
      public void run()
      {
                for(int  i= 0 ; i <20 ; i++)
          {
              System.out.println(Thread.currentThread().getName() + "     " + i);

              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }

             // System.out.println(i);
          }
      }
  }

    class  ThreadingPractice
    {
        public static void main(String[] args) {

            MyTask t = new MyTask();


            Thread threads1 = new Thread(t);
            
            Thread threads2 = new Thread(t);

                 threads1.start();
                 threads2.start();


        }


    }










