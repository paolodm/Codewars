(ns highest-rank)

(defn highest-rank
  "Returns the most frequent entry in the data ISeq"
  [data]

  (defn- sort-by-val [s]        (sort-by val s))

  (first (last
          (sort-by-val
           (frequencies data)
           )
          )
   )
)

(println (highest-rank [12, 10, 8, 12, 7, 6, 4, 10, 12]))
