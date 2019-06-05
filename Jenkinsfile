node {
    stage('SCM Checkout') {
       checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'gitUser', url: 'https://github.com/pradyumna1979/spring-integration-adapter.git']]])
    }
    stage('Build') {
        if(isUnix()){
        echo 'Unix'
          // get Gradle HOME value
          //def gradleHome = tool 'gradle4'
         //  run Gradle to execute compile and unit testing
          sh 'maven clean build -x test'
        }else{
        echo 'Windows'
           bat 'maven clean build -x test'
        }
    }
    stage('TEST'){
        echo 'Test Done'
    }
    stage('Sonar Check'){
        echo 'Sonar done'
    }
    stage('Deploy'){
            echo 'Deploy done'
    }
}
