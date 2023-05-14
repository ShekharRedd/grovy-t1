def build(){
    echo "build the application"
}
def test(){
    echo "testing the application"
    withCredentials([usernamePassword(credentialsId:'0672b53e-cc7a-46c7-aad8-bf5e6a6d1325', usernameVariable: 'USERNAME',passwordVariable:'PASSWORD')])
    sh 'docker build -t shekhar123reddy/num:34.5'
    sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
    sh "docker push shekhar123reddy/num:34.5"
}

def deploy(){
    echo "deploy the application"
}

return this