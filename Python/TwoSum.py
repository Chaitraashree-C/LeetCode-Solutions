def two_sum(nums, target):

    num_map = {}

    for i, num in enumerate(nums):

        complement = target - num

        if complement in num_map:

            return [num_map[complement], i]

        num_map[num] = i


nums = list(map(int, input().split()))

target = int(input())

print(two_sum(nums, target))