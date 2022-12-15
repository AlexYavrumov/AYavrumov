# Задание номер 1

a = 5
b = 6

def is_square(one,two):
    result = one == two
    return result

def is_kvadrat(a, b):
    nabir_1 = is_square (a,b)
    nabir_2 = is_square (b,a)
    if nabir_1 and nabir_2:
        return "is kvadrat"
    return "is not"

print(is_kvadrat(a,b))
print(is_kvadrat(2,2))








# Задание номер 2

number_of_rains = [1, 2, 3, 15, 8, 13, 21, 7, 4, 30]

weather_conditions = []
def sunny_counter(expected_list: list):
    for value in number_of_rains:
        if value <= 5:
            weather_conditions.append("sunny")
        else:
            weather_conditions.append("rain") 
    return weather_conditions

print(sunny_counter(weather_conditions))
