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
        stage("building"){
            steps{
                script{
                    gv=build()
                }
            }

        }
        stage("testing"){
            steps{
                script{
                    gv=deploy()
                }
            }
        }

        }
    }
    
