package tempconverter;

public class converter {
	float cel_kelvin(float c)
	{
		float kelvin = (float) (c+273.15);
		return kelvin;
	}
	float cel_fahren(float c)
	{
		float fahren = (float) ((c*1.8)+32);
		return fahren;
	}
	float kel_cel(float k)
	{
		float celcius = (float) (k-273.15);
		return celcius;
	}
	float fahren_cel(float f)
	{
		float calcius = (float) ((f-32)/1.8);
		return calcius;
		
	}
	float kel_fahren(float k)
	{
		float fahren = (float) ((k - 273.15)*1.8 + 32);
		return fahren;
	}
	float fahren_kel(float f)
	{
		float kelvin = (float) (((f-32)/1.8)+273.15);
		return kelvin;
	}
	

}
