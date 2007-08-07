package edu.cmu.sphinx.tools.confdesigner.propedit;

import edu.cmu.sphinx.util.props.PropertySheet;
import edu.cmu.sphinx.util.props.S4Double;

/**
 * DOCUMENT ME!
 *
 * @author Holger Brandl
 */
public class ConfDoubleProperty extends TableProperty {

    private PropertySheet currentPS;
    private String propName;
    private S4Double s4Double;


    public ConfDoubleProperty(PropertySheet currentPS, String propName, S4Double s4Double) {
        this.currentPS = currentPS;
        this.propName = propName;
        this.s4Double = s4Double;

        setDisplayName(propName);

        if (currentPS.getRaw(propName) != null) {
            setValue(currentPS.getDouble(propName));
        } else {
            double defValue = s4Double.defaultValue();
            if (defValue != S4Double.NOT_DEFINED)
                setValue(defValue);

            // set color to gray to indicate the defaultness
        }
        setEditable(true);
    }


    private void setEditable(boolean b) {
    }


    private void setValue(double aDouble) {
    }


    private void setDisplayName(String propName) {
    }
}