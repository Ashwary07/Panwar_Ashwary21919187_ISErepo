# this function sums the digits of a number
def sum_digits(number):
    
    total = 0
    while number > 0:
        total += number % 10
        number //= 10
    return total

# this function reduces a number to a single digit or Master Number.
def reduce_to_single_digit(number):

    while number > 9:
        if number in (11, 22, 33):
            break
        number = sum_digits(number)
    return number

# this function calculates the Life Path Number based on the provided day, month, and year
def calculate_life_path_number(day, month, year):
    
    day_sum = reduce_to_single_digit(day)
    month_sum = reduce_to_single_digit(month)
    year_sum = reduce_to_single_digit(year)
    return reduce_to_single_digit(day_sum + month_sum + year_sum)

# this function maps Life Path Numbers to their corresponding Lucky Colours
def get_lucky_colour(life_path_number):
    
    colours = {
        1: "Red", 2: "Orange", 3: "Yellow", 4: "Green",
        5: "Sky Blue", 6: "Indigo", 7: "Violet", 8: "Magenta",
        9: "Gold", 11: "Silver", 22: "White", 33: "Crimson"
    }
    return colours.get(life_path_number, "Unknown")

# this function determines the generation based on the birth year
def find_generation(year):
    
    if year < 1946:
        return "Silent Generation"
    elif year < 1965:
        return "Baby Boomers"
    elif year < 1980:
        return "Generation X"
    elif year < 1995:
        return "Millennials"
    elif year < 2010:
        return "Generation Z"
    else:
        return "Generation Alpha"

# main function to handle user input and display results.
def main():
   
    day = int(input("Enter your birth day (1-31): "))
    month = int(input("Enter your birth month (1-12): "))
    year = int(input("Enter your birth year (1901-2024): "))

    # doing validation of input dates
    if year < 1901 or year > 2024:
        print("Invalid year entered. Please enter a year between 1901 and 2024.")
        return

    life_path_number = calculate_life_path_number(day, month, year)
    lucky_colour = get_lucky_colour(life_path_number)
    generation = find_generation(year)

    print("Life Path Number:", life_path_number)
    print("Lucky Colour:", lucky_colour)
    print("Generation:", generation)

if __name__ == "__main__":
    main()
