/* Prime */
static boolean isPrime(int index) {
    int i = 2;
    while (index % i++ != 0);

    if (index == (i-1)) {
        return true;
    }

    return false;
}
