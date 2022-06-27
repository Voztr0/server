pipeline {
    agent { jenkin-slave }
    stages {
        stage('build') {
            steps {
                sh 'node --version'
            }
        }
    }
}