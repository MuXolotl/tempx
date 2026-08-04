package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14719l implements InterfaceC13142l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function2 f28780l;

    public C14719l(Function2 function2) {
        this.f28780l = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14719l) && AbstractC8576l.yandex(this.f28780l, ((C14719l) obj).f28780l);
    }

    @Override // defpackage.InterfaceC13142l
    public final void firebase(C2566l c2566l) {
        int i;
        int i2;
        int i3;
        C5667l c5667lAdmob = C2566l.admob(c2566l, 0L, null, 15);
        C5667l c5667l = c2566l.f5581l;
        CharSequence charSequence = (CharSequence) this.f28780l.invoke(c5667l, c5667lAdmob);
        if (charSequence == c5667lAdmob) {
            return;
        }
        C13545l c13545l = c2566l.f5577l;
        boolean z = false;
        if (charSequence != c5667l) {
            int length = c13545l.length();
            int length2 = charSequence.length();
            if (c13545l.length() <= 0 || charSequence.length() <= 0) {
                i = 0;
                i2 = 0;
                i3 = length2;
            } else {
                int i4 = 0;
                boolean z2 = false;
                int i5 = length2;
                int i6 = 0;
                while (true) {
                    if (!z) {
                        if (c13545l.charAt(i6) == charSequence.charAt(i4)) {
                            i6++;
                            i4++;
                        } else {
                            z = true;
                        }
                    }
                    if (!z2) {
                        if (c13545l.charAt(length - 1) == charSequence.charAt(i5 - 1)) {
                            length--;
                            i5--;
                        } else {
                            z2 = true;
                        }
                    }
                    if (i6 >= length || i4 >= i5 || (z && z2)) {
                        break;
                    }
                }
                i = i6;
                i2 = i4;
                i3 = i5;
            }
            int i7 = length;
            if (i < i7 || i2 < i3) {
                c2566l.amazon(i, i7, charSequence, i2, i3);
                return;
            }
            return;
        }
        int length3 = c13545l.length();
        CharSequence charSequence2 = c5667l.f12057l;
        C1343l c1343l = c5667l.f12058l;
        c2566l.crashlytics(0, length3, charSequence2.toString());
        c2566l.mopub(c5667l.f12061l);
        c2566l.yandex().premium();
        C1257l c1257l = c2566l.f5583l;
        if (c1343l == null) {
            if (c1257l != null) {
                C14261l c14261l = c1257l.loadAd;
                c14261l.amazon = c14261l.purchase;
                C9571l c9571l = c14261l.loadAd;
                c9571l.purchase(4, c9571l.loadAd);
                C12463l c12463l = c14261l.yandex;
                c12463l.vip(1, c12463l.loadAd);
                c14261l.crashlytics = 0;
                return;
            }
            return;
        }
        if (c1257l == null) {
            c1257l = new C1257l((C1257l) null, 3);
            c2566l.f5583l = c1257l;
        }
        C1257l c1257l2 = c1343l.yandex;
        if (!c1257l.yandex) {
            AbstractC14825l.crashlytics("This buffer is immutable");
        }
        c1257l.crashlytics = c1257l2.crashlytics;
        c1257l.amazon = c1257l2.amazon;
        C14261l c14261l2 = c1257l.loadAd;
        C14261l c14261l3 = c1257l2.loadAd;
        C12463l c12463l2 = c14261l2.yandex;
        C9571l c9571l2 = c14261l2.loadAd;
        if (c14261l3.amazon == c14261l3.purchase) {
            c14261l2.amazon = c14261l2.purchase;
            c9571l2.purchase(4, c9571l2.loadAd);
            C12463l c12463l3 = c14261l2.yandex;
            c12463l3.vip(1, c12463l3.loadAd);
            c14261l2.crashlytics = 0;
            return;
        }
        c9571l2.loadAd = 0;
        c9571l2.loadAd(0, c14261l3.loadAd);
        c12463l2.billing();
        c12463l2.loadAd(c14261l3.yandex);
        c14261l2.amazon = c14261l3.amazon;
        c14261l2.crashlytics = c14261l3.crashlytics;
    }

    public final int hashCode() {
        return this.f28780l.hashCode();
    }

    @Override // defpackage.InterfaceC13142l
    public final /* synthetic */ C3790l metrica() {
        return null;
    }

    public final String toString() {
        return "InputTransformation.byValue(transformation=" + this.f28780l + ")";
    }

    @Override // defpackage.InterfaceC13142l
    public final /* synthetic */ void isPro(InterfaceC17593l interfaceC17593l) {
    }
}
