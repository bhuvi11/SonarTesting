pipeline {
    agent {
        docker { image 'node:14-alpine' }
    }
    stages {
        
        stage('Test') {
            environment {
                  HOME="."
            }
            steps {
                sh './gradlew sonar'
            }
        }
    }
}
