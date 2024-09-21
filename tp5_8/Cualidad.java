package tp5_8;

public class Cualidad {
    private String cualidad;
    public Cualidad(String cualidad) {
        setCualidad(cualidad);
    }


    public boolean equals(Object o){
        Cualidad c = (Cualidad) o ;
        try{
            return c.getCualidad() == this.getCualidad();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCualidad() {
        return cualidad;
    }

    public void setCualidad(String cualidad) {
        this.cualidad = cualidad;
    }
}
