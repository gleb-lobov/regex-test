from greenery.lego import parse


print("test")

match_everything = parse(".*").reduce()
with open('regex.txt') as f:
    lines = [line for line in f]
    regex = lines[0]
    print(regex)
regex_parsed = parse(regex).reduce()
print((regex_parsed & match_everything.everythingbut()).empty())
