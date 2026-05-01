import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashMap;

public class MainAWT extends Frame implements ActionListener {

    private CheckboxGroup group;
    private Checkbox cbASD, cbPemlan, cbMatkomlan, cbProbstat;
    private TextField tfTugas, tfKuis, tfUTS, tfUAS, tfHasil;
    private TextArea  taSemua;
    private Button    btnHitung, btnTampil;
    private LinkedHashMap<String, Double> nilaiAkhirMap;

    public MainAWT() {
        setTitle("Hitung Nilai Akhir dengan GUI...");
        setSize(500, 480);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 6));

        // --- Judul ---
        Label lblJudul = new Label("Hitung Nilai Akhir");
        lblJudul.setFont(new Font("Dialog", Font.BOLD, 16));
        add(lblJudul);

         // --- Radio button mata kuliah ---
        group       = new CheckboxGroup();
        cbASD       = new Checkbox("ASD",       group, false);
        cbPemlan    = new Checkbox("Pemlan",    group, true);
        cbMatkomlan = new Checkbox("Matkomlan", group, false);
        cbProbstat  = new Checkbox("Probstat",  group, false);

        add(cbASD);
        add(cbPemlan);
        add(cbMatkomlan);
        add(cbProbstat);

        // --- Field input nilai ---
        tfTugas = new TextField(7);
        tfKuis  = new TextField(7);
        tfUTS   = new TextField(7);
        tfUAS   = new TextField(7);
        tfHasil = new TextField(10);
        tfHasil.setEditable(false);

         add(new Label("Tugas :")); add(tfTugas);
        add(new Label("Kuis  :")); add(tfKuis);
        add(new Label("UTS   :")); add(tfUTS);
        add(new Label("UAS   :")); add(tfUAS);
        add(new Label("Hasil :")); add(tfHasil);

        // --- Tombol Hitung ---
        btnHitung = new Button("Hitung");
        add(btnHitung);

        // --- TextArea hasil semua matkul ---
        taSemua = new TextArea(8, 42);
        taSemua.setEditable(false);
        taSemua.setFont(new Font("Monospaced", Font.PLAIN, 12));
        taSemua.setText("HASIL NILAI SEMUA MATA KULIAH\n");
        add(taSemua);

        // --- Tombol Tampilkan semua ---
        btnTampil = new Button("Tampilkan nilai semua matkul");
        add(btnTampil);

        // --- Map penyimpan nilai ---
        nilaiAkhirMap = new LinkedHashMap<>();

        // --- Event listener ---
        btnHitung.addActionListener(this);
        btnTampil.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnHitung) {
            try {
                double tugas = Double.parseDouble(tfTugas.getText().trim());
                double kuis  = Double.parseDouble(tfKuis.getText().trim());
                double uts   = Double.parseDouble(tfUTS.getText().trim());
                double uas   = Double.parseDouble(tfUAS.getText().trim());

                MataKuliah mk     = null;
                String namaMatkul = "";

                if      (cbASD.getState())       { mk = new ASD();       namaMatkul = "ASD"; }
                else if (cbPemlan.getState())    { mk = new Pemlan();    namaMatkul = "Pemlan"; }
                else if (cbMatkomlan.getState()) { mk = new Matkomlan(); namaMatkul = "Matkomlan"; }
                else if (cbProbstat.getState())  { mk = new Probstat();  namaMatkul = "Probstat"; }

                if (mk != null) {
                    mk.setNilai(tugas, kuis, uts, uas);
                    double hasil = mk.hitungNilaiAkhir();
                    tfHasil.setText(String.format("%.1f", hasil));
                    nilaiAkhirMap.put(namaMatkul, hasil);
                }
            } catch (NumberFormatException ex) {
                tfHasil.setText("Error");
            }

        } else if (e.getSource() == btnTampil) {
            // Cari panjang nama matkul terpanjang agar titik dua sejajar/rata
            int maxLen = 0;
            for (String matkul : nilaiAkhirMap.keySet()) {
                if (matkul.length() > maxLen) maxLen = matkul.length();
            }

            taSemua.setText("HASIL NILAI SEMUA MATA KULIAH\n");
            for (String matkul : nilaiAkhirMap.keySet()) {
                // Pad nama dengan spasi di kanan agar posisi titik dua sejajar
                String padded = String.format("%-" + maxLen + "s", matkul);
                taSemua.append(padded + " : " + String.format("%.1f", nilaiAkhirMap.get(matkul)) + "\n");
            }
        }
    }

    public static void main(String[] args) {
        new MainAWT().setVisible(true);
    }
}