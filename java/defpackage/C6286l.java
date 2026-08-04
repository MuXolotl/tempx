package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؘؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6286l {
    public final InterfaceC2262l amazon;
    public volatile C0641l billing;
    public final Function1 crashlytics;
    public final C7972l loadAd;
    public final Object purchase = new Object();
    public final String yandex;

    public C6286l(String str, C7972l c7972l, Function1 function1, InterfaceC2262l interfaceC2262l) {
        this.yandex = str;
        this.loadAd = c7972l;
        this.crashlytics = function1;
        this.amazon = interfaceC2262l;
    }

    public final Object yandex(Object obj) {
        C0641l c0641l;
        Context context = (Context) obj;
        C0641l c0641l2 = this.billing;
        if (c0641l2 != null) {
            return c0641l2;
        }
        synchronized (this.purchase) {
            try {
                if (this.billing == null) {
                    Context applicationContext = context.getApplicationContext();
                    this.billing = AbstractC4596l.yandex(this.loadAd, (List) this.crashlytics.invoke(applicationContext), this.amazon, new C8652l(applicationContext, this, 6));
                }
                c0641l = this.billing;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0641l;
    }
}
