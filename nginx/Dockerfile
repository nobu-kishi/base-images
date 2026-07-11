# syntax=docker/dockerfile:1
FROM nginx:1.27.5

RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
    --mount=type=cache,target=/var/lib/apt,sharing=locked \
    apt-get update && apt-get install -y --no-install-recommends curl

COPY default.conf /etc/nginx/conf.d/default.conf

EXPOSE 80
