pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withMaven(maven : 'Maven') {
                    bat'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                 bat'mvn test'
            }
        }
     }
    post {
       always {
          junit(
        allowEmptyResults: true,
        testResults: '*/test-reports/.xml'
      )
      }
   } 
}
