node('Jenkins-slave') {
    stage('Source') {
        git clone 'https://github.com/Voztr0/server.git'
    }
    stage('Build') {
        echo 'Building stage!'
    }
}