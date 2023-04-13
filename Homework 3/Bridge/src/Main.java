public class Main {
    public static void main(String[] args) {
        MessageType text = new TextMessage();
        MessageType image = new ImageMessage();
        MessageType video = new VideoMessage();

        MessagingApp whatsApp = new WhatsAppMessagingApp();
        whatsApp.sendMessage(text);
        whatsApp.sendMessage(image);
        whatsApp.sendMessage(video);
        System.out.println();

        MessagingApp telegram = new TelegramMessagingApp();
        telegram.sendMessage(text);
        telegram.sendMessage(image);
        telegram.sendMessage(video);
        System.out.println();

        MessagingApp facebook = new FacebookMessagingApp();
        facebook.sendMessage(text);
        facebook.sendMessage(image);
        facebook.sendMessage(video);
    }
}