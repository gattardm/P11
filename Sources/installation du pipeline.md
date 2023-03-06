installer et configurer JDK; OK
    installation du JDK dans ~/bin/dev/java/jdk (ln -s) -> ./openjdk-17.0.2
    configurer JDK, $JAVA_HOME=~/bin/dev/java/jdk dans ~/.bashrc
installer et configurer Maven; OK
    installation de maven dans ~/bin/dev/maven (ln -s) -> ./apache-maven-3.9.0
    configuration Maven, $MAVEN_HOME=~/bin/dev/maven dans ~/;bashrc
    test de Maven:
    	création d'un package d'archetype:
    		mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.1
    	se positionner dans le répertoire : cd mon-appli
    	générer le package : mvn package
    	générer le jar et exécuter le code :
    		java -cp target/mon-appli-1.0-SNAPSHOT.jar org.exemple.demo.App

        Création de module pour une architecture multi-couche avec Maven
        	génération de l'exemple:
            mvn archetype:generate \
             -DarchetypeGroupId=org.apache.maven.archetypes \
             -DarchtypeArtifactId=maven-archetype-quickstart \
             -DarchetypeVersion=1.1 \
             -DgroupId=org.exemple.demo \
             -DartifactId=ticket \
             -Dversion=1.0-SNAPSHOT

            mvn -B archetype:generate \
             -DarchetypeGroupId=org.apache.maven.archetypes \
             -DarchtypeArtifactId=maven-archetype-quickstart \
             -DarchetypeVersion=1.1 \
             -DgroupId=org.exemple.demo \
             -DartifactId=ticket-batch \
             -Dpackage=org.exemple.demo.batch

            mvn -B archetype:generate \
             -DarchetypeGroupId=org.apache.maven.archetypes \
             -DarchtypeArtifactId=maven-archetype-webapp \
             -DarchetypeVersion=1.1 \
             -DgroupId=org.exemple.demo \
             -DartifactId=ticket-webapp \
             -Dpackage=org.exemple.demo.webapp

            mvn -B archetype:generate \
             -DarchetypeGroupId=org.apache.maven.archetypes \
             -DarchtypeArtifactId=maven-archetype-quickstart \
             -DarchetypeVersion=1.1 \
             -DgroupId=org.exemple.demo \
             -DartifactId=ticket-business \
             -Dpackage=org.exemple.demo.business

            mvn -B archetype:generate \
             -DarchetypeGroupId=org.apache.maven.archetypes \
             -DarchtypeArtifactId=maven-archetype-quickstart \
             -DarchetypeVersion=1.1 \
             -DgroupId=org.exemple.demo \
             -DartifactId=ticket-consumer \
             -Dpackage=org.exemple.demo.consumer

            mvn -B archetype:generate \
             -DarchetypeGroupId=org.apache.maven.archetypes \
             -DarchtypeArtifactId=maven-archetype-quickstart \
             -DarchetypeVersion=1.1 \
             -DgroupId=org.exemple.demo \
             -DartifactId=ticket-model \
             -Dpackage=org.exemple.demo.model
installer et configurer Jenkins:
    installation de Jenkins:
        curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo tee  /usr/share/keyrings/jenkins-keyring.asc > /dev/null
        echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian-stable binary/ | sudo tee /etc/apt/sources.list.d/jenkins.list > /dev/null
        sudo apt-get update
        sudo apt-get install jenkins
    configuration de Jenkins :
        ajout des plugins par défaut
Installer et configurer Docker:
    Configuration du dépot :
        //uninstall old versions
        sudo apt-get remove docker docker-engine docker.io containerd runc 
        //Update the apt package index and install packages to allow apt to use a repository over HTTPS
        sudo apt update
        sudo apt-get install ca-certificates curl gnupg lsb-release
        //Add Docker’s official GPG key:
        sudo mkdir -m 0755 -p /etc/apt/keyrings
        curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
        //set up the repository
        echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
    Installation de Docker :
        //Update the apt package index
        sudo apt-get update
        //install the latest version, run
        sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
        //Verify taht the Docker installation succesful
        sudo docker run hello-world
    Configuration post-install de Docker:
        sudo groupadd docker
        sudo usermod -aG docker $USER
        //Log in to the new docker group
        newgrp docker
        //Verify that you can run docker commands without sudo
        docker run hello-world
        //Authorize Jenkins to call Docker
        sudo usermod -aG docker jenkins
        sudo usermod -aG root jenkins
        sudo chmod 666 /var/run/docker.sock
        newgrp docker

    Configuration pour lancer Docker au démarrage
        sudo systemctl enable docker.service
        sudo systemctl enable containerd.service

Configuration de Jenkins pour intégrer Docker:
    Ajout des plugins :
        CloudBees Docker Build Publish
        Docker API plugin
        Docker commons plugin
        Docker plugin
        Docker Bukld Step plugin

Vérifcation credentials dans ~docker/config/json
    echo -n "solarhis:lmdpdSol25!" | base64








<REMARQUES-A-OC>
	Dans le cour "Organisez et packagez une application Java avec Apapche Maven", il s'avère que j'ai relevé plusieurs coquilles qui font purement et simplement échouer le build Maven.
	<remarque1>
	En effet, dans la vidéo, du chapitre 4 de la 1ère partie du cours, intitulée "Découpez votre projet en couches applicatives", à 9'10'', l'orateur mentionne que l'entrée <version/> est facultative au sein du groupe <dependency></dependency>, alors que cette entrée est obligatoire (maintenant...). En d'auters termes, lors du Build Maven, dans les fichiers pom.xml de configuration Maven de chaque module (ticket-batch, ticket-business, ticket-consumer, ticket-model et ticket-webapp), chaque groupe <dependency></dependency> doit être composé OBLIGATOIREMENT de :
 <dependency>
 	<groupId>XXX</groupId>
 	<artifactId>nom-module</artifactId>
 	<version>1.2.3</version>
 </dependency>
Si ces entrées ne sont pas présentes, le build échoue. 
Le cours datant de 12/2019, les nouvelles mises à jour de Maven ont du apporter leur lot de changement...
	</remarque1>
	<remarque2>
	Dans le chapitre 5 intitulé "Gérer efficacement les dépendances", le build Maven ne fonctionne pas avec le pom.xml 'minimaliste' du module ticket-webapp. Pour que le build fonctionne, il faut rajouter 2 blocs:
	<dependencies>
		...
		<dependency>
      		<groupId>javax.servlet</groupId>
      		<artifactId>javax.servlet-api</artifactId>
      		<version>3.0.1</version>
   		</dependency>
		...
	</dependencies>
	<build>
		...
		<pluginManagement>
      		<plugins>
	        	<plugin>
	          		<groupId>org.apache.maven.plugins</groupId>
	          		<artifactId>maven-war-plugin</artifactId>
	          		<version>3.3.2</version>
	        	</plugin>
      		</plugins>
   		 </pluginManagement>
		...
	</build>
	</remarque2>
    <remarque3>
        D'un point de vue général, les exemples donnés par l'orateur très formateurs. Néanmoins, ce dernier va extrèmement vite pour faire les modifications de code et surtout les noms des fichiers dans lesquels il fait ces modifications ne sont pas affichés. Vu qu'il réalise ces modifications, au sein de fichiers ayant TOUS le même libellé (pom.xml) dans chaque module, l'étudiant est très vite perdu dans les explications. De plus, au sein des explications textuelles sous la vidéo, le nom des fichiers dans lesquels appliqués ces modifications ne sont pas mentionnés non plus...
    </remarque3>
    <remarque4>
        Hormis les remarques précédentes, les explications de ce que l'orateur réalise sont claires, cependant l'orateur ne dit pas POURQUOI il les réalise; il guide l'étudiant en montrant COMMENT réaliser ces modifications, mais ne mentionne guère les motivations de ces modifications.
    </remarque4>
</REMARQUES-A-OC>
