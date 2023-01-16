# Analyse des attendus

**Dans la partie 1**, il est question exclusivement des exigences du code source en matière de:

- conformité;
- pertinence .

**Dans la partie 2**, il est question des exigences relatives à :

- [ ] le plan de test;
- [x] l'énonce des travaux d'architecture;
- [x] le document des principes d'architecture;
- [ ] un document décrivant toute la configuration des pipelines CI/CD utilisé et/ou à utiliser.

**Dans la partie 3**, il est question des exigences relatives à :

- le répertoire GitHub contenant le code;
- la description du pipeline CI/CD contenue PAR les repo GitHub.



# ATTENDUS DU PROJET

## 1 / Développer une POC entièrement testée pour valider les choix de mise en œuvre auprès des parties prenantes

### Le code source est terminé et conforme à cette exigence lorsque :

- [ ] Un répertoire avec des tests peut être cloné.
- [ ] Le dossier des tests suit la convention Maven (src/main src/test).
- [ ] Les tests des fonctionnalités sont inclus dans le projet.

 

### Le code source est pertinent par rapport à cette exigence quand :

- [ ] Les tests tiennent compte du fonctionnement d'un système d'intervention d'urgence
- [ ] Les tests des fonctionnalités du système d'intervention d'urgence peuvent être exécutés ensemble pour déterminer le bon fonctionnement/l’échec de la fonctionnalité.

 

### Le code source est conforme à cette exigence quand :

- [ ] Les tests peuvent être exécutés à l'aide d'un outil de build standard tel que Maven, à partir de la ligne de commande.
- [ ] Les tests peuvent être exécutés à plusieurs reprises sans interférer avec les exécutions futures.
- [ ] Les tests ayant échoué avec l'outil de build se terminent par un code de sortie approprié pour prendre en charge l’intégration continue (CI).
- [ ] Le nommage des tests indique les exigences fonctionnelles testés et garantit que les exécutions CI et en ligne de commande rendent clairement compte de l'état de l'exécution des tests.

 

## 2/ Assurer la conformité des livrables finaux avec les exigences du produit

### Le plan de test est terminé et conforme à cette exigence lorsque :

- [ ] Les tests couvrent tous les ***comportements*** clés du système et les cas atypiques ***probables***.
- [ ] Des tests unitaires existent pour toutes les classes qui contiennent un comportement implémenté pour prendre en charge nos scénarios BDD.
- [ ] Des tests d'intégration de composants existent pour toutes les classes utilisées par plusieurs systèmes auxiliaires.
- [ ] Tests d'intégration système qui valident le comportement métier et les systèmes auxiliaires, avec un système totalement ou partiellement intégré.
- [ ] Tests d'intégration de bout en bout.
- [ ] Un document de stratégie de test est fourni dans le référentiel d’architecture, décrivant l’approche à adopter.

 

### Le plan de test est pertinent par rapport à cette exigence quand :

- [ ] Les tests contiennent des tests fonctionnels, définis comme des scénarios BDD, pour un système d'intervention d'urgence.
- [ ] Les tests prouvent la résilience du système lors d'une interruption de service.
- [ ] Les principes de test détaillés dans le document principes d’architecture sont respectés ; le plan de test et l'implémentation du test utilisent le même langage que le répertoire d’architecture.
- [ ] Les tests sont mis en œuvre conformément au document de stratégie de tests fourni par l'étudiant.

 

### Le plan de test est conforme à cette exigence lorsque :

- [ ] L’exécution des tests ne prend pas plus de 30 secondes.
- [ ] Les tests exécutés sont indépendants et n'interfèrent pas entre eux.
- [ ] Tous les tests s'exécutent, les uns à la suite des autres, sans échec.
- [ ] La sortie de l'exécution des test identifie clairement la cause de l’échec (le cas échéant).

 

### La documentation de l’architecture pour les livrables finaux est terminée et conforme à cette exigence lorsque :

- [ ] L'énoncé des travaux d'architecture est mis à jour et indique comment la PoC a été évaluée.
- [ ] L'hypothèse de la PoC est mise à jour (si nécessaire).
- [ ] Le document sur les principes d'architecture reflète les principes suivis dans la mise en œuvre de la validation de principe.

 

### La documentation de l’architecture pour les livrables finaux est conforme à cette exigence lorsque :

- [ ] L'énoncé des travaux d'architecture définit des métriques et des KPI pour mesurer le succès de la PoC.
- [ ] Un document supplémentaire a été rédigé, décrivant les pipelines CI/CD pour les futurs projets.

 

## La documentation de l’architecture pour les livrables finaux est conforme à cette exigence lorsque :

- [ ] Les documents relatifs à l’architecture sont stockés dans le répertoire d'architecture.
- [ ] Tous les nouveaux documents sont liés d'une manière ou d'une autre et il n’y a pas de documents orphelins.

 

## 3/ Assurer l'application des pratiques d'intégration continue lors de la mise en œuvre

### Le référentiel de code source et le pipeline CI/CD sont terminés et conformes à cette exigence quand :

- [ ] Le répertoire est accessible par l'évaluateur et le code peut être cloné pour créer un artéfact déployable.
- [ ] Un pipeline CI/CD est associé au répertoire contenant le code source.

 

### Le référentiel de code source et le pipeline CI/CD sont conformes à cette exigence quand :

- [ ] Une configuration de pipeline CI/CD fonctionnelle réside dans le code ou est explicitement documentée dans le projet (par exemple *Jenkisfile, .travis.yml, .circleci/config.yml*).
- [ ] Les artéfacts de build sont clairement versionnés et traçables par rapport à leur branche source/validation d'une manière ou d’une autre.

 

### Le référentiel de code source et le pipeline CI/CD sont conformes à cette exigence quand :

- [ ] La configuration du pipeline CI/CD est implémentée d’une manière qui est simple à suivre.
- [ ] Les artéfacts de déploiement sont versionnés pour faciliter la restauration et la traçabilité.