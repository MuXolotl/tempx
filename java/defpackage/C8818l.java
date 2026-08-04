package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lٌٖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8818l extends AbstractC16763l {
    public final /* synthetic */ WeakReference firebase;
    public final /* synthetic */ int isPro;
    public final /* synthetic */ C10899l smaato;
    public final /* synthetic */ int subs;

    public C8818l(C10899l c10899l, int i, int i2, WeakReference weakReference) {
        this.smaato = c10899l;
        this.subs = i;
        this.isPro = i2;
        this.firebase = weakReference;
    }

    @Override // defpackage.AbstractC16763l
    public final void vip(Typeface typeface) {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.subs) != -1) {
            typeface = AbstractC10615l.yandex(typeface, i, (this.isPro & 2) != 0);
        }
        C10899l c10899l = this.smaato;
        if (c10899l.remoteconfig) {
            c10899l.smaato = typeface;
            TextView textView = (TextView) this.firebase.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i3 = c10899l.isPro;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC16824l(textView, typeface, i3, i2));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }

    @Override // defpackage.AbstractC16763l
    public final void remoteconfig(int i) {
    }
}
