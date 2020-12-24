pipeline {
    agent none
   stages {     
    stage('sonar Install') {
      agent {         
       docker {          
         image 'sonarqube'         
     }       
  }       
  steps {
       sh './gradlew sonarqube'
       }
     }
   }
 }
