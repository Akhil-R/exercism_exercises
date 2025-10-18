def square(number):
    if number<1 or number>64:
        # when the square value is not in the acceptable range        
        raise ValueError("square must be between 1 and 64")
    # 1=2^0 ,2=2^1, 4=2^2,.. ie;square(n)=2^(n-1)    
    return pow(2,number-1)


def total():
    total_grains=0
    for i in range(1,65):
        total_grains+=square(i)
    return total_grains
