public class Human {


    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;

    public int getYearOfBirth() {// гетер на дату рождения
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {//сетер на дату рождения
        if (yearOfBirth < 0) {// не понимаю зачем тут проверка на пустоту строки int не может быть равен null по IDEA =)
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {// гетер для города
        return town;
    }

    public void setTown(String town) {// сетер для города с проверками
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
    }
    // конструкторы на любой вкус и цвет =)
    Human(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.name = "Информация не указана";
        this.town = "Информация не указана";
        this.jobTitle = "Информация не указана";
    }
    Human(int yearOfBirth, String name) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = "Информация не указана";
        this.jobTitle = "Информация не указана";
    }
    Human(int yearOfBirth,String name, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = "Информация не указана";
    }
    Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
        if (this.name == null|| this.name.isEmpty()) {
            this.name = "Информация не указана";
        }
        if (this.town == null|| this.town.isEmpty()) {
            this.town = "Информация не указана";
        }
        if (this.jobTitle == null|| this.jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        }

    }
    // переопределил toString
    @Override
    public String toString(){
        return "Привет! меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности "+jobTitle+ ". Будем знакомы!";
    }
}
