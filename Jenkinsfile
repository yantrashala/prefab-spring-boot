node('docker') {
 
    stage 'Checkout'
        checkout scm

    stage 'Build & UnitTest'
        sh "docker build -t ${IMAGE_REPO}/${SERVICE_NAME}:v${BUILD_NUMBER} -f Dockerfile ."
        
    stage 'Publish UnitTest Reports'
        containerID = sh (
            script: "docker run -d -p${SERVICE_PORT}:${SERVICE_PORT} ${IMAGE_REPO}/${SERVICE_NAME}:v${BUILD_NUMBER}", 
        returnStdout: true
        ).trim()
        echo "Container ID is ==> ${containerID}"
        sh "docker cp ${containerID}:/TestResults/test_results.xml test_results.xml"
        sh "docker stop ${containerID}"
        sh "docker rm ${containerID}"
        step([$class: 'JUnitResultArchiver', testResults: 'test_results.xml']) 
}