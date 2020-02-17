Actividad 3.7

EJERCICIO 3_7     ENVÍO DE OBJETOS A TRAVÉS DE SOCKETS TCP 
                                Y
                               CONEXIÓN DE MÚLTIPLES CLIENTES.HILOS 

1º. Crea las siguientes clases con los atributos , los constructores y los métodos get y set necesarios.
Clase Asignatura
int id;
String nombreasig;
Clase Especialidad
int id;
String nombreespe;
Clase Profesor
int idprofesor;
String nombre;
Asignatura [] asignaturas;
Especialidad espe;
Suponemos que un profesor puede impartir hasta 3 asignaturas
2º.- Utilizando Sockets TCP crea un programa servidor que inicialice un array de 5 objetos de tipo Profesor. ( simula datos que tiene el servidor y sirve a sus clientes).Cada vez que se conecta un cliente, el servidor le asigna un identificador al cliente, que identifica al cliente y el orden de las conexiones, empezará en 1 y se incrementará en 1 según se van aceptando conexiones. Al concetarse el cliente, el servidor le envía al cliente el identificador que le ha correspondido.
El servidor recibirá del cliente un idprofesor  y le devolverá el objeto Profesor correspondiente a ese identificador de profesor, (le sirve los datos ).
Este  servidor  puede atender a múltiples clientes  
3º.- Crea un programa cliente,que una vez conectado al servidor,  primero muestre el identificador de cliente que le ha correspondido. El proceso cliente recibirá por teclado el idprofesor que desea consultar al servidor, se leeran repetidamente idprofesor a consultar hasta que el idprofesor sea “*”.
El servidor le devolverá un objeto Profesor con los datos solicitados. Si elprofesor no existe, el servidor también devolverá un objeto Profesor con datos que indiquen que el profesor no existe. El cliente debe visualizar todos los datos recibidos incluidos la especialidad y las asignaturas del profesor con sus identificadores. 