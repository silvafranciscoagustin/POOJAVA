package TP2_2;

import java.util.ArrayList;

public class AgendaPersonal {
    private String nombre;
    private ArrayList<Reunion> reuniones = new ArrayList<>();

    public AgendaPersonal(String nombre){
       setNombre(nombre);
       setReuniones(reuniones);
    }



//no es necesario ni pidieron, ver si esta en el mismo lugar, pero es interesante de ver,
// como funciona la forma de comparar un objeto con otro , no es con ==
    //String cadena1 = "Hola";
    //String cadena2 = new String("Hola");
    //
    //System.out.println(cadena1 == cadena2);  // Imprime false (diferentes referencias)
    //System.out.println(cadena1.equals(cadena2));  // Imprime true (mismo contenido)

    public void agregarReunion(Reunion nuevaReunion){
        boolean haySup =  false;
        for (int i = 0; i < reuniones.size(); i++) {
            //if(nuevaReunion.getLugar().equals(reuniones.get(i).getLugar()))  {}
                if (haySuperposicion(reuniones.get(i), nuevaReunion)){
                    haySup= true;
                    break;
                }
        }
        if(!haySup){
            reuniones.add(nuevaReunion);
        }else{
            throw new IllegalArgumentException("Ya hay una reunión en ese horario");
        }
    }

//el primer caso: seria que el fin de la 2, este despues del inicio de la 1,
//el segundo caso: qe el inicio de la 2, sea antes del fin de la 1

//return !(r2.getHoraFin().isAfter(r1.getHoraInicio())||r2.getHoraInicio().isBefore(r1.getHoraFin()));
    //por alguna razon estaba mal, por lo tanto se descubrio el otro metodo bien picadiño, despuies de dibujar
    //huevo dibu huevo


//que el fin de la 2 este antes que el inicio de la 1
// que el fin de la 1 este antes que el inicio de la 2.
//si cualquiera de las 2 es falsa, da true, osea que hay superposicion
    public boolean haySuperposicion(Reunion r1, Reunion r2){
        return !(r2.getHoraFin().isBefore(r1.getHoraInicio()) || r1.getHoraFin().isBefore(r2.getHoraInicio()));
    }

    public AgendaPersonal(){
        this("Agenda Por Defecto");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(ArrayList<Reunion> reuniones) {
        if(reuniones== null){
          throw new IllegalArgumentException("La lista de asistentes no puede ser vacia.");
        }
        this.reuniones = reuniones;
    }
}

//¡Excelente pregunta! Una agenda personal bien diseñada puede ser una herramienta invaluable para gestionar el tiempo de manera efectiva.
//
//Métodos adicionales para tu agenda:
//
//Más allá de agregar reuniones y verificar horarios, aquí te presento algunas funcionalidades que podrían enriquecer tu agenda:
//
//1. Edición y Eliminación de Reuniones:
//Edición: Permitir al usuario modificar cualquier detalle de una reunión existente (fecha, hora, lugar, participantes, tema, etc.).
//Eliminación: Ofrecer la opción de borrar una reunión del registro.
//2. Búsqueda de Reuniones:
//Por fecha: Buscar todas las reuniones programadas para un día específico o un rango de fechas.
//Por participante: Encontrar todas las reuniones en las que participa una persona determinada.
//Por tema: Buscar reuniones relacionadas con un tema en particular.
//Por lugar: Encontrar todas las reuniones que se llevarán a cabo en un lugar específico.
//3. Recordatorios:
//Notificaciones: Enviar alertas al usuario antes de una reunión, ya sea por correo electrónico, mensaje de texto o una notificación en la propia aplicación.
//Personalización: Permitir al usuario configurar la frecuencia y el tipo de recordatorio.
//4. Integración con otras aplicaciones:
//Calendario: Sincronizar la agenda con calendarios digitales como Google Calendar o Outlook.
//Contactos: Integrar la agenda con la aplicación de contactos del dispositivo para facilitar la búsqueda y el agregado de participantes.
//Mapas: Mostrar la ubicación de las reuniones en un mapa integrado.
//5. Estadísticas y reportes:
//Tiempo dedicado a reuniones: Generar reportes sobre la cantidad de tiempo que el usuario dedica a reuniones en un período determinado.
//Participantes frecuentes: Identificar a las personas con las que el usuario se reúne más a menudo.
//Temas más recurrentes: Mostrar los temas que se abordan con mayor frecuencia en las reuniones.
//6. Compartir la agenda:
//Permisos de acceso: Permitir al usuario compartir la agenda con otros usuarios y definir los niveles de acceso (solo lectura, edición, etc.).
//Sincronización en tiempo real: Mantener la agenda actualizada en todos los dispositivos del usuario.
