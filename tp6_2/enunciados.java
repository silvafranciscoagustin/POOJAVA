package tp6_2;


//2. Centro de Cómputos
//Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las
//computadoras que dispone. Si no hay computadoras disponibles los procesos a ejecutar deben
//esperar en una cola de espera que los ordena teniendo en cuenta sus requerimientos de
//memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer
//lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que
//prioriza la selección de las computadoras más rápidas.


//3. Puerto de Cereales
//Un puerto debe coordinar las actividades de carga de los barcos con cereal traído por
//camiones desde el campo. Sólo se puede cargar un barco a la vez. Los barcos que esperan ser
//cargados se ubican en una cola de espera que los ordena teniendo en cuenta su capacidad (los
//barcos con mayor capacidad serán atendidos en primer lugar). Sólo se puede descargar un
//camión a la vez.
// Los camiones que esperan ser descargados se ubican en una cola de espera
//que los ordena teniendo en cuenta la fecha en que fueron cargados (los camiones que fueron
//cargados primero serán atendidos en primer lugar).

//4. Abstracción


//Abstraer el comportamiento en común de los ejercicios 2 y 3 e implementar la solución.
//Implementar como quedaron las dos versiones

//1. Agroquímicos
//Se debe diseñar e implementar un sistema para una empresa agrícola que se dedica a la
//fabricación y venta de productos químicos. Un producto químico tiene asociado un nombre, un
//conjunto cultivos donde se desaconseja su uso (por ejemplo, girasol, lino, maíz), y un conjunto
//de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de tratar (por
//ejemplo, hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros).
//El sistema está pensado para ayudar a las agrícolas a decidir qué agroquímico se puede
//utilizar para tratar ciertas enfermedades de los cultivos. Una enfermedad tiene un nombre
//asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo: Cochinilla
//(estados patológicos: deshidratación, hojas amarillas). Aclaración: los estados patológicos de
//una enfermedad se corresponden con los estados patológicos que los productos son capaces de
//tratar.
//Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden afectar.
//Asimismo, dado un producto químico, los cultivos son capaces de decir si en algún momento
//puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus enfermedades
//frecuentes y no se desaconseja su uso en el cultivo. Se considera que el agroquímico trata una
//enfermedad si todos los estados patológicos de la enfermedad están contenidos por las acciones
//del producto químico.
//Se debe proveer los siguientes servicios:
//● Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
//● Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los pueden
//tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
//determinados cultivos.
public class enunciados {


}
