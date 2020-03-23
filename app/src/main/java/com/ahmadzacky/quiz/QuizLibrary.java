package com.ahmadzacky.quiz;

public class QuizLibrary {

    private int[] mImages = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10
    };

    public static String[] mQuestions = {
            "Arti dari Ar-Rahman adalah...",
            "Arti dari Ar-Rahim adalah...",
            "Arti dari Al-Malik adalah...",
            "Arti dari Al-Quddus adalah...",
            "Arti dari As-Salam adalah...",
            "Arti dari Al-Mu'min adalah...",
            "Arti dari Al-Muhaymin adalah...",
            "Arti dari Al-Aziiz adalah...",
            "Arti dari Al-Jabbar adalah...",
            "Arti dari Al-Mutakabbir adalah..."

    };

    private String mChoices [][] = {
            {"Yang Maha Pengasih", "Yang Maha Pencipta", "Yang Maha Melepaskan", "Yang Maha Membentuk Rupa"},
            {"Yang Maha Pengampun", "Yang Maha Penyayang", "Yang Maha Memaksa", "Yang Maha Pemberi Karunia"},
            {"Yang Maha Pemberi Rezeki","Yang Maha Pembuka Rahmat","Yang Maha Mengetahui","Yang Maha Merajai"},
            {"Yang Maha Menyempitkan", "Yang Maha Melapangkan", "Yang Maha Suci", "Yang Maha Merendahkan"},
            {"Yang Maha Meninggikan","Yang Maha Memberi Kesejahteraan","Yang Maha Memuliakan","Yang Maha Menghinakan"},
            {"Yang Maha Mendengar","Yang Maha Melihat","Yang Maha Memberi Keamanan","Yang Maha Menetapkan"},
            {"Yang Maha Pemelihara","Yang Maha Adil","Yang Maha Lembut","Yang Maha Mengenal"},
            {"Yang Maha Penyantun","Yang Maha Agung","Yang Maha Pengampun","Yang Maha Perkasa"},
            {"Yang Maha Pembalas Budi","Yang Maha Gagah","Yang Maha Tinggi","Yang Maha Besar"},
            {"Yang Maha Memelihara","Yang Maha Pemberi Kecukupan","Yang Maha Megah","Yang Maha Membuat Perhitungan"},
    };

    private String mCorrectAnswers [] = {"Yang Maha Pengasih", "Yang Maha Penyayang", "Yang Maha Merajai", "Yang Maha Suci" ,"Yang Maha Memberi Kesejahteraan", "Yang Maha Memberi Keamanan", "Yang Maha Pemelihara", "Yang Maha Perkasa", "Yang Maha Gagah", "Yang Maha Megah"};

    public int getImages(int a){
        int image = mImages[a];
        return image;
    }

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice0(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice1(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice2(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice3(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer (int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
