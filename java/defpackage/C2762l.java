package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٜؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2762l implements InterfaceC0526l, InterfaceC15251l {
    public final Set amazon;
    public final InterfaceC15189l crashlytics;
    public final Context loadAd;
    public final Executor purchase;
    public final C13252l yandex;

    public C2762l(Context context, String str, Set set, InterfaceC15189l interfaceC15189l, Executor executor) {
        this.yandex = new C13252l(new C16865l(context, str, 1));
        this.amazon = set;
        this.purchase = executor;
        this.crashlytics = interfaceC15189l;
        this.loadAd = context;
    }

    public final void crashlytics() {
        if (this.amazon.size() <= 0) {
            AbstractC4311l.mopub(null);
        } else if (!AbstractC17002l.amazon(this.loadAd)) {
            AbstractC4311l.mopub(null);
        } else {
            AbstractC4311l.purchase(this.purchase, new CallableC18264l(this, 1));
        }
    }

    public final C3823l loadAd() {
        if (!AbstractC17002l.amazon(this.loadAd)) {
            return AbstractC4311l.mopub("");
        }
        return AbstractC4311l.purchase(this.purchase, new CallableC18264l(this, 0));
    }

    public final synchronized int yandex() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4595l c4595l = (C4595l) this.yandex.get();
        if (!c4595l.subs(jCurrentTimeMillis)) {
            return 1;
        }
        c4595l.mopub();
        return 3;
    }
}
