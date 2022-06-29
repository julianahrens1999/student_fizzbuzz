import io
import sys

import pytest

from fizzbuzz import fizzbuzz



def test_should_return_hello_world():
    # given

    # when
    actualResult = fizzbuzz()

    # then
    assert actualResult == "hello world"
