import sys

nums = []

"""
A program to check for a given range of numbers, the count of numbers for which there is only odd divisors

Test case 
   Input
   
   2
   1 3
   1 6
   
   Output
   
   1
   2
"""

def factors(n):
    return [x for x in range(1, n + 1) if n % x == 0]


for l in sys.stdin.readlines()[1:]:
    a, b = map(int, l.split())
    nums = [x for x in range(a, b + 1)]
    odd_list = []
    for each_num in nums:
        factors_list = factors(each_num)
        print "factors_list for  ", each_num ," is " ,factors_list
        if len(factors_list) % 2 == 1:
        	odd_list.append(each_num)

    print len(odd_list)
