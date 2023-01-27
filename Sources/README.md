**===========================================================================================================================**
#                                                            P11
**===========================================================================================================================**

## Semaine 4 du 23/01 au 27/01

### entretien tuteur 17/01/2023

#### A faire pour le 31/01

Réaliser la configuration du pipeline CI/CD (Jenkins, IntelliJ IDEA, JAVA J2SE, JUnit, javadoc, outils de surcharge).

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
