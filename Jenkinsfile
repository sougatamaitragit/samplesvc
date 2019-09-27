def label = "worker-${UUID.randomUUID().toString()}"
podTemplate(label: label, containers: [
  containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
  containerTemplate(name: 'docker', image: 'docker', command: 'cat', ttyEnabled: true),
  containerTemplate(name: 'kubectl', image: 'lachlanevenson/k8s-kubectl:v1.8.8', command: 'cat', ttyEnabled: true),
  containerTemplate(name: 'helm', image: 'lachlanevenson/k8s-helm:latest', command: 'cat', ttyEnabled: true)
],
volumes: [
  hostPathVolume(mountPath: '/var/run/docker.sock', hostPath: '/var/run/docker.sock')
]) 

{
    node (label) {

	  git 'https://github.com/sougatamaitragit/samplesvc.git'
	  stage('Build and Unit Test code') {
	      sh("mvn test")
	      sh("mvn package")
	  }
  
	  stage('Build Docker image') {
	       container('docker') {
	       		 withCredentials([[$class: 'UsernamePasswordMultiBinding',
          		 credentialsId: 'dockerhub',
                 usernameVariable: 'DOCKER_HUB_USER',
                 passwordVariable: 'DOCKER_HUB_PASSWORD']]){
                 sh """
            		docker login -u ${DOCKER_HUB_USER} -p ${DOCKER_HUB_PASSWORD}
            		docker build -t sougatamaitra/filehandlingsrvc .
            		docker push sougatamaitra/filehandlingsrvc
            		"""
                 }

	       }
	       
	  }
   }
}