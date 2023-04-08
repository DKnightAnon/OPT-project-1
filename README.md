# OPT-project-1
Github repo voor het eerste project van OPT(Ontwerpen, Programmeren en Testen).

Om te starten moet je eerst Git geinstalleerd hebben op je systeem. Maak daarna ergens op je systeem een folder aan waarin je de repo gaat zetten.
  1. In de folder dat je heb aangemaakt moet je rechts-klikken en op 'Git Bash here' of 'Open in Terminal' klikken in het menu dat verschijnt.
  2. In de git bash command line, voer het volgende in : git clone https://github.com/DKnightAnon/OPT-project-1.git . Met dit command kloon(download) je de main branch van de repository. Wil je een andere branch clonen, dan moet je op github naar die branch navigeren, op de 'code' knop drukken (staat naast 'Go to file' en 'Add file') zodat je de url kan kopieren om te gebruiken met de git clone command.
  3. Om een branch aan te maken waarin je werkt zodat je de main code niet aanraakt, voer het volgende in de gitbash in : git checkout -b [jouw-branch-naam]
          Met 'git branch' kun je vervolgens checken op welke branch je zit en welke er zijn, en met git checkout (zonder de -b flag) en de naam van de branch kun je     
          naar de ingevoerde branch navigeren.
  4. Nu kun je bestanden toevoegen in je branch. Dit doe je door in Windows Explorer bestanden naar de map waarin je werkt te verplaatsen. (Tip : Als je de folder ShipFlexCode in IntelliJ opent als project hoef je geen .java bestanden rond te slepen in Windows Explorer.) Als je dat hebt gedaan, voer dan het volgende in : git status . Hiermee kun je kijken welke bestanden er  
     geregistreerd zijn in een commit.
  5. Vevolgens kun je een bestand toevoegen aan je commits met het volgende command : git add [bestandnaam.bestandtype]. Wil je alle bestanden in je branch toevoegen, 
     dan doe je het volgende : 'git add .' De punt achter 'add' zorgt ervoor dat het command een 'add all' command wordt.
  6. Nu kun je de veranderingen in de bestanden committen met het volgende command : git commmit -m "comment" . Vervang de comment tussen de haakjes met een duidelijke 
     beschrijving van wat je hebt veranderd sinds de vorige commit.
  7. Om de branch op je systeem te pushen naar Github voer je het volgende command in : git push origin [jouw-branch-naam] . Als deze branch nog niet bestaat op de 
     Github pagina zal dit automatisch aangemaakt worden. 
  8. Om in de toekomst een branch vanaf je sytseem te pushen moet je veranderingen aanbrengen in een van de bestanden in de branch. Zoals eerder gezegd kun je het command git status gebruiken om te kijken welke bestanden gewijzigd zijn en welke niet toegevoegd zijn aan je commits(Dit zijn de 'untracked' bestanden.)

Om een andere branch op github te pullen kun je het volgende doen : 
  1. git fetch
  2. git branch -r (Dit laat alle branches op github zien)
  3. git checkout [branch-name]
  of je kan het command git merge origin [branch-name](Hiermee combineer je de branch waar je op zit met de branch waarvan je de naam opgeeft. Dit gebeurt alleen lokaal op je eigen computer.)
  
  
# Git foutmeldingen

Als je een foutmelding ziet in de command line dat er ongeveer zo uit ziet : "LF will be replaced by CRLF", kun je dit oplossen door het volgende command te runnen : git config --local core.autocrlf false
Deze foutmelding gaat over de manier hoe Windows omgaat met line-endings. Met bovenstaande command configureer je dit op een lokaal niveau(project gebaseerd). 

In het geval dat je een foutmelding krijgt waarin staat dat je geen toegang hebt tot de repo(Dit gebeurt meestal als je iets probeert te pushen), stuur mij dan een bericht. Deze foutmelding betekent namelijk dat je geen collaborator bent, en dat ik je toestemming moet geven om dingen te wijzigen in de repository. Om write-access te krijgen moet je toegevoegd worden als een collaborator. Je krijgt hiervoor een invite dat je moet accepteren.

Als je een merge conflict hebt betekent het dat in een van de bestanden die je wilt mergen een verschil is tussen de base versie(het bestand op github) de lokale versie(die jij hebt aangemaakt) en de inkomende versie die je wilt mergen(van een andere branch). Als het goed is kun je dit bestand dan openen met IntelliJ als het een java file is, en zal IntelliJ ook aangeven dat er een conflict is. Je krijgt dan beide versies te zien van het bestand. Maak veranderingen aan en sla het op, en voer dan het git add command uit. Hiermee hoor je de merge opgelost te hebben.

In het geval dat je de volgende warning krijgt in git :
"warning: in the working copy of 'out/production/OPT-project-1/CSV_Files/opties.csv', LF will be replaced by CRLF the next time Git touches it"
betekent het dat het teken waarmee het einde van een regel door git verandert zal worden. LF staat voor 'line feed', en CRLF staat voor 'carriage return line feed'. Dit is pas van belang wanneer je developers hebt die niet op een windows systeem werken.

Als je met alleen windows computer aan een project werkt kun je deze waarschuwing uitzetten met het volgende command : "git config core.autocrlf true"

Als je op een Mac of Linux systeem werkt, gebruik dan het volgende command : '$ git config --global core.autocrlf input'

  
# Pull-requests aanmaken nadat je iets hebt gepusht naar Github

Nadat je iets hebt gepusht met het git push command vanuit de branch dat je op je systeem hebt gemaakt, moet je nog naar de Github pagina gaan om daar een pull-request te maken. Github kijkt dan eerst of jouw branch samengevoegd kan worden met de main branch. Een pull-request moet eerst bekeken en goedgekeurd worden voordat het met de main branch samengevoegd kan worden. 

# Project requirements

Voor dit project moet er een applicatie gemaakt worden voor scheepsbouwers. Deze opdracht komt voor uit een behoefte van de opdrachtgever om het genereren van offertes te stroomlijnen. Deze applicatie moet (kennelijk) een CLI(Command Line Interface) applicatie zijn.


# Veelgebruikte git commands
git init // repository initializeren

git status // status bekijken

git add gitbestand.txt // gitbestand.txt toevoegen

git clone (url) // bestand clonen/downloaden

git fetch // ophalen zonder merge

git pull // ophalen met merge

git commit -m "asdhaskjd" // soort van opslaan + comment "asdhaskjd" meegeven

git checkout -b jasdk // nieuwe branch genaamd jasdk aanmaken

git checkout offerte // overgaan naar een bestaande branch offerte

git push origin offerte // branch offerte doorsturen naar github

# Afbeeldingen van de applicatie in werking

Applicatie start
![Start](https://user-images.githubusercontent.com/127386817/230741076-76257ac5-6a7e-4fd6-8c78-c45f7be92ead.jpg)

Uitleg van de beschikbare commands
![Uitleg commands](https://user-images.githubusercontent.com/127386817/230741084-0387310c-03f2-4e47-871a-d50ffdf0dab5.jpg)

Optielijst command
![Optielijst](https://user-images.githubusercontent.com/127386817/230741081-e7b116a6-59c5-4637-825c-c01e95d07a54.jpg)

