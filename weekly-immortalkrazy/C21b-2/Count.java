public class Count{

  public static int count(String str, char a) {
    int result = 0;
    if (str.length() > 0)
      result = count(str.substring(1), a) +
        ((str.charAt(0) == a) ? 1 : 0);

    return result;
  }

}
