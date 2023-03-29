Haitian Ji
===========

getSize() arreglado
---------------------
Me percate de que en **FileManager** estaba incumpliendo en *Principio de abierto y cerrado*, porque usa una cadena de ifs en lugar de usar un método abstracto.
Y que al usar el método abstracto hemos podido ahorrar lineas de codigo.

Incumplimiento de **Principio Segregación de Interfaces**
-----------------------------------------------------------

En la interfaz de **FileSystemItem** incumple con este principio porque hay métodos que no se usa, por ejemplo en file no usa algunos métodos de directorio, y a la viceversa.

Incumplimiento del **Principio de sustitucion de Liskov**
-----------------------------------------------------------

En el fichero o clase **FileSystemItemBase** le hereda 2 clases, Directory y File, pero uno no puede sustituir al otro en ninguna situación, asi que incumple este principio.
