import java.util.NoSuchElementException;

public class Tester {
  public static void main(String args[]){
    // IntegerSequence x = new Range(9, 6);
    // IntegerSequence r = new Range(10,15);
    // System.out.println(r.length());
    // while(r.hasNext()){
    //   System.out.print(r.next());
    //   if(r.hasNext()){
    //      System.out.print( ", " );
    //   }
    // }
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println(as.length());
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    IntegerSequence r = new Range(10,20);
    IntegerSequence ap = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(ap.hasNext()){
      System.out.print(ap.next()+", ");
    }
    System.out.println();
  }
}
