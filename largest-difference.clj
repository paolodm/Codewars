(ns largest-difference)

(defn largestDifference
  [data]

  (defn helper
    [startInd, endInd]

    (println "startIndex: " startInd "endIndex: " endInd)

    (if (< startInd endInd)
      (max
        (cond
           (<= (get data startInd) (get data endInd)) (- endInd startInd)
           :else 0
         )

         (helper (+ 1 startInd) endInd)

         (helper startInd (- endInd 1))
      )
      0
      )
  )

  (helper 0 (- (count data) 1))
  )


(println (largestDifference [9 4 1 10 3 4 0 -1 -2]))
(println (largestDifference [3 2 1]))
