pipeline {
    agent any
    tools {
        maven "Maven" // Corrigido para usar o Maven sem especificar uma versão exata
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/lucasbernardodev/vs13-jenkins-maven']]])
            }
        }
        
        stage('Navigate to Project folder') {
            steps {
                script {
                    // Navegue para a pasta desejada
                    sh 'cd JENKINS'
                }
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package' // Comando Maven para limpar e construir o projeto
                sh 'java -cp target/classes com.testejenkins.Main' // Comando para executar a classe Main
            }
        }
        
        stage('Run Unit Tests') {
            steps {
                sh 'mvn test' // Comando Maven para executar os testes
            }
        }
    }
}
