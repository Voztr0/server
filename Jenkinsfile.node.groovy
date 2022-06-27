pipeline {
    agent any
    stages {
        stage('Source') {
            steps {
                git 'https://github.com/Voztr0/server.git'
            }
        }
        stage('Build') {
            steps {
                echo 'run build'
            }
        }
        stage('Deploy') {
            steps {
                echo 'run deploy'
            }
        }
        stage('Test') {
            steps {
                echo 'run test'
            }
        }
        stage('Feedback') {
            steps {
                echo 'send reports'
            }
        }
    }
}
