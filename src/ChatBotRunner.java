public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot bot1 = new ChatBot("debbie", 2);
        bot1.greeting("Ivy");
        bot1.weather();
        bot1.favoriteNumber(6);
        bot1.addNumbers(2,3,4);
        double meter= bot1.convertFeetToMeters(4);
        System.out.println(meter);
        String goodbye1 = bot1.goodbye();
        System.out.println(goodbye1);



    }
}
