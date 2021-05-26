pipeline {
  agent any
  stages {
    stage('Build Stage') {
      steps {
        echo 'Hello World'
      }
    }

    stage('Test Stage') {
      steps {
        echo 'Testing'
        bat 'cd C:\\Program Files\\SmartBear\\SoapUI-5.6.0\\bin\\. testrunner.bat -s"TestSuite 1" -c"TestCase 1" C:\\Users\\Steven\\Documents\\SOAPUI\\RESTAPIgenderGuess.xml'
      }
    }

    stage('Deploy Stage') {
      steps {
        echo 'Deploy'
      }
    }

  }
}