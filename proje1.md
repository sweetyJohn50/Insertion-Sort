## İnsertion Sort

[22,27,16,2,18,6]

### Yukarıda verilen sayıları sort türüne göre sıralayınız.

**En küçük eleman bulunur ve ilk elemanla yeri değiştirilir. Her adım da bir diğer eleman geçerek aynı işlem sıralama doğru olana kadar uygulanır.**


_En küçük elemanımız 2 olduğu için ilk eleman ile yeri değiştirilir_




CEVAP:
1 --> [2|27,16,22,18,6]  

2 --> [2,6|16,22,18,27]

_Not: Üçüncü elemanımız ilk iki elemandan sonra en küçük olduğu için farklılık yapılmaz._

3 --> [2,6,16|22,18,27]

4 --> [2,6,16,18|22,27]

_Sıralama doğru olduğu zaman işlem durur_

Sonuç => [2,6,16,18,22,27]

---

2.Soru: Big-O Gösterimini yazınız.

CEVAP:

[n(n+1)]/2 = (n^2+n)/2 'den

Big O Notation : O(n^2)

---

3.Soru: Time Complexity -> 

Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer?

CEVAP: Sıralanan diziye bakıldığında aranan 18 elemanı ortada olduğu için **_Average Case_** kapsamına girer.

---

## Selection Sort

Soru: [7,3,5,8,2,9,4,15,6] Dizisinin Selection Sort'a göre ilk 4 adımı?

CEVAP:

1 --> [2|3,5,8,7,9,4,15,6]

_Not: ikinci eleman ikinci işlem de en küçük olduğundan işlem farklılığı olmaz ve diğer elemana geçilir._

2 --> [2,3|5,8,7,9,4,15,6]

3 --> [2,3,4|7,9,5,15,6]

4 --> [2,3,4,5,7,9,8,15,6]

---
## **_Hakan Çoban_**

<a href=www.patika.dev> Patika.dev </a>