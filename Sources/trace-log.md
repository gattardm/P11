Démarré par l'utilisateur solarhis
Running as SYSTEM
Building in workspace /var/lib/jenkins/workspace/emergency-system
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/lib/jenkins/workspace/emergency-system/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/gattardm/emergency-system.git # timeout=10
Fetching upstream changes from https://github.com/gattardm/emergency-system.git
 > git --version # timeout=10
 > git --version # 'git version 2.34.1'
 > git fetch --tags --force --progress -- https://github.com/gattardm/emergency-system.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/master^{commit} # timeout=10
Checking out Revision 73fb0f8e42ffbf1e41868e7eaea935c8eea15f61 (refs/remotes/origin/master)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 73fb0f8e42ffbf1e41868e7eaea935c8eea15f61 # timeout=10
Commit message: "create meta-inf/manifest.xml manually"
 > git rev-list --no-walk 73fb0f8e42ffbf1e41868e7eaea935c8eea15f61 # timeout=10
[emergency-system] $ /home/solarhis/bin/dev/apache-maven-3.9.0/bin/mvn install
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.solarhis:emergency-system >--------------------
[INFO] Building emergency-system 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.0:resources (default-resources) @ emergency-system ---
[INFO] skip non existing resourceDirectory /var/lib/jenkins/workspace/emergency-system/src/main/resources
[INFO] 
[INFO] --- compiler:3.10.1:compile (default-compile) @ emergency-system ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.0:testResources (default-testResources) @ emergency-system ---
[INFO] skip non existing resourceDirectory /var/lib/jenkins/workspace/emergency-system/src/test/resources
[INFO] 
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ emergency-system ---
[INFO] No sources to compile
[INFO] 
[INFO] --- surefire:3.0.0-M8:test (default-test) @ emergency-system ---
[INFO] No tests to run.
[INFO] 
[INFO] --- jar:3.3.0:jar (default-jar) @ emergency-system ---
[INFO] Building jar: /var/lib/jenkins/workspace/emergency-system/target/emergency-system.jar
[INFO] 
[INFO] --- install:3.1.0:install (default-install) @ emergency-system ---
[INFO] Installing /var/lib/jenkins/workspace/emergency-system/pom.xml to /var/lib/jenkins/.m2/repository/org/solarhis/emergency-system/1.0-SNAPSHOT/emergency-system-1.0-SNAPSHOT.pom
[INFO] Installing /var/lib/jenkins/workspace/emergency-system/target/emergency-system.jar to /var/lib/jenkins/.m2/repository/org/solarhis/emergency-system/1.0-SNAPSHOT/emergency-system-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.589 s
[INFO] Finished at: 2023-02-23T17:29:34+01:00
[INFO] ------------------------------------------------------------------------
[emergency-system] $ docker build -t solarhis/emergency-system --pull=true /var/lib/jenkins/workspace/emergency-system
WARNING: Support for the legacy ~/.dockercfg configuration file and file-format has been removed and the configuration file will be ignored
WARNING: Support for the legacy ~/.dockercfg configuration file and file-format has been removed and the configuration file will be ignored
WARNING: Support for the legacy ~/.dockercfg configuration file and file-format has been removed and the configuration file will be ignored
#1 [internal] load .dockerignore
#1 transferring context: 2B done
#1 DONE 0.3s

#2 [internal] load build definition from Dockerfile
#2 transferring dockerfile: 169B done
#2 DONE 0.5s

#3 [internal] load metadata for docker.io/library/openjdk:8
#3 DONE 0.9s

#4 [1/2] FROM docker.io/library/openjdk:8@sha256:86e863cc57215cfb181bd319736d0baf625fe8f150577f9eb58bd937f5452cb8
#4 DONE 0.0s

#5 [internal] load build context
#5 transferring context: 2.00kB done
#5 DONE 0.8s

#4 [1/2] FROM docker.io/library/openjdk:8@sha256:86e863cc57215cfb181bd319736d0baf625fe8f150577f9eb58bd937f5452cb8
#4 CACHED

#6 [2/2] ADD target/emergency-system.jar emergency-system.jar
#6 DONE 2.6s

#7 exporting to image
#7 exporting layers
#7 exporting layers 0.7s done
#7 writing image sha256:8609680f8289ca74a847d2092cc8aa3b5d9b21d248e7e11d78e303586cabd92b 0.0s done
#7 naming to docker.io/solarhis/emergency-system 0.0s done
#7 DONE 0.8s
[emergency-system] $ docker push solarhis/emergency-system
WARNING: Support for the legacy ~/.dockercfg configuration file and file-format has been removed and the configuration file will be ignored
Using default tag: latest
The push refers to repository [docker.io/solarhis/emergency-system]
d5fea6a53cea: Preparing
6b5aaff44254: Preparing
53a0b163e995: Preparing
b626401ef603: Preparing
9b55156abf26: Preparing
293d5db30c9f: Preparing
03127cdb479b: Preparing
9c742cd6c7a5: Preparing
9c742cd6c7a5: Waiting
293d5db30c9f: Waiting
03127cdb479b: Waiting
denied: requested access to the resource is denied
Build step 'Docker Build and Publish' marked build as failure
Finished: FAILURE
