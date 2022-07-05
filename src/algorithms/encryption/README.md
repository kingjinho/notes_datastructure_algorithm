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

## symmetric-key encryption

- `same key for encryption and decryption`
- `Sender & Receiver shares same key`
  - meaning that receiver has to have a key
- `How sender tells or sends key to receiver?`
  - disadvantage of symmetric-key encryption
  - `What if other people know this key?`
- example
    - Wi-Fi password
  
## asymmetric-key encryption

- a.k.a public key encryption
- `different keys for encryption and decryption`
