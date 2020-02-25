(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

(deftest a-test
  (testing "creates an game state"
    (is (= (game) [[:- :- :-],[:- :- :-],[:- :- :-]])))
  (testing "tells you if someone won"
    (is (= (check [[:x :x :x],[:o :- :-],[:- :o :o]]) true))
    ))
