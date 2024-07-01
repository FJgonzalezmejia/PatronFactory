class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new EmailNotificacion();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new SMSNotificacion();
        } else if (tipo.equalsIgnoreCase("app")) {
            return new AppNotificacion();
        } else {
            throw new IllegalArgumentException("Tipo de notificación no válido");
        }
    }
}

