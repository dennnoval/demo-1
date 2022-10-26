node {
	/* Requires the Docker Pipeline plugin to be installed */
	docker.image('maven:3.8.6-openjdk-8-slim').inside {
		stage('Build') {
			sh 'mvn clean compile package'
		}
	}
}
