def build(){
    echo "build the application"
}
def test(){
    echo "testing the application"
    withCredentials([usernamePassword(credentialsId:'Docker-hub', usernameVariable: 'USERNAME',passwordVariable:'PASSWORD')])
    sh 'docker build -t shekhar123reddy/num:34.5'
    sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
    sh "docker push shekhar123reddy/num:34.5"
}

def deploy(){
    echo "deploy the application"
}

return this