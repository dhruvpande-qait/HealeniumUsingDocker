# HealeniumUsingDocker

<H3>Docker Setup</H3>

<b>Step01:</b> Go to https://download.docker.com/linux/ubuntu/dists/ <br>
<b>Step02:</b> choose your Ubuntu version, then browse to pool/stable/<br>
<b>Step03:</b> choose amd64, armhf, or arm64 (To check -> $ dpkg --print-architecture) <br>
<b>Step04:</b> download the .deb file for containerd, docker-ce-cli and docker-ce<br>
<b>Step05:</b> Install Docker Engine ($ sudo dpkg -i /path/to/package.deb)<br>
<b>Step06:</b> Verify docker is installed correctly ($ sudo docker run hello-world)<br>
