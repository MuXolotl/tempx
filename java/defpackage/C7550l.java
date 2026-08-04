package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: lؚ۠ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7550l {
    public final /* synthetic */ C12124l yandex;

    public C7550l(C12124l c12124l) {
        this.yandex = c12124l;
    }

    public final void yandex(TextInputLayout textInputLayout) {
        C12124l c12124l = this.yandex;
        C9981l c9981l = c12124l.f24123l;
        if (c12124l.f24133l == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c12124l.f24133l;
        if (editText != null) {
            editText.removeTextChangedListener(c9981l);
            if (c12124l.f24133l.getOnFocusChangeListener() == c12124l.yandex().purchase()) {
                c12124l.f24133l.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c12124l.f24133l = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c9981l);
        }
        c12124l.yandex().smaato(c12124l.f24133l);
        c12124l.subs(c12124l.yandex());
    }
}
