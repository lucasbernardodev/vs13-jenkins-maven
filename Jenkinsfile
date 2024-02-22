pipeline {
    agent any
     tools { 
        maven "Maven 3.9.6"
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/lucasbernardodev/vs13-jenkins-maven']]])

            }
        }

        stage('Navigate to Project folder') {
            sh 'cd'
        }

        stage('Hello World') {
            steps {
                sh 'java -cp target/classes com.testejenkins.Main'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

    }
}