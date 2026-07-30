# syntax=docker/dockerfile:1
# https://hub.docker.com/r/codercom/code-server
FROM codercom/code-server:4.127.0

USER root

RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
    --mount=type=cache,target=/var/lib/apt,sharing=locked \
    apt-get update && apt-get install -y --no-install-recommends \
        git \
        curl \
        vim \
        unzip \
        jq \
        gnupg && \
    curl -fsSL https://mise.jdx.dev/gpg-key.pub \
        | gpg --dearmor -o /etc/apt/keyrings/mise-archive-keyring.gpg && \
    echo "deb [signed-by=/etc/apt/keyrings/mise-archive-keyring.gpg arch=amd64] https://mise.jdx.dev/deb stable main" \
        > /etc/apt/sources.list.d/mise.list && \
    apt-get update && apt-get install -y --no-install-recommends mise

RUN curl -fsSL "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o /tmp/awscliv2.zip && \
    unzip -q /tmp/awscliv2.zip -d /tmp && \
    /tmp/aws/install && \
    rm -rf /tmp/aws /tmp/awscliv2.zip

USER coder

COPY --chown=coder:coder mise.toml /home/coder/.config/mise/config.toml

RUN mise install && \
    echo 'eval "$(mise activate bash)"' >> ~/.bashrc

EXPOSE 8080
