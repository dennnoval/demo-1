node {
  stage('Initialization') {
    sh 'cd $WORKSPACE/$JOB_NAME'
  }
  stage('Build') {
    sh 'mvnw -B -DskipTests clean package'  
  }
  stage('Test') {
    sh 'mvnw test' 
  }
}
