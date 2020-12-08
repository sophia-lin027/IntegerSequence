import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  public void reset() {
    currentIndex = 0;
  }
  public int length() {
    return data.length;
  }
  public int next() {
    if (hasNext() == false) {
      throw new NoSuchElementException("There are no more values");
    }
    currentIndex++;
    return data[currentIndex - 1];
  }
  public boolean hasNext() {
    return (currentIndex < length());
  }


  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }

  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.

  public ArraySequence(IntegerSequence otherseq){
    currentIndex = 0;
    data = new int[otherseq.length()];
    for (int i = 0; i < otherseq.length(); i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }
}
