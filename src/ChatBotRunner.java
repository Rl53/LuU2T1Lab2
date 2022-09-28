public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("debbie", 5);
        debbie.greeting("Rosanna");
        debbie.weather();
    }
}
