## Features

Di esguito sono riportate le principali caratteristiche di questo software.

### Progetto modulare

Questo progetto si compone di due moduli principali: frontend e backend. Il primo implementato in Angular ed il secondo, che espone servizi Rest, in Spring-boot. I due moduli sono integrati in quanto alla fine verrà prodotto un solo jar che contiene sia la parte di presentation che il backend.
Questo approccio modulare ha vari vantaggi:
- rendere più pulito il codice separando la parte web dal backend
- è possibile esporre i servizi rest per altre finalità
- è possibile implementare un'altra interfaccia (frontend) senza inficiare il progetto
- permette uno sviluppo parallelo sui due moduli

### Sviluppo ed esecuzione in Container

Questo progetto è fortemente integrato con Docker e può essere sviluppato direttamente dentro un container. Nelle cartelle 'src\main\docker' del frontend e del backend troverete gli artefatti necessari all'integrazione. Se provate ad aprire tale progetto con Visual Sutdio Code vi verrà chiesto se desiderate sviluppare dentro un container oppure no (cfr. cartella .devcontainer). Questo implica che non serve installare nulla oltre che all'IDE di sviluppo e ovviamente Docker.
Questo non impedisce di utilizzare l'approccio standard: sviluppare direttamente sull'host. Usando Visual Studio Code basta rispondere no alla domando "Aprire il progetto in un container"
Il progetto contiene anche tutti gli script necessari per il deploy su OpenShift.

### Test di integrazione, funzionale e di componente

In qusto progetto sono stati implementati i seguenti test:
- Test di componente: basati su JUnit
- Test funzionali: basati su Cucumber
- Test funzionali: basati su Selenium (recorded)

<b>Per ora i test sono solo esemplificativi e non mirano a verificare il corretto funzionamento dell'app</b>

### Standard (To Do)

- OpenApi 3: le rest api sono state sviluppate tenendo conto degli standard AGID e lo standard OpenApi 3. Sono esposte tramite Swagger
- Il frontend utilizza il css boostrap di AGID

### Integrazione con le seguenti componenti trasversali (To Do)
- LoginFvg\SPiD
- Gestione Documentale
- Server Stampe
- Master Data

### Generazione automatica della documentazione
Il progetto è configurato per generare la documentazione necessaria.
- Viene creato un sito in cui vengono raccolte tutte le informazioni riportate nella cartella "src\site" e tutti i report generati in fase di test.

### Organizzazione centralizzata della documentazione
Tutta la documentazione è presente all'interno delle cartelle di progetto. In ogni caso eventuale altra documentazione può essere referenziata modificando\integrando le pagine del sito. In questo modo c'è un unico indice della documentazione.