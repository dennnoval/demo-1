pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'chmod 777 ./mvnw'
                sh './mvnw -B -DskipTests clean package' 
            }
        }
    }
}
