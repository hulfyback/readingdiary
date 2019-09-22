pipeline {
  agent any

  stages {
    stage('Compile Stage') {
      steps {
        dir("reading_diary") {
          bat './gradlew compileJava'      
        }
      }
    }
  }
}