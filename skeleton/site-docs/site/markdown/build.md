## Build e run in locale

Per creare gli artefatti di progetto eseguire i seguenti comandi:

Generazione del jar ed esecuzione dei test

    mvnw clean install

Generazione del sito 

    mvnw site

Run del software

    mvnw spring-boot:run

Gli artefatti saranno disponibili nella cartella target. 
Il sito raccoglie tutta la documentazione generata in fase di test e molto altro ancora.

## Build e run nel container

Dalla root di progetto eseguire il comando

    make build

Verranno eseguiti i seguenti comandi del file Makefile:

- mvn.build: (può essere eseguite direttamente con make mvn.build)
    - pulizia, compilazione, creazione degli artefatti
    - registrazione delle componenti nel repository locale di maven

- docker.build: 
    - provvede alla creazione dell'immagine docker alla quale viene assegnato il tag ricavato dal POM come segue:

        ${project.groupId}.${project.name}:${project.version}

    - produce nella cartella 'target' i seguenti artefatti:
        - docker-compose.yml: file per la gestione del container
        - Dockerfile: file per la creazione del container
        - Makefile: file per l'esecuzione del container in locale
        
Per eseguire il container eseguire il comando:

    make docker.up
        
Per fermare il container eseguire il comando;

    make docker.down

