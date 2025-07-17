def max_subarray(nums):

    current_sum = nums[0]

    max_sum = nums[0]

    for i in range(len(nums)):

        current_sum = max(nums[i], current_sum + nums[i])

        max_sum = max(max_sum, current_sum)

    return max_sum

nums = list(map(int, input().split()))

print(max_subarray(nums))