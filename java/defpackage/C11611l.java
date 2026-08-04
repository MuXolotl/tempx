package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lؘِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11611l {
    public static final C13645l smaato = new C13645l(new C2062l(28), new C10557l(25), 13);
    public C1120l admob;
    public final AtomicLong amazon;
    public C4508l billing;
    public final C18730l crashlytics;
    public final C10086l firebase;
    public C15531l isPro;
    public final ArrayList loadAd = new ArrayList();
    public C17169l mopub;
    public C15531l purchase;
    public C15531l subs;
    public boolean yandex;

    public C11611l(long j) {
        C18730l c18730l = AbstractC17774l.yandex;
        this.crashlytics = new C18730l();
        this.amazon = new AtomicLong(j);
        this.firebase = AbstractC8020l.smaato(AbstractC17774l.yandex);
    }

    public final void amazon(InterfaceC18212l interfaceC18212l, long j, C11379l c11379l, boolean z) {
        C4508l c4508l = this.billing;
        if (c4508l != null) {
            c4508l.invoke(Boolean.valueOf(z), interfaceC18212l, new C1187l(j), c11379l);
        }
    }

    public final void billing(C18329l c18329l) {
        long j = c18329l.yandex;
        C18730l c18730l = this.crashlytics;
        if (c18730l.loadAd(j)) {
            this.loadAd.remove(c18329l);
            long j2 = c18329l.yandex;
            c18730l.mopub(j2);
            C15531l c15531l = this.isPro;
            if (c15531l != null) {
                c15531l.invoke(Long.valueOf(j2));
            }
        }
    }

    public final void crashlytics() {
        C1120l c1120l = this.admob;
        if (c1120l != null) {
            c1120l.invoke();
        }
    }

    public final boolean loadAd(InterfaceC18212l interfaceC18212l, long j, long j2, C11379l c11379l, boolean z) {
        C17169l c17169l = this.mopub;
        if (c17169l == null) {
            return true;
        }
        C0205l c0205l = c17169l.f33345l;
        long jAmazon = c0205l.amazon(interfaceC18212l, j);
        long jAmazon2 = c0205l.amazon(interfaceC18212l, j2);
        c0205l.vip(z);
        return c0205l.subscription(jAmazon, jAmazon2, false, c11379l);
    }

    public final ArrayList purchase(InterfaceC18212l interfaceC18212l) {
        boolean z = this.yandex;
        ArrayList arrayList = this.loadAd;
        if (!z) {
            AbstractC3826l.Signature(new C9933l(2, new C1645l(5, interfaceC18212l)), arrayList);
            this.yandex = true;
        }
        return arrayList;
    }

    public final C18730l yandex() {
        return (C18730l) this.firebase.getValue();
    }
}
