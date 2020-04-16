package com.pointer.pattern.creators.builder;

public class Computer {

    //required parameters
    private final String HDD;
    private final String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(String hdd, String ram) {
        HDD = hdd;
        RAM = ram;
    }

    //Builder Class
    public static class ComputerBuilder {

        private Computer computer;

        public ComputerBuilder(String hdd, String ram) {
           this.computer = new Computer(hdd, ram);
        }

        public ComputerBuilder withGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.computer.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder withBluetoothEnabled(boolean isBluetoothEnabled) {
            this.computer.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return this.computer;
        }
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}