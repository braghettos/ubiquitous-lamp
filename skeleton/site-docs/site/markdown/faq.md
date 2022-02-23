## FAQ

### <b>Come utilizzare le proprietà definite nel POM nelle pagine del sito</b>

Nelle pagine del sito possono essere utilizzate solo le proprietà definite nel POM all'interno del tag \<properties>. Quindi la proprietà ${project.name} non potà essere utilizzata. Come workaround si può definire nel POM una propiertà del tipo:

    <site.project.name>${project.name}</site.project.name>

Per utilizzare tale proprietà nelle pagine del sito è necessario:

1. estendere il nome del file con .vm (es. faq.md diventa faq.md.vm). In questo modo verrà abilitato Velocity

2. utilizzare $context.get('site.project.name') al posto di ${site.project.name}. Questo serve solo se il nome della proprietà contiene dei punti. 

Per maggiori dettagli visitare il sito https://maven.apache.org/plugins/maven-site-plugin/examples/creating-content.html#Filtering

### Come creare il Maven Wrapper

Per creare il wrapper maven al fine di avere maven a livello di cartella di progetto, seguire le indicazioni fornite dalla seguente guida<https://www.baeldung.com/maven-wrapper>. In sostanza si deve lanciare il seguente comando:

    mvn -N io.takari:maven:wrapper
