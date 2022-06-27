pipeline {
    agent { label 'Jenkin-slave' }
    stages {
        stage('build') {
            steps {
                sh 'node --version'
            }
        }
    }
}