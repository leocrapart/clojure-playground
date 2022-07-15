(ns playground.core
  (:gen-class)
  (:require [clojure.string :as str]))

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
(replace [1 2 3 4] ["index1" "index2"])

;; select 1 2 3 in [10 2 3 4]s
(replace [10 2 3 4] [1 2 3])

;;select 0 2 7 in [0 1 2 3 4 5 6 7]
(replace ["0" "1" "2" "3" "4" "5" "6" "7"] [0 2 7])

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


;; helper tool for digital twin

;; interactive tester
;; route predefined
;; easy manual testing


;; choose the library for http requests
;; should be simple one


;; api given to user to play with digital twin api





(defn GET-entity-route 
  ([entity-id] 
    (str "/api/entities/" entity-id))
  ([entity-id entity-pk]
    (str "/api/entities" entity-id "?pk=" entity-pk)))



(comment
  (GET-entity-route "id_1_test_qa"))










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





















(take 2 [1 2 3 4 5])
(take-nth 3 [1 2 3 4 5])
(take-while even? [0 1 2 3 4 5])

(drop 2 [1 2 3 4 5])
(drop-nth)
(drop-while even? [0 1 2 3 4 5])
(drop-while (fn [x] (< x 5)) [0 1 2 3 4 5])

(defn less-than-five? [x]
  (< x 5))

(drop-while less-than-five? [0 1 2 3 4 5])
(drop-while less-than-five? [0 1 1 2 2 1 10 2 3 4 5 6])
(take-while less-than-five? [0 1 1 2 2 1 10 2 3 4 5 6])
(take-while less-than-five?)

(into [] (comp (take-while (fn [x] (not= x 3)))
               (drop-while (fn [x] (not= x 10)))) 
          [0 1 1 2 2 1 10 2 3 4 5 6])

(time
  (into [] (comp (take-while (fn [x] (not= x 3)))
               (drop-while (fn [x] (not= x 10)))) 
          [0 1 1 2 2 1 10 2 3 4 5 6]))

(keep (fn [x] (if (>= x 5) x))
      [0 1 2 3 4 5 6 7 8 9])


(time)
(time (even? 2))


(defn time-str [expr]
  (with-out-str (time expr)))

(defn time-value [expr]
  (Double/parseDouble
  ((clojure.string/split 
  ((clojure.string/split (time-str expr) #": ") 1)
  #" msec") 0)))

(time-value (= 3 3))

(defn time-transducer []
  (time-value
    (into [] (comp (take-while (fn [x] (not= x 3)))
                 (drop-while (fn [x] (not= x 10)))) 
            [0 1 1 2 2 1 10 2 3 4 5 6])))


(defn time-no-transducer []
  (time-value
    (vec
      (drop-while (fn [x] (not= x 10))
        (take-while (fn [x] (not= x 3))
          [0 1 1 2 2 1 10 2 3 4 5 6])))))



(time-transducer)
(time-no-transducer)

(defn transducer-better-than-no-transducer-of-ms []
  (- (time-no-transducer) (time-transducer)))

(transducer-better-than-no-transducer-of-ms)

(* (transducer-better-than-no-transducer-of-ms) 1000)

(defn transducer-better-than-no-transducer-of-us [_]
  (* (transducer-better-than-no-transducer-of-ms) 1000))

(transducer-better-than-no-transducer-of-us 1)



(defn average [coll] 
  (/ (reduce + coll) (count coll)))

(average [1 2 3 4 5 6])

(average
  (map transducer-better-than-no-transducer-of-us
    (range 100000)))





(into [] (comp (take-while #(not= % 3))
               (drop-while #(not= % 10)))
          [0 1 1 2 2 1 10 2 3 4 5 6])






;;scrapping
;get all likes made on les.confitures.de.valerie profile


; posts-urls -> post-likes -> total-likes


(def url "https://www.instagram.com/les.confitures.de.valerie/")
(def html (slurp url))

html
(count html)

(str/split "la la" #" ")

(def html-lines (str/split-lines html))

;;filter non href tags

(defn contains-href-tag? [str]
  (str/includes? str "href"))

(def href-lines (filter contains-href-tag? html-lines))

href-lines
(clojure.pprint/pprint href-lines)
(clojure.pprint/pprint html-lines)

;; remove link tags

(filter (fn [str] (str/includes? str "tabindex"))
  href-lines)


(def href-tags
  str/split html )
;; all href
;; all href="/p/

(defn str-between [str]
  )


(def post-1-url "https://www.instagram.com/p/Cf9olzaoxOt/")
(def post-2-url "https://www.instagram.com/p/CftXr1PoOCY/")


(def post-1-likes 4)
(def post-2-likes 8)


(def total-likes 12)


;; interesting : commenters
;; top-commenters + graph with number of comments (root)
;; [["helenebrehier" 4] ["bebou.8_3"]]


;; interesting : likers



;; transduce
;; = transducer + reduce

(def xf (comp (filter odd?) (map inc)))

(range 5)
(filter odd? (range 5))
(map inc [1 3])
(sequence xf (range 5))

(def n 15)
(transduce xf + (range 15))
(reduce + (sequence xf (range 15)))

(reduce + [2 4])

(dedupe [0 0 0 0 1 1 2 1 2 11 "11" "11" "11"])