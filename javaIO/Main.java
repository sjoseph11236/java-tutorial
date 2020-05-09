class Main  { 
  public static void main(String[] args) {
    try {
      int i = System.in.read();
      // the casting is to turn the ASCII back into letter
      System.out.println((char) i);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}