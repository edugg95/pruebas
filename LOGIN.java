/*esto es una prueba para github*/
public class LOGIN {
    /** Correo electrónico para autenticación */
    private String mail;
    /** Contraseña para autenticación */
    private String contrasena;
    /** Nombre de usuario */
    private String usuario;
    
    /**
     * Constructor de la clase LOGIN
     * @param usuario Se asignara un nombre de Usuario
     */
    public LOGIN(String usuario) {
        this.mail = "";
        this.contrasena = "";
        this.usuario = usuario;
    }

    /**
     * Obtiene el correo electrónico registrado
     * @return Correo electrónico
     */
    public String getMail() {
        return mail;
    }
    
    /**
     * Establece el correo electrónico
     * @param mail Nuevo correo electrónico
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    /**
     * Obtiene la contraseña actual
     * @return Contraseña
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * Establece una nueva contraseña
     * @param contrasena Nueva contraseña
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * Obtiene el nombre de usuario
     * @return Nombre de usuario
     */
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Establece un nuevo nombre de usuario
     * @param usuario Nuevo nombre de usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Establece conexión con el servidor del juego
     * @param aconectar el usuario que intenta conectarse
     * @return true si la contraseña y el mail son correctos, false en caso contrario
     */
 public boolean conectar(Persona aconectar) {
    if (this.mail.equals(aconectar.getMail())) {
        if (this.contrasena.equals(aconectar.getContrasena())) {
            System.out.println("Conectando al servidor...");
            return true;
        }
    }
    return false;
}

        


    /**
     * Cambia la contraseña del usuario
     * @param contrasenaNueva contraseña nueva introducida por el usuario
     * @param acambiar Usuario que quiere cambiar la contraseña
     * @return true si el cambio fue exitoso, false en caso contrario
     */
    public boolean cambiarContrasena (String contrasenaNueva, Persona acambiar) {
        acambiar.setContrasena(contrasenaNueva);
        System.out.println("Contraseña cambiada con éxito");
        return true;
    }
}