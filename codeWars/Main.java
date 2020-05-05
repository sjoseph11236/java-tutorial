import whatIs.HowDoICompare;

class Main { 
  public static void main(String[] args) {
    // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
    for (Object[] t: tests)
    HowDoICompare.whatIs((Integer)t[0]);
  }

  static final Object[][] tests = {
    {0, "nothing"},
    {123, "nothing"},
    {-1, "nothing"},
    {42, "everything"},
    {42 * 42, "everything squared"},
  };
}


