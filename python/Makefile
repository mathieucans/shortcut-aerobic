GREEN = \033[1;32m
WHITE = \033[00m

.SILENT:

default: help

help: # Show help.
	@grep -E '^[a-zA-Z0-9 -]+:.*#'  Makefile | sort | while read -r l; do printf "$(GREEN)$$(echo $$l | cut -f 1 -d':')$(WHITE):$$(echo $$l | cut -f 2- -d'#')\n"; done

check: test-first-fail # run all check

test-first-fail: # Run all tests and stop to first fail
	poetry run pytest -x

test-all: # Run all tests
	poetry run pytest

test-coverage: # Run all tests with coverage
	poetry run coverage run -m pytest

report-coverage-test: test-coverage show-coverage

show-coverage: # Show coverage
	poetry run coverage report -m --skip-covered

green:  # git gamble green
	git-gamble --green -m "green" -- make test

red: # git gamble red
	git-gamble --red -m "red" -- make test

check-file: # Check a specific file
	poetry run pytest $(FILE) -x