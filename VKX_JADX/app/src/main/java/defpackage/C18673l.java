package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18673l {
    public final Function1 amazon;
    public final Object billing = new Object();
    public final C7972l crashlytics;
    public final C15053l loadAd;
    public volatile C0360l mopub;
    public final InterfaceC2262l purchase;
    public final String yandex;

    public C18673l(String str, C15053l c15053l, C7972l c7972l, Function1 function1, InterfaceC2262l interfaceC2262l) {
        this.yandex = str;
        this.loadAd = c15053l;
        this.crashlytics = c7972l;
        this.amazon = function1;
        this.purchase = interfaceC2262l;
    }

    public final Object yandex(Object obj) {
        C0360l c0360l;
        Context context = (Context) obj;
        InterfaceC5763l interfaceC5763lMo245l = this.purchase.vip().mo245l(C1083l.f2996l);
        InterfaceC2262l interfaceC2262l = this.purchase;
        InterfaceC12932l interfaceC12932lMo246l = interfaceC5763lMo245l == null ? interfaceC2262l.vip().mo246l(AbstractC11174l.yandex()) : interfaceC2262l.vip();
        C0360l c0360l2 = this.mopub;
        if (c0360l2 != null) {
            return c0360l2;
        }
        synchronized (this.billing) {
            try {
                if (this.mopub == null) {
                    Context applicationContext = context.getApplicationContext();
                    this.mopub = new C0360l(new C9817l(AbstractC5921l.f12465l, this.loadAd, new C12242l(this, applicationContext, 10)), Collections.singletonList(new C6637l(AbstractC16901l.m4232new(C2580l.f5619l, (List) this.amazon.invoke(applicationContext)), null, 16)), this.crashlytics, interfaceC12932lMo246l);
                }
                c0360l = this.mopub;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0360l;
    }
}
