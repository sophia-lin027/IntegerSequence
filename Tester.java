import java.util.NoSuchElementException;

public class Tester {
  public static void main(String args[]){
    IntegerSequence x = new Range(9, 6);
    IntegerSequence r = new Range(10,15);
    System.out.println(r.length());
    while(r.hasNext()){
      System.out.print(r.next());
      if(r.hasNext()){
         System.out.print( ", " );
      }
    }
  }
}
