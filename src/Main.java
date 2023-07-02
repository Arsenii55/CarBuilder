public class Main {
    public static void main(String[] args) {
    Car.Builder carbuilder = new Car.Builder("Bmw",4);
    Car car = carbuilder.setDoorsquan(5).build();
    Car car2 = carbuilder.setDoorsquan(3).build();
    }
}