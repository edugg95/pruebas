/**
 * Clase NPC (Non-Player Character) que representa a personajes no jugables.
 * Define comportamientos e interacciones con NPCs del juego.
 */
public class NPC {

    /**
     * Apariencia visual del NPC
     */
    private String apariencia;
    /**
     * Posición X del NPC
     */
    private int coordenadax;
    /**
     * Posición Y del NPC
     */
    private int coordenaday;
    /**
     * Identificador único del NPC
     */
    private String id_npc;

    /**
     * Constructor de la clase NPC
     *
     * @param id_npc Se le asigna una id a cada NPC que se crea
     */
    public NPC(String id_npc) {
        this.apariencia = "default";
        this.coordenadax = 0;
        this.coordenaday = 0;
        this.id_npc = id_npc;
    }

    /**
     * Obtiene la apariencia del NPC
     *
     * @return Descripción de la apariencia
     */
    public String getApariencia() {
        return apariencia;
    }

    /**
     * Establece una nueva apariencia para el NPC
     *
     * @param apariencia Nueva apariencia
     */
    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    /**
     * Obtiene las coordenadas actuales del NPC
     *
     * @return Coordenada X en formato int
     */
    public int getCoordenadax() {
        return coordenadax;
    }

    /**
     * Establece nuevas coordenada X para el NPC
     *
     * @param coordenadax Nuevas coordenada en X
     */
    public void setCoordenadax(int coordenadax) {
        this.coordenadax = coordenadax;
    }

    /**
     * Obtiene las coordenadas actuales del NPC
     *
     * @return Coordenada Y en formato int
     */
    public int getCoordenaday() {
        return coordenaday;
    }

    /**
     * Establece nuevas coordenada Y para el NPC
     *
     * @param coordenaday Nuevas coordenada en Y
     */
    public void setCoordenaday(int coordenaday) {
        this.coordenaday = coordenaday;
    }

    /**
     * Obtiene el identificador único del NPC
     *
     * @return ID del NPC
     */
    public String getId_npc() {
        return id_npc;
    }

    /**
     * Establece el identificador único del NPC
     *
     * @param id_npc Nuevo ID para el NPC
     */
    public void setId_npc(String id_npc) {
        this.id_npc = id_npc;
    }

    /**
     * Mueve al NPC por el mapa en una dirección específica
     *
     * @param direccion Dirección del movimiento ("norte", "sur", "este",
     * "oeste")
     * @param pasos Cantidad de pasos a mover
     * @return Las nueva coordenada de X o de Y después del movimiento
     */
    public int moverse(String direccion, int pasos) {

        // Actualizar posición según la dirección
        switch (direccion.toLowerCase()) {
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
     * Inicia un diálogo con el jugador
     */
    public boolean dialogo(Heroe adialogar) {
        if (adialogar.getCoordenadax() == this.coordenadax
                && adialogar.getCoordenaday() == this.coordenaday) {
            System.out.println("NPC iniciando diálogo");
            return true;
        }
        return false;
    }
}