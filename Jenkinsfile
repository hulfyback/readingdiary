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
        bat 'docker run -i -t -d --rm -p 8081:8081 --name reading-diary reading_diary:latest'
      }
    }
    stage('Stop Running') {
      steps {
        bat 'docker stop reading-diary'
        bat 'docker rmi reading_diary:latest'
      }
    }
  }
}
