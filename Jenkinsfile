pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sudo sh './mvnw -B -DskipTests clean package' 
            }
        }
    }
}
