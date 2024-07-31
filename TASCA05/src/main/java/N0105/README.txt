-------------------------------
Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
Crea un fitxer anomenat “readme.txt” per explicar el comando a executar a cada exercici.

Es pot utilitzar Java exclusivament, o bé la llibreria Apache Commons IO si ho prefereixes.
-------------------------------

ENUNCIAT EXERCICI 5

Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.

Per compilar i executar el programa (MAC):

1. Obrir Terminal
2. Naveguem fins a la carpeta del projecte creat a Intellij
3. Primer compilem:
    Executem el següent comando (javac package/nomdelaclasse.java):
    Exemple: javac N0104/n1exercici4.java
    -> Si tot és correcte es crearà un arxiu anomenat igual que la classe, però amb extensió .class
4. Executem el programa indicant la ruta:
    - de la carpeta que volem mostrar
    - de l'arxiu que volem llegir i mostrar per consola
    Exemple: java N0104/n1exercici4 N0103/resources N0103/carpetes.txt