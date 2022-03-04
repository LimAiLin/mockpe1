/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */

class Operand implements Expression {

  private Object o;

  public Operand(Object o) {
    this.o = o;
  }

  @Override
  public Object eval() {
    return this.o;
  }
}
