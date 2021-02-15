package martin.library.inputsFilters;

import android.text.InputFilter;

public class UtilInputFilter {

    public UtilInputFilter() {

    }

    public static InputFilter[] getInputFilterDosDecimales() {
        return new InputFilter[]{new InputFilterDosDecimales()};
    }

    public static InputFilter[] getInputFilterCustomDecimals(int digitsBeforeZero, int digitsAfterZero) {
        return new InputFilter[]{new InputFilterCustomDecimals(digitsBeforeZero, digitsAfterZero)};
    }

    public static InputFilter[] getInputFilterPorcentajeConCero(int digitsBeforeZero, int digitsAfterZero) {
        return new InputFilter[]{new InputFilterPorcentaje()};
    }

    public static InputFilter[] getInputFilterPorcentajeSinCero(int digitsBeforeZero, int digitsAfterZero) {
        return new InputFilter[]{new InputFilterPorcentaje(true)};
    }

}



