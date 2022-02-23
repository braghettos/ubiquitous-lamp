# language: it
Funzionalità: verifica dei comuni presenti in regione Friuli Venezia Giulia
 
  Scenario: l'utente richiede l'elenco completo dei comuni
    Quando l'utente accede al sistema
    E richiede l'elenco completo dei comuni
    Allora il numero dei comuni trovati e' 215

  Scenario: l'utente richiede l'elenco dei comuni presenti nella provincia di Trieste
    Quando l'utente accede al sistema
    E richiede elenco comuni presenti nella provincia di 'Trieste'
    Allora il numero dei comuni trovati e' 6
    E il numero di abitanti nel comune di 'Trieste' e' pari a 202123

  Scenario: l'utente richiede il comune di Fagagna
    Quando l'utente accede al sistema
    E richiede il comune di 'Fagagna'
    Allora il numero dei comuni trovati e' 1
    E il nome del comune è 'Fagagna', la provincia è 'Udine' ed il numero di abitanti è 6279
  
  Scenario: l'utente richiede l'elenco dei comuni di una provincia che non esiste in regione FVG
    Quando l'utente accede al sistema
    E richiede elenco comuni presenti nella provincia di 'Venezia'
    Allora il numero dei comuni trovati e' 0

  Scenario: l'utente richiede l'elenco dei comuni senza specificare la provincia
    Quando l'utente accede al sistema
    E richiede elenco comuni presenti nella provincia di ''
    Allora il sistema genera una eccezione

 Scenario: l'utente richiede un comune senza specificarne il nome
    Quando l'utente accede al sistema
    E richiede il comune di ''
    Allora il sistema genera una eccezione