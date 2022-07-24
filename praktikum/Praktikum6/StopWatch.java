
import java.util.Scanner;

public class StopWatch {
  
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
    
    StopWatch(){
    }

    public void start() {
      this.startTime = System.currentTimeMillis();
      this.running = true;
    }
    
    
    public void stop() {
      this.stopTime = System.currentTimeMillis();
      this.running = false;
    }
    
    //elaspsed time in seconds
    public long getElapsedTimeSecs() {
      long elapsed;
      if (running) {
        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
      } else {
        elapsed = ((stopTime - startTime) / 1000);
      }
      return elapsed;
    }

    public static void main(String[] args) {
      StopWatch SW = new StopWatch();
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int mulai = 1;

        while (mulai == 1) {
            if (s.equals("S")) {
                SW.start();
                String q = input.nextLine();
                if (q.equals("Q")) {
                    SW.stop();
                    System.out.print(SW.getElapsedTimeSecs() + " detik");
                    mulai = 0;
                }
            }
        }
        input.close();
    }
  }


      //elaspsed time in milliseconds
    // public long getElapsedTime() {
    //   long elapsed;
    //   if (running) {
    //     elapsed = (System.currentTimeMillis() - startTime);
    //   } else {
    //     elapsed = (stopTime - startTime);
    //   }
    //   return elapsed;
    // }
    