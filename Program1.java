class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double miles;

    for(int km = 10; km <= 100; km += 10){
        miles = km * 0.621371;
        System.out.println(km + "km --> " + miles + "mi");
    }

  }
}
