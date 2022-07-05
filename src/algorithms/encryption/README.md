# Encryption

- In general, Hashing itself is not really an encryption
- Definition: `Convert plaintext to ciphertext`
    - plain text: everyone can read and understand
    - cipher text: everyone can read but not every one can understand
        - `Need something special(rule) to understand`
- Decryption
    - Convert cipher text into plain text
    - `Need something special(rule) to understand`

## Difference between hash algorithm vs encryption algorithm

- Hash aims to prevent retrieving original text(one way)
- whereas encryption allows retrieving original text(two-way)
- Choosing between these depend on use case
    - Hash: one that should not be saved(id, password)
    - encryption: shipping address

## Integer used in encryption

- very large Integer
    - bigger than 32-bit integer
- input size N = number of bit in integer

## Stream cipher vs Block cipher

- Stream cipher
  - one byte at a time and encrypt

Block cipher
  - designated size of block(more than 64 bit) and encrypt

# symmetric-key encryption

- `same key for encryption and decryption`
- `Sender & Receiver shares same key`
  - meaning that receiver has to have a key
- `How sender tells or sends key to receiver?`
  - disadvantage of symmetric-key encryption
  - `What if other people know this key?`
- example
    - Wi-Fi password
  
## Symmetric-key encryption: AES(Advanced Encryption Standard)
- `Block size: 128bit`
- key length: 128, 192, 256 bit
  - depending on that, number of rounds plain text goes through to cipher text can differ
  - 128: 10 rounds
  - 192: 12 rounds
  - 256: 14 rounds
- `How it works`
  - `read and encrypt 16 bytes at a time`
  - `place this 16 bytes by 4 * 4 arrays before encryption`
  - round 0: add round key(key expansion)
  - round 1 to n: replace bytes, move rows, mix columns and add round key
  - final round: replace bytes, move rows and add round key
  - `key in each step differs from others`
  
- key expansion
  - 128 bit  
  - create key based on symmetric key(128, 192, 256 bit)
  - # of keys created = # of rounds + 1
  - 
1. Round 0: Add Round Key
  - add round key to plain text
  - add means xor
  - use previous steps result as an input(same for the entire step)

2. Round ~ to N: SubBytes
  - replace each byte into another one
    - with AES S-Box lookup table

3. Round ~ to N: shift rows 
   - bit shift to left
   - 1st row: X
   - 2nd row: by 1
   - 3rd row: by 2
   - 4rd row: by 3

4. Round ~ to N: mix columns
   - use array * vector (result in 4 bytes) + xor
   - *
     - when it comes to 1: just 1
     - 2: bit shift left by 1 and 0x1B xor if highest bit is 1
    
  

# asymmetric-key encryption

- a.k.a public key encryption
- `different keys for encryption and decryption`
