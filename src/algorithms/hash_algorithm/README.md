# Hash Algorithm

## Usage

- find location(index) to save data in hash table
- Compare(hashCode())
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

## Non-cryptological hashing

- hash function that is not safe for cryptography
    - Hash table, Hash map
    - unique id
    - caching
- How to find right hash function
    - What and where to use hash function?
    - What computation does hash function use, to ensure efficiency and uniformity?

### Lose Lose hash

- Not used in field
- use of unsigned integer
- Simple but frequent collision

## MurMur

- shift by 2
- lots of xor and `overflow`

## FNV-1 Hash

- Much simpler than murmur 
- xor and `overflow`

## Checksum

- `Check if there is a change in data`
- Simple, consume less memory, easy to implement
- sum up every data into one piece of data
- can be similar to hash function, if it has fixed length of output
- Usage
  - Find errors in saved data, or sending data
    - when save or sending data for the first time, compute checksum and save it
    - When reading later, compute checksum again
    - error if two checksums are different
- Examples of checksum
  - ISBN, ID, Credit card

## Parity bit

- an example of checksum
- data unit = 1 bit + 7 bit of data
- odd, even number parity
  - number of 1 in 8 bits are either odd or even
  - check data changes

## CRC

- an Example of checksum
- suffix can defer depending on degree of polynomial
- x^3 + x + 1 = 1011

---

## Cryptographical Hashing Algorithm

- an algorithm that is impossible to retrieve original value from hash value
  - lots and lots of CPU power,
  - one-way function
- Used in security field
- Example
  - integrity check
  - PoW
  - Digital signage

## Other characteristics of cryptographical hashing algorithm

- pre-image resistance
    - Should be difficult retrieve original data from hash value
- second pre-image resistance
    - Should be difficult to find other values that have a same hash value
