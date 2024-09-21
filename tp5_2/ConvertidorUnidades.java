package tp5_2;

public class ConvertidorUnidades {
    private static final double CENTIMETROS_POR_PULGADA = 2.54;
    private static final double KILOS_POR_LIBRA = 0.453592;
    private static final double LITROS_POR_GALON = 3.78541;


    //al poner static en un metodo, el metodo se puede llamar desde la misma clase sin la necesidad de ser instanciado.
    public static double centimetrosAPulgada(double centimetros){
        return centimetros / CENTIMETROS_POR_PULGADA;
    }
    public static double pulgadasACentimetros(double pulgadas){
        return CENTIMETROS_POR_PULGADA * pulgadas;
    }

    public static double kilosALibra(double libras){
        return libras / KILOS_POR_LIBRA;
    }
    public static double libraAKilos(double kilos){
        return KILOS_POR_LIBRA * kilos ;
    }

    public static double litrosAGalon(double litros){
        return litros / LITROS_POR_GALON;
    }

    public static double galonALitros(double galon){
        return LITROS_POR_GALON * galon;
    }







}
