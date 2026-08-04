package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lۣؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5254l extends AbstractC17054l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C5254l f11335l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f11336l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f11337l;

    static {
        String str = "*";
        f11335l = new C5254l(str, str);
    }

    public C5254l(String str, String str2, String str3, List list) {
        super(str3, list, false, 11);
        this.f11337l = str;
        this.f11336l = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5254l)) {
            return false;
        }
        C5254l c5254l = (C5254l) obj;
        return AbstractC16648l.license(this.f11337l, c5254l.f11337l, true) && AbstractC16648l.license(this.f11336l, c5254l.f11336l, true) && AbstractC8576l.yandex((List) this.f33214l, (List) c5254l.f33214l);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int iHashCode = this.f11337l.toLowerCase(locale).hashCode();
        int iHashCode2 = this.f11336l.toLowerCase(locale).hashCode();
        return (((List) this.f33214l).hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final boolean m1754l(C5254l c5254l) {
        boolean zLicense;
        String str = c5254l.f11336l;
        String str2 = c5254l.f11337l;
        if ((AbstractC8576l.yandex(str2, "*") || AbstractC16648l.license(str2, this.f11337l, true)) && (AbstractC8576l.yandex(str, "*") || AbstractC16648l.license(str, this.f11336l, true))) {
            for (C14345l c14345l : (List) c5254l.f33214l) {
                String str3 = c14345l.yandex;
                String str4 = c14345l.loadAd;
                if (!AbstractC8576l.yandex(str3, "*")) {
                    String strM4259l = m4259l(str3);
                    zLicense = AbstractC8576l.yandex(str4, "*") ? strM4259l != null : AbstractC16648l.license(strM4259l, str4, true);
                } else if (!AbstractC8576l.yandex(str4, "*")) {
                    List list = (List) this.f33214l;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (AbstractC16648l.license(((C14345l) it.next()).loadAd, str4, true)) {
                                }
                            }
                        }
                    }
                }
                if (!zLicense) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final C5254l m1755l() {
        return ((List) this.f33214l).isEmpty() ? this : new C5254l(this.f11337l, this.f11336l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (defpackage.AbstractC16648l.license(r1.loadAd, r7, true) != false) goto L21;
     */
    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C5254l m1756l(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f33214l
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L4f
            r3 = 1
            if (r1 == r3) goto L37
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L4f
        L16:
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r1.next()
            lؘٓۗ r4 = (defpackage.C14345l) r4
            java.lang.String r5 = r4.yandex
            boolean r5 = defpackage.AbstractC16648l.license(r5, r2, r3)
            if (r5 == 0) goto L1a
            java.lang.String r4 = r4.loadAd
            boolean r4 = defpackage.AbstractC16648l.license(r4, r7, r3)
            if (r4 == 0) goto L1a
            goto L4e
        L37:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            lؘٓۗ r1 = (defpackage.C14345l) r1
            java.lang.String r4 = r1.yandex
            boolean r4 = defpackage.AbstractC16648l.license(r4, r2, r3)
            if (r4 == 0) goto L4f
            java.lang.String r1 = r1.loadAd
            boolean r1 = defpackage.AbstractC16648l.license(r1, r7, r3)
            if (r1 == 0) goto L4f
        L4e:
            return r6
        L4f:
            lۣؗۨ r1 = new lۣؗۨ
            java.lang.Object r3 = r6.f33215l
            java.lang.String r3 = (java.lang.String) r3
            lؘٓۗ r4 = new lؘٓۗ
            r4.<init>(r2, r7)
            java.util.ArrayList r7 = defpackage.AbstractC16901l.m4218final(r4, r0)
            java.lang.String r0 = r6.f11337l
            java.lang.String r6 = r6.f11336l
            r1.<init>(r0, r6, r3, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5254l.m1756l(java.lang.String):lۣؗۨ");
    }

    public C5254l(String str, String str2, List list) {
        this(str, str2, AbstractC11043l.admob('/', str, str2), list);
    }

    public /* synthetic */ C5254l(String str, String str2) {
        this(str, str2, C2580l.f5619l);
    }
}
