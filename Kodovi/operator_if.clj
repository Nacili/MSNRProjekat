(if true
    "If grana"
    "Else grana")
;; => "If grana"

(if true
    (do (println "Marko")
        "Petar"))
;; Marko
;; => "Petar"

(if nil
    "Nece biti povratna vrednost"
    "Povratna vrednost")
;; => "Povratna vrednost"