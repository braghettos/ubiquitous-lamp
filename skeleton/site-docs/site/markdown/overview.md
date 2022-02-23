## Overview

Come accennato questo software è un template che incorpora varie tecnologie e soluzioni che possono essere portarte nei propri progetti.

Il progetto è interamente gestito tramite maven e gestito tramite la toolchane DevOps Insiel. 

Si compone di due moduli principali:

- Front-end: implementato in Angular
- Back-end: impelemntato in Spring-boot

Le principali tecnologie utilizzate sono:

- spring-boot
- angular
- cucumber
- junit
- selenium
- docker

Si integra con i seguenti componenti trasversali:
- LoginFvg\SPiD
- Gestione Documentale
- Server Stampe
- Master Data
- ...

I test sono eseguiti a vari livelli con i seguenti tools:
- JUnit
- Cucumber
- Selenium
- Sonarqube


Di seguito viene riportata la struttura del progetto:

    .   
    ├── .devcontainer Cartella di VisualStudio Code per sviluppare all'interno di container
    ├── .mvn          Installazione locale di maven tramite wrapper    
    └── backend
        └── src
            └── main
                ├── docker  File per la creazione dell'immagine docker
                ├── java    Back-end implementato in spring-boot
                └── resources
            └── test         Cartella dei test
    └── frontend
        └── src
            └── main
                ├── docker  File per la creazione dell'immagine docker
                └── webapp  Front-end implmentato in angular            
    ├── k8s
    ├── selenium
    └── site-docs
        ├── site         Questo sito del progetto
        ├── apt      Documentazione scritta in APT
        ├── fml      Documentazione scritta in FML
        ├── markdown Documentazione scritta in Markdown
        ├── resources Risorse del sito
        ├── xdoc     Documentazione scritta in XDoc
        ├── xhtml    Documentazione scritta in XHtml
        └── site.xml File principale del sito maven
    ├── tools
    ├── .gitignore    File git per escludere file e cartelle
    ├── docker-compose.yml
    ├── jenkins.conf  Configurazione della pipeline di Cloudbees
    ├── Makefile      Make file che semplifica l'esecuzione di alcuni comandi
    ├── mvnw          Wrapper maven integrato direttamente nel progetto
    ├── mvnw.cmd      Wrapper maven per windows
    ├── pom.xml       Project Object Model principale 
    ├── README.md     Informazioni per utilizzare il progetto
    └── sonar-project.properties Configurazione di sonarqube
    └── tools
        ├── jira.sh   Script per scaricare la release notes da Jira
        └── oc        Openshift client
  
    







