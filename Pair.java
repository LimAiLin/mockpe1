/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */
public class Pair<T> implements SourceList<T> {
  private T first;
  private SourceList<T> second;

  public Pair(T first, SourceList<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public T getFirst() {
    return this.first;
  }

  @Override
  public SourceList<T> getSecond() {
    return this.second;
  }

  @Override
  public String toString() {
    return this.first + ", " + this.second;
  }

  // Write your code here

  @Override
  public int length() {
    int count = 1;
    if (this.second instanceof EmptyList<?>) {
      return count;
    } else {
      count += this.second.length();
    }
    return count;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Pair<?>) {
      @SuppressWarnings("unchecked")
      Pair<?> op = (Pair<?>) o;
      if (this.first == op.getFirst()) {
        return this.second.equals(op.getSecond());
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  @Override
  public SourceList<T> filter(BooleanCondition cond) {
    if (cond.test(this.first)) {
      return new Pair<T>(this.first, this.second.filter(cond));
    } else {
      return this.second.filter(cond);
    }
  }

  @Override
  public SourceList<U> map(Transformer<Object, U> trans) {
    return new Pair<U>(trans.transform(this.first), this.second.map(trans));
  }
}
