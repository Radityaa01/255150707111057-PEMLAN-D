import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashMap;

public class FormDaftarUlang extends JFrame implements ActionListener {
    private JTextField tfNama, tfTanggal, tfNoPendaftaran, tfNoTelp, tfAlamat, tfEmail;
    private JButton btnSubmit;

    public FormDaftarUlang() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(400, 400);
        setLayout(new GridLayout(7, 2, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Label dan TextField
        add(new JLabel("Nama Lengkap"));
        tfNama = new JTextField();
        add(tfNama);

        add(new JLabel("Tanggal Lahir"));
        tfTanggal = new JTextField();
        add(tfTanggal);

        add(new JLabel("No. Pendaftaran"));
        tfNoPendaftaran = new JTextField();
        add(tfNoPendaftaran);

        add(new JLabel("No. Telp"));
        tfNoTelp = new JTextField();
        add(tfNoTelp);

        add(new JLabel("Alamat"));
        tfAlamat = new JTextField();
        add(tfAlamat);

        add(new JLabel("E-mail"));
        tfEmail = new JTextField();
        add(tfEmail);

        btnSubmit = new JButton("Submit");
        add(new JLabel()); // kosong untuk layout
        add(btnSubmit);

        btnSubmit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Validasi semua kolom harus terisi
        if (tfNama.getText().trim().isEmpty() || tfTanggal.getText().trim().isEmpty() ||
            tfNoPendaftaran.getText().trim().isEmpty() || tfNoTelp.getText().trim().isEmpty() ||
            tfAlamat.getText().trim().isEmpty() || tfEmail.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Konfirmasi
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin data yang Anda isi sudah benar?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            // Simpan data ke map agar bisa rata titik dua
            LinkedHashMap<String, String> dataMap = new LinkedHashMap<>();
            dataMap.put("Nama", tfNama.getText());
            dataMap.put("Tanggal Lahir", tfTanggal.getText());
            dataMap.put("No. Pendaftaran", tfNoPendaftaran.getText());
            dataMap.put("No. Telp", tfNoTelp.getText());
            dataMap.put("Alamat", tfAlamat.getText());
            dataMap.put("E-mail", tfEmail.getText());

            // Cari panjang label terpanjang
            int maxLen = 0;
            for (String key : dataMap.keySet()) {
                if (key.length() > maxLen) maxLen = key.length();
            }

            // Buat jendela baru untuk menampilkan data
            JFrame frameData = new JFrame("Data Mahasiswa");
            frameData.setSize(400, 300);
            JTextArea taData = new JTextArea();
            taData.setFont(new Font("Monospaced", Font.PLAIN, 12));
            taData.setEditable(false);

            for (String key : dataMap.keySet()) {
                String padded = String.format("%-" + maxLen + "s", key);
                taData.append(padded + " : " + dataMap.get(key) + "\n");
            }

            frameData.add(new JScrollPane(taData));
            frameData.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new FormDaftarUlang().setVisible(true);
    }
}
