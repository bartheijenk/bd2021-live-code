
pipeline {
tools {
    maven 'mvn'
  }
    agent any
//     {
//         docker {
//             image 'maven:3-alpine'
//             args '-v /root/.m2:/root/.m2'
//         }
//     }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Package') {
            steps {
             sh 'mvn -B -DskipTests clean package'

            }
            post {
            always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true

            }}
        }
    }
}