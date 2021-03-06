import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    try {
      if (start > end) {
        throw new IllegalArgumentException("Start value cannot be greater than the end value");
      }
      this.start = start;
      this.end = end;
      current = start;
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException("Error: Start value is greater than end value");
    }
  }

  public void reset(){
    this.start = start;
    this.end = end;
    current = start;
  }

  public int length(){
    return end - start + 1;
    // another and very ineffective way to do it:
    // int count = 0;
    // for (int i = start; i < end + 1; i++) {
    //   count++;
    // }
    // return count;
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    return (current >= start && current <= end);
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){
    if (hasNext() == false) {
      throw new NoSuchElementException("There are no more values");
    }
    current = current + 1;
    return current - 1;
  }
}
