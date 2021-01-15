def dups(nums):
    tr = nums[0]
    hr = nums[0]
    while True:
        tr = nums[tr]
        hr = nums[nums[hr]]
        if tr == hr:
            break

    ptr1 = nums[0]
    ptr2 = tr
    while ptr1 != ptr2:
        ptr1 = nums[ptr1]
        ptr2 = nums[ptr2]

    return ptr1


print(dups([3, 2, 1, 3, 2]))
