# OPT-project-1
Github repo voor het eerste project van OPT(Ontwerpen, Programmeren en Testen).

Om te starten moet je eerst Git geinstalleerd hebben op je systeem. Maak daarna ergens op je systeem een folder aan waarin je de repo gaat zetten.
  1. In de folder dat je heb aangemaakt moet je rechts-klikken en op 'Git Bash here' klikken in het menu dat verschijnt.
  2. In de git bash command line, voer het volgende in : git clone https://github.com/DKnightAnon/OPT-project-1.git . Met dit command kloon(download) je de main branch van de repository. Wil je een andere branch clonen, dan moet je op github naar die branch navigeren, op de 'code' knop drukken (staat naast 'Go to file' en 'Add file') waar je de url kan kopieren om te gebruiken met de git clone command.
  3. Om een branch aan te maken waarin je werkt zodat je de main code niet aanraakt, voer het volgende in de gitbash in : git checkout -b [jouw-branch-naam]
          Met 'git branch' kun je vervolgens checken op welke branch je zit en welke er zijn, en met git checkout (zonder de -b flag) en de naam van de branch kun je     
          naar de ingevoerde branch navigeren.
  4. Nu kun je bestanden toevoegen in je branch. Als je dat hebt gedaan, voer dan het volgende in : git status . Hiermee kun je kijken welke bestanden er  
     geregistreerd zijn in een commit.
  5. Vevolgens kun je een bestand toevoegen aan je commits met het volgende command : git add [bestandnaam.bestandtype]. Wil je alle bestanden in je branch toevoegen, 
     dan doe je het volgende : 'git add .' De punt achter 'add' zorgt ervoor dat het command een 'add all' command wordt.
  6. Nu kun je de veranderingen in de bestanden committen met het volgende command : git commmit -m "comment" . Vervang de comment tussen de haakjes met een duidelijke 
     beschrijving van wat je hebt veranderd sinds de vorige commit.
  7. Om de branch op je systeem te pushen naar Github voer je het volgende command in : git push origin [jouw-branch-naam] . Als deze branch nog niet bestaat op de 
     Github pagina zal dit automatisch aangemaakt worden. 
  8. 
