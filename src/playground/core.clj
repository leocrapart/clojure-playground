(ns playground.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



(take 1 [1 2 3])

(take 2)

(into () (into [] (take 2 (range 100))))

(into [] (take 2 [1 2 3]))
(into [] (take 2) [1 2 3])
(into [] (comp (take 2) (filter even?)) [1 2 3])
(into [] (comp (map even?) (take 2)) [1 2 3])

(even? 2)
(map even?)
(filter even?)

(filter even? (range))
(take-while)


(defn seff [number]
  (println number)
  (if (even? number)
    true
    false))

(seff 2)

(filter seff (range 10))
(type (filter seff (range 10)))
(into [] (filter seff (range 10)))

(filter even? (range 10))


(defn f1 [x]
  (println "f1"))

(defn f2 [x]
  (println "f2"))

(Math/sqrt)

((comp f1 f2) 2)


((comp Math/sqrt))


; 2 => 2*2*2 = 8 => sqrt = 2.8284
; 2 => sqrt = 1,414 => ** = 2.8284


; 2 => "2" => count = 1

(str 2)
(str (range 10))


(count "2")


((comp str count) 2)
((comp count str) 2)
((comp count str) (range 10))
((comp str count) (range 10))



(take-while even? [2 3 4])

(into [] (take-while even?) [2 4 6 7 8 10])


(rest [1 2 3])

(drop 2 [1 2 4])

(map inc (range 6))

(into [] (comp (drop 3) (map inc)) (range 6))

(drop-while even?)

(into [] (drop-while even?) (range 1 10))

(into [] {:a 1 :b 2})
(into [] {:a {:c 3 :d 4} :b 2})
(into [] {:a (into [] {:c 3 :d 4}) :b 2})


(odd?)

(map)
(filter)
(take)
(take-while)
(drop)

(drop-while)
(drop-while odd? (range 10))


(mapcat)
(defn f3 [el]
  [el])
(map f3 [1 2 3])
(concat [1] [2] [3])

(mapcat f3 [1 2 3])

(conj [1] 2)
(concat)
(concat [1 2] [3 4])


(cat)
;; flatten vector

(into [] (comp cat cat (map inc)) [[[1] [2]] [[3] [4]]])
(into [] (comp cat cat) [[[1] [2]] [[3] [4]]])

(into [] (comp cat (map inc)) [[1 2] [3 4]])
(into [] (comp cat (map inc)) [[1 2] [3 4]])

(take-nth 2 (range 10))
(take-nth 3 (range 10))
(take-nth 4 (range 10))
(take-nth 1 (range 10))

(rand-nth [1 2 3])
(rand-nth '(1 2 3))
(rand-nth '(1 2 3))

(count {:a 1 :b 2})
(seq {:a 1 :b 2})
(conj {:a 1 :b 2} {:c 3})
(conj {:a 1 :b 2} [:c 3])

(conj (range 10) (range 10))
(zip [1 2] [3 4])
(into [] (comp (distinct)) (range 10))

(remove)
(replace)

(replace {1 2 3 4 5 6 7 8 9 10} [1 2 3 4 5 6 7 8 9])
(replace [1 2 3 5 6 7 8 9 10] [1 2 3 4 5 6 7 8 9])
(replace {:a "b" :b "c"} ["a" "b"])
(keep)

;; keep = map + filter nils
(defn nillify-zero-square-x [x]
  (if (= x 0)
    nil
    (* x x)))

(nillify-zero 0)
(nillify-zero 2)


(range 10)
(keep nillify-zero-square-x (range 10))

(keep even? [1 2 3 4])
(map even? [1 2 3 4])
(filter even? [1 2 3 4])

(keep-indexed)
(dedupe)
(random-sample)
(partition-by)
(partition-all)
(take-nth)

(random-sample 0.5 [1 2 3 4 6 8 10])
(rand-int 10)
(shuffle [1 2 3 4 5 6 7 8 9])

(shuffe)


(map (fn [x] [x x]) (range 10))

(defn duplicate [x]
  [x x])

(vector 1 1)
(vec (range 10))

(range 0 10 1)

(defn dedouble [coll]
  (into [] (comp (map duplicate) cat) coll))

(dedouble (range 10))
(dedouble (range 10))

(into [] (comp (map duplicate) cat) (range 10))
(into [] (comp (map (fn [x] (repeat 2 x))) cat) (range 10))
(fn (repeat 2 x))

(type #{1 2 3})
(type #())
(map (fn [x] [x x]) [1 2 3])
(map #([% %]) [1 2 3])
(map (#([% %])))


#()
