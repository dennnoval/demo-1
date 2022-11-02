node {
  withDockerContainer(image: 'maven:3.8.6-openjdk-8-slim', args: '-v $HOME/.m2:/root/.m2') {
    stage('Initialization') {
      sh 'git clone https://github.com/dennnoval/demo-1.git'
    }
    stage('Build') {
      sh './mvnw -B -DskipTests clean package'  
    }
    stage('Test') {
      sh './mvnw test' 
    }
  }
}
