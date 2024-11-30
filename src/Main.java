public class Main {

    public static void main(String[] args) {

        Music symphony = new Music("symphony", "Clean Bandit", "pop", 246);
        Music subeme = new Music("subele a la radio", "Enrique", "pop", 208);
        Music night_call = new Music("Night call","Kavinsky", "pop", 256);

        System.out.println(symphony.get_info());
        System.out.println(subeme.get_info());
        System.out.println(night_call.get_info());
    }

}