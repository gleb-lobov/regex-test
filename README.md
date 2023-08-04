# Testing different regex subset libraries
## Prerequisites
scala-cli, python3
## Install dependencies
`pip3 install -r requirements.txt`
## Testing
Change `regex.txt` to the desired regex. It will be checked to a subset of `.*`, so the result should be always true.
Run `./run.sh` to run both scala and python implementations, and time them.