def contains_duplicate(nums):

    seen = set()

    for num in nums:

        if num in seen:

            return True
        
        seen.add(num)

    return False

nums = list(map(int, input().split()))

print(contains_duplicate(nums))