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
                sh '/usr/local/apache-maven-3.9.6/bin/mvn clean test'
            }
        }
        stage('Test Results') {
            steps {
                junit '**/target/surefire-reports/**/*.xml'
            }
        }
    }
}
