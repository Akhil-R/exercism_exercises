def square(number):
    if number<1 or number>64:
        # when the square value is not in the acceptable range        
        raise ValueError("square must be between 1 and 64")
    if number==1:
        return 1
    return 2*square(number-1)


def total():
    total_grains=0
    for i in range(1,65):
        total_grains+=square(i)
    return total_grains
