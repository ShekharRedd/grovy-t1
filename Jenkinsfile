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
        stage("building"){
            steps{
                script{
                    buildapp()
                    echo "hello world"
                }
            }

        }
        stage("testing"){
            steps{
                script{
                    test()
                    echo "hi"
                }
            }
        }

        }
    }
    
