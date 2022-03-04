/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */

class InvalidOperandException extends RuntimeException {

  private char c;

  public InvalidOperandException(char c) {
    super("ERROR: Invalid operand for operator " + c);
    this.c = c;
  }
}
