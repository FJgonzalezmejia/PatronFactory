// Sin usar Factory
public class Main {
    public static void main(String[] args) {
        // Creación directa de objetos
        EmailNotificacion emailNotificacion = new EmailNotificacion();
        emailNotificacion.enviarMensaje("¡Hola desde email!");

        SMSNotificacion smsNotificacion = new SMSNotificacion();
        smsNotificacion.enviarMensaje("¡Hola desde SMS!");

        AppNotificacion appNotificacion = new AppNotificacion();
        appNotificacion.enviarMensaje("¡Hola desde aplicación!");
    }
}


