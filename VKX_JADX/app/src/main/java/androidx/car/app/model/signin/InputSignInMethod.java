package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import defpackage.AbstractC14814l;
import defpackage.AbstractC4464l;
import defpackage.InterfaceC11796l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC6815l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class InputSignInMethod implements InterfaceC11796l {
    public static final int INPUT_TYPE_DEFAULT = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int KEYBOARD_DEFAULT = 1;
    public static final int KEYBOARD_EMAIL = 2;
    public static final int KEYBOARD_NUMBER = 4;
    public static final int KEYBOARD_PHONE = 3;
    private final CarText mDefaultValue;
    private final CarText mErrorMessage;
    private final CarText mHint;
    private final InterfaceC6815l mInputCallbackDelegate;
    private final int mInputType;
    private final int mKeyboardType;
    private final boolean mShowKeyboardByDefault;

    private InputSignInMethod() {
        this.mHint = null;
        this.mDefaultValue = null;
        this.mInputType = 1;
        this.mErrorMessage = null;
        this.mKeyboardType = 1;
        this.mInputCallbackDelegate = null;
        this.mShowKeyboardByDefault = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public CarText getDefaultValue() {
        return this.mDefaultValue;
    }

    public CarText getErrorMessage() {
        return this.mErrorMessage;
    }

    public CarText getHint() {
        return this.mHint;
    }

    public InterfaceC6815l getInputCallbackDelegate() {
        InterfaceC6815l interfaceC6815l = this.mInputCallbackDelegate;
        Objects.requireNonNull(interfaceC6815l);
        return interfaceC6815l;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public int hashCode() {
        return Objects.hash(this.mHint, this.mDefaultValue, Integer.valueOf(this.mInputType), this.mErrorMessage, Integer.valueOf(this.mKeyboardType), Boolean.valueOf(this.mShowKeyboardByDefault));
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[inputType:");
        sb.append(this.mInputType);
        sb.append(", keyboardType: ");
        return AbstractC14814l.remoteconfig(this.mKeyboardType, "]", sb);
    }

    public InputSignInMethod(AbstractC4464l abstractC4464l) {
        throw null;
    }
}
