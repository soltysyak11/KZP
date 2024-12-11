# math_module.py
import math
import pickle
import os

# Обчислення виразу y = 1 / cos(4x)
def calculate_expression(x):
    try:
        cos_value = math.cos(4 * x)
        if abs(cos_value) < 1e-10:  # Перевірка, якщо cos(4x) дуже близький до нуля
            raise ZeroDivisionError("ZeroDivisionError")
        y = 1 / cos_value
        return y
    except ZeroDivisionError as e:
        return e

# Запис результатів у текстовий файл
def write_to_text_file(filename, results, errors):
    try:
        with open(filename, 'w') as file:
            for x, y in results:
                file.write(f"x: {x}, y: {y}\n")
            for x, error in errors:
                file.write(f"{error}\n")
    except IOError as e:
        print(f"Помилка запису у текстовий файл: {e}")

# Читання з текстового файлу
def read_from_text_file(filename):
    try:
        if os.path.exists(filename):
            with open(filename, 'r') as file:
                data = file.readlines()
            return data
        else:
            raise FileNotFoundError(f"Файл {filename} не знайдено.")
    except FileNotFoundError as e:
        print(e)
        return []
    except IOError as e:
        print(f"Помилка читання з текстового файлу: {e}")
        return []

# Запис результатів у двійковий файл
def write_to_binary_file(filename, results):
    try:
        with open(filename, 'wb') as file:
            pickle.dump(results, file)
    except IOError as e:
        print(f"Помилка запису у двійковий файл: {e}")

# Читання з двійкового файлу
def read_from_binary_file(filename):
    try:
        if os.path.exists(filename):
            with open(filename, 'rb') as file:
                data = pickle.load(file)
            return data
        else:
            raise FileNotFoundError(f"Файл {filename} не знайдено.")
    except FileNotFoundError as e:
        print(e)
        return []
    except (IOError, pickle.PickleError) as e:
        print(f"Помилка читання з двійкового файлу: {e}")
        return []

if __name__ == "__main__":
    try:
        # Введення значень x з клавіатури
        x_values = []
        n = int(input("Введіть кількість значень x: "))
        for i in range(n):
            x = float(input(f"Введіть значення x[{i+1}]: "))
            x_values.append(x)
        
        results = []
        errors = []

        # Обчислюємо значення y для кожного x і зберігаємо результат або помилку
        for x in x_values:
            y = calculate_expression(x)
            if isinstance(y, ZeroDivisionError):
                errors.append((x, y))
                print("ZeroDivisionError")
            else:
                results.append((x, y))

        # Записуємо результати і помилки у текстовий файл
        write_to_text_file("results.txt", results, errors)
        print("Результати та помилки записано у текстовий файл 'results.txt'")

        # Читаємо результати з текстового файлу
        text_data = read_from_text_file("results.txt")
        print("Дані з текстового файлу:")
        print(''.join(text_data))

        # Записуємо результати у двійковий файл (тільки успішні обчислення)
        write_to_binary_file("results.bin", results)
        print("Результати записано у двійковий файл 'results.bin'")

        # Читаємо результати з двійкового файлу
        binary_data = read_from_binary_file("results.bin")
        print("Дані з двійкового файлу:")
        print(binary_data)
    except ValueError as e:
        print(f"Помилка введення: {e}")
    except Exception as e:
        print(f"Невідома помилка: {e}")
