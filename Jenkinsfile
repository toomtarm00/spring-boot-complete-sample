pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage ('Build') {
            steps {
                'mvn install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
