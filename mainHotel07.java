package jobsheet6;

public class mainHotel07 {

        public static void main(String[] args) {
        
            HotelService07 list = new HotelService07();
            Hotel07 H1 = new Hotel07("Queen City", "Surabaya", 150000, (byte)1);
            Hotel07 H2 = new Hotel07("Forty Choice", "Malang", 300000, (byte)2);
            Hotel07 H3 = new Hotel07("Golden Horizon Inn", "Jakarta", 400000, (byte)3);
            Hotel07 H4 = new Hotel07("Moonlight Oasis Hotel", "Bandung", 600000, (byte)4);
            Hotel07 H5 = new Hotel07("Lux Hotel", "Jogja", 799000, (byte)4);
            Hotel07 H6 = new Hotel07("Azure Skyline Hotel", "Batu", 1250000, (byte)5);
            Hotel07 H7 = new Hotel07("Tranquil Vista Lodge Suite Hotel", "Surabaya", 3000000, (byte)5);
    
            list.tambah(H1);
            list.tambah(H2);
            list.tambah(H3);
            list.tambah(H4);
            list.tambah(H5);
            list.tambah(H6);
            list.tambah(H7);

    System.out.println("\n========================================================================================");
    System.out.println("Daftar Beberapa Hotel yang Mungkin Menarik Untuk Anda dengan Harga Terendah-Tertinggi : ");
    System.out.println("========================================================================================\n");
    list.bubbleSort();
    list.tampilAll();

    System.out.println("\n========================================================================================");
    System.out.println("Daftar Beberapa Hotel yang Mungkin Menarik Untuk Anda dengan Bintang Tertinggi-Terendah :    ");
    System.out.println("========================================================================================\n");
    list.selectionSort();
    list.tampilAll(); 
        }   
    }   
    
