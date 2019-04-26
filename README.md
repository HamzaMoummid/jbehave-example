# Projet Maven Example avec [JBehave](http://jbehave.org/) 
projet exemple pour executer un simple scénario de calcul de surface 

## Contexte
JBehave est un outil d'automatisation de test qui respecte les principes de la conception comportementale et de la documentation évolutive. Les spécifications sont rédigées sous une forme lisible par l’homme et exécutées en intégration continue.

## Utilisation
Après avoir installé maven: mvn clean install exécutera les tests et produira la sortie de test.



## Etapes
Dans src/test/java
 - creation ..Scenario.java
 - creation ..ScenarioSteps.java
 - creation .._scenario.story
 
 Dans pom.xml :
 exemple :
 
```
 <configuration>
	<includes>
		<include>**/*RECTANGLEScenario.java</include>
	</includes>

	<scope>test</scope>
</configuration>

```


