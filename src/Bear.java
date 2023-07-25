public class Bear extends AbstraktPredator implements Hantablee{
    public Bear(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void hunt() {
        System.out.println("bearrr");
    }
}
