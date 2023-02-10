public enum Day {
    MONDAY("Дуйшонбу"),
    TUESDAY(" Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");
    private String name;

    Day(String name) {
        this.name(); {
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Day{" +
                getName()  +
                '}';
    }
}
