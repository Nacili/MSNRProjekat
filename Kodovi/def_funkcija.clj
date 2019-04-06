(defn zdravo
    "Vraca se \"Zdravo \" i nadovezuje ime"
    [ime]
    (str "Zdravo " ime "!"))

(hello "svete")
; => "Zdravo svete!"

(defn zdravo_svima
    [& ljudi]
    (map zdravo ljudi))

(zdravo_svima "Ana" "Marija" "Luka")
; => ("Zdravo Ana!" "Zdravo Marija!" "Zdravo Luka!")