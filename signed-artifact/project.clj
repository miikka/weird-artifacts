(defproject org.clojars.miikka/signed-artifact "0.1.1-SNAPSHOT"
  :description "Signed with GPG"
  :url "https://github.com/miikka/weird-artifacts"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repl-options {:init-ns signed-artifact.core}
  :deploy-repositories [["releases" :clojars]]
  :vcs :git)
