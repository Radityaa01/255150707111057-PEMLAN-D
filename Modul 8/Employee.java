class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoice = 0;
        for (Invoice inv : invoices) {
            totalInvoice += inv.getPayableAmount();
        }
        return salaryPerMonth - totalInvoice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Data Karyawan ===\n");
        sb.append("No. Registrasi: ").append(registrationNumber).append("\n");
        sb.append("Nama: ").append(name).append("\n");
        sb.append("Gaji Bulanan: Rp").append(salaryPerMonth).append("\n\n");

        sb.append("=== Detail Belanjaan ===\n");
        for (Invoice inv : invoices) {
            sb.append(inv.toString()).append("\n");
        }

        sb.append("\nTotal gaji setelah dipotong belanja: Rp").append(getPayableAmount());
        return sb.toString();
    }
}