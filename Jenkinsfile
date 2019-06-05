node{
stage("SCM Checkout"){
checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'gitUser', url: 'https://github.com/pradyumna1979/spring-integration-adapter.git']]])
}
}
