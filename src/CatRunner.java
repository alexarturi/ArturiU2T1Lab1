public class CatRunner {
    public static void main (String [] args){
        Cat cat1 = new Cat ("Furry", 12, 10.3);
        cat1.introduce();
        cat1.printCatInfo();
        cat1.playCat();

        Cat cat2 = new Cat("Charles", 3, 4.5);
        cat2.introduce();
        cat2.printCatInfo();
        cat2.playCat();
    }
}
