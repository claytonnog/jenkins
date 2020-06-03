# Use : docker build -t name_of_build "local of the dockerfile"

FROM jenkins/jenkins:lts

USER root

## tar -xz -C 
# -x extract / -z gzip / -C change to directory DIR
## groupadd -g "groupid" "user"
## usermod
# -a, add the user to supplementary groups, use with -G
# -G, group list

RUN mkdir -p /tmp/download && \ 
    curl -L https://download.docker.com/linux/static/stable/x86_64/docker-18.03.1-ce.tgz | tar -xz -C /tmp/download && \ 
    rm -rf /tmp/download/docker/dockerd && \ 
    mv /tmp/download/docker/docker* /usr/local/bin/ && \
    rm -rf /tmp/download && \
    groupadd -g 999 docker && \
    usermod -aG staff,docker jenkins

USER jenkins

