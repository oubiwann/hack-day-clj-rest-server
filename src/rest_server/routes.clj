(ns rest-server.routes
	(:require [compojure.core :refer :all]))

(defroutes main-routes
  (POST "/order" [] "<h1>Order placed.</h1>")
  (GET "/order/:id" [id] (str "<h2>Order " id " is not ready.</h2>"))
  (PUT "/order/:id" [id] (str "<h2>Received update for Order " id)))
