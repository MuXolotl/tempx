package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3863l implements InterfaceC1767l {
    public boolean admob;
    public C6074l amazon;
    public boolean billing;
    public float crashlytics;
    public float loadAd;
    public int mopub;
    public boolean purchase;
    public final ArrayList yandex;

    public C3863l(C1424l c1424l, C11522l c11522l) {
        ArrayList arrayList = new ArrayList();
        this.yandex = arrayList;
        this.amazon = null;
        this.purchase = false;
        this.billing = true;
        this.mopub = -1;
        if (c11522l == null) {
            return;
        }
        c11522l.isVip(this);
        if (this.admob) {
            this.amazon.loadAd((C6074l) arrayList.get(this.mopub));
            arrayList.set(this.mopub, this.amazon);
            this.admob = false;
        }
        C6074l c6074l = this.amazon;
        if (c6074l != null) {
            arrayList.add(c6074l);
        }
    }

    @Override // defpackage.InterfaceC1767l
    public final void amazon(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.purchase = true;
        this.billing = false;
        C6074l c6074l = this.amazon;
        C1424l.mopub(c6074l.yandex, c6074l.loadAd, f, f2, f3, z, z2, f4, f5, this);
        this.billing = true;
        this.admob = false;
    }

    @Override // defpackage.InterfaceC1767l
    public final void close() {
        this.yandex.add(this.amazon);
        purchase(this.loadAd, this.crashlytics);
        this.admob = true;
    }

    @Override // defpackage.InterfaceC1767l
    public final void crashlytics(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.billing || this.purchase) {
            this.amazon.yandex(f, f2);
            this.yandex.add(this.amazon);
            this.purchase = false;
        }
        this.amazon = new C6074l(f5, f6, f5 - f3, f6 - f4);
        this.admob = false;
    }

    @Override // defpackage.InterfaceC1767l
    public final void loadAd(float f, float f2) {
        boolean z = this.admob;
        ArrayList arrayList = this.yandex;
        if (z) {
            this.amazon.loadAd((C6074l) arrayList.get(this.mopub));
            arrayList.set(this.mopub, this.amazon);
            this.admob = false;
        }
        C6074l c6074l = this.amazon;
        if (c6074l != null) {
            arrayList.add(c6074l);
        }
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = new C6074l(f, f2, 0.0f, 0.0f);
        this.mopub = arrayList.size();
    }

    @Override // defpackage.InterfaceC1767l
    public final void purchase(float f, float f2) {
        this.amazon.yandex(f, f2);
        this.yandex.add(this.amazon);
        C6074l c6074l = this.amazon;
        this.amazon = new C6074l(f, f2, f - c6074l.yandex, f2 - c6074l.loadAd);
        this.admob = false;
    }

    @Override // defpackage.InterfaceC1767l
    public final void yandex(float f, float f2, float f3, float f4) {
        this.amazon.yandex(f, f2);
        this.yandex.add(this.amazon);
        this.amazon = new C6074l(f3, f4, f3 - f, f4 - f2);
        this.admob = false;
    }
}
