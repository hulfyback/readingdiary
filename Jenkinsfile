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

    stage('Cleaning Stage') {
      steps {
        dir('reading_diary') {
          bat './gradlew clean'
        }
      }
    }

    stage('Building Stage') {
      steps {
        dir('reading_diary') {
          bat './gradlew bootJar'
        }
      }
    }

    stage('Dockerization') {
      steps {
        dir('reading_diary') {
          bat 'docker build -t "reading_diary:latest" .'
        }
        bat 'docker run --rm -p 8081:8081 --name reading-diary reading_diary:latest -d reading_diary'
      }
    }
  }
}
