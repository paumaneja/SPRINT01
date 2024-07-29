-------------------------------
Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
Crea un fitxer anomenat “readme.txt” per explicar el comando a executar a cada exercici.

Es pot utilitzar Java exclusivament, o bé la llibreria Apache Commons IO si ho prefereixes.
-------------------------------

ENUNCIAT EXERCICI 2

Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament)
de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F),
i la seva última data de modificació.

Per compilar i executar el programa (MAC):

1. Obrir Terminal
2. Naveguem fins a la carpeta del projecte creat a Intellij
3. Primer compilem:
    Executem el següent comando (javac package/nomdelaclasse.java):
    Exemple: javac N0102/n1exercici2.java
    -> Si tot és correcte es crearà un arxiu anomenat igual que la classe, però amb extensió .class
4. Executem el programa indicant la ruta que volem mostrar (java package/nomdelaclasse ruta/relativa/diretori)
    Exemple: java N0102/n1exercici2 N0102/resources