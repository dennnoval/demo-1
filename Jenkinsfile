node {
  stage('Initialization') {
    sh 'cd $WORKSPACE'
    sh 'git clone https://github.com/dennnoval/demo-1.git'
  }
  stage('Build') {
    sh 'mvnw -B -DskipTests clean package'  
  }
  stage('Test') {
    sh 'mvnw test' 
  }
}
