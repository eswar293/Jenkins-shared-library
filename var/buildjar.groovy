#! /user/bin/env groovy

def call () {
    echo "building the application"
    sh 'mvn clean package'
    sh 'mvn package'
}

