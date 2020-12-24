pipeline {
    agent {
        docker { image 'sonar' }
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew sonar'
            }
        }
    }
}
