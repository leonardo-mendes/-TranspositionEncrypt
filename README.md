## Rail Fence Cipher
In the rail fence cipher, the plain text is written downwards and diagonally on successive "rails" of an imaginary fence, then moving up when we reach the bottom rail. When we reach the top rail, the message is written downwards again until the whole plaintext is written out. The message is then read off in rows.

Example:

> E.....A.....P.....E<br>
> ....X....M.....L <br><br>
> Result: EAPEXML - Key: 2

<br>

## Rectangular Transposition
Rectangular Transpositions start out by placing all of the letters of a message to be "encrypted" into a grid. If there are any spaces left over, they are filled with padding characters until the grid is perfectly filled.

Example:

> 2 1 3 - Aleatory Key<br>
> E X A<br>
> M P L<br>
> E <br><br>
> Result: XPEMEAL - Key: 2 1 3
