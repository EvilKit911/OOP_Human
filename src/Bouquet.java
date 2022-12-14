import java.util.Arrays;

public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    private double calculateCost() {
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getCost();
    }
        return sum * 1.1;
    }

    private int calculateLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
    public void printBouquet() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder result  = new StringBuilder("Состав букета: ").append("\n");
        double sum = calculateCost();
        int minLifeSpan = calculateLifeSpan();
        for (Flower flower : flowers) {
            result.append(flower).append("\n");
        }
        result.append("Срок стояния букета: ").append(minLifeSpan).append(" дней, ");
        result.append("Стоимость букета: ").append(String.format("%.2f",sum)).append(" рублей");
        return result.toString();
    }
}
