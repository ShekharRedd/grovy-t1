// def build(){
//     echo "build the application"
// }
// def test(){
//     echo "testing the application"
//     sh 'docker build -t shekhar123reddy/num:34.6 .'
//     withCredentials([usernamePassword(credentialsId: 'Docker-hub', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
//         sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
//         sh 'docker push shekhar123reddy/num:34.6'
// }
// }

def deploy(){
    echo "deploy the application"
}

return this