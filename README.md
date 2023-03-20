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
  1. git branch -r (Dit laat alle branches op github zien)
  2. git checkout [branch-name]
  
  
# Git foutmeldingen

Als je een foutmelding ziet in de command line dat er ongeveer zo uit ziet : "LF will be replaced by CRLF", kun je dit oplossen door het volgende command te runnen : git config --local core.autocrlf false
Deze foutmelding gaat over de manier hoe Windows omgaat met line-endings. Met bovenstaande command configureer je dit op een lokaal niveau(project gebaseerd). 

In het geval dat je een foutmelding krijgt waarin staat dat je geen toegang hebt tot de repo(Dit gebeurt meestal als je iets probeert te pushen), stuur mij dan een bericht. Deze foutmelding betekent namelijk dat je geen collaborator bent, en dat ik je toestemming moet geven om dingen te wijzigen in de repository. Om write-access te krijgen moet je toegevoegd worden als een collaborator. Je krijgt hiervoor een invite dat je moet accepteren.

  
# Pull-requests aanmaken nadat je iets hebt gepusht naar Github

Nadat je iets hebt gepusht met het git push command vanuit de branch dat je op je systeem hebt gemaakt, moet je nog naar de Github pagina gaan om daar een pull-request te maken. Github kijkt dan eerst of jouw branch samengevoegd kan worden met de main branch. Een pull-request moet eerst bekeken en goedgekeurd worden voordat het met de main branch samengevoegd kan worden. 

# Project requirements

Voor dit project moet er een applicatie gemaakt worden voor scheepsbouwers. Deze opdracht komt voor uit een behoefte van de opdrachtgever om het genereren van offertes te stroomlijnen. Deze applicatie moet (kennelijk) een CLI(Command Line Interface) applicatie zijn.

# Sprint planning

Sprint 0/1(Huidig)
  - Einddatum 19/3/2022
  - User story 3 : “ Als scheepsbouwer wil ik de mogelijkheid hebben om verschillende klanttypes te selecteren, zodat ik de juiste kortingen kan toepassen en de prijs nauwkeuriger kan bepalen.”

    • Er zijn verschillende klanttypes beschikbaar voor de scheepsbouwer, zoals particulieren, bedrijven en overheden.


    • De klanttypes zijn gemakkelijk te selecteren en te wijzigen in de applicatie.


    • Elk klanttype heeft zijn eigen kortingen, die nauwkeurig worden berekend en toegepast op de offerte.


  - Item 2 : User story 1 - “ Als scheepsbouwer wil ik een overzichtelijke lijst van essentiële en extra opties, zodat ik snel en gemakkelijk een offerte op maat kan maken voor mijn klant.” 
  
    • Er is een optie voor milieu-kortingen per onderdeel beschikbaar voor de scheepsbouwer.
    
    • De optie is duidelijk omschreven en gemakkelijk te vinden in de applicatie.
    
    • De kortingen worden nauwkeurig berekend en toegepast op de offerte. 
    
