pipeline {
    agent any
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
