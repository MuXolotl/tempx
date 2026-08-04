package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٖٔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14925l implements TextWatcher {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f29378l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ EditText f29379l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f29380l;

    public C14925l(TextInputLayout textInputLayout, EditText editText) {
        this.f29378l = textInputLayout;
        this.f29379l = editText;
        this.f29380l = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f29378l;
        textInputLayout.Signature(!textInputLayout.f752l, false);
        if (textInputLayout.f750l) {
            textInputLayout.vip(editable);
        }
        if (textInputLayout.f716l) {
            textInputLayout.license(editable);
        }
        EditText editText = this.f29379l;
        int lineCount = editText.getLineCount();
        int i = this.f29380l;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f693l;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f29380l = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
