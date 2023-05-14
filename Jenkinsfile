#!/usr/bin/env groovy
@Library('SharedLib')
def gv
pipeline{
    agent any
    stages{
        stage("initgroovy"){
            steps{
                script{
                    echo "good to see you"
                }
            }
        }
        stage("testing"){
            steps{
                script{
                    test.call1()
                    echo "hi"
                }
            }
        }        
        stage("building"){
            steps{
                script{
                    echo "hello world"
                }
            }

        }


        }
    }
    
