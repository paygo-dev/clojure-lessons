(ns corr.core
  (:gen-class)
  (:require [clojure.string :as str]))

(def players 
  (str "marta;marta@gmail.com;30\n"
       "cristiane;cristiane@bol.com;30\n"
       "formiga;formiga_2011@hotmail.com;41"))

; (str/split-lines players)

(defn split-lines-players
  [players]
  (str/split-lines players))

(reduce split-lines-players 
        []
        (split-lines-players
         players))

(split-lines-players
 "marta;marta@gmail.com;30\ncristiane;cristiane@bol.com;30\n")


; (defn )

; (split-players players)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
