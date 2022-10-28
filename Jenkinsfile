pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'chmod 777 ./mvnw'
                sh './mvnw -B -DskipTests clean package' 
            }
        }
        stage('Test') { 
            steps {
                sh './mvnw test' 
            }
            post {
                always {
                    junit './target/surefire-reports/*.xml' 
                }
            }
        }
//         stage('Deliver') { 
//             steps {
//                 sh './jenkins/scripts/deliver.sh' 
//             }
//         }
        stage('Run') { 
            steps {
                sh './mvnw spring-boot:run' 
            }
        }
    }
}
