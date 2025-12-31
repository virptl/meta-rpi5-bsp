# meta-rpi5-bsp

A minimal, production-style **Yocto BSP layer for Raspberry Pi 5**, focused on
boot correctness, reproducibility, and clear documentation.

## Project Goal

This layer provides a clean reference BSP for Raspberry Pi 5 with:

- A custom machine configuration
- Reliable UART and HDMI console support
- A debug-friendly image for bring-up
- Clear documentation of the Raspberry Pi boot flow

The emphasis is on **stability and clarity**, not feature breadth.

## Scope (v1)

Included:
- Custom Yocto BSP layer
- Custom Raspberry Pi 5 machine configuration
- Serial and HDMI console support
- Debug-oriented image
- WIC-based SD card images
- Documented boot chain

Explicitly excluded from v1:
- OTA updates
- Secure boot
- GUI / graphics stack
- Wi-Fi/Bluetooth tuning
- U-Boot or kernel heavy patching

## Layer Status

**Current state:**  
Layer skeleton initialized.  
Machine configuration and image recipes are under active development.

This repository is intended to evolve incrementally with tagged milestones.

## Compatible Yocto Releases

Targeted against:
- poky (recent LTS)
- meta-raspberrypi

Exact versions will be documented once v1 is finalized.

## License

MIT (see COPYING.MIT)

