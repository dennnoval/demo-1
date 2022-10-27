pipeline {  
    agent any 
    environment {
        JAVA_HOME = 'C:\Program Files\Java\jdk1.8.0_341'
    }
    stages {  
            stage ('Build') {  
                steps {  
                        bat 'mvnw.cmd clean compile'
                }  
            }  
    }  
}  
