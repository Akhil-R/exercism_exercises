<?php

class PizzaPi
{
    public function calculateDoughRequirement($pizzas, $persons)
    {
        return $pizzas * (($persons * 20) +200);
    }

    public function calculateSauceRequirement($pizzas, $canVolume)
    {
        return (int) ceil(($pizzas * 125) / $canVolume);
    }

    public function calculateCheeseCubeCoverage($dimension, $thickness, $diameter)
    {
        $cubeVolume = $dimension ** 3;
        $pizzaVolume = $thickness * pi() * $diameter;
        return (int) floor($cubeVolume / $pizzaVolume);
    }

    public function calculateLeftOverSlices($pizzas, $friends)
    {
        return (8 * $pizzas) % $friends;
    }
}
