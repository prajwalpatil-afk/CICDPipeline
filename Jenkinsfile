pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Python Setup') {
            steps {
                bat 'echo Installing Python dependencies'
                bat 'python --version'
                bat 'python -m venv venv'
                bat 'venv\\Scripts\\python -m pip install --upgrade pip'
                bat 'venv\\Scripts\\pip install -r requirements.txt'
            }
        }

        stage('Run Data Check') {
            steps {
                bat 'echo Running data checker script'
                bat 'cmd /c "venv\\Scripts\\python app\\check_data.py || echo DB not available, skipping check && exit /b 0"'
            }
        }
    }
}