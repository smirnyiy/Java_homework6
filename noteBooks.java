public class noteBooks {
    private String manufacturer;
    private String OS;
    private String model;
    private String ram;    
    private String hardDrive;
    private String video;
    
    
    
   

    public noteBooks(String manufacturer, String OS, String model, String ram, String hardDrive, String video) {
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.OS = OS;
        this.manufacturer = manufacturer;
        this.video = video;
        this.model = model;
        
    }

    public String getRam() {
        return this.ram;
    }

    

    public void setRam(String ram) {
        this.ram = ram;
    }
   

    public String getHardDrive() {
        return this.hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }
    

    public String getOS() {
        return this.OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof noteBooks)) {
    //         return false;
    //     }
    //     noteBooks noteBooks = (noteBooks) o;
    //     return Objects.equals(ram, noteBooks.ram) && Objects.equals(hardDrive, noteBooks.hardDrive) && Objects.equals(OS, noteBooks.OS) && Objects.equals(manufacturer, noteBooks.manufacturer) && Objects.equals(model, noteBooks.model);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(ram, hardDrive, OS, manufacturer, model);
    // }

    
    @Override
    public String toString() {
        return "{" +
            " manufacturer='" + getManufacturer() + "'" +
            ", OS='" + getOS() + "'" +
            ", model='" + getModel() + "'" +
            ", ram='" + getRam() + "'" +
            ", hardDrive='" + getHardDrive() + "'" +
            ", video='" + getVideo() + "'" +
            "}";
    }
    
}