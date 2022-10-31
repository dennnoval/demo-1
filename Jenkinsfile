node {
  stage('Initialization') {
    sh 'cd $WORKSPACE'
  }
  stage('Build') {
    sh 'mvnw -B -DskipTests clean package'  
  }
  stage('Test') {
    sh 'mvnw test' 
  }
}
