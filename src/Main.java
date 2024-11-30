public class Main {

    public static void main(String[] args) {
//
        Music symphony = new Music("symphony", "Clean Bandit", "pop", 246, 40);
        Music subeme = new Music("subele a la radio", "Enrique", "pop", 208, 20);
        Music night_call = new Music("Night call","Kavinsky", "pop", 256, 55);


        User Ryan = new User("Ryan Gosling", "POP", 500);
        User Temi = new User("Temirlan Emilbekov", "Metal", 120);

//        Ryan.getInfo();
//        Temi.getInfo();

        Ryan.getBalance();
        Ryan.buyMusic(night_call);
        Ryan.getBalance();
    }

}