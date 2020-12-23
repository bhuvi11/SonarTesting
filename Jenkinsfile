pipeline {
  agent any
  stages{
  stage('SonarQube analysis') {
    script{
   
      sh """./gradlew sonarqube """
    }
  }
  }
}
