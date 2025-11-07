// Package weather provides tools to forecast weather conditions in Goblinocus.
package weather

var (
    // CurrentCondition stores the latest weather condition.
	CurrentCondition string
    
    // CurrentLocation stores the name of the city being forecasted.
	CurrentLocation  string
)

// Forecast returns a formatted string describing the weather in the current location.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
