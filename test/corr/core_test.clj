(ns corr.core-test
  (:require [clojure.test :refer :all]
            [corr.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest test-split-players
  (testing "Testando se vai separar o array de jogadora"
    (is (= (corr.core/split-lines-players 
            (str "marta;marta@gmail.com;30\n"
                 "cristiane;cristiane@bol.com;30\n"))
           ["marta;marta@gmail.com;30" 
            "cristiane;cristiane@bol.com;30"]))))

(corr.core/split-lines-players
 "marta;marta@gmail.com;30\ncristiane;cristiane@bol.com;30\n")

(str "marta;marta@gmail.com;30\n"
     "cristiane;cristiane@bol.com;30\n")