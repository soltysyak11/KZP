# Модуль, що генерує зубчатий список з заштрихованими областями квадратної матриці

def generate_matrix(size, fill_char):
    # Перевірка чи розмір матриці є додатнім
    if size <= 0:
        raise ValueError("Розмір матриці має бути додатнім цілим числом.")
    
    # Ініціалізація матриці порожніми рядками
    matrix = [[' ' for _ in range(size)] for _ in range(size)]

    # Заповнення заштрихованих областей
    for i in range(size):
        for j in range(size):
            # Заповнення заштрихованих трикутників
            if (i >= j and i + j < size) or (i <= j and i + j >= size - 1):
                matrix[i][j] = fill_char

    return matrix


def print_matrix(matrix):
    # Вивід матриці на екран
    for row in matrix:
        print(''.join(row))


def main():
    try:
        # Зчитування розміру матриці з клавіатури
        size = input("Введіть розмір квадратної матриці: ")
        if not size.isdigit() or int(size) <= 0:
            raise ValueError("Розмір матриці має бути додатнім цілим числом.")
        size = int(size)
        
        # Зчитування символу-заповнювача з клавіатури
        fill_char = input("Введіть символ-заповнювач: ")

        # Перевірка, щоб було введено лише один символ
        if len(fill_char) != 1:
            raise ValueError("Необхідно ввести лише один символ для заповнення.")

        # Генерація та вивід матриці
        matrix = generate_matrix(size, fill_char)
        print_matrix(matrix)
    
    except ValueError as e:
        # Вивід повідомлення про помилку у випадку некоректного вводу
        print(f"Помилка: {e}")


if __name__ == "__main__":
    main()


    