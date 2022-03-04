class Concatenate extends Operation {

  private static char c = '+';

  public Concatenate(Expression e1, Expression e2) {
    super(e1, e2);
  }

  @Override
  public Object eval() {
    Expression e1 = super.getFirst();
    Expression e2 = super.getSecond();
    if (e1.eval() instanceof String && e2.eval() instanceof String) {
      return (String) e1.eval() + (String) e2.eval();
    } else {
      throw new InvalidOperandException(c);
    }
  }    
}
