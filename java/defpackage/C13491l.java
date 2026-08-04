package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: lْٛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13491l implements TextWatcher {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f26486l = true;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public RunnableC12987l f26487l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EditText f26488l;

    public C13491l(EditText editText) {
        this.f26488l = editText;
    }

    public static void yandex(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C12304l c12304lYandex = C12304l.yandex();
            if (editableText == null) {
                length = 0;
            } else {
                c12304lYandex.getClass();
                length = editableText.length();
            }
            c12304lYandex.mopub(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f26488l;
        if (!editText.isInEditMode() && this.f26486l && C12304l.amazon() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iCrashlytics = C12304l.yandex().crashlytics();
            if (iCrashlytics != 0) {
                if (iCrashlytics == 1) {
                    C12304l.yandex().mopub(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iCrashlytics != 3) {
                    return;
                }
            }
            C12304l c12304lYandex = C12304l.yandex();
            if (this.f26487l == null) {
                this.f26487l = new RunnableC12987l(editText);
            }
            c12304lYandex.admob(this.f26487l);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
