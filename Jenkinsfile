pipeline {
    agent any
    environment {
        PATH = "/opt/apache-maven-3.8.4/bin:%PATH"
    }
    tools {
        maven 'Maven'
    }
    stages {
        stage ('Build') {
            steps {
                mvn clean install
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
