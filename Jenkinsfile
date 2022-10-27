pipeline {  
    agent any  
    stages {  
            stage ('Build') {  
                steps {  
                        set 'JAVA_HOME=C:\Program Files\Java\jdk1.8.0_341'
                        bat 'mvnw.cmd clean compile'
                }  
            }  
    }  
}  
