package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: lؘؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5425l {
    public C4853l admob;
    public final AbstractC5832l amazon;
    public int billing;
    public final InterfaceC14555l crashlytics;
    public final boolean loadAd;
    public ArrayDeque mopub;
    public final AbstractC6974l purchase;
    public final boolean yandex;

    public C5425l(boolean z, boolean z2, boolean z3, InterfaceC14555l interfaceC14555l, AbstractC5832l abstractC5832l, AbstractC6974l abstractC6974l) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = interfaceC14555l;
        this.amazon = abstractC5832l;
        this.purchase = abstractC6974l;
    }

    public final void crashlytics() {
        if (this.mopub == null) {
            this.mopub = new ArrayDeque(4);
        }
        if (this.admob == null) {
            int i = C4853l.f9907l;
            this.admob = AbstractC11621l.crashlytics();
        }
    }

    public boolean loadAd(InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        return true;
    }

    public final void yandex() {
        this.mopub.clear();
        this.admob.clear();
    }
}
