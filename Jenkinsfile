pipeline {
  agent any
  stages {
    stage ('Build') {
      steps {
        sh 'mvn install' 
      }
      steps {
        sh 'mvn test' 
      }
      post {
        success {
          junit 'target/surefire-reports/**/*.xml' 
        }
      }
    }
  }
}
