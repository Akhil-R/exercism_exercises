def square(number):
    if number<1 or number>64:
        # when the square value is not in the acceptable range        
        raise ValueError("square must be between 1 and 64")
    # 1=2^0 ,2=2^1, 4=2^2,.. ie;square(n)=2^(n-1)    
    return 2**(number-1)


def total():
    #total_grains=2^0+2^1+..+2^63
    #it is a geometric series
    # Sn=a+ar+ar^2+..  for n terms is a(r^n-1)/(r-1)
    #a=1 r=2,n=64
    #Sn=(2^64-1)
    total_grains=(2**64)-1
    return total_grains
