(ns clj-tvdb.core
  (:require [environ.core :refer :all])
  (:gen-class :main true))

(declare get-api-key get-api-key-map get-api-key-project-name)

(defn get-api-key-project-name []
 (:api-key-project-name (env :tvdb)))

(defn get-api-key []
 (:api-key (env :tvdb)))

(defn get-api-key-map []
 {:api-key (get-api-key) :api-key-project-name (get-api-key-project-name)})

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
