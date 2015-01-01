(ns function-composition)

(defn compose [f g]
  (fn [& args] (f (apply g args)))


)


(defn id [n] (do n))

((compose (partial + 1) id) 0)
