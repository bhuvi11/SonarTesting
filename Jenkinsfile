pipeline {
  agent any
  stages{
  stage('SonarQube analysis') {
   
      sh """./gradlew sonarqube """
    
  }
  }
}
