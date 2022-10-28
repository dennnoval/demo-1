node {
  docker.image('maven:3.8.6-openjdk-8-slim').inside('-v $HOME/.m2:/root/.m2') {
    stage('Initialization') {
      sh 'git clone https://github.com/dennnoval/demo-1.git'
    }
    stage('Build') {
      sh 'mvn -B -DskipTests clean package'  
    }
    stage('Test') {
      sh 'mvn test' 
    }
    stage('Deliver') {
      sh './jenkins/deliver.sh'
    }
  }
}
