# Web-Services-REST
Rest service to convert arabic digits to roman and binary

Punkt dostępowy
Punkt dostępowy API znajduje się pod adresem:
http://localhost:8080/convert


Parametry wejściowe
type: rodzaj konwersji, możliwe opcje "roman", "binary".
value: liczba całkowita z zakresu (0,3999] dla liczby rzymskiej i z zakresu (0,+∞) dla liczby binarnej.


Przykłady uruchomienia
Aby otrzymać liczbę rzymską z liczby 110 należy ustawić wartość parametru type jako roman oraz value jako 110
http://localhost:8080/convert?type=roman&value=110
 
Aby otrzymać liczbę binarną z liczby 2020 należy ustawić wartość parametru type jako binary oraz value jako 2020
http://localhost:8080/convert?type=roman&value=2020


Częściowe odpowiedzi
Wielkość liter np. Binary, binary, BINARY nie ma znaczenia.
Podanie błędnego typu czy wartości value jest wykrywane przez algorytm, przy czym zwracany jest odpowiedni komunikat.
Odświeżenie stron przeglądarki powoduje ponowne wywołanie kodu.


Uruchomienie
Należy otworzyć katalog "NumberConventer-serwis", następnie uruchomić plik "NC-1.0.0-SNAPSHOT.jar".

Następnie otworzyć w przeglądarce internetowej link "http://localhost:8080/convert?type=roman&value=3331" 

Typ konwersji zmienia się wstawiając odpowiednio słowo roman/binary dla liczb rzymskich/binarnych w wartości type= oraz zadaną wartość dla value=
