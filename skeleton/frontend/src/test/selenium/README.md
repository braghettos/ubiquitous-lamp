# Prerequisiti

Per eseguire i test in locale è necessario avere installato docker e docker-compose.

# Registrazione dei test

Per registrare i test utiizzare Selenium IDE (plugin per firefox, chrome, ecc).
I test (con estionsione .side) dovranno essere inseriti nella cartella testplan

# Esecuzione dei test

Per eseguire i test presenti nella cartella testplan eseguire il seguente comando

    run.sh

Verranno creati quattro container (cfr. docker-compose.yml)
- web-automation_hub : master che coordina i vari nodi
- web-automation_chrome: contiene i webdriver per chrome
- web-automation_firefox: contiene i webdriver per firefox
- selenium-runner: carica i test e li invia all'hub per l'esecuzione  

Il container selenium-runner, all'avvio, esegue il file test_runner.sh all'interno del container.

Tutti i test vanno inseriti nella cartella testplan (senza sottocartelle).

Per configurare i vari webdriver modificare\creare i file config.<browser>.yml

# Bibliografia

https://medium.com/@nitinbhardwaj6/selenium-grid-with-docker-c8ecb0d8404

https://www.seleniumhq.org/selenium-ide/docs/en/introduction/command-line-runner/
