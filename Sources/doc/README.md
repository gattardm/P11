**===========================================================================================================================**

#                                                            P11

**==========================================================================================================================**
### Semaine 13 du 27/03 au 31/03

### entretien tuteur 27/03/2023

#### Travaux réalisés

#### A faire pour le 27/03

:-1:finir la documentation technique

:-1:réaliser la présentation 

:-1:faire une soutenance blanche

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:+1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le Plan de tests/Ressources/Structure de la PoC (à faire quand l'appli sera fonctionnelle)

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques


### Travail personnel


#### A Faire

#### Architecture


**===========================================================================================================================**
### Semaine 13 du 20/03 au 24/03

### entretien tuteur 20/03/2023

#### Travaux réalisés

#### A faire pour le 27/03

:+1: créer le load-balancer/ordonnanceur pour faire interagir les 3 composants, selon 3 étapes:
* 0 Un incident est déclaré (traitement à "false")

* 1 Actions de l'ordonnanceur :
* 1.1 l'ordonnanceur identifie l'incident en cours de traitement (traitement à "En cours")
* 1.2 l'ordonnanceur cherche un opérateur disponible et va patienter tant qu'il n'y en aura pas de disponible
* 1.3 l'ordonnanceur attribue l'incident à l'opérateur "disponible"
* 1.4 l'opérateur prend en charge l'incident en devenant "Non disponible"
* 1.5 boucle sur l'étape 1.1

* 2 Actions des opérateurs :
* 2.1 l'opérateur va chercher un hopital correspondant aux critères de l'incident (critères de spécialité médicale, localisation, lits disponibles)
* 2.2 l'opérateur va attribuer l'incident à l'hopital adéquat
* 2.3 l'opérateur identifie l'incident comme traité (traitement à "true")
* 2.4 l'opérateur se remet au statut "Disponible"
* 2.5 boucle sur l'étape 2.1

* 3 Actions des hôpitaux :
* 3.1 l'hôpital prend en charge l'incident
* 3.2 boucle sur l'étape 3.1

### Travail personnel

:+1: Intégrer l'API dans un pipeline CI/CD

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le Plan de tests/Ressources/Structure de la PoC (à faire quand l'appli sera fonctionnelle)

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques

:point_right:La distance entre deux points d'un repère orthonormé peut être imaginée  comme la longueur de la ligne qui les relie. La formule pour calculer  cette longueur est :
![{\sqrt  {(x_{2}-x_{1})^{2}+(y_{2}-y_{1})^{2}}}](https://wikimedia.org/api/rest_v1/media/math/render/svg/9ceb616b7d5c2c8c06a3880fa1592fd4e3e0284c).

= `sqrt( x2 x2 - 2 x1 x2 + x1 x1 + y2 y2 - 2 y1 y2 + y1 y1  )`

= `sqrt( pow(x2, 2) - 2.x1.x2 + pow(x1, 2) +  pow(y2, 2) - 2.y1.y2 +  pow(y1, 2)  )`

sqrt -> java.lang.Math.sqrt

pow -> java.lang.Math.pow 

:point_right: Pour la génération aléatoire des incidents, il faudra utiliser java.lang.Math.random() :

Avec un calcul mathématique, on peut obtenir un nombre aléatoire compris dans les limites que l'on souhaite. La première  opération consiste à multiplier le nombre aléatoire par la différence  entre le nombre maximum et le nombre minimum (ex : 10-5=5).

```
Math.random() * ( Max - Min )
```

Avec cette opération, on obtiendra un nombre compris entre 0 et la  valeur de l'ampleur. Si on y ajoute le nombre minimum, on obtient un  nombre aléatoire compris entre la limite inférieure et la limite  supérieure.

```
Min + (Math.random() * (Max - Min))
```

La limite supérieure n'est cependant pas comprise dans l'intervalle.  Pour l'inclure, la solution la plus simple consiste à ajouter 1, puis à  enlever la partie décimale en convertissant le nombre en entier. La  formule qui en résulte est la suivante :

```
int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
```

La méthode nextInt() de la classe Random permet de générer un entier  aléatoire compris entre 0 inclus et l'entier passé en paramètre exclus.  En ajoutant 1 et en enlevant le minimum dans l'entier en paramètre, puis en ajoutant le nombre minimum au résultat, on arrive à obtenir un  nombre aléatoire compris entre les deux valeurs:

```
Random rand = new Random(); int nombreAleatoire = rand.nextInt(max - min + 1) + min;
```


#### A Faire

:point_right:Il a été décidé en accord avec Faouzi de laisser le goal Publish > DockerHub de côté.

#### Architecture


**===========================================================================================================================**

### Semaine 12 du 20/03 au 24/03

### entretien tuteur 20/03/2023

#### Travaux réalisés

#### A faire pour le 27/03

créer le load-balancer/ordonnanceur pour faire interagir les 3 composants, selon 3 étapes:
* 0 Un incident est déclaré (traitement à "false")

* 1 Actions de l'ordonnanceur :
* 1.1 l'ordonnanceur identifie l'incident en cours de traitement (traitement à "En cours")
* 1.2 l'ordonnanceur cherche un opérateur disponible et va patienter tant qu'il n'y en aura pas de disponible
* 1.3 l'ordonnanceur attribue l'incident à l'opérateur "disponible"
* 1.4 l'opérateur prend en charge l'incident en devenant "Non disponible"
* 1.5 boucle sur l'étape 1.1

* 2 Actions des opérateurs :
* 2.1 l'opérateur va chercher un hopital correspondant aux critères de l'incident (critères de spécialité médicale, localisation, lits disponibles)
* 2.2 l'opérateur va attribuer l'incident à l'hopital adéquat
* 2.3 l'opérateur identifie l'incident comme traité (traitement à "true")
* 2.4 l'opérateur se remet au statut "Disponible"
* 2.5 boucle sur l'étape 2.1

* 3 Actions des hôpitaux :
* 3.1 l'hôpital prend en charge l'incident
* 3.2 boucle sur l'étape 3.1
		

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le Plan de tests/Ressources/Structure de la PoC (à faire quand l'appli sera fonctionnelle)

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques

:point_right:La distance entre deux points d'un repère orthonormé peut être imaginée  comme la longueur de la ligne qui les relie. La formule pour calculer  cette longueur est :
![{\sqrt  {(x_{2}-x_{1})^{2}+(y_{2}-y_{1})^{2}}}](https://wikimedia.org/api/rest_v1/media/math/render/svg/9ceb616b7d5c2c8c06a3880fa1592fd4e3e0284c).

= `sqrt( x2 x2 - 2 x1 x2 + x1 x1 + y2 y2 - 2 y1 y2 + y1 y1  )`

= `sqrt( pow(x2, 2) - 2.x1.x2 + pow(x1, 2) +  pow(y2, 2) - 2.y1.y2 +  pow(y1, 2)  )`

sqrt -> java.lang.Math.sqrt

pow -> java.lang.Math.pow 

:point_right: Pour la génération aléatoire des incidents, il faudra utiliser java.lang.Math.random() :

Avec un calcul mathématique, on peut obtenir un nombre aléatoire compris dans les limites que l'on souhaite. La première  opération consiste à multiplier le nombre aléatoire par la différence  entre le nombre maximum et le nombre minimum (ex : 10-5=5).

```
Math.random() * ( Max - Min )
```

Avec cette opération, on obtiendra un nombre compris entre 0 et la  valeur de l'ampleur. Si on y ajoute le nombre minimum, on obtient un  nombre aléatoire compris entre la limite inférieure et la limite  supérieure.

```
Min + (Math.random() * (Max - Min))
```

La limite supérieure n'est cependant pas comprise dans l'intervalle.  Pour l'inclure, la solution la plus simple consiste à ajouter 1, puis à  enlever la partie décimale en convertissant le nombre en entier. La  formule qui en résulte est la suivante :

```
int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
```

La méthode nextInt() de la classe Random permet de générer un entier  aléatoire compris entre 0 inclus et l'entier passé en paramètre exclus.  En ajoutant 1 et en enlevant le minimum dans l'entier en paramètre, puis en ajoutant le nombre minimum au résultat, on arrive à obtenir un  nombre aléatoire compris entre les deux valeurs:

```
Random rand = new Random(); int nombreAleatoire = rand.nextInt(max - min + 1) + min;
```

### Travail personnel


#### A Faire

:point_right:Il a été décidé en accord avec Faouzi de laisser le goal Publish > DockerHub de côté.

#### Architecture


**===========================================================================================================================**

### Semaine 11 du 13/03 au 17/03

### entretien tuteur 07/03/2023

#### Travaux réalisés

#### A faire pour le ??/03

:point_right:en attente du nouveau tuteur : ~~Aurélien Pinston~~ Bertrand Vanautryve

:+1: créer l'API de gestion des hôpitaux (avec des hôpitaux fictifs)

​	:+1: faire des tests unitaires sur l'API de gestion des hôpitaux

​	:+1: créer une application web d'accès à l'API de gestion des hôpitaux

​	:+1: réaliser des tests d'intégration de l'appllication web de gestion des hôpitaux

:+1: créer l'API de gestion des opérateurs (avec des opérateurs fictifs)

​	:+1: faire des tests unitaires sur l'API de gestion des opérateurs

​	:+1: créer une application web d'accès à l'API de gestion des opérateurs

​	:+1: réaliser des tests d'intégration de l'appllication web de gestion des opérateurs

:+1: créer l'API de gestion des incidents (avec des incidents fictifs)

​	:+1: faire des tests unitaires sur l'API de gestion des incidents

​	:+1: créer une application web d'accès à l'API de gestion des incidents

​	:+1: réaliser des tests d'intégration de l'appllication web de gestion des incidents

:-1: créer le load-balancer/ordonnanceur pour faire interagir les 3 composants ci-dessus, selon 3 étapes:

​	:-1: Intéraction entre l'ordonnanceur et l'API d'incidents

​	:-1:Intéraction entre l'ordonnanceur et l'API d'oprérateurs

​	:-1:Intéraction entre l'API d'opérateurs et l'API d'hôpitaux

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le Plan de tests/Ressources/Structure de la PoC (à faire quand l'appli sera fonctionnelle)

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques

:point_right:La distance entre deux points d'un repère orthonormé peut être imaginée  comme la longueur de la ligne qui les relie. La formule pour calculer  cette longueur est :
![{\sqrt  {(x_{2}-x_{1})^{2}+(y_{2}-y_{1})^{2}}}](https://wikimedia.org/api/rest_v1/media/math/render/svg/9ceb616b7d5c2c8c06a3880fa1592fd4e3e0284c).

= `sqrt( x2 x2 - 2 x1 x2 + x1 x1 + y2 y2 - 2 y1 y2 + y1 y1  )`

= `sqrt( pow(x2, 2) - 2.x1.x2 + pow(x1, 2) +  pow(y2, 2) - 2.y1.y2 +  pow(y1, 2)  )`

sqrt -> java.lang.Math.sqrt

pow -> java.lang.Math.pow 

:point_right: Pour la génération aléatoire des incidents, il faudra utiliser java.lang.Math.random() :

Avec un calcul mathématique, on peut obtenir un nombre aléatoire compris dans les limites que l'on souhaite. La première  opération consiste à multiplier le nombre aléatoire par la différence  entre le nombre maximum et le nombre minimum (ex : 10-5=5).

```
Math.random() * ( Max - Min )
```

Avec cette opération, on obtiendra un nombre compris entre 0 et la  valeur de l'ampleur. Si on y ajoute le nombre minimum, on obtient un  nombre aléatoire compris entre la limite inférieure et la limite  supérieure.

```
Min + (Math.random() * (Max - Min))
```

La limite supérieure n'est cependant pas comprise dans l'intervalle.  Pour l'inclure, la solution la plus simple consiste à ajouter 1, puis à  enlever la partie décimale en convertissant le nombre en entier. La  formule qui en résulte est la suivante :

```
int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
```

La méthode nextInt() de la classe Random permet de générer un entier  aléatoire compris entre 0 inclus et l'entier passé en paramètre exclus.  En ajoutant 1 et en enlevant le minimum dans l'entier en paramètre, puis en ajoutant le nombre minimum au résultat, on arrive à obtenir un  nombre aléatoire compris entre les deux valeurs:

```
Random rand = new Random(); int nombreAleatoire = rand.nextInt(max - min + 1) + min;
```

### Travail personnel


#### A Faire

:point_right:Il a été décidé en accord avec Faouzi de laisser le goal Publish > DockerHub de côté.

#### Architecture

**Théorie**

1. Création de la structure minimale du projet avec Spring intialzr (https://start.spring.io/)
2. Configuration du projet :
   1. complément de l'application.properties
   2. création des dossiers :
      1. Controller : réceptionner la requête et fournir la réponse;
      2. Service : exécuter les traitements métiers;
      3. Repository : communiquer avec le source de données;
      4. Model : contenir les objets métiers.
3. Écriture du code avec l'utilisation des annotations Spring, dont notamment, @Entity, @Repository, @RestController
4. Tester
   1. écrire les tests d'intégration @SpringBootTest
   2. écrire les tests unitaires @WebMVCTest
5. déployer sous format jar

**identification des fonctionnalités de l'API:**

Fonctionnalités

Qu'est ce que dois faire mon API de message d'intervention:

1 Un point d'entrée (témoin de l'incident, secours ou victime) fait un appel d'urgence.

​	1-1 le journal d'appel d'urgence est complété.

2 l'appel d'urgence est reçu et ACK.

3 les informations contenues dans le message sont prises en compte (par un opérateur).

​	3-1 les secours sont appelés en parallèle;

​	3-2 les ressources médicales adaptées au type de l'incident sont identifiées;

​		3-2-1 un hôpital approprié est localisé et identifié;

​		3-2-2 un lit dans cet hôpital est réservé.

​	3-3 les ressources identifiées sont réservées "en urgence" (réquisitionnées);

​	3-4 le tableau de service et le planning sont mis à jour.

4 le dossier de l'appel d'urgence est envoyé aux équipes médicales identifiées:

​	4-1 si la victime est "déjà" connue, son historique médical est récupéré et envoyé aux équipes médicales;

​	4-2 l'identité médicale du patient est envoyée aux équipes médicales.

5 les équipes médicales préparent les solutions médicales au vu des dommages de la victime.

6 la victime est admise et traitée.

**identification des ressources : opération CRUD**

- victime : C
  - POST /persons
  - GET /persons/{person_id}

- système expert d'urgence -> journal d'urgence : RU
  - PUT /emergencyLog

- hôpital : R
- lit : RU
- équipes médicales / spécialités médicales : R
- dossier du patient : CRU

**Type d'API : PRIVE**

**API SpringBoot :**

- Avantages:
  - optimisation de la gestion des dépendances
  - autoconfiguration
  - gestion des propriété&s
  - monitoring et gestion du programme
  - déploiement
- composants :
  - Spring Boot : autoconfiguration, startes de dépenadnce, et endpoins Actuator pour les données sur l'appli
  - Spring Core -> core container comprenant Spring MVC et d'autres composants nécessaires pour la communication avec la BDD notamment...
  - Spring DATA
  - Spring Security : authentifaction
  - Spring Cloud : pour l'archi MSA

utilisation de Spring Initialzr (https://start.spring.io/)

#### Théorie

- **REST**
  - Client-Serveur separation
  - Stateless
  - Cacheable
  - Uniform interface
  - Layered system
  - Code on demand

- **HTTP : CRUD**
  - POST : Create
  - GET : Read
  - PUT : Update
  - DELETE : Delete
- **Structure d'une requête**
  - Verbe HTTP + URI + Version HTTP + Headers+ Body (optionnal)

- **Réponse d'une requête**
  - Version HTTP + Code HTTP + Headers + Body

- **Erreurs**
  - 100+ : infos
  - 200+ : success
  - 300+ : redirection
  - 400+ : erreur client
  - 500+ : erreur serveur
- **Filtres**
  - ex: GET /photos?location= {location_id}
- **Tri**
  - ex GET /users/{user_ID}/followers?sort=lastName&order=asc
  - GET /users?verified=true&firstName=Jamie
  - GET /photos?location=NYC&created_at=2018-12-31&likes_greater_than=5000

**===========================================================================================================================**

### Semaine 10 du 06/03 au 10/03

### entretien tuteur 07/03/2023

#### Travaux réalisés

#### A faire pour le ??/03

:point_right:en attente du nouveau tuteur : Aurélien Pinston

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le Plan de tests/Ressources/Structure de la PoC (à faire quand l'appli sera fonctionnelle)

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques



### Travail personnel


#### A Faire

:point_right:Il a été décidé en accord avec Faouzi de laisser le goal Publish > DockerHub de côté.

#### Architecture

**===========================================================================================================================**

### Semaine 9 du 27/02 au 03/02

### entretien tuteur 02/03/2023

#### Travaux réalisés

:+1:**Dans le Plan de tests :**

​		:+1: renseigner le *§Ressources* à fournir pour réaliser la PoC.

​				:+1:Pipeline CI/CD

​				:+1: Conceptualisation architecturale de la structure de l'application de la PoC --> initialisation du document *SBB_application-POC*				

:+1:**Rédaction de la SBB de pipeline CI/CD**

#### A faire pour le 07/03

:point_right:**Dans le Plan de tests :**

​		:point_right: renseigner le *§Ressources* à fournir pour réaliser la PoC.

​				:+1:Pipeline CI/CD

​				:-1: Structure de l'application de la PoC

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le *§Ressources* à fournir pour réaliser la PoC.

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

### Travail personnel


#### A Faire

:+1:Install JDK19
:+1:Configure variable d'environnement (JAVA_HOME et JRE_HOME)
:+1:Install Jenkins
:+1:Configure Jenkins
:+1:Install Maven
:+1:Declare Maven in Jenkins
:+1:Install IDE (IntellIJ IDEA)
:+1:Configure IntellIJ with GitHub/Jenkins

:+1:Configure Jenkins with Docker

:-1: Publier l'image Docker sur DockerHub

```
docker push solarhis/emergency-system
```

```
denied: requested access to the resource is denied
Build step 'Docker Build and Publish' marked build as failure
Finished: FAILURE
```

:point_right:Il a été décidé en accord avec Faouzi de laisser le goal Publish > DockerHub de côté.

**===========================================================================================================================**

### Semaine 4 du 23/01 au 27/01

### entretien tuteur 09/02/2023

#### A faire pour le 14/02



#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le *§Ressources* à fournir pour réaliser la PoC.

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques

:point_right:Faire remonter l'absence des règles de gestion



### Travail personnel

#### A Faire



**===========================================================================================================================**

## Semaine 4 du 23/01 au 27/01

### entretien tuteur 17/01/2023

#### A faire pour le 31/01

:+1:Réaliser la configuration du pipeline CI/CD (Jenkins, IntelliJ IDEA, JAVA J2SE, JUnit, javadoc, outils de surcharge).

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

​		:-1: transformer l'exemple en XML de formattage des messages en JSON.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le *§Ressources* à fournir pour réaliser la PoC.

​		:-1: Prévoir le Tests de sauvegarde dans un cadre de save/restore de données.

#### Questions



#### Remarques

:point_right:Faire remonter l'absence des règles de gestion



### Travail personnel


#### A Faire



#### Architecture



**===========================================================================================================================**

## Semaine 3 du 16/01 au 20/01

### entretien tuteur 17/01/2023

#### A faire pour le 24/01

:+1:  **rédiger le plan de tests comprenant:**

​		:+1: la stratégie de tests;

​		:fist: l'hypothèse de validation de principe avec méthodologie et résultats

​				:point_right:Faire confirmer à Faouzi que l'hypothèse de validation de principe avec méthodologie et résultats est bien définie dans mon Plan de Tests .

#### A faire avant la fin du projet

**:point_right: Dans le SAW :**

​		:-1: renseigner le *§Critères d'acceptation* (à faire après avoir développé la solution);

​		:-1: renseigner le *§Plan et calendrier* du projet d'architecture (à faire après avoir développé la solution).

​		:-1: produire/renseigner les KPI et métrique tel que demandé dans le modèle de SAW fourni en intrant.

:point_right:**Dans le Plan de tests :**

​		:-1: renseigner le *§Ressources* à fournir pour réaliser la PoC.

#### Questions

:point_right: Faouzi va poser les questions suivantes à OC pour préciser le chiffrage temporel vis à vis de :

- la profondeur de rédaction du plan de tests (jusqu'où dois-je les prévoir?);
- la couverture des tests sur une PoC;
- le descriptif de la configuration du pipeline CI/CD.
- réponse d'OC : OC n'a donné pas de détail vis à vis du calcul du chiffrage temporel. Il s'agit d'une moyenne relative à la réalisation du P11 par les élèves l'ayant déjà fini.

:+1: Faouzi va poser la question à OC pour savoir jusqu'à quand, après ma formation, j'aurai accès aux ressources d'OC?

- réponse : oui tout le temps (mail d'OpenClassroom du 18/01/2023 à 16:39)

#### Remarques

:point_right: il est spécifié dans les attendus "La documentation de l’architecture pour les livrables finaux est conforme à cette exigence lorsque : L'énoncé des travaux d'architecture définit des métriques et des KPI pour mesurer le succès de la PoC."

- il est nullement mention de KPI ou de quelconque métrique contenus dans le SAW au sein du TOGAF.
- je produirai quand même des KPI car ceux-ci font parti du modèle fourni par MedHead, Alors même si TOGAF ne le demande pas dans un SAW, osef c'est le client qui a le chéquier pas TOGAF...

:point_right: Faouzi va informer OC  qu'il n'y ait pas de KPI ou de métrique définis dans le SAW, selon TOGAF.

### Travail personnel

#### A Faire
:+1: Mettre à jour la liste du paragraphe Objectifs, composants et domaines à l'issue du listing des campagnes et des scénarii

#### Architecture

:point_right: Prévoir la traçabilité des interventions.
:point_right: Prévoir un stockage de données en 2 temps :

- 1er temps cache de données sur 24 heures;
- 2ème temps stockage des données dans un SGBdR pour historique.

===========================================================================================================================

## Semaine 2 du 09/01 au 13/01
### entretien tuteur 10/01/2023
**A faire pour le 16/01**

+ Rédiger dans le SAW :
	- :-1: renseigner les Critères d'acceptation (à faire après avoir développé la solution)
	- :-1: renseigner le Plan et calendrier du projet d'architecture (à faire après avoir développé la solution)
	- :-1: ~~faire la description d'impact du nouveau système~~
	  - réponse de Faouzi (mail du 12/01/2023 à 14:04) : "*L'impact à considérer : dsl si j'ai mal formulé les choses mais l'idée  était d'utiliser ton travail sur le SAW pour évaluer l'impact de l'étude qui sera développé dans le document des spécifications des conditions  requises entre autres.*"
	- :+1: indiquer que le patient puisse déclencher le système d'intervention d'urgence
	- :+1: présenter les fiches d'intervention d'urgence dans le SAW
	- :+1: Compléter les principes d'architecture proposés dans la PJ
	- :+1: Présenter les risques accocièes à la solution (l'introduction d'un ERM est déjà spécifiée dans le §Sécurité)

**Questions**

**Remarques**

:point_right: il est spécifié dans les attendus "La documentation de l’architecture pour les livrables finaux est conforme à cette exigence lorsque : L'énoncé des travaux d'architecture définit des métriques et des KPI pour mesurer le succès de la PoC."

- il est nullement mention de KPI ou de quelconque métrique contenus dans le SAW au sein du TOGAF.

**Architecture**
+ :+1: durant le projet, des risques peuvent apparaitre, relativement aux domaines:
	- non conformité des messages d'urgence émis
	- non prise en compte des messages d'urgence émis
	- non prise en compte de l'urgence
	- interruption de services
	- pénurie de ressource
	- perte de confiance
	- temps de rétablissement long

**===========================================================================================================================**
## Semaine 1 du 02/01 au 07/06
### entretien tuteur 03/01/2023
**A faire pour le 09/01**
+ :+1: ~~Compléter le tableau de sourcing avec les PJ anglaises du repo~~
+ :+1: ~~Définir les objectifs du projets~~
	- :point_right: Pour définir ces objectifs, j'ai décidé de rédiger le SAW demandé dans les livrables
	- :+1: Dans le SAW, présenter les risques accocièes à la solution (l'introduction d'un ERM est déjà spécifiée dans le §Sécurité)
	- :-1: Dans le SAW, renseigner les Critères d'acceptation (à faire après avoir développé la solution)
	- :-1: Dans le SAW, renseigner le Plan et calendrier du projet d'architecture (à faire après avoir développé la solution)
+ :point_right: Définir la stratégie de tests

**Questions**

+ :point_right: S'agit-il de délivrer une plateforme qui regroupera l'ensemble des plateformes des organisations membres du Consortium ou s'agit-il de développer un support de plateforme dont les autres membres du Consortium se serviront pour migrer leur plateforme existante vers un résultat de plateforme homogène et prévilégiant l'interopérabilité entre les plateformes migrées?
	- réponse : DDA *"Un consortium de quatre sociétés de premier plan s'est réuni pour consolider les efforts, les données, les applications et les feuilles de route de chacune afin de développer une plateforme de nouvelle génération centrée sur le patient et capable d'améliorer les soins de base proposés - tout en étant réactive, opérationnelle en temps réel et capable de prendre des décisions dans les situations d'urgence, en prenant en compte l’ensemble des données."*
+ :point_right: Dans le DDA fourni, il est inscrit : *"Il est suggéré que ce document fasse référence aux différents livrables du conteneur. Par exemple, les principes d'architecture seront documentés dans un document correspondant et ce document sera référencé ici. Il se peut que ce conteneur soit implémenté à l'aide d'un wiki ou d'un intranet plutôt que d'un document texte. Il serait encore mieux d'utiliser un outil TOGAF sous licence."* Existe-il un outil TOGAF sous licence permettant de contenir de la documentation technique?
+ :point_right: Dans le diagramme du DDA représentant le système d'intervention d'urgence dans un encart rouge, il est spécifié qu'il existe une Internal API Gateway jouant d'ores et déj) le rôle d'ESB. Puis-je m'appuyer sur cette Internal API Gateway pour répondre à mes hypothèses de mise en place d'ESB ou dois-je développer une ESB spécifique?

**Remarques**

+ :point_right: Dans tous les livrables, il est mention d'une nouvelle plateforme venant remplacée les anciennes sans jamais mentionner la reprise des données des anciennes.
	- réponse DDA : *"Les éléments suivants sont hors de portée par rapport à ce document et à l'ensemble du projet : Architecture de systèmes relative aux solutions héritées et internes qui résident en dehors des domaines problématiques exprimés dans le contexte métier et les objectifs du projet."*

**Architecture**
+ :point_right: "L'objectif principal du projet est de développer une plateforme de services dont les systèmes communiquent grâce à des événements." Il faudra développer ~~une architecture orientée évènements~~ **FAUX** (cf P4/EtudeExploratoireArchitecture.odt)
	- l'architecture préconisée sera à base de µservices posséant un ***catalogie de µservices*** et/ou une ***passerelle API***
+ :point_right: Préconiser l'utilisation de designs patterns de type OBSERVER, CHAIN OF RESPONSABILITY, MICROSERVICE.
+ :point_right: Préconiser l'utilisation de trigger.
+ :point_right: Penser à l'utilisation du Design Patterns ADAPTER pour *"Existing systems and processes must not be significantly impeded during any phase of the project." Ainsi, en développant des interfaces ADAPTER spécifiques à chaque autre système, je réponds au fait que ceux-ci continueront à fonctionner nominalement, comme d'habitude"*, tout en collaborant si nécessaire avec la solution développée.
**=========================================================================================================================**
