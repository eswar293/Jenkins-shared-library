#! /user/bin/env groovy

def call () {
    echo "building the application $BEANCH_NAME"
    sh 'mvn package'
}

