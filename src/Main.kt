fun main() {
    val correo = CorreoElectronico("Pablo Motos")
    val mensajeTexto = MensajeDeTexto("Tu Abuela Manuela")
    val notificacion = NotificacionPush("Fornite")

    correo.enviarNotificacion()
    mensajeTexto.enviarNotificacion()
    notificacion.enviarNotificacion()
}