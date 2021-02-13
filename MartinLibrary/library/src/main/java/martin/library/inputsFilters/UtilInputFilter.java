package martin.library.inputsFilters;

import android.text.InputFilter;

public class UtilInputFilter {

    private InputFilter[] inputFilterDosDecimales = new InputFilter[]{new InputFilterDosDecimales()};

    public UtilInputFilter() {

    }

    public InputFilter[] getInputFilterDosDecimales() {
        return inputFilterDosDecimales;
    }

    public InputFilter[] getInputFilterCustomDecimals(int digitsBeforeZero, int digitsAfterZero) {
        return new InputFilter[]{new InputFilterCustomDecimals(digitsBeforeZero, digitsAfterZero)};
    }

}



