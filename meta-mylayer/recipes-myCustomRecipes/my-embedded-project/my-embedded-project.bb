SUMMARY = "My Embedded pr0ject image"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " htop nano python3 openssh hello smiley"
IMAGE_FEATURES:append = " ssh-server-openssh"

