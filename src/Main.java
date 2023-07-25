public class Main {
    public static void main(String[] args) {
        Volf volf=new Volf("Volf",2,"white");
        volf.hunt();
        System.out.println(volf);
        Lion lion=new Lion("Lion",3,"black");
        lion.hunt();
        System.out.println(lion);
        Bear bear=new Bear("Bear",3,"broun");
        bear.hunt();
        System.out.println(bear);
    }
}