def move_zeroes(nums):

    non_zero_idx = 0

    for i in range(len(nums)):

        if nums[i] != 0:

            nums[non_zero_idx] = nums[i]

            non_zero_idx += 1

    for i in range(non_zero_idx, len(nums)):

        nums[i] = 0

    print(nums)

nums = list(map(int, input().split()))

move_zeroes(nums)