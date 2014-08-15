(ns rest-server.routes
	(:require compojure.core :refer [defroutes]))

(defroutes main-routes
  (POST "/order" [] "<h1>Order placed.</h1>"))
