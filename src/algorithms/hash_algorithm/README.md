# Hash Algorithm

## Usage

- find location to save data in hash table
- Compare
- Save encrypted data
- Depending on usage, hash can be different

## Definition

- `A function that set arbitrary length of data into a fixed length of data(hashCode)`
    - `Requisition`
- 임의의 크기를 가진 값을 고정 크기의 값에 대응시키는 함수
- `Since it's a function, it should also satisfy a mathematical definition of a function`
    - 1:1, N:1
- same input, always return same value
    - `Requisition`
- There are other requisitions, but this depends on usage

## Classification of Hash Algorithm

- Cryptological
- Non-cryptological hash algorithm

## Characteristics

1. Efficiency
    - in general, Faster the better
        - However, it depends on where we will apply hash algorithm 
2. Uniformity
    - distributed evenly
        - The more return value of hash algorithm distributed evenly, the better uniformity it has
    - Good hash function means less collision
    - Perfect Hash
        - No collision
        - possible with limited number of input values
    - Avalanche effect
    - Higher uniformity the better?
        - Not always
        - locality-sensitive hashing
            - `aim to maximize hash collision`
            - `similar data should collide: ABC, ABD`
        - Usage: Spam mail search, copyright check
    

