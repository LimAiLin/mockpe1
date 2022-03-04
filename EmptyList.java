/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */
class EmptyList<T> implements SourceList<T> {
  
  @Override
  public T getFirst() {
    return null;
  }

  @Override
  public SourceList<T> getSecond() {
    return null;
  }

  @Override
  public String toString() {
    return "EmptyList";
  }

  // Write your code here
  
  @Override
  public int length() {
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof EmptyList<?>) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public SourceList<T> filter(BooleanCondition cond) {
    return this;
  }

  @Override
  public SourceList<U> map(Transformer<Object, U> trans) {
    return new EmptyList<U>();
  }
}
