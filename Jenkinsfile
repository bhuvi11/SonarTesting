pipeline {
  agent any
  stages{
  stage('SonarQube analysis') {
    steps {
    script{
   
      sh """./gradlew sonarqube """
    }
  }
  }
  }
}
