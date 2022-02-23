TARGET_DIR = target

# Build all
build: mvn.build docker.build --copy-tools

# Build maven project	
mvn.build:
	./mvnw clean install

mvn.sonar:
	./mvnw -Powasp-dependency-check sonar:sonar -Dsonar.login=3f12932a27a0dfe9f92c554d316881019ffb08c9 -Dsonar.url=http://localhost:9000

# Build docker image
docker.build:	
	docker-compose -f "$(PWD)/${TARGET_DIR}/docker-compose.yml" build
	
# Run container
docker.up:
	docker-compose -f "$(PWD)/${TARGET_DIR}/docker-compose.yml" up -d

# Stop container
docker.down:
	docker-compose -f "$(PWD)/${TARGET_DIR}/docker-compose.yml" down

# Copy tools
--copy-tools:
	cp ./tools/* ./target/
