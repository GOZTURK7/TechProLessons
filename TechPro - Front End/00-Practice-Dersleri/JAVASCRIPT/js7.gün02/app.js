//listeyi ul nin icine li olarak ekleyiniz
//sonra butona basilinca yeni eklenenler ile birlikte listeyi gosterelim
// sil e basilinca da sirayla sil denilen kisim silinecek ve en sonrada liste  bitti mesaji gosterilecek
const notlar = [
    "Kitap oku.",
    "Yürüyüşe çık.",
    "Daily'e katıl.",
    "Taskini bitir.",
  ];
  const liste = document.querySelector("#liste");
  let satir = "";
  for (not of notlar) {
    satir += ` <li>${not}</li>`;
  }
  liste.innerHTML = satir;
  let veri = document.querySelector("#yeni");
  document.querySelector("#ekle").addEventListener("click", () => {
    liste.innerHTML += `<li>${veri.value}</li>`;
    notlar.push(veri.value);
    sonuc(notlar);
    veri.value = "";
  });
  document.querySelector("#sil").addEventListener("click", () => {
    if (notlar.length == 0) {
      alert("Liste boşaldı.");
    } else {
      notlar.pop();
      liste.removeChild(liste.lastElementChild);
      sonuc(notlar);
    }
  });
  const sonuc = (eklenen) => {
    let listeUl = document.querySelector("#metin ul");
    let satir = "";

    for(not of eklenen){
        satir+= ` <li>${not}</li>`;
    }

    listeUl.innerHTML = satir;

  };

//   const sonuc = (eklenen) => {
//     document.querySelector(
//       "#metin ul"
//     ).innerHTML = `<li class= "list-group-item">${eklenen}</li>`;
//   };
  