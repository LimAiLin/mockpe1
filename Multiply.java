class Multiply extends Operation {

  private static char c = '*';

  public Multiply(Expression e1, Expression e2) {
    super(e1, e2);
  }

  @Override
  public Object eval() {
    Expression e1 = super.getFirst();
    Expression e2 = super.getSecond();
    if (e1.eval() instanceof Integer && e2.eval() instanceof Integer) {
      return (Integer) e1.eval() * (Integer) e2.eval();
    } else {
      throw new InvalidOperandException(c);
    }
  }
}
