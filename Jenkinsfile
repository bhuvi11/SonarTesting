pipeline {
  agent any
  
  stage('SonarQube analysis') {
   
      sh """./gradlew sonarqube """
    
  }
}
