pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/iamtitas/WebCalculatorTK.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Test Results') {
            steps {
                junit '**/target/surefire-reports/**/*.xml'
            }
        }
    }
}
