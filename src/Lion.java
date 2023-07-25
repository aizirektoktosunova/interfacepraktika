public class Lion extends  AbstraktPredator implements Hantablee{
    public Lion(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void hunt() {
        System.out.println("lionnn");
    }
}
