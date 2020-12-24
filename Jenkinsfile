pipeline {
    agent {
        docker { image 'node:14-alpine' }
    }
    stages {
        stage('build') {
                environment {
                  HOME="."
                }
        stage('Test') {
            steps {
                sh './gradlew sonar'
            }
        }
    }
}
