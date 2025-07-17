def intersection(nums1, nums2):

    seen = set(nums1)

    result = set()

    for num in nums2:

        if num in seen:

            result.add(num)

    return list(result)

nums1 = list(map(int, input().split()))

nums2 = list(map(int, input().split()))

print(intersection(nums1, nums2))