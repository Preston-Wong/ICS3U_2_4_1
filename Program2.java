class Program2 extends ConsoleProgram {

  /**
  * Description calculate the amount of numbers between 1 and n
  * @author: Preston Wong
  */
  
  public void run() {

    // variables 
    int n = readInt("Enter n:" );
    int sum = 0;

    // calculate the numbers from 1 to n
    for (int i = 1; i <= n; i++){
        sum = sum + i;
    }

    // outputting the results
    System.out.println(sum);
  }
}
