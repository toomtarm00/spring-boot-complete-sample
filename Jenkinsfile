pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withMaven(maven : 'Maven') {
                    sh'mvn clean compile'
                }
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
