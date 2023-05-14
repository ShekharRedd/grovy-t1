def gv
pipeline{
    agent any
    stages{
        stage("initgroovy"){
            steps{
                script{
                    gv=load "script.groovy"
                }
            }
        }
        stage("building"){
            steps{
                script{
                    gv.build()
                    echo "hello world"
                }
            }

        }
        stage("testing"){
            steps{
                script{
                    gv.test()
                    echo "hi"
                }
            }
        }

        }
    }
    
