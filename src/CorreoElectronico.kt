class CorreoElectronico(val remitente : String): Notificable{
    override fun enviarNotificacion() {
        println("\"Tienes un nuevo correo de $remitente. Revisa tu bandeja de entrada para más detalles.\"")
    }
}