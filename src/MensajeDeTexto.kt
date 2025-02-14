class MensajeDeTexto(val contacto : String) : Notificable {
    override fun enviarNotificacion() {
        println("📩 Nuevo mensaje de $contacto. Responde ahora o revisa tu bandeja de mensajes.")
    }
}