package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: lُؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7183l extends C10156l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final TextInputLayout f15022l;

    public C7183l(TextInputLayout textInputLayout) {
        this.f15022l = textInputLayout;
    }

    @Override // defpackage.C10156l
    public final void amazon(View view, C15685l c15685l) {
        AccessibilityNodeInfo accessibilityNodeInfo = c15685l.yandex;
        this.f20672l.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f15022l;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f755l;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        C7867l c7867l = textInputLayout.f712l;
        C9189l c9189l = c7867l.f16406l;
        if (c9189l.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c9189l);
            accessibilityNodeInfo.setTraversalAfter(c9189l);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c7867l.f16410l);
        }
        if (!zIsEmpty) {
            c15685l.tapsense(text);
        } else if (!TextUtils.isEmpty(string)) {
            c15685l.tapsense(string);
            if (!z && placeholderText != null) {
                c15685l.tapsense(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c15685l.tapsense(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c15685l.vip(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c15685l.tapsense(string);
            }
            c15685l.subscription(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C9189l c9189l2 = textInputLayout.f726l.advert;
        if (c9189l2 != null) {
            accessibilityNodeInfo.setLabelFor(c9189l2);
        }
        textInputLayout.f694l.yandex().remoteconfig(c15685l);
    }

    @Override // defpackage.C10156l
    public final void purchase(View view, AccessibilityEvent accessibilityEvent) {
        super.purchase(view, accessibilityEvent);
        this.f15022l.f694l.yandex().vip(accessibilityEvent);
    }
}
