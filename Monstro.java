/**
 * Clase Monstro que representa a los enemigos del juego.
 * Define características, comportamiento y habilidades de los monstros.
 */
public class Monstro {
    /** Apariencia visual del monstro */
    private String apariencia;
    /** Posición X del NPC */
    private int coordenadax;
    /** Posición Y del NPC */
    private int coordenaday;
    /** Puntos de vida del monstro */
    private int puntosVida;
    /** Poder de ataque del monstro */
    private int ataque;
    /** Identificador único del monstro */
    private String id_monstro;
    
    /**
     * Constructor de la clase Monstruo
     * @param id_monstro Se le asigna una id a cada Monstro que se crea
     */
    public Monstro(String id_monstro) {
        this.apariencia = "default";
        this.coordenadax = 0;
        this.coordenaday = 0;
        this.puntosVida = 50;
        this.ataque = 5;
        this.id_monstro = id_monstro;
    }
    
     /**
     * Obtiene las coordenadas actuales del monstro
     * @return Coordenada X en formato int
     */
    public int getCoordenadax() {
        return coordenadax;
    }
    
    /**
     * Establece nuevas coordenada X para el monstro
     * @param coordenadax Nuevas coordenada en X
     */
    public void setCoordenadax(int coordenadax) {
        this.coordenadax = coordenadax;
    }
    
    /**
     * Obtiene las coordenadas actuales del monstro
     * @return Coordenada Y en formato int
     */
    public int getCoordenaday() {
        return coordenaday;
    }

     /**
     * Establece nuevas coordenada Y para el monstro
     * @param coordenaday Nuevas coordenada en Y
     */
    public void setCoordenaday(int coordenaday) {    
        this.coordenaday = coordenaday;
    }
    
    /**
     * Obtiene los puntos de vida actuales del monstro
     * @return Puntos de vida
     */
    public int getPuntosVida() {
        return puntosVida;
    }
    
    /**
     * Establece los puntos de vida del monstro
     * @param puntosVida Nuevos puntos de vida
     */
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    
    /**
     * Obtiene el poder de ataque del monstro
     * @return Poder de ataque
     */
    public int getAtaque() {
        return ataque;
    }
    
    /**
     * Establece el poder de ataque del monstro
     * @param ataque Nuevo poder de ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    /**
     * Obtiene el identificador único del monstro
     * @return ID del monstruo
     */
    public String getId_monstruo() {
        return id_monstro;
    }
    
    /**
     * Establece el identificador único del monstro
     * @param id_monstro Nuevo ID para el monstro
     */
    public void setId_monstruo(String id_monstro) {
        this.id_monstro = id_monstro;
    }
    
    /**
     * Realiza un ataque contra el héroe u otros objetivos
     * @return Poder de ataque que realizara el Monstro
     */
    public int atacar() {
        System.out.println("Monstro atacando con poder: " + ataque);
        return this.ataque;
    }
    
    /**
     * Mueve al NPC por el mapa en una dirección específica
     * @param direccion Dirección del movimiento ("norte", "sur", "este", "oeste")
     * @param pasos Cantidad de pasos a mover
     * @return Las nueva coordenada de X o de Y después del movimiento
     */
    public int moverse(String direccion, int pasos) {
        
        // Actualizar posición según la dirección
        switch(direccion.toLowerCase()) {
            case "norte":
                this.coordenaday += pasos;
                System.out.println("NPC movido hacia arriba");
                return this.coordenaday;
            case "sur":
                this.coordenaday -= pasos;
                System.out.println("NPC movido hacia abajo");
                return this.coordenaday;
            case "este":
                this.coordenadax += pasos;
                System.out.println("NPC movido a la derecha");
                return this.coordenadax;
            case "oeste":
                this.coordenadax -= pasos;
                System.out.println("NPC movido a la izquierda");
                return this.coordenadax;
            default:
                System.out.println("Dirección no válida. Use norte, sur, este u oeste.");
                return this.coordenadax;
        }
    } 

     /**
     * Recibir daño de un Monstro
     * @param atacante Heroe que te ataca
     */
        public void recibirDanio(Heroe atacante){
        this.puntosVida -= atacante.atacar();
    }
}