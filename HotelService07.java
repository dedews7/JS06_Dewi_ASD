package jobsheet6;
public class HotelService07 {
  Hotel07 [] rooms = new Hotel07[7];
  int idx;

  void tambah(Hotel07 H){
    if(idx<rooms.length){
        rooms[idx] = H;
        idx++;
    }else{
        System.out.println("Data sudah penuh!");
    }
}

void tampilAll(){
    for(Hotel07 H : rooms){
        H.tampil();
        System.out.println("--------------------------------------");

    }
}

void bubbleSort(){
    for(int i=0; i<rooms.length-1; i++){
        for(int j=1; j<rooms.length-i; j++){
            if(rooms[j].harga < rooms[j-1].harga){

                Hotel07 tmp = rooms[j];
                rooms[j] = rooms[j-1];
                rooms[j-1] = tmp;
            }
        }
    }
}

void selectionSort(){
    for(int i = 0; i<rooms.length-1; i++){
        int idxMin = i;
        for(int j=i+1; j<rooms.length; j++){
            if(rooms[j].bintang > rooms[idxMin].bintang){
                idxMin = j;
            }
        }
        Hotel07 tmp = rooms[idxMin];
        rooms[idxMin] = rooms[i];
        rooms[i] = tmp;

    }
  }
}
