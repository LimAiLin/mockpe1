/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0238768J
 */

class StringToLength implements Transformer<String, Integer> {
  
  @Override
  public Integer transform(String s) {
    return s.length();
  }
}
