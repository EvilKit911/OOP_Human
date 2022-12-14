public class Flower {
  private final String flowerName;
   final String country;
   final double cost;
   int lifeSpan = 3;

    public Flower(String flowerName, String country, double cost) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            flowerName = "тип цветка не указан";
        }this.flowerName = flowerName;
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";}this.country = country;
        if (cost <= 0) {
            cost = 1;
        }this.cost = cost;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }
    public String setCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        }else{
        this.lifeSpan = lifeSpan;
    }
    }

    @Override
    public String toString() {
        return "Цветок: " +
                "Название цветка " + flowerName +
                ", Страна " + country +
                ", Стоимость цветка " + cost +" Руб," +
                " Срок стояния = " + lifeSpan + " дней";
    }




}
