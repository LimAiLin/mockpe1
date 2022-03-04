/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */
interface SourceList<T> {
  T getFirst();

  SourceList<T> getSecond();
  // Write your code here
  
  public int length();

  public boolean equals(Object o);

  public SourceList<T> filter(BooleanCondition cond);

  public SourceList<U> map(Transformer<Object, U> trans); 
}
