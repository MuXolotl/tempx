package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lٖؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1300l implements InterfaceC3270l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f3378l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC1087l f3379l;

    public C1300l(InterfaceC1087l interfaceC1087l, int i) {
        this.f3379l = interfaceC1087l;
        this.f3378l = i;
    }

    @Override // defpackage.InterfaceC3270l
    public final void adcel(int i, C9009l c9009l, boolean z, boolean z2, int i2) {
        this.f3379l.mo807continue(i, c9009l.yandex(z, z2).crashlytics(i2));
    }

    @Override // defpackage.InterfaceC3270l
    public final void admob(int i, int i2, int i3) {
        this.f3379l.admob(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C1300l.class) {
            return false;
        }
        return Objects.equals(this.f3379l.asBinder(), ((C1300l) obj).f3379l.asBinder());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // defpackage.InterfaceC3270l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void firebase(int r9, defpackage.C9201l r10) {
        /*
            r8 = this;
            java.lang.String r0 = defpackage.C9201l.isPro
            java.lang.Object r1 = r10.crashlytics
            int r2 = r10.amazon
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = defpackage.C9201l.mopub
            int r5 = r10.yandex
            r3.putInt(r4, r5)
            java.lang.String r4 = defpackage.C9201l.admob
            long r5 = r10.loadAd
            r3.putLong(r4, r5)
            lٗۜ۠ r4 = r10.purchase
            if (r4 == 0) goto L26
            java.lang.String r5 = defpackage.C9201l.subs
            android.os.Bundle r4 = r4.loadAd()
            r3.putBundle(r5, r4)
        L26:
            lٟۖ r10 = r10.billing
            if (r10 == 0) goto L33
            java.lang.String r4 = defpackage.C9201l.smaato
            android.os.Bundle r10 = r10.loadAd()
            r3.putBundle(r4, r10)
        L33:
            java.lang.String r10 = defpackage.C9201l.firebase
            r3.putInt(r10, r2)
            if (r1 != 0) goto L3b
            goto L7e
        L3b:
            r10 = 1
            if (r2 == r10) goto L84
            r10 = 2
            r4 = 0
            int r5 = r8.f3378l
            if (r2 == r10) goto L75
            r10 = 3
            if (r2 == r10) goto L4b
            r10 = 4
            if (r2 == r10) goto L84
            goto L7e
        L4b:
            lُ۟۠ r10 = new lُ۟۠
            lٜؒٗ r1 = (defpackage.AbstractC1186l) r1
            lؚٗ۟ r2 = defpackage.AbstractC1186l.metrica()
            r6 = r4
        L54:
            int r7 = r1.size()
            if (r6 >= r7) goto L6a
            java.lang.Object r7 = r1.get(r6)
            lؔؗ۟ r7 = (defpackage.C2427l) r7
            android.os.Bundle r7 = r7.crashlytics(r5, r4)
            r2.crashlytics(r7)
            int r6 = r6 + 1
            goto L54
        L6a:
            lْ۠ؒ r1 = r2.mopub()
            r10.<init>(r1)
            r3.putBinder(r0, r10)
            goto L7e
        L75:
            lؔؗ۟ r1 = (defpackage.C2427l) r1
            android.os.Bundle r10 = r1.crashlytics(r5, r4)
            r3.putBundle(r0, r10)
        L7e:
            lٖؒ۟ r8 = r8.f3379l
            r8.mo813this(r9, r3)
            return
        L84:
            defpackage.C18073l.admob()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1300l.firebase(int, lٌۦۧ):void");
    }

    public final int hashCode() {
        return Objects.hash(this.f3379l.asBinder());
    }

    @Override // defpackage.InterfaceC3270l
    public final void isPro(int i, List list) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c16971lMetrica.crashlytics(((C14869l) list.get(i2)).metrica(this.f3378l));
        }
        this.f3379l.firebase(i, c16971lMetrica.mopub());
    }

    @Override // defpackage.InterfaceC3270l
    public final void loadAd(int i) {
        this.f3379l.loadAd(i);
    }

    @Override // defpackage.InterfaceC3270l
    public final void metrica(int i, C17425l c17425l, String str) {
        this.f3379l.mo806class(i, 0, c17425l == null ? null : c17425l.loadAd(), str);
    }

    @Override // defpackage.InterfaceC3270l
    public final void purchase(int i, C12417l c12417l) {
        this.f3379l.mo812static(i, c12417l.loadAd(), Bundle.EMPTY);
    }

    @Override // defpackage.InterfaceC3270l
    public final void remoteconfig(int i, C5159l c5159l) {
        this.f3379l.mo809l(i, c5159l.loadAd());
    }

    @Override // defpackage.InterfaceC3270l
    public final void smaato(int i, C16616l c16616l) {
        this.f3379l.mo814throw(i, c16616l.crashlytics());
    }

    @Override // defpackage.InterfaceC3270l
    public final void startapp(int i, C1908l c1908l, C16616l c16616l, boolean z, boolean z2) {
        Bundle bundleTapsense;
        int i2 = this.f3378l;
        AbstractC12442l.subscription(i2 != 0);
        boolean z3 = z || !c16616l.yandex(17);
        boolean z4 = z2 || !c16616l.yandex(30);
        InterfaceC1087l interfaceC1087l = this.f3379l;
        if (i2 < 2) {
            interfaceC1087l.mo810l(i, c1908l.adcel(c16616l, z, true).tapsense(i2), z3);
            return;
        }
        C1908l c1908lAdcel = c1908l.adcel(c16616l, z, z2);
        if (interfaceC1087l instanceof BinderC11857l) {
            bundleTapsense = new Bundle();
            bundleTapsense.putBinder(C1908l.f4335const, new BinderC9305l(c1908lAdcel));
        } else {
            bundleTapsense = c1908lAdcel.tapsense(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(C3508l.amazon, z3);
        bundle.putBoolean(C3508l.purchase, z4);
        interfaceC1087l.mo811new(i, bundleTapsense, bundle);
    }

    @Override // defpackage.InterfaceC3270l
    public final void subs(int i, C17425l c17425l, String str) {
        this.f3379l.mo808l(i, 10, c17425l == null ? null : c17425l.loadAd(), str);
    }

    @Override // defpackage.InterfaceC3270l
    public final void yandex() {
        AbstractC2632l.purchase(this.f3379l);
    }
}
