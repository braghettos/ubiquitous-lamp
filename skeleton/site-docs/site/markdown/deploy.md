## Deploy su Openshift (Obsoleto)

#
## <b>NB: questo capitolo non è più valida in quanto il deploy avviene tramite Cloudbees e non da locale.</b>
#

Dato che attualmente il server di Openshift, dove si trova il registry, utilizza una connessione insicura è necessario indicare a docker tale condizione. Modificare il file /etc/docker/daemon.json in modo che riporti i seguenti dati:

	{
		"insecure-registries" : [
			"docker-registry-default.openshift-test-apps.insiel.it:443",
				"docker-registry-default.openshift-test-apps.insiel.it"
		]
	}

Riavviare docker localmente

	service docker restart

Posizionari nella cartella target. Qui è presente il file Makefile  (creato in precedenza con il comando build)

Registrare l'immagine del container, creata precedentemente, sul registry di openshift con il seguente comando:

    make push

Questo comando provvede a:
- creare un tag adeguato per il registry
- autenticare la sessione sul registry
- effettuare il push dell'immagine sul registry

Ora che l'immagine è stata caricata sul registry aziendale si può procedere con la configurazione di Openshift. Eseguire il comando:

    make configure

Questo comando provvede a:
- autenticare la session su openshift
- creare un progetto con il nome "@project.groupId@.@project.name@"
- creare il pod su openshift

Ora l'applicazione è disponibile al seguente indirizzo:

    http://<project.name>-<project.groupId>.<REGISTRY>:<porta_pom_yaml>/

Perchè il tutto funzioni correttamente è necessario che il pom.xml sia configurato correttamente. Aprire il pom.xml e verificare le seguenti proprietà:

    - container.registry.host: nome del server del registry delle immagini docker
	- container.registry.user: utente per accesso al registry
	- container.registry.pwd: pwd per accesso al registry
	- container.openshift.login.cmd: il comando (privato della parte 'oc login') è ricavato da openshift (cfr. Profilo->Copy Login Command)
        
        NB: 
		
        - rimuovere la parte iniziale del comando 'oc login' e lasciare tutto quello che segue (dall' https in poi)
        - tale istruzione riporta il token personale di un utente. Utilizzare un tocken di gruppo

    queste variabili verranno utilizzate per sostituire i relativi placeholder nei file presenti nella cartella src/container

Adeguare se necessario e salvare.