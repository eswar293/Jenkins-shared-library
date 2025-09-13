#! /user/bin/env groovy
import com.example.Docker

def call(String imageName) {
    def Docker = new Docker(this)
    docker.buildDockerImage(imageName)
}