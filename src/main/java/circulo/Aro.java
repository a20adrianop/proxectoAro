package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Adrian Ordas Pato
 */
public class Aro {

    /**
     * Minimo radio disponible
     */
    public static final double MINIMO = 0.0;

    /**
     * Minimo radio disponible
     */
    public static final double LIMITERADIO = 0.0;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor vacío por defecto
     */
    public Aro() {
    }

    /**
     * Constructor con valores de coordenadas X e Y y el valor del radio
     * @param valorX coordenada X
     * @param valorY coordenada Y
     * @param valorRadio valor del radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * @return la coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX la coordenadaX a establecer
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return la coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY la coordenadaY a establecer
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return el radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio el radio a establecer
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *  Obtener el diámetro del Aro
     * @return el diámetro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * obtener el tamaño de la circunferencia del Aro
     * @return la longitud
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obtener la superficie total del Aro
     * @return la superficie
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Método para mover el Aro de coordenadas, sumando a las del Aro las enviadas
     * @param trasladarX distancia en ejeX a mover
     * @param trasladarY distancia en ejeY a mover
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}