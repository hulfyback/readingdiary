pipeline {
  agent any

  stages {
    stage('Compile Stage') {
      steps {
        sh 'gradle compTest'
      }
    }
    stage('Test Stage') {
      steps {
        sh 'gradle test --continuous'
      }
    }
    stage('Build Stage') {
      steps {
        sh 'gradle build'
      }
    }
    stage('Run Stage') {
      steps {
        sh 'gradle bootRun'
      }
    }
  }
}