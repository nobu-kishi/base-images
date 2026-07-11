# syntax=docker/dockerfile:1
# https://gallery.ecr.aws/docker/library/httpd
FROM public.ecr.aws/docker/library/httpd:2.4.65

RUN --mount=type=cache,target=/var/cache/apt,sharing=locked \
    --mount=type=cache,target=/var/lib/apt,sharing=locked \
    apt-get update && apt-get install -y --no-install-recommends curl

COPY conf/httpd.conf /usr/local/apache2/conf/extra/httpd-custom.conf
RUN echo "Include conf/extra/httpd-custom.conf" >> /usr/local/apache2/conf/httpd.conf

EXPOSE 80
