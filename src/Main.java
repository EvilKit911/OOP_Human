public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human(1988,"Максим", "Минск", "Бренд-менеджер");
        Human Anna = new Human(1993,"Аня","Москва", "Методист образовательных программ");
        Human Katerina = new Human(1992,"Катя","Калининград", "продакт-менеджер");
        Human Artem = new Human(1995,"Артем", "Москва", "директор по развитию бизнеса");
        Human Vladimir = new Human(2001, "Владимир","Казань","Безработный");
        System.out.println(Maksim);
        System.out.println(Anna);
        System.out.println(Katerina);
        System.out.println(Artem);
        System.out.println(Vladimir);

        System.out.println(" ");


        //Роза обыкновенная из Голландии, стоимость штуки — 35,59 рублей.
        //Хризантема, стоимость штуки — 15 рублей, срок стояния — 5 дней.
        //Пион из Англии, стоимость штуки — 69,9 рублей, срок стояния — 1 день.
        //Гипсофила, страна происхождения — Турция, стоимость штуки — 19,5 рублей, срок стояния — 10 дней.



        Flower rosa = new Flower("Роза", "Голландия", 35.59);
        Flower hrizantema = new Flower("Хризантема",null,15);
        hrizantema.setLifeSpan(5);
        Flower pion = new Flower("Пион", "Англия",69.9);
        pion.setLifeSpan(1);
        Flower gipsofila = new Flower("Гипсофила","Турция",19.5);
        gipsofila.setLifeSpan(10);


        System.out.println(rosa);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);

        Bouquet bouquet = new Bouquet(
          new Flower[]{
                  rosa,rosa,rosa,
                  hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,
                  pion,pion,pion,pion,pion,
                  gipsofila,gipsofila
          }
        );
        bouquet.printBouquet();
    }
}