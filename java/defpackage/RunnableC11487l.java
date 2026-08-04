package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lُۥۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11487l extends AbstractC2148l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final WeakReference f23096l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f23097l;

    public RunnableC11487l(TextView textView, C12906l c12906l) {
        this.f23097l = new WeakReference(textView);
        this.f23096l = new WeakReference(c12906l);
    }

    @Override // defpackage.AbstractC2148l
    public final void loadAd() {
        Handler handler;
        TextView textView = (TextView) this.f23097l.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f23097l.get();
        InputFilter inputFilter = (InputFilter) this.f23096l.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C12304l c12304lYandex = C12304l.yandex();
                    if (text == null) {
                        length = 0;
                    } else {
                        c12304lYandex.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceMopub = c12304lYandex.mopub(0, length, 0, text);
                    if (text == charSequenceMopub) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceMopub);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceMopub);
                    textView.setText(charSequenceMopub);
                    if (charSequenceMopub instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceMopub;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
