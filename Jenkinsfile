node {
  stage('Initialization') {
    sh 'whoami'
    sh 'git clone https://github.com/dennnoval/demo-1.git .'
  }
  stage('Build') {
    sh 'whoami'
    sh './mvnw -B -DskipTests clean package'  
  }
  stage('Test') {
    sh './mvnw test' 
  }
}
