node('agent01') {
    stage('Source') {
        git 'https://github.com/Voztr0/server.git'
    }
    stage('Build') {
        echo 'Building stage!'
    }
}