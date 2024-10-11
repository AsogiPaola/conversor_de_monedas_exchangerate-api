package com.aluracursos.monedas;

public class InfoMonedas {
    private final Double conversion;
    private Double conversion_rate;
    private String target_code;
    private String base_code;

    public InfoMonedas(ConversorDeMonedas conversor){
        this.conversion = conversor.conversion_result();
        this.conversion_rate = conversor.conversion_rate();
        this.target_code = conversor.target_code();
        this.base_code = conversor.base_code();
    }
    public Double getConversion() {//System.out.println("Este es el valor de la conversion: "+ conversion);
        return conversion;
    }

    public Double getConversion_rate() {//System.out.println("Este es conversion rate: "+ conversion_rate);
        return conversion_rate;
    }

    public String getTarget_code() {//System.out.println("Este es el target_code: " +target_code);
        return target_code;
    }

    public String getBase_code() {//System.out.println("Este el es codigo base: "+ base_code);
        return base_code;
    }
}
