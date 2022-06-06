package com.example.patterns.builder;

// Simple class where I implemented builder pattern
public class NetworkInfo {
    private String address;
    private String port;

    public NetworkInfo(String address, String port) {
        this.address = address;
        this.port = port;
    }

    @Override
    public String toString() {
        return "NetworkInfo{" +
                "address='" + address + '\'' +
                ", port='" + port + '\'' +
                '}';
    }

    public static NetworkInfoBuilder builder() {
        return new NetworkInfoBuilder();
    }

    static class NetworkInfoBuilder {
        private String address;
        private String port;

        public NetworkInfoBuilder address(String address) {
            this.address = address;
            return this;
        }

        public NetworkInfoBuilder port(String port) {
            this.port = port;
            return this;
        }

        public NetworkInfo build() {
            return new NetworkInfo(this.address, this.port);
        }
    }
}

