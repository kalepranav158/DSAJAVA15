
# 1. Read a file
def read_file(file_path):
    try:
        with open(file_path, 'r') as file:
            return file.read()
    except FileNotFoundError:
        return "File not found."

# 2. Count words in the text file
def count_words(file_path):
    try:
        with open(file_path, 'r') as file:
            text = file.read()
            words = text.split()
            return len(words)
    except FileNotFoundError:
        return "File not found."

# 3. Print the number of lines in the file
def count_lines(file_path):
    try:
        with open(file_path, 'r') as file:
            lines = file.readlines()
            return len(lines)
    except FileNotFoundError:
        return "File not found."

# 4. Append to the file
def append_to_file(file_path, content):
    try:
        with open(file_path, 'a') as file:
            file.write(content)
            return "Content appended successfully."
    except FileNotFoundError:
        return "File not found."

# 5. Copy contents from one file to another
def copy_file_contents(source_file, destination_file):
    try:
        with open(source_file, 'r') as src_file:
            content = src_file.read()
        with open(destination_file, 'w') as dest_file:
            dest_file.write(content)
        return "Content copied successfully."
    except FileNotFoundError:
        return "File not found."