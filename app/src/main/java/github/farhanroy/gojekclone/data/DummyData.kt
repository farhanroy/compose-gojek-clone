package github.farhanroy.gojekclone.data

data class ContentForYou(
    val id: Int,
    val title: String,
    val shortDesc: String,
    val imageUrl: String,
    val type: String
)
object DummyData {
    val listContent = listOf(
        ContentForYou(
            id = 1,
            title = "Layanan GoMart Kini Hadir di Kotamu!",
            shortDesc = "Setelah sukses melayani banyak kota di Indonesia, kini GoMart telah hadir dan siap melayani warga",
            imageUrl = "https://lelogama.go-jek.com/cache/37/e4/37e46f5933cf70b08d64d8a35ec6ddf5.webp",
            type = "Jelajah"
        ),
        ContentForYou(
            id = 2,
            title = "Category Ad di GoFood, Solusi Iklan Ciamik yang Sayang Dilewatkan",
            shortDesc = "Ingin tahu lebih dalam tentang Category Ad? Yuk, simak lebih mendalam di sini.",
            imageUrl = "https://lelogama.go-jek.com/cache/b3/30/b330d01e1df466924c5ec8b16c725463.webp",
            type = "Data"
        ),
        ContentForYou(
            id = 3,
            title = "Promo The Coffee Bean & Tea Leaf: Cashback Rp15.000",
            shortDesc = "Mau ngopi atau ngeteh? Nikmati promo The Coffee Bean & Tea Leaf berupa cashback Rp15.000 khusus",
            imageUrl = "https://lelogama.go-jek.com/cache/30/95/3095b1efd58a3ba2b40809cb66f21a50.webp",
            type = "Promo"
        ),
        ContentForYou(
            id = 4,
            title = "5 Rekomendasi Drama dan Anime Terbaik Wajib Tonton 2021 di iQIYI",
            shortDesc = "Lagi cari drama Asia populer atau anime yang lagi hits buat nikmatin waktu santaimu? Kamu bisa...",
            imageUrl = "https://lelogama.go-jek.com/cache/d0/28/d0283c51e3a01b62b902007ff9604f9a.webp",
            type = "Film"
        ),
        ContentForYou(
            id = 5,
            title = "Inspirasi Menu Masakan Bulan Puasa: Cappucino Cincau",
            shortDesc = "Resep cappucino cincau tak hanya mudah dibuat dan lezat, semua bahan-bahan yang diperlukan untuk...",
            imageUrl = "https://lelogama.go-jek.com/cache/41/d9/41d96be19db708906450b41c584ee9c4.webp",
            type = "Inspirasi"
        ),
        ContentForYou(
            id = 6,
            title = "5 Rekomendasi Drama Korea Terbaik Wajib Tonton di Bulan Ramadan",
            shortDesc = "Lagi di rumah dan bingung mau ngapain? Ini saatnya kamu maraton nonton drama Korea, yang udah lama...",
            imageUrl = "https://lelogama.go-jek.com/cache/a1/2b/a12bc84bdbb2ec436402fcab68d40fc3.webp",
            type = "Ulasan"
        ),
        ContentForYou(
            id = 7,
            title = "Pulang Malam Nyaman, Sampai Rumah #AmanBersamaGojek",
            shortDesc = "Kami berkomitmen untuk memastikan keamanan terutama bagi kaum perempuan yang berpergian di malam...",
            imageUrl = "https://lelogama.go-jek.com/cache/ca/d5/cad51c6222cefd8a8e76bb74ea35f0c2.webp",
            type = "Teknis"
        ),
    )
}