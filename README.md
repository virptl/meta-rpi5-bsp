# meta-rpi5-bsp

A minimal, production-style **Yocto BSP layer for Raspberry Pi 5**, focused on
boot correctness, reproducibility, and clear documentation.

## Project Goal

This layer provides a clean reference BSP for Raspberry Pi 5 with:

* A custom machine configuration
* Reliable UART and HDMI console support
* A debug-friendly image for bring-up
* Clear documentation of the Raspberry Pi boot flow

The emphasis is on **stability and clarity**, not feature breadth.

## Scope (v1)

### Included

* Custom Yocto BSP layer
* Custom Raspberry Pi 5 machine configuration
* Serial and HDMI console support
* Debug-oriented image
* WIC-based SD card images
* Basic Wi-Fi/Bluetooth connectivity
* Automated network configuration (DHCP)

### Explicitly Excluded from v1

* OTA updates
* Secure boot
* GUI / graphics stack
* Advanced RF tuning or compliance testing

## Network Configuration

The image is configured to attempt DHCP on `eth0` and `wlan0` automatically on boot.

### Wi-Fi Setup

To connect to Wi-Fi, the system expects a standard `wpa_supplicant.conf`.
Run the following on the target board (or create the file in the rootfs):

```bash
# Replace with your actual SSID and password
wpa_passphrase "YOUR_SSID" "YOUR_PASSWORD" >> /etc/wpa_supplicant.conf

# Restart the interface to connect immediately
ifdown wlan0 && ifup wlan0
```

## Layer Status

**Current state:**

* Layer skeleton initialized
* Machine configuration and image recipes are under active development

This repository is intended to evolve incrementally with tagged milestones.

## Compatible Yocto Releases

Targeted against:

* poky (recent LTS)
* meta-raspberrypi

Exact versions will be documented once v1 is finalized.

## License

MIT (see `COPYING.MIT`)

