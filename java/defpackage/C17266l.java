package defpackage;

import android.util.Log;
import kotlin.Unit;

/* JADX INFO: renamed from: lٗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17266l {
    public final C8490l admob;
    public final int amazon;
    public boolean billing;
    public final InterfaceC2262l crashlytics;
    public C7504l firebase;
    public AbstractC5387l isPro;
    public final C18548l loadAd;
    public C1156l mopub;
    public final Object purchase;
    public C17726l smaato;
    public final InterfaceC6942l subs;
    public final String yandex;

    public C17266l(String str, C18548l c18548l, InterfaceC2262l interfaceC2262l) {
        this.yandex = str;
        this.loadAd = c18548l;
        this.crashlytics = interfaceC2262l;
        C11879l c11879l = AbstractC5843l.yandex;
        c11879l.getClass();
        this.amazon = C11879l.loadAd.incrementAndGet(c11879l);
        this.purchase = new Object();
        C8490l c8490lLoadAd = AbstractC3861l.loadAd(3, 0, 4);
        this.admob = c8490lLoadAd;
        this.subs = AbstractC0622l.isPro(c8490lLoadAd);
        C2797l c2797l = C2797l.yandex;
        this.isPro = c2797l;
        if (c8490lLoadAd.mopub(c2797l)) {
            return;
        }
        C8339l.smaato("Check failed.");
        throw null;
    }

    public final AbstractC5387l crashlytics() {
        AbstractC5387l abstractC5387l;
        synchronized (this.purchase) {
            abstractC5387l = this.isPro;
        }
        return abstractC5387l;
    }

    public final void loadAd(AbstractC5387l abstractC5387l) {
        this.isPro = abstractC5387l;
        if (this.admob.mopub(abstractC5387l)) {
            return;
        }
        C10754l.subscription("Failed to emit ", abstractC5387l, " in ", this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.amazon;
    }

    public final void yandex(C6288l c6288l) {
        synchronized (this.purchase) {
            try {
                if (this.billing) {
                    return;
                }
                this.billing = true;
                Log.i("CXCP", "Disconnecting " + this);
                C1156l c1156l = this.mopub;
                if (c1156l != null) {
                    c1156l.yandex();
                }
                C7504l c7504l = this.firebase;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                C17726l c17726l = this.smaato;
                if (c17726l != null) {
                    c17726l.loadAd();
                }
                if (!(crashlytics() instanceof C8172l)) {
                    if (!(this.isPro instanceof C11968l)) {
                        loadAd(new C11968l(null));
                    }
                    loadAd(new C8172l(this.yandex, 2, null, null, null, null, null, null, c6288l));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
