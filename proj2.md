## Merge Sort

---

1.Soru: [16,21,11,8,12,22] Dizinin Sort aşamalarını yazınız.

**Dizin yarıya bölünerek tek eleman kalana kadar bölünmeye devam eder.**
**En sade halinden sonra ise sırayla küçükten büyüğe sıralanarak dizin tekrar toparlanır.**

> CEVAP:
>
> > 1 --> [16,21,11,8,12,22]

> > 2 --> [16,21,11] [8,12,22]

> > 3 --> [16,21] [11] [8,12] [22]

> > 4 --> [16] [21] [11] [8] [12] [22]

> > 5 --> [16,21] [8,11] [12,22]

> > 6 --> [8,11,16,21] [12,22]

SONUÇ:

> > 7 --> [8,11,12,16,21,22] 
---

2.Soru: Big-O Gösterimini yazınız.

> CEVAP:
>
> > 2^x=n -> logn=x
> > Big O Notation : O(nlogn)
---
 <a href="www.patika.dev"> Patika.dev </a>