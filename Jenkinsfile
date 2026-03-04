pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Python Data Validation') {
            steps {
                bat '''
                python -m venv venv
                venv\\Scripts\\activate
                pip install -r requirements.txt
                python app\\check_data.py
                '''
            }
        }

        stage('Run Selenium TestNG Tests') {
            steps {
                bat '''
                cd tests\\selenium
                mvn test
                '''
            }
        }

    }
}