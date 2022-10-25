pipeline {
	agent {
	  docker {
	    image 'maven:3.8.6-openjdk-8-slim'
			reuseNode true
	  }
	}
	stages {
		stage('Build') {
	    steps {
	      sh 'mvn clean compile'
	    }
		}
	}
}
