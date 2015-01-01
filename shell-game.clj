(ns the-shell-game)

(defn find-the-ball
  "Given the starting position and a list of swaps, find the final position"
  [start moves]

  (reduce (fn [last-move current] (

                              (if (= (second last-move) (first current))
                                current
                                last-move
                              )
            ))
            [0 start]
            moves)

  )


(find-the-ball 0 [[0 1] [1 2] [0 1]])
(second [0 1])
