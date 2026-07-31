package defpackage;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* JADX INFO: renamed from: lؘۥۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6093l extends InputConnectionWrapper {
    public final C12899l loadAd;
    public final EditText yandex;

    public C6093l(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C12899l c12899l = new C12899l(0);
        super(inputConnection, false);
        this.yandex = editText;
        this.loadAd = c12899l;
        if (C12304l.amazon()) {
            C12304l.yandex().subs(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.yandex.getEditableText();
        this.loadAd.getClass();
        return C12899l.yandex(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.yandex.getEditableText();
        this.loadAd.getClass();
        return C12899l.yandex(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
