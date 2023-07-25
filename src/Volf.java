public class Volf extends AbstraktPredator implements Hantablee{
    public Volf(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void hunt() {
        System.out.println("Volfff");
    }
}
