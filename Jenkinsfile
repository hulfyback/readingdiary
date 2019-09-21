pipeline {
  agent any

  stages {
    stage('Compile Stage') {
      steps {
        sh 'cd reading_diary'
        sh './gradlew compileJava'
      }
    }
    stage('Docker Stage') {
      steps {
        sh 'cd reading_diary'
        sh 'docker build -t reading_diary:latest ./reading_diary'
      }
    }
  }
}