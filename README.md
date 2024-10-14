# LP_FileReader

Projet JAVA - Bataille

## Description
Ce projet a pour but d'ouvrir un fichier (json/txt/csv) d'en lire son contenue et d'avoir 3 resultats de sortie à savoir : Afficher le contenu du fichier à l'endroit, à l'enveers en fonction des lignes et de manière palindromique.

## Structure du projet
Le projet est structuré en 6 classes principales :

FileReader : Représente le main, là ou il y a notre emplacement de fichier et les functions à tester.
FileType : Représente la classe abstraite.
IFileReader : Cette classe correspond à notre interface.
csvFile : La classe enfant permettant d'effectuer les actions pour le fichier de type csv.
jsonFile: La classe enfant permettant d'effectuer les actions pour le fichier de type json.
txtFile : La classe enfant permettant d'effectuer les actions pour le fichier de type txt.

## ATTENTION
Il est important de **modifié l'emplacement du fichier à essayer** par celui de votre convenance dans le `FileReader.java`
