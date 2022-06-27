pipeline {
    agent { Jenkin-slave }
    stages {
        stage('build') {
            steps {
                sh 'node --version'
            }
        }
    }
}