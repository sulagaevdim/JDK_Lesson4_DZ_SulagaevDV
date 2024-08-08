public class Worker {
    private int tabelNumber;
    private String name;
    private long phoneNumber;
    private int experience;

    public Worker(int tabelNumber, String name, long phoneNumber, int experience) {
        this.tabelNumber = tabelNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getExperience() {
        return experience;
    }
    public String toString() {
        return "№: " + tabelNumber +
                ", Имя: " + name +
                ", Номер телефона: " + phoneNumber +
                ", Стаж: " + experience;
    }
}
