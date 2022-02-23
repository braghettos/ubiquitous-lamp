## Configurazione

### Progetto

Tutta la configurazione del progetto è raccolta nei tre file 'pom.xml': uno per il modulo principale, uno per il backend ed uno per il frontend
Nella sezione properties sono riportate tutte le variabili che configurano il progetto. Il file è documentato con tutte le spiegazioni necessarie.

La generazione delle varie risorse (sito, containers, ecc.) sono influenzate dalle prorpietà presenti nel file pom.xml.

### Applicazione

L'applicazione viene configurata tramite il file application presente nella cartella resources del backend.

Per esempio, per modificare la porta a cui risponde il servizio basta cambiare il seguente parametro

    server.port=8080

Il file application riporta la spiegazioni delle varie proprietà.

