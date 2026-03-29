# syntax=docker/dockerfile:1
# https://gallery.ecr.aws/docker/library/httpd
# alpineタグを指定しないことでDebianベースイメージを使用
FROM public.ecr.aws/docker/library/httpd:2.4.65

# 必要に応じて、Apache用の設定ファイルを上書き
# COPY .conf/httpd.conf /etc/httpd/conf/httpd.conf

EXPOSE 80

ENTRYPOINT ["httpd"]
CMD ["-D", "FOREGROUND"]
