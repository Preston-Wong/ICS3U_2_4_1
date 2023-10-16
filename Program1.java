class Program1 extends ConsoleProgram {

  /**
  * Description convert km to mi
  * @author: Preton Wong
  */
  
  public void run() {

    // variables
    double miles;

    // converting km to miles and outputting the results 
    for(int km = 10; km <= 100; km += 10){
        miles = km * 0.621371;
        System.out.println(km + "km --> " + miles + "mi");
    }

  }
}
