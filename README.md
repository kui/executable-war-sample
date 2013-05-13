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
ls -lh **/sample.war
```

[Maven 3]: http://maven.apache.org/


Servlet API の対応状況
----------------------

各サーブレットコンテナで利用できる Servlet API のバージョン。

* Winstone: [2.5](https://code.google.com/p/winstone/wiki/ChangeLog)
* Jetty: [3.0](http://www.eclipse.org/jetty/about.php) （3.1 の一部）
* Tomcat: [3.0](http://tomcat.apache.org/tomcat-7.0-doc/index.html)
* GlassFish: [3.0](https://glassfish.java.net/downloads/3.0.1-final.html)

ただし、Jetty で `@WebListener`, `@WebServlet` といったアノテーションを使いたい時は、
パッケージ [jetty-annotations][] が必要になる。

[jetty-annotations]: http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.eclipse.jetty%22%20AND%20a%3A%22jetty-annotations%22


war ファイルサイズ比較
------------------------

```sh
$ mvn clean package
$ ls -1s **/sample.war | sort
   80 non-executable/target/sample.war
  360 winstone/target/sample.war
 1344 jetty/target/sample.war
 3344 tomcat/target/sample.war
39388 glassfish/target/sample.war
```

増分は:

	winstone: + 280KB (0.3MB)
	   jetty: +1264KB (1.3MB)
	  tomcat: +3264KB (3.3MB)

glassfish...


フットプリント比較
---------------------

* TODO


Reference
----------------

* [Internna - Geared towards Open Source: Step by step: Executable WAR files](http://internna.blogspot.jp/2011/08/step-by-step-executable-war-files.html)
* [Embedded jetty executable war with Maven and Jetty 8.1](http://uguptablog.blogspot.jp/2012/09/embedded-jetty-executable-war-with.html)
