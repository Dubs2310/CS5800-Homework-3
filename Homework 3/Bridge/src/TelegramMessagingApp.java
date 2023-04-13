public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        messageType.sendMessage();
        System.out.println(" from Telegram");
    }
}