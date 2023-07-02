public class Car {
    private int weelsquan;
    private int doorsquan;
    private String brand;

    private Car(Builder builder) {
        this.weelsquan = builder.weelsquan;
        this.doorsquan = builder.doorsquan;
        this.brand = builder.brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weelsquan=" + weelsquan +
                ", doorsquan=" + doorsquan +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static class Builder {
        private int weelsquan;
        private int doorsquan;
        private String brand;

        public Builder(String brand,int weelsquan) {
            this.brand = brand;
            this.weelsquan = weelsquan;
        }

        public Builder setDoorsquan(int doorsquan) {
            this.doorsquan = doorsquan;
            return this;
        }

        public Builder setWeelsquan(int weelsquan) {
            this.weelsquan = weelsquan;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
