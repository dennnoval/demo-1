node {
  stage('Initialization') {
    step([$class: 'WsCleanup'])
    sh 'git clone https://github.com/dennnoval/demo-1.git .'
  }
  stage('Build') {
    sh 'mvn -B -DskipTests clean package'  
  }
  stage('Test') {
    sh 'mvn test' 
  }
}
