node('docker') {
 
    stage 'Checkout'
        checkout scm

    stage 'Build & UnitTest'
        sh "docker build -t ps/prefab-spring-boot:B${BUILD_NUMBER} -f Dockerfile ."
        sh "docker build -t ps/prefab-spring-boot:test-B${BUILD_NUMBER} -f Dockerfile.Integration ."
  
    stage 'Publish UnitTest Reports'
        containerID = sh (
            script: "docker run -d ps/prefab-spring-boot:B${BUILD_NUMBER}", 
        returnStdout: true
        ).trim()
        echo "Container ID is ==> ${containerID}"
        sh "docker cp ${containerID}:/TestResults/test_results.xml test_results.xml"
        sh "docker stop ${containerID}"
        sh "docker rm ${containerID}"
        step([$class: 'JUnitResultArchiver', testResults: 'test_results.xml']) 

    stage 'Integration Test'
        sh "docker-compose -f docker-compose.integration.yml up --force-recreate --abort-on-container-exit"
        sh "docker-compose -f docker-compose.integration.yml down -v"
}