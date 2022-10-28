pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'sudo ./mvnw -B -DskipTests clean package' 
            }
        }
    }
}
