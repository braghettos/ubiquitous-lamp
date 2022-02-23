# language: it
Funzionalità: ricerca dei comuni presenti in regione Friuli Venezia Giulia
  Scenario: l'utente effettua una ricerca sui comuni
    Quando l'utente accede al sistema
    E cerca il comune di 'Trieste'
    Allora il numero dei comuni trovati e' 1

  Scenario: l'utente effettua una ricerca sui comuni
    Quando l'utente accede al sistema
    E cerca il comune di 'Paperopoli'
    Allora il numero dei comuni trovati e' 0



