pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Build the Maven project
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
    }
    
    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
