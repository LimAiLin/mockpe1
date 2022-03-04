/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */

abstract class Operation implements Expression {
  
  private Expression e1;
  private Expression e2;
  
  public Operation(Expression e1, Expression e2) {
    this.e1 = e1;
    this.e2 = e2;
  }

  @Override
  public abstract Object eval() throws InvalidOperandException;

  public static Operation of(char c, Expression e1, Expression e2) {
    if (c == '*') {
      return new Multiply(e1, e2);
    } else if (c == '+') {
      return new Concatenate(e1, e2);
    } else if (c == '^') {
      return new Xor(e1, e2);
    } else {
      return null;
    }
  }  

  public Expression getFirst() {
    return e1;
  }

  public Expression getSecond() {
    return e2;
  }
}
