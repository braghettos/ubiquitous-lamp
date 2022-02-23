# Constrains

- Il codice ed i servizi devono rispettare le specifiche agid:
  - Interoperabilità: https://trasparenza.agid.gov.it/archivio28_provvedimenti-amministrativi_0_122346_725_1.html
  - Interfaccia: ...
  - Versioning REST API: cfr. https://stackoverflow.com/questions/389169/best-practices-for-api-versioning
  - Implementare il specifiche openapi: 3.0.0 per i servizi REST
- Angular: verificare che il progetto segua le Best Practices riportate qui https://angular.io/guide/styleguide

# Known defects

- Jenkins - Sonarqube: allo stato attuale non vengono analizzati i file typescript in quanto in fase di analisi sonarqube non riesce a trovare nodejs nonostante sia stato pecificato tramite il parametro 'sonar.nodejs.executable' nel file sonar-project.properties
- Nodejs: allo stato attuale è stata adottata la versione 10.13.0 di Nodejs che risulta essere la più recente per compatibilità con il plugin 'frontend-maven-plugin' e maven 3.6. E necessario trovare una soluzione per portare Nodjs all'ultima versione LTS.
- Il Jar generato ha un nome diverso dal nome del progetto riportato nel POM
- Reload: caricando la pagina la prima volta tutto funziona correttamente. Ricaricando la pagina (F5) viene visualizzato l'errore 404. Il problema sembra dovuto al fatto che dopo caricando la pagina la prima volta con l'url "localhost:8080", l'url viene modificato (localhost:8080/static) e la seconda volta non funziona più.
- Sistemare il file .gitignore: ridurre le ridondanze e ordinare gli elementi

# Tips\Enhancements

- Spring-boot: configurazione - utilizzare il formato yaml invece del file .properties (application.properties -> application.yml)
- Design: suggerisco di disaccoppiare il frontend dal backend da un punto di vista del build. Adesso il frontend, quando viene eseguita la build, scrive il codice nel backend. Questo vuol dire che il frontend conosce il backend. Propongo di isolare il frontend dal backend. Quindi:
  - il frontend crea gli artefatti nella sua cartella standard (dist?)
  - il frontend viene trattato come un modulo maven (ha il suo pom). Rinominerei la cartella angular in frontend così ci svincolaimo dalla tecnologia.
  - il backend ha il suo modulo maven (ha il suo pom). Metterei il progetto java in una cartella di nome backend.
  - il backend importa il frontend (dependency nel pom)
  - Il backend ed il frontend sono due moduli di un parent pom principale in cui:
    - vengono riportati i moduli

            <modules>
                <module>backend</module>
                <module>frontend</module>
            </modules>

    - vengono definiti le dipendencies globali
    - vengono definite le proprietà globali

- Lettura della versione dell'applicazione da POM
- Docker: utilizzare i plugins di maven per creare l'immagine usando possibilmente sempre il file Docker e docker-compose. Parametrizzare il nome dell'artefatto del file Docker usando i filtri e le variabili del POM
