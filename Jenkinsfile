pipeline {
  agent any

  stages {
    stage('Compile Stage') {
      steps {
        dir("reading_diary") {
          sh "pwd"
          sh './gradlew compileJava'
        }
      }
    }
  }
}