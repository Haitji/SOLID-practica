Haitian Ji
===========

getSize() arreglado
---------------------
Me percate de que en **FileManager** estaba incumpliendo en *Principio de abierto y cerrado*, porque usa una cadena de ifs en lugar de usar un método abstracto.  
Y que al usar el método abstracto hemos podido ahorrar lineas de codigo.

Incumplimiento de **Principio Segregación de Interfaces**
-----------------------------------------------------------

En la interfaz de **FileSystemItem** incumple con este principio porque hay métodos que no se usa, por ejemplo en file no usa algunos métodos de directorio, y a la viceversa.  
-He intentado solucionarlo separando métodos de la interfaz en 3 interfaces pero al intentarlo me saltaba error por todos los lados.

Incumplimiento del **Principio de sustitucion de Liskov**
-----------------------------------------------------------

En el fichero o clase **FileSystemItemBase** le hereda 2 clases, Directory y File, pero uno no puede sustituir al otro en ninguna situación, asi que incumple este principio.  


Incumplimiento del **Principio de Responsabilidad unica**
-----------------------------------------------------------

Incumple este principio porque en la clase **File** hace como gestor de file y también hace de conversor .mp3 .  
Lo he solucionado separando los métodos de conversión en mp3 en otra clase(*ConverterMP3*).