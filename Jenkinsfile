node {
  docker.image('maven:3.8.6-openjdk-8-slim').inside('-v $HOME/.m2:/root/.m2') {
    stage('Initialization') {
      sh 'cd /var/jenkins/home/workspace/${env.JOB_BASE_NAME

}_master'  
    }
    stage('Build') {
      sh 'mvn -B -DskipTests clean package'  
    }
    stage('Test') {
      sh 'mvn test' 
    }
  }
}
