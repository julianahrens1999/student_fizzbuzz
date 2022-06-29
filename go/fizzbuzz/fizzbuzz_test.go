package fizzbuzz

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestShouldReturnHelloWorld(t *testing.T) {
	// given

	// when
	actualResult := fizzbuzz()

	// then
	assert.Equal(t, "hello world", actualResult)
}
