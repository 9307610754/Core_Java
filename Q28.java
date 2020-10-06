class Q28{
  public static void main(String[] args) {
    String[] arrData = {"Aish", "Bhaika", "Gauri", "Dyanu", "Simba"};
   
    System.out.println("\nUsing Foreach loop:");
    //The optimized method of using the for loop - also called the foreach loop
    for (String strTemp : arrData){
      System.out.println(strTemp);
    }
  }
}
