package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: lؘٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17367l {
    public static final C4995l amazon;
    public static final C4995l purchase;
    public C0511l yandex;
    public static final Set loadAd = Collections.singleton(EnumC4474l.CLASS);
    public static final Set crashlytics = AbstractC8669l.m2407import(new EnumC4474l[]{EnumC4474l.FILE_FACADE, EnumC4474l.MULTIFILE_CLASS_PART});

    static {
        new C4995l(new int[]{1, 1, 2}, false);
        amazon = new C4995l(new int[]{1, 1, 11}, false);
        purchase = new C4995l(new int[]{1, 1, 13}, false);
    }

    public final C4995l amazon() {
        C0511l c0511l = this.yandex;
        if (c0511l == null) {
            c0511l = null;
        }
        ((C17334l) c0511l.crashlytics).getClass();
        return C4995l.mopub;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final C8160l billing(C5222l c5222l) {
        C8195l c8195lBilling;
        C11906l c11906l = c5222l.loadAd;
        String[] strArr = (String[]) c11906l.purchase;
        if (strArr == null) {
            strArr = (String[]) c11906l.billing;
        }
        if (strArr != null) {
            if (!loadAd.contains((EnumC4474l) c11906l.crashlytics)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            C4995l c4995l = (C4995l) c11906l.amazon;
            String[] strArr2 = (String[]) c11906l.mopub;
            try {
                if (strArr2 != null) {
                    try {
                        c8195lBilling = C11682l.billing(strArr, strArr2);
                        if (c8195lBilling != null) {
                            C2962l c2962l = (C2962l) c8195lBilling.f17098l;
                            C6582l c6582l = (C6582l) c8195lBilling.f17097l;
                            crashlytics(c5222l);
                            purchase(c5222l);
                            loadAd(c5222l);
                            return new C8160l(c2962l, c6582l, c4995l, new C3820l(c5222l));
                        }
                    } catch (C12383l e) {
                        throw new IllegalStateException("Could not read data from ".concat(c5222l.yandex()), e);
                    }
                }
            } catch (Throwable th) {
                C0511l c0511l = this.yandex;
                if (c0511l == null) {
                    c0511l = null;
                }
                ((C17334l) c0511l.crashlytics).getClass();
                C4995l c4995lAmazon = amazon();
                C4995l c4995l2 = c4995l.billing ? C4995l.mopub : C4995l.admob;
                int i = c4995l2.loadAd;
                int i2 = c4995lAmazon.loadAd;
                if (i > i2 || (i >= i2 && c4995l2.crashlytics > c4995lAmazon.crashlytics)) {
                    c4995lAmazon = c4995l2;
                }
                int i3 = c4995l.crashlytics;
                int i4 = c4995l.loadAd;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = c4995lAmazon.loadAd;
                    if (i4 > i5 || (i4 >= i5 && i3 > c4995lAmazon.crashlytics)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                c8195lBilling = null;
            }
        }
        return null;
    }

    public final C16277l crashlytics(C5222l c5222l) {
        C0511l c0511l = this.yandex;
        if (c0511l == null) {
            c0511l = null;
        }
        ((C17334l) c0511l.crashlytics).getClass();
        C4995l c4995l = (C4995l) c5222l.loadAd.amazon;
        C4995l c4995lAmazon = amazon();
        C4995l c4995l2 = c4995l.billing ? C4995l.mopub : C4995l.admob;
        int i = c4995l2.loadAd;
        int i2 = c4995lAmazon.loadAd;
        if (i > i2 || (i >= i2 && c4995l2.crashlytics > c4995lAmazon.crashlytics)) {
            c4995lAmazon = c4995l2;
        }
        int i3 = c4995l.crashlytics;
        int i4 = c4995l.loadAd;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = c4995lAmazon.loadAd;
            if (i4 > i5 || (i4 >= i5 && i3 > c4995lAmazon.crashlytics)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        C4995l c4995l3 = (C4995l) c5222l.loadAd.amazon;
        C4995l c4995l4 = C4995l.mopub;
        C4995l c4995lAmazon2 = amazon();
        C4995l c4995lAmazon3 = amazon();
        boolean z2 = c4995l3.billing;
        c4995lAmazon3.getClass();
        C4995l c4995l5 = z2 ? c4995l4 : C4995l.admob;
        int i6 = c4995l5.loadAd;
        int i7 = c4995lAmazon3.loadAd;
        return new C16277l(c4995l3, c4995l4, c4995lAmazon2, (i6 <= i7 && (i6 < i7 || c4995l5.crashlytics <= c4995lAmazon3.crashlytics)) ? c4995lAmazon3 : c4995l5, c5222l.yandex());
    }

    public final int loadAd(C5222l c5222l) {
        C0511l c0511l = this.yandex;
        if (c0511l == null) {
            c0511l = null;
        }
        ((C17334l) c0511l.crashlytics).getClass();
        int i = c5222l.loadAd.loadAd;
        return ((i & 16) == 0 || (i & 32) != 0) ? 1 : 2;
    }

    public final boolean purchase(C5222l c5222l) {
        C0511l c0511l = this.yandex;
        if (c0511l == null) {
            c0511l = null;
        }
        ((C17334l) c0511l.crashlytics).getClass();
        C0511l c0511l2 = this.yandex;
        ((C17334l) (c0511l2 != null ? c0511l2 : null).crashlytics).getClass();
        return (c5222l.loadAd.loadAd & 2) != 0 && ((C4995l) c5222l.loadAd.amazon).equals(amazon);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public final C12181l yandex(InterfaceC9921l interfaceC9921l, C5222l c5222l) {
        C8195l c8195lSubs;
        C11906l c11906l = c5222l.loadAd;
        String[] strArr = (String[]) c11906l.purchase;
        if (strArr == null) {
            strArr = (String[]) c11906l.billing;
        }
        if (strArr != null) {
            if (!crashlytics.contains((EnumC4474l) c11906l.crashlytics)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            C4995l c4995l = (C4995l) c11906l.amazon;
            String[] strArr2 = (String[]) c11906l.mopub;
            try {
                if (strArr2 != null) {
                    try {
                        c8195lSubs = C11682l.subs(strArr, strArr2);
                        if (c8195lSubs != null) {
                            C2962l c2962l = (C2962l) c8195lSubs.f17098l;
                            C5665l c5665l = (C5665l) c8195lSubs.f17097l;
                            crashlytics(c5222l);
                            purchase(c5222l);
                            loadAd(c5222l);
                            C8269l c8269l = new C8269l(c5222l, c5665l, c2962l);
                            C0511l c0511l = this.yandex;
                            return new C12181l(interfaceC9921l, c5665l, c2962l, c4995l, c8269l, c0511l != null ? c0511l : null, "scope for " + c8269l + " in " + interfaceC9921l, C15152l.f29733l);
                        }
                    } catch (C12383l e) {
                        throw new IllegalStateException("Could not read data from ".concat(c5222l.yandex()), e);
                    }
                }
            } catch (Throwable th) {
                C0511l c0511l2 = this.yandex;
                if (c0511l2 == null) {
                    c0511l2 = null;
                }
                ((C17334l) c0511l2.crashlytics).getClass();
                C4995l c4995lAmazon = amazon();
                C4995l c4995l2 = c4995l.billing ? C4995l.mopub : C4995l.admob;
                int i = c4995l2.loadAd;
                int i2 = c4995lAmazon.loadAd;
                if (i > i2 || (i >= i2 && c4995l2.crashlytics > c4995lAmazon.crashlytics)) {
                    c4995lAmazon = c4995l2;
                }
                int i3 = c4995l.crashlytics;
                int i4 = c4995l.loadAd;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = c4995lAmazon.loadAd;
                    if (i4 > i5 || (i4 >= i5 && i3 > c4995lAmazon.crashlytics)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                c8195lSubs = null;
            }
        }
        return null;
    }
}
