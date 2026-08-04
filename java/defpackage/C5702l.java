package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؘٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5702l {
    public final C18289l crashlytics;
    public final C18012l loadAd;
    public final C1424l purchase;
    public final String yandex;
    public final C1424l billing = new C1424l(new C0848l(14, this));
    public final Object mopub = new Object();
    public List subs = new ArrayList();
    public final C18595l amazon = new C18595l(22);
    public final C18420l admob = new C18420l();

    public C5702l(C18289l c18289l, C18012l c18012l) {
        this.crashlytics = c18289l;
        this.loadAd = c18012l;
        this.yandex = (String) c18289l.loadAd;
        this.purchase = new C1424l(new C3529l(c18289l));
        yandex(new C11651l(4, this));
    }

    public final C3565l loadAd(C1164l c1164l, ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l) {
        C3013l c3013lLoadAd = AbstractC6854l.loadAd(new C11651l(3, c1164l));
        AbstractC11156l abstractC11156l = AbstractC10569l.yandex;
        AbstractC12442l.metrica(abstractC11156l, "ticker");
        abstractC11156l.billing();
        RunnableC9543l runnableC9543lTapsense = this.admob.tapsense("Update ".concat(String.valueOf(this.yandex)));
        try {
            AbstractC2722l abstractC2722lM952l = this.billing.m952l();
            C18595l c18595l = this.amazon;
            C7026l c7026l = new C7026l(29, abstractC2722lM952l);
            EnumC1535l enumC1535l = EnumC1535l.f3808l;
            c18595l.ad(c7026l, enumC1535l);
            ListenableFuture listenableFutureAd = c18595l.ad(AbstractC6854l.yandex(new C1381l(this, abstractC2722lM952l, c3013lLoadAd, scheduledExecutorServiceC6354l)), enumC1535l);
            AbstractC7151l.propagateCancellation(listenableFutureAd, abstractC2722lM952l);
            AbstractC7151l.billing(this.loadAd);
            C3565l c3565lMopub = AbstractC7151l.mopub(listenableFutureAd, new C5626l(), enumC1535l);
            runnableC9543lTapsense.yandex(c3565lMopub);
            runnableC9543lTapsense.close();
            return c3565lMopub;
        } catch (Throwable th) {
            try {
                runnableC9543lTapsense.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void yandex(InterfaceC12538l interfaceC12538l) {
        synchronized (this.mopub) {
            this.subs.add(interfaceC12538l);
        }
    }
}
