pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        step('build-step-1') {
          echo "build-step-1"
        }
        step('build-step-2') {
          echo "build-step-2"
        }
      }
    }
    stage ('test') {
      steps {
        echo "test stage"
      }
    }
  }
}
