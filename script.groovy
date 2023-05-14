def build(){
    echo "build the application"
}
def test(){
    echo "testing the application"
    withCredentials([usernamePassword(credentialsId:'docker-hub-repo', usernameVariable: 'USERNAME',passwordVariable:'PASSWORD')])
    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
    sh "docker build -t shekhar123reddy/num:34.5"
    sh "docker push shekhar123reddy/num:34.5"
}

def deploy(){
    echo "deploy the application"
}

return this