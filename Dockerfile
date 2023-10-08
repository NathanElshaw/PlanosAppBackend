FROM ubuntu:latest
LABEL authors="Nathan Elshaw"

ENTRYPOINT ["top", "-b"]