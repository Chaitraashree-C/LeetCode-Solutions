def merge(m, n, nums1, nums2):

    p1 = m - 1

    p2 = n - 1

    p = m + n - 1

    while p1 >= 0 and p2 >= 0:

        if nums1[p1] > nums2[p2]:

            nums1[p] = nums1[p1]

            p1 -= 1

        else:

            nums1[p] = nums2[p2]

            p2 -= 1

        p -= 1

    while p2 >= 0:

        nums1[p] = nums2[p2]

        p2 -= 1

        p -= 1

    print(nums1)

m = int(input())

n = int(input())

nums1 = list(map(int, input().split()))

nums1 += [0] * n

nums2 = list(map(int, input().split()))

merge(m, n, nums1, nums2)