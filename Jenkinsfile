pipeline {
  agent any
  stages{
  stage('SonarQube analysis') {
    steps {
    script{
   
      bat " sh ./gradlew sonarqube "
    }
  }
  }
  }
}
