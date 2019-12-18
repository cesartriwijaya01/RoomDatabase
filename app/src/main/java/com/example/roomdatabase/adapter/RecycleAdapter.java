public class RecyclerViewAdapter extends RecyclerView.Adapter{

    private ArrayList namaList; //Digunakan untuk Nama
    private ArrayList jurusanList; //Digunakan untuk Jurusan
    private ArrayList nimList; //Digunakan untuk Jurusan
    private Context context; //Membuat Variable Context

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList namaList, ArrayList jurusanList, ArrayList nimList){
        this.namaList = namaList;
        this.jurusanList = jurusanList;
        this.nimList = nimList;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView Nama, Jurusan, Nim;
        private ImageButton Overflow;

        ViewHolder(View itemView) {
            super(itemView);

            //Mendapatkan Context dari itemView yang terhubung dengan Activity ViewData
            context = itemView.getContext();

            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Nama = itemView.findViewById(R.id.name);
            Jurusan = itemView.findViewById(R.id.jurusan);
            Overflow = itemView.findViewById(R.id.overflow);
            Nim = itemView.findViewById(R.id.NIM);
        }
    }