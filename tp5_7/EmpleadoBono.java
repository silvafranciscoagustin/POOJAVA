package tp5_7;

public class EmpleadoBono extends EmpleadoComision {
    private int cantVentasParaBono;
    private double montoBono;

    public EmpleadoBono(String nombre, String apellido,int dni,double sueldoMensual,double porcentajeComision, int cantVentasParaBono, double montoBono) {
        super(nombre,apellido,dni,sueldoMensual,porcentajeComision);
        setCantVentasParaBono(cantVentasParaBono);
        setMontoBono(montoBono);
    }

    public int getCantVentasParaBono() {
        return cantVentasParaBono;
    }

    public void setCantVentasParaBono(int cantVentasParaBono) {
        this.cantVentasParaBono = cantVentasParaBono;
    }

    public double getMontoBono() {
        return montoBono;
    }

    public void setMontoBono(double montoBono) {
        this.montoBono = montoBono;
    }

    public boolean correspondeBono(){
        return this.getVentas().size() >= cantVentasParaBono;  //el this es solo para claridad, si no lo tubiera anda igual, pero aclaro que llama al padre
    }

    @Override
    public double getSueldoMensual() {
        if(correspondeBono()){
            return super.getSueldoMensual() + montoBono;
        }else{
            return super.getSueldoMensual();
        }
    }



}
