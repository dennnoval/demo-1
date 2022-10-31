node {
  checkout scm
  stage('Build') {
    sh 'mvnw -B -DskipTests clean package'  
  }
  stage('Test') {
    sh 'mvnw test' 
  }
}
