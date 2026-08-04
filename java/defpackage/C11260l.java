package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: lُۗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11260l {
    public static int remoteconfig;
    public double admob;
    public final String crashlytics;
    public boolean loadAd;
    public double mopub;
    public final C18480l smaato;
    public C17930l yandex;
    public final C5533l amazon = new C5533l();
    public final C5533l purchase = new C5533l();
    public final C5533l billing = new C5533l();
    public boolean subs = true;
    public final CopyOnWriteArraySet isPro = new CopyOnWriteArraySet();
    public double firebase = 0.0d;

    public C11260l(C18480l c18480l) {
        this.smaato = c18480l;
        StringBuilder sb = new StringBuilder("spring:");
        int i = remoteconfig;
        remoteconfig = i + 1;
        sb.append(i);
        this.crashlytics = sb.toString();
        C17930l c17930l = C17930l.crashlytics;
        if (c17930l != null) {
            this.yandex = c17930l;
        } else {
            C8339l.metrica("springConfig is required");
            throw null;
        }
    }

    public final void amazon(double d) {
        if (this.admob == d && loadAd()) {
            return;
        }
        this.mopub = this.amazon.yandex;
        this.admob = d;
        this.smaato.billing(this.crashlytics);
        Iterator it = this.isPro.iterator();
        while (it.hasNext()) {
            ((InterfaceC18216l) it.next()).getClass();
        }
    }

    public final void crashlytics(double d) {
        this.mopub = d;
        C5533l c5533l = this.amazon;
        c5533l.yandex = d;
        this.smaato.billing(this.crashlytics);
        Iterator it = this.isPro.iterator();
        while (it.hasNext()) {
            ((InterfaceC18216l) it.next()).yandex(this);
        }
        double d2 = c5533l.yandex;
        this.admob = d2;
        this.billing.yandex = d2;
        c5533l.loadAd = 0.0d;
    }

    public final boolean loadAd() {
        C5533l c5533l = this.amazon;
        if (Math.abs(c5533l.loadAd) <= 0.005d) {
            return Math.abs(this.admob - c5533l.yandex) <= 0.005d || this.yandex.loadAd == 0.0d;
        }
        return false;
    }

    public final void yandex() {
        this.isPro.clear();
        C18480l c18480l = this.smaato;
        ((CopyOnWriteArraySet) c18480l.f36088l).remove(this);
        ((HashMap) c18480l.f36084l).remove(this.crashlytics);
    }
}
