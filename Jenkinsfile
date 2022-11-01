pipeline {

  agent any
  
  stages {
    stage('Build') {
      sh 'mvnw -B -DskipTests clean package'
    }
    stage('Test') {
      sh 'mvnw test'
    }
    stage('Deliver') {
      sh 'echo "delivered to cloud"'
    }
  }

}
