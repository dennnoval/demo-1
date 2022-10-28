pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'chmod 777 ../'
                sh './mvnw -B -DskipTests clean package' 
            }
        }
    }
}
