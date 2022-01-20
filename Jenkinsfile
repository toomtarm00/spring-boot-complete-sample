pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = E:/Work/Apache Tomcat/apache-tomcat/apache-maven-3.5.4"
                    echo "M2_HOME = ${PATH}/bin"
                '''
            }
        }
        stage ('Build') {
            steps {
                sh "mvn clean install"
            }
        }
    }
}
