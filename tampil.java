public class tampil {
        public static void main(String[] args) {
        
        method m = new method();    
        Rumah r = new Rumah();
        sekolah s = new sekolah();
        umur u = new umur();
        datadiri d = new datadiri();
        BerangkatKeSekolah b = new BerangkatKeSekolah();
        
        System.out.println("===NAMA===");
        m.sayHello();
        m.showName("Hanif");
        System.out.println("===DATA RUMAH===");
        r.tampillokasi();
        r.tampilukuran(13,8);
        System.out.println("===DATA SEKOLAH===");
        s.tampilNama("SMK TELKOM SANDHY PUTRA MALANG");
        s.jumlahSiswa(26, 9);
        System.out.println("===UMUR===");
        u.umur(17);
        System.out.println("===DATA DIRI===");
        d.kelahiran("KOTA MALANG RAYA TERCINTA");
        d.tanggalLahir("15 OKTOBER 2007");
        System.out.println("===BERANGKAT KE SEKOLAH===");
        b.Transportasi();
        b.Kendaraan();
    
    }
    public void sayHello(){
        System.out.println("Hello everyone");
    }
    public void showName(String nama){
        String name = "Hanif";
        System.out.println("Halo, nama saya " + name);
    }
    public void tampillokasi(){
        String Alamat ="Malang";
        System.out.println("lokasi rumah: " + Alamat);
    }
    public void tampilukuran(int panjang, int lebar){
        int luas = panjang*lebar;
        System.out.println("luas: "+ luas);
    }
    public void tampilNama(String nama){
        System.out.println("saya bersekolah di: "+ nama);
    }
    public void jumlahSiswa(int rombel, int jumlahSiswa){
        int total= rombel*jumlahSiswa;
        System.out.println("jumlah siswa: " + total);
    }
    public void umur(int umur){
        System.out.println("umur: "+ umur);
    }
    public void kelahiran(String kelahiran){
        System.out.println("lahir di: " + kelahiran);
    }
    public void tanggallahir(String lahir){
        System.out.println("tanggal: " + lahir);
    }
    public void Transportasi(){
        String Transportasi ="Berangkat Sendiri";
        System.out.println("Trabsportasi: " + Transportasi);
    }
    public void Kendaraan(){
        String Kendaraan ="Motor";
        System.out.println("Kendaraan: " + Kendaraan);
    }

}
