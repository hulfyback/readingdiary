pipeline {
  agent any

  stages {
    stage('Compile Stage') {
      steps {
        dir("reading_diary") {
          sh "pwd"  
          sh "echo 'Hello World!'"        
        }
        sh './gradlew compileJava'
      }
    }
  }
}