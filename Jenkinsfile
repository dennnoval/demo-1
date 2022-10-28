node {
  docker.image('maven:3.8.6-openjdk-8-slim').inside('-v $HOME/.m2:/root/.m2') {
    environment {
      projPath = '/var/jenkins_home/workspace/${env.JOB_BASE_NAME}_master'
    }
    stage('Build') {
      sh 'cd ${projPath}'
      sh 'mvn -B -DskipTests clean package'  
    }
    stage('Test') {
      sh 'cd ${projPath}'
      sh 'mvn test' 
    }
  }
}
