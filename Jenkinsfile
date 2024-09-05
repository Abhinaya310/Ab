pipeline {
    agent any
    
    stages {
      stage('Git Checkout') {
            steps {
                script {
                    git url: 'https://github.com/Abhinaya310/Ab'
                      echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
                script {
                    sh 'mvn clean install'
                      echo 'maven build is done'
                }
            }
        }
        stage('docker image'){
            steps{
             
                sh 'docker build -t 9894851315/Ab:${BUILD_NUMBER} .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                sh 'docker container rm -f Ab'
                sh 'docker run --name Ab -itd -p 9999:9999 9894851315/Ab:${BUILD_NUMBER}'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }


