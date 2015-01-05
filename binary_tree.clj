
(ns binary-tree
  (:use clojure.test))

(defprotocol BINARYTREE
  (insert [this node])
  (delete [this node])
  (search [this key])
  (minimum [this])
  (maximum [this])
  (pprint [this])
  )


(defn unwind [stack node]
  (reduce (fn [parent child] (
                    (println "Child:" child)
                    (println "Parent: " parent)
                    (println "Child key: " (:key child))
                    (println "Parent key: " (:key parent))


                   (if (> (:key child) (:key parent))
                       (println "true")
                       (println "false")

                       ;(assoc parent :right child)
                       ;(assoc parent :left child)
                   )
                    )) node stack)
  )

(defrecord TreeNode [left right key]
  BINARYTREE
  )



(println "Printing: " (TreeNode. nil nil 10))

(let [tree (unwind [(TreeNode. nil nil 5)
                    ]
                   (TreeNode. nil nil 3)

                   )]

  (println "Tree: " tree)

  (println (:key tree) 5))

