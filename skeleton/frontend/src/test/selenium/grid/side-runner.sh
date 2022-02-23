 # esegue container side-runner sovrascrivendo variabili ambientali di default; vedi file env.list
 docker run --env-file env.list  --network="host" -v "$(pwd)"/../testplan:/sides -v "$(pwd)"/../../target/test-results/test:/out it.insiel.innovazione/ipp-reference-java-app-side-runner:latest
