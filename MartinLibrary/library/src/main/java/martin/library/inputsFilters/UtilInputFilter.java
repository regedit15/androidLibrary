package martin.library.inputsFilters;

import android.text.InputFilter;

public class UtilInputFilter {

    private static InputFilter[] inputFilterDosDecimales = new InputFilter[]{new InputFilterDosDecimales()};

    public UtilInputFilter() {

    }

    public static InputFilter[] getInputFilterDosDecimales() {
        return inputFilterDosDecimales;
    }

    public static InputFilter[] getInputFilterCustomDecimals(int digitsBeforeZero, int digitsAfterZero) {
        return new InputFilter[]{new InputFilterCustomDecimals(digitsBeforeZero, digitsAfterZero)};
    }

}



