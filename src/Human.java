public class Human {

    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;
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
    @Override
    public String toString(){
        return "Привет! меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности "+jobTitle+ ". Будем знакомы!";
    }
}
