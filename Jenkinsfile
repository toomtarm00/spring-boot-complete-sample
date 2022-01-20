pipeline {
    agent any
    environment {
        PATH = "E:/Work/Apache Tomcat/apache-tomcat/apache-maven-3.5.4"
        M2_HOME = "${PATH}/bin"
    }
    tools {
        maven 'Maven'
    }
    stages {
        stage ('Build') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true install"
            }
        }
    }
}
