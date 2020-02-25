(ns tic-tac-toe.core)

(defn game
  "creates empty game"
  []
  (repeat 3 [(repeat 3 :-)]))

(defn full-row [v]
  (let [x (set v)]
    (if (nil? (x :-))
      (if
        (= 1 (count x)) true
        false)
      false
    )
  )

(defn check [board]
  (any? (map full-row board))
  )
