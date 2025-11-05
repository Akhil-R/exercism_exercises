def is_isogram(string):
    cleaned = [ch.lower() for ch in string if ch.isalpha()]
    # Compare the length of the cleaned list to the length of the set of cleaned characters
    # If lengths are equal, there are no duplicates — it's an isogram
    return len(cleaned) == len(set(cleaned))
