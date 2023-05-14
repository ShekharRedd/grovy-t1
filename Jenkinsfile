
def gv
pipeline{
    agent any
    stages{
        stage("initgroovy"){
            steps{
                script{
                    gv="load script.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script{
                    gv=test()
                }
            }

        }
        stage("test"){
            steps{
                script{
                    gv=deploy()
                }
            }
        }

        }
    }
    
