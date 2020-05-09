class Main implements Runnable{
  public static void main(String[] args) throws InterruptedException{
      // // Streams //
      // List<String> strings = Arrays.asList("dog", "cat", "hamster");
      // Stream<String> filteredStream = strings.stream().map((String animal)-> animal + "animal");
      // List<String> filteredSortedList = filteredStream.sorted().collect(Collectors.toList());
      // System.out.print(filteredSortedList);
      // // Streams //
      
      // Threads //
      // (new Thread(new Main())).start();
      // (new Thread(new Main())).start();
      String threadName = Thread.currentThread().getName();
      // System.out.println("This is from our thread called " + threadName);
      String[] strArr = {
          threadName + " - one",
          threadName + " - two",
          threadName + " - three"
      };
      Thread thread0 = new Thread(new Main());
      Thread thread1 = new Thread(new Main());
      thread0.start();
      thread1.start();
      
      thread0.interrupt();
      for(int i=0;i<strArr.length; i++){
          System.out.println(strArr[i]);
          Thread.sleep(1000);
      }
      // Threads // 
  }

  public void run(){
      String threadName = Thread.currentThread().getName();
      String[] strArr = {
          threadName + " - one",
          threadName + " - two",
          threadName + " - three"
      };
      try{
          for(int i=0;i<strArr.length; i++){
              System.out.println(strArr[i]);
              Thread.sleep(1000);
          }
      } catch(InterruptedException ie){
          System.out.println(threadName + " - " + ie.getMessage());
      }
      // System.out.println("This is from our thread called " + threadName);
  }
}

// class Main implements Runnable{
//   public static void main(String[] args) throws InterruptedException{
//       // // Streams //
//       // List<String> strings = Arrays.asList("dog", "cat", "hamster");
//       // Stream<String> filteredStream = strings.stream().map((String animal)-> animal + "animal");
//       // List<String> filteredSortedList = filteredStream.sorted().collect(Collectors.toList());
//       // System.out.print(filteredSortedList);
//       // // Streams //

//       // Threads //
//       // Thread thread0 = new Thread(new Main());
//       // Thread thread1 = new Thread(new Main());
//       // thread0.start();
//       // thread1.start();
//       // (new Thread(new Main())).start();
//       // (new Thread(new Main())).start();
//       String threadName = Thread.currentThread().getName();
//       // System.out.println("This is from our thread called " + threadName);
//       String[] strArr = {
//           threadName + " - one",
//           threadName + " - two",
//           threadName + " - three"
//       };

//       // Threads // 
//       Thread thread0 = new Thread(new Main());
//       Thread thread1 = new Thread(new Main());
//       thread0.start();
//       thread1.start();
//       thread0.interrupt();

//       for(int i = 0; i<strArr.length; i++){
//           System.out.println(strArr[i]);
//           Thread.sleep(1000);
//       }
//   }

//   public void run() {
//       String threadName = Thread.currentThread().getName();
//       String[] strArr = {
//           threadName + " - one",
//           threadName + " - two",
//           threadName + " - three"
//       };

//       for(int i=0;i<strArr.length; i++){
//         try {
//           System.out.println(strArr[i]); 
//           Thread.sleep(1000);  
//         } catch (InterruptedException ie) {
//           System.out.println(threadName + " - " + ie.getMessage());
//         }
//       }
//       // System.out.println("This is from our thread called " + threadName);
//   }
// }



// class Main {
//   public static void main(String[] args) throws InterruptedException {
    
//     // Thread.currentThread();
//     // Thread thread0 = new Thread(new Main());
//     // Thread thread1 = new Thread(new Main());
//     // thread0.start();
//     // thread1.start();
//     String[] strArr = {
//       "one",
//       "two",
//       "three"
//     };

//     for(int i = 0; i < strArr.length; i++) {
//       // you must specify and exception
//       // This applys to the main thread
//       Thread.sleep(1000);
//       System.out.println(strArr[i]);
//     }

//     // (new Thread(new Main())).start();
//     // (new Thread(new Main())).start();
//   }

//   // .start() requires that you have to implement runable interface
//   // This run method is different from the run method that compiles and run the program.
//   // Picture the concurrent action as opening a new tab.
//   // Threads can be inturrupted and pass information to other threads
//   // A value can get to  return from a thread. 
//   public void run() {
//     String threadName = Thread.currentThread().getName();

//     String[] strArr = {
//       "one",
//       "two",
//       "three"
//     };
//     System.out.println("This is from our thread: " + threadName);
//   }
// }