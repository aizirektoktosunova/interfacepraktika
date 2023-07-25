public abstract class AbstraktPredator implements Hantablee {
    private  String name;
    private int age;
    private String color;

    public AbstraktPredator(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "AbstraktPredator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
