class Program1 extends ConsoleProgram {

  /**
  * Description convert km to mi
  * @author: Preton Wong
  */
  
  public void run() {

    // variables
    double dblMiles;

    // converting km to miles and outputting the results 
    for(int intKm = 10; intKm <= 100; intKm += 10){
        dblMiles = intKm * 0.621371;
        System.out.println(intKm + "km --> " + dblMiles + "mi");
    }

  }
}
