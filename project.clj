(defproject rest-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [http-kit "2.1.18"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]]
  :source-paths ["src"]
  :jvm-opts ^:replace ["-Xmx512m" "-server"]
  :aot [rest-server.server]
  :main rest-server.server/run)
