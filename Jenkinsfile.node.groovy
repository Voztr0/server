pipeline {
    agent any
    stages {
        stage('Source') {
            steps {
                echo 'Hello World'
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
