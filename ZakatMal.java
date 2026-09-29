public class ZakatMal {
    public static void main(String[] args) {
        // Inisialisasi variabel
        long totalPenghasilan = 30000000L;
        long totalPengeluaran = 10000000L;
        long surplus = totalPenghasilan - totalPengeluaran;
        long nisab = 9916667L;

        String kategori;
        long zakat;

        // Perhitungan dan penentuan kategori
        if (surplus >= nisab) {
            kategori = "MUZAKKI";
            zakat = (long) (surplus * 0.025); // 2.5% dari surplus
        } else {
            kategori = "MUSTAHIK (MISKIN)";
            zakat = 0;
        }

        // Output dengan format rapi (titik dua sejajar)
        System.out.printf("%-18s: %d%n", "Total Penghasilan", totalPenghasilan);
        System.out.printf("%-18s: %d%n", "Total Pengeluaran", totalPengeluaran);
        System.out.printf("%-18s: %d%n", "Surplus", surplus);
        System.out.printf("%-18s: %d%n", "Nisab", nisab);
        System.out.printf("%-18s: %s%n", "Kategori", kategori);
        System.out.printf("%-18s: %d%n", "Zakat", zakat);
    }
}
