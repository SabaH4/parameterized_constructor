public class Parameterized
{
  int modelYear;
  String modelName;

  public Parameterized(int year, String name) 
{
    modelYear = year;
    modelName = name;
}

  public static void main(String[] args) 
{
    Parameterized myCar = new Parameterized(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
}
}
