# P11
## Semaine 1 du 02/01 au 07/06
**entretien tuteur 03/01/2023**
**A faire pour le 09/01**
+ ~~Compléter le tableau de sourcing avec les PJ anglaises du repo~~
+ ~~Définir les objectifs du projets~~
	- Pour définir ces objectifs, j'ai décidé de rédiger le SAW demandé dans les livrables
+ Définir la stratégie de tests

**Questions
+ S'agit-il de délivrer une plateforme qui regroupera l'ensemble des plateformes des organisations membres du Consortium ou s'agit-il de développer un support de plateforme dont les autres membres du Consortium se serviront pour migrer leur plateforme existante vers un résultat de plateforme homogène et prévilégiant l'interopérabilité entre les plateformes migrées?
	- réponse : DDA *"Un consortium de quatre sociétés de premier plan s'est réuni pour consolider les efforts, les données, les applications et les feuilles de route de chacune afin de développer une plateforme de nouvelle génération centrée sur le patient et capable d'améliorer les soins de base proposés - tout en étant réactive, opérationnelle en temps réel et capable de prendre des décisions dans les situations d'urgence, en prenant en compte l’ensemble des données."*
+ Dans le DDA fourni, il est inscrit : *"Il est suggéré que ce document fasse référence aux différents livrables du conteneur. Par exemple, les principes d'architecture seront documentés dans un document correspondant et ce document sera référencé ici. Il se peut que ce conteneur soit implémenté à l'aide d'un wiki ou d'un intranet plutôt que d'un document texte. Il serait encore mieux d'utiliser un outil TOGAF sous licence."*
	- Existe-il un outil TOGAF sous licence permettant de contenir de la documentation technique?
+ Dans le diagramme du DDA représentant le système d'intervention d'urgence dans un encart rouge, il est spécifié qu'il existe une Internal API Gateway jouant d'ores et déj) le rôle d'ESB. Puis-je m'appuyer sur cette Internal API Gateway pour répondre à mes hypothèses de mise en place d'ESB ou dois-je développer une ESB spécifique?

**Remarques**
+ Dans tous les livrables, il est mention d'une nouvelle plateforme venant remplacée les anciennes sans jamais mentionner la reprise des données des anciennes.
	- réponse DDA : *"Les éléments suivants sont hors de portée par rapport à ce document et à l'ensemble du projet : Architecture de systèmes relative aux solutions héritées et internes qui résident en dehors des domaines problématiques exprimés dans le contexte métier et les objectifs du projet."*

**Architecture**
+ "L'objectif principal du projet est de développer une plateforme de services dont les systèmes communiquent grâce à des événements." Il faudra développer ~~une architecture orientée évènements~~ **FAUX** (cf P4/EtudeExploratoireArchitecture.odt)
	- l'architecture préconisée sera à base de µservices posséant un ***catalogie de µservices*** et/ou une ***passerelle API***
+ Préconiser l'utilisation de designs patterns de type OBSERVER, CHAIN OF RESPONSABILITY, MICROSERVICE.
+ Préconsier l'utilisation de trigger.
+ Penser à l'utilisation du Design Patterns ADAPTER pour *"Existing systems and processes must not be significantly impeded during any phase of the project." Ainsi, en développant des interfaces ADAPTER spécifiques à chaque autre système, je réponds au fait que ceux-ci continueront à fonctionner nominalement, comme d'habitude"*, tout en collaborant si nécessaire avec la solution développée.
