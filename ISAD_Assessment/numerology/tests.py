from index import calculate_life_path_number, get_lucky_colour

def test_calculate_life_path_number():
    test_cases = [
        (15, 8, 1992, 8, "TC1"),
        (29, 12, 1988, 22, "TC2"),
        (25, 10, 1994, 4, "TC3")
    ]
    
    for day, month, year, expected, tc_id in test_cases:
        result = calculate_life_path_number(day, month, year)
        if result == expected:
            print(f"{tc_id}: Expected {expected}, Received {result} - Result Pass")
        else:
            print(f"{tc_id}: Expected {expected}, Received {result} - Result Fail")

def test_get_lucky_colour():
    
    test_cases = [
        (11, "Silver", "TC1"),
        (22, "White", "TC2"),
        (9, "Gold", "TC3"),
        (4, "Green", "TC4"),
        (33, "Crimson", "TC5"),
        (10, "Unknown", "TC6")
    ]
    
    for number, expected_color, tc_id in test_cases:
        result = get_lucky_colour(number)
        if result == expected_color:
            print(f"{tc_id}: Expected {expected_color}, Received {result} - Result Pass")
        else:
            print(f"{tc_id}: Expected {expected_color}, Received {result} - Result Fail")

if __name__ == "__main__":
    test_calculate_life_path_number()
    test_get_lucky_colour()

