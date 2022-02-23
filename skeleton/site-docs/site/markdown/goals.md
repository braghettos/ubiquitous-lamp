## Obiettivi del progetto

I principali obiettivi del progetto sono i seguenti:

1. Consolidare, configurare e validare la toolchain DevOps per progetti basati su tecnologia Java\Maven
2. Creare un template di riferimento per progetti Java
3. Mostrare come integrarsi con i principali componenti trasversali
4. Definire uno standard di sviluppo

### Toolchain DevOps
Questo progetto ci consente di verificare che la tool chain DevOps aziendale funzioni correttamente e sia integrata.
La tool chain utilizzata si compone dei seguenti strumenti:
- Jira: utilizzato per il change management
- GitHub: serve per gestire il versionamento e come wiki del progetto
- Jenkins\Cloudbees: è utilizzato per le build ed il deploy dei vari artefatti
- Sonarqube: viene utilizzato per valutare la qualità del codice

Di seguito viene riportato un sunto del processo e delle integrazioni che sono alla base della tool chain.
Le segnalazioni vengono riportate in Jira. Lo sviluppatore prende in carico la segnalazione quindi procede ad adeguare il codice.
Quando le modifiche sono consolidate procede con una Pull Request su GitHub. Quando la Pull Request viene accettata il codice entra nel master e l'attività su Jira viene marcata come "Resolved".
Ad ogni commit su GitHub viene inviato un Hook a Jenkins il quale procede con la build.
Jenkins compila il codice, eseguie i test, genera i vari reports ed il site.
Il deploy sull'ambiente di test verrà eseguito tramite Jenkins su richeista per evitare di rendere instabile tale ambiente.

### Template di riferimento
Questo progetto è un'opportunità per definire un template di applicazione web che può essere utilizzata per iniziare un nuovo progetto o semplicemente per prendere spunti e copiare il codice.
Il template è anche uno strumento per individuare problemi di sviluppo tra cui anche di compatibilità tra librerie e tools.

### Integrazione con le componenti trasversali
In qusto progetto sono integrate alcune componenti trasversali che possono tornare utili in un progetto reale. Quindi è un esempio da cui partire per  intergrasi con tali componenti.

### Standard di sviluppo
In tale progetto si vuole adottare e definire degli standard di sviluppo con l'obiettivo di rendere le applicazioni aziendali conformi alle indicazioni AGID e più uniformi tra di loro.
