class Program2 extends ConsoleProgram {

  /**
  * Description calculate the amount of numbers between 1 and the number inputted from the user 
  * @author: Preston Wong
  */
  
  public void run() {

    // variables 
    int intNumber = readInt("Enter n:" );
    int intSum = 0;

    // calculate the numbers from 1 to n
    for (int i = 1; i <= intNumber; i++){
        intSum = intSum + i;
    }

    // outputting the results
    System.out.println(intSum);
  }
}
