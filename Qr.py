import qrcode

# 1. Define your data list (Name, URL)
links_to_generate = [
    ("Google", "https://google.com"),
    ("GitHub", "https://github.com"),
    ("Python", "https://python.org")
]

# 2. Loop through the list and create files
for name, url in links_to_generate:
    qr = qrcode.QRCode(version=1, box_size=10, border=4)
    qr.add_data(url)
    qr.make(fit=True)
    
    # Save each with a unique file name
    img = qr.make_image(fill_color="black", back_color="white")
    filename = f"{name.lower()}_qr.png"
    img.show(filename)
    print(f"Saved: {filename}")
