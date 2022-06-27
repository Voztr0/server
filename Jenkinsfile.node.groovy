pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
            }
        }
        stage('Source') {
            steps {
                git 'https://github.com/Voztr0/server.git'
            }    
        }
    }
}