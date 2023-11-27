import random
def random_multiplier():
    if random.random()<0.8:
        return random.uniform(1.2,5)
    else:
        return random.uniform(5,30)
    
def random_number():
    if random.random()<0.6:
        return random.randint(1,15)
    else:
        return random.randint(15,30)
    
multiplier=random_multiplier()
number=random_number()
print(f"Random Multiplier:{multiplier} \n Random Number: {number}")
