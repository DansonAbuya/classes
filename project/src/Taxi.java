public class Taxi extends Vehicle{

  private String shape;
  private String speed;

  public Taxi() {
    super();
    shape="round";
    speed= "80km/h";
  }

  public Taxi(String color, String plateNo,String shape, String speed) {
    super(color,plateNo);
    this.shape = shape;
    this.speed = speed;
  }



  public static void main(String[] args) {
    Taxi taxi = new Taxi();

  }
  }


