(ns count-change)

(defn count-change
  "Gives the number of ways to make change for some money given a set of coins"
  [money coins]

  (cond
     (< money 0) 0
     (> money 0) (reduce (fn [total cur] (

                    (+ total (count-change (- money cur) coins)
                      )
                                          )) 0 coins)


     :else 1
  )
)

(count-change 10 [5, 2])


