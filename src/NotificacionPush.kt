class NotificacionPush(val aplicacion : String) : Notificable {
    override fun enviarNotificacion() {
        println("🔔 ¡Notificación importante! $aplicacion tiene una actualización para ti. Abre la app para más detalles.")
    }
}