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
                sh "mvn clean install"
            }
        }
    }
}
