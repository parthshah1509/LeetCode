from typing import List

def ArrayJourney(k: int, path: List[int]) -> int:
    steps = [0] * k
    for i in reversed(range(len(path))):
        curr_step = path[i] + max(steps)
        steps = steps[1:]
        steps.append(curr_step)
    print(max(steps))
    return max(steps)

ArrayJourney(2,[10,-20,-5])
ArrayJourney(2,[10,2,-10,5,20])
