def rotate(text, key):
    result = []
    for ch in text:
        if ch.isalpha():
            base = ord('A') if ch.isupper() else ord('a')
            shifted = chr((ord(ch)-base+key) % 26 + base)
            result.append(shifted)
        else:
            result.append(ch)
    return ''.join(result)
