class Xor extends Operation {

  private static char c = '^';

  public Xor(Expression e1, Expression e2) {
    super(e1, e2);
  }

  @Override
  public Object eval() {
    Expression e1 = super.getFirst();
    Expression e2 = super.getSecond();
    if (e1.eval() instanceof Boolean && e2.eval() instanceof Boolean) {
      return (Boolean) e1.eval() ^ (Boolean) e2.eval();
    } else {
      throw new InvalidOperandException(c);
    }
  }
}
