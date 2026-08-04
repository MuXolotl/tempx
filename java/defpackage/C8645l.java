package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lًٌٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8645l implements InterfaceC12499l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3102l f17800l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17801l;

    public /* synthetic */ C8645l(InterfaceC3102l interfaceC3102l, int i) {
        this.f17801l = i;
        this.f17800l = interfaceC3102l;
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: lَٖؕ */
    public final Object mo1110l(long j, InterfaceC14029l interfaceC14029l) {
        switch (this.f17801l) {
            case 0:
                break;
        }
        return new C12121l(0L);
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: return */
    public final long mo1111return(int i, long j, long j2) {
        int i2 = this.f17801l;
        InterfaceC3102l interfaceC3102l = this.f17800l;
        switch (i2) {
            case 0:
                C13072l c13072l = (C13072l) interfaceC3102l;
                C6935l c6935l = c13072l.yandex;
                if (!((Boolean) c13072l.amazon.invoke()).booleanValue()) {
                    return 0L;
                }
                int i3 = (int) (j & 4294967295L);
                c6935l.loadAd.subs(Float.intBitsToFloat(i3) + c6935l.loadAd.admob());
                int i4 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i4) < 0.0f || Float.intBitsToFloat(i3) < 0.0f) {
                    float fAdmob = c6935l.amazon.admob();
                    c6935l.crashlytics(Float.intBitsToFloat(i3) + c6935l.amazon.admob());
                    float fAdmob2 = c6935l.amazon.admob() - fAdmob;
                    return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fAdmob2)) & 4294967295L);
                }
                if (Float.intBitsToFloat(i4) <= 0.0f) {
                    return 0L;
                }
                float fAdmob3 = c6935l.amazon.admob();
                c6935l.crashlytics(Float.intBitsToFloat(i4) + c6935l.amazon.admob());
                float fAdmob4 = c6935l.amazon.admob() - fAdmob3;
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fAdmob4)) & 4294967295L);
            default:
                C2663l c2663l = (C2663l) interfaceC3102l;
                if (((Boolean) c2663l.loadAd.invoke()).booleanValue()) {
                    C6935l c6935l2 = c2663l.yandex;
                    c6935l2.loadAd.subs(Float.intBitsToFloat((int) (j & 4294967295L)) + c6935l2.loadAd.admob());
                }
                return 0L;
        }
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: switch */
    public final long mo1112switch(int i, long j) {
        switch (this.f17801l) {
            case 0:
                C13072l c13072l = (C13072l) this.f17800l;
                C6935l c6935l = c13072l.yandex;
                if (!((Boolean) c13072l.amazon.invoke()).booleanValue()) {
                    return 0L;
                }
                int i2 = (int) (4294967295L & j);
                if (Float.intBitsToFloat(i2) > 0.0f) {
                    return 0L;
                }
                float fAdmob = c6935l.amazon.admob();
                c6935l.crashlytics(Float.intBitsToFloat(i2) + c6935l.amazon.admob());
                if (fAdmob == c6935l.amazon.admob()) {
                    return 0L;
                }
                return C1187l.yandex(0.0f, 2, j);
            default:
                return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: throws */
    public final Object mo1113throws(long j, long j2, InterfaceC14029l interfaceC14029l) {
        C11461l c11461l;
        long j3;
        int i = this.f17801l;
        InterfaceC3102l interfaceC3102l = this.f17800l;
        switch (i) {
            case 0:
                C13072l c13072l = (C13072l) interfaceC3102l;
                C6935l c6935l = c13072l.yandex;
                if (interfaceC14029l instanceof C11461l) {
                    c11461l = (C11461l) interfaceC14029l;
                    int i2 = c11461l.f23040l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11461l.f23040l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11461l = new C11461l(this, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c11461l = new C11461l(this, (AbstractC0283l) interfaceC14029l);
                }
                Object c12121l = c11461l.f23041l;
                int i3 = c11461l.f23040l;
                Object obj = EnumC9342l.f19165l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        j2 = c11461l.f23042l;
                        AbstractC2829l.crashlytics(c12121l);
                    } else {
                        if (i3 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = c11461l.f23042l;
                        AbstractC2829l.crashlytics(c12121l);
                    }
                    return new C12121l(C12121l.purchase(j3, ((C12121l) c12121l).yandex));
                }
                AbstractC2829l.crashlytics(c12121l);
                if (C12121l.crashlytics(j2) > 0.0f) {
                    c6935l.loadAd.subs(0.0f);
                }
                c11461l.f23042l = j2;
                c11461l.f23040l = 1;
                c12121l = new C12121l(0L);
                if (c12121l == obj) {
                    return obj;
                }
                long j4 = ((C12121l) c12121l).yandex;
                float fCrashlytics = C12121l.crashlytics(j2);
                C17308l c17308l = c13072l.crashlytics;
                InterfaceC1489l interfaceC1489l = c13072l.loadAd;
                c11461l.f23042l = j4;
                c11461l.f23040l = 2;
                c12121l = AbstractC18079l.mopub(c6935l, fCrashlytics, c17308l, interfaceC1489l, c11461l);
                if (c12121l == obj) {
                    return obj;
                }
                j3 = j4;
                return new C12121l(C12121l.purchase(j3, ((C12121l) c12121l).yandex));
            default:
                if (C12121l.crashlytics(j2) > 0.0f) {
                    ((C2663l) interfaceC3102l).yandex.loadAd.subs(0.0f);
                }
                return new C12121l(0L);
        }
    }
}
