package ooptest7;



public class SuperCarApp {
    public static void main(String[] args) {

        SuperCar c1 = new SuperCar();
        c1.setCarBrand("Honda");
        c1.setCarColor("Pink");
        c1.setCarEngineSize("7000");
        c1.setMaxSpeed("500");
        c1.setContryofOrigin("Thai");
        c1.setSuperCarClass("m");

      System.out.println(c1.getCarBrand());
      System.out.println(c1.getCarColor());
      System.out.println(c1.getCarEngineSize());
      System.out.println(c1.getMaxSpeed());
      System.out.println(c1.getContryofOrigin());
      System.out.println(c1.getSuperCarClass());


    }

}//class