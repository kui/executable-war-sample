Executable War Sample
=====================

実行可能な war をビルドするためのサンプル。

サーブレットコンテナに war としてデプロイもできるし、`java -jar sample.war` でサーバーを立ち上げて使うこともできる。

[Hudson][] や [Jenkins][] が配布に使ってる方式。

[Hudson]: http://hudson-ci.org/
[Jenkins]: http://jenkins-ci.org/


パッケージング
-------------

[Maven 3][] が必要。

```sh
mvn package
```

[Maven 3]: http://maven.apache.org/


Reference
----------------

* [Internna - Geared towards Open Source: Step by step: Executable WAR files](http://internna.blogspot.jp/2011/08/step-by-step-executable-war-files.html)
* [Embedded jetty executable war with Maven and Jetty 8.1](http://uguptablog.blogspot.jp/2012/09/embedded-jetty-executable-war-with.html)
