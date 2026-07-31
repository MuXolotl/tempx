package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lّۦؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC12987l extends AbstractC2148l implements Runnable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f25456l;

    public RunnableC12987l(EditText editText) {
        this.f25456l = new WeakReference(editText);
    }

    @Override // defpackage.AbstractC2148l
    public final void loadAd() {
        Handler handler;
        EditText editText = (EditText) this.f25456l.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13491l.yandex((EditText) this.f25456l.get(), 1);
    }
}
