package collections;

public class SystemExitFinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("SALAM BRATTTTT");
            System.exit(0);     //system.exit proqrami dayandirir finally blocku el satan olmur
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Hi");
        }
    }
}
