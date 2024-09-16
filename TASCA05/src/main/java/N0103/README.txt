-------------------------------
Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
Crea un fitxer anomenat “readme.txt” per explicar el comando a executar a cada exercici.

Es pot utilitzar Java exclusivament, o bé la llibreria Apache Commons IO si ho prefereixes.
-------------------------------

ENUNCIAT EXERCICI 3

Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.

Per compilar i executar el programa (MAC):

1. Obrir Terminal
2. Naveguem fins a la carpeta del projecte creat a Intellij
3. Primer compilem:
    Executem el següent comando (javac package/nomdelaclasse.java):
    Exemple: javac N0103/DirectoryAndFileManager_V2.java
    -> Si tot és correcte es crearà un arxiu anomenat igual que la classe, però amb extensió .class
4. Executem el programa indicant la ruta que volem mostrar i l'arxiu de sortida:
    java package/nomdelaclasse ruta/relativa/diretori ruta/arxiu/sortida.txt)

    Exemple: java N0103/DirectoryAndFileManager_V2 N0103/resources N0103/carpetes.txt