package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؔؕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2394l extends AbstractC7532l {
    public final /* synthetic */ int Signature;
    public final AbstractC7532l license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2394l(AbstractC7532l abstractC7532l, int i) {
        super(3, AbstractC18202l.yandex.loadAd(int[].class), abstractC7532l.purchase, new int[0], 32);
        this.Signature = i;
        switch (i) {
            case 1:
                super(3, AbstractC18202l.yandex.loadAd(long[].class), abstractC7532l.purchase, new long[0], 32);
                this.license = abstractC7532l;
                break;
            default:
                this.license = abstractC7532l;
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public void admob(C13161l c13161l, int i, Object obj) {
        switch (this.Signature) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length != 0) {
                    super.admob(c13161l, i, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr != null && jArr.length != 0) {
                    super.admob(c13161l, i, jArr);
                    break;
                }
                break;
            default:
                super.admob(c13161l, i, obj);
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        int i = this.Signature;
        AbstractC7532l abstractC7532l = this.license;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    abstractC7532l.billing(c1080l, Integer.valueOf(iArr[length]));
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                for (int length2 = jArr.length - 1; -1 < length2; length2--) {
                    abstractC7532l.billing(c1080l, Long.valueOf(jArr[length2]));
                }
                break;
            default:
                if (obj != null && !obj.equals(abstractC7532l.loadAd)) {
                    abstractC7532l.subs(c1080l, 1, obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        int i = this.Signature;
        AbstractC7532l abstractC7532l = this.license;
        switch (i) {
            case 0:
                return new int[]{((Number) abstractC7532l.crashlytics(c7084l)).intValue()};
            case 1:
                return new long[]{((Number) abstractC7532l.crashlytics(c7084l)).longValue()};
            default:
                Object objCrashlytics = abstractC7532l.loadAd;
                long jAmazon = c7084l.amazon();
                while (true) {
                    int iMopub = c7084l.mopub();
                    if (iMopub == -1) {
                        c7084l.purchase(jAmazon);
                        return objCrashlytics;
                    }
                    if (iMopub == 1) {
                        objCrashlytics = abstractC7532l.crashlytics(c7084l);
                    } else {
                        c7084l.remoteconfig(iMopub);
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public int firebase(int i, Object obj) {
        switch (this.Signature) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.firebase(i, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.firebase(i, jArr);
            default:
                return super.firebase(i, obj);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        int i = this.Signature;
        int i2 = 0;
        AbstractC7532l abstractC7532l = this.license;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                int iIsPro = 0;
                while (i2 < length) {
                    iIsPro += abstractC7532l.isPro(Integer.valueOf(iArr[i2]));
                    i2++;
                }
                return iIsPro;
            case 1:
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                int iIsPro2 = 0;
                while (i2 < length2) {
                    iIsPro2 += abstractC7532l.isPro(Long.valueOf(jArr[i2]));
                    i2++;
                }
                return iIsPro2;
            default:
                if (obj == null || obj.equals(abstractC7532l.loadAd)) {
                    return 0;
                }
                return abstractC7532l.firebase(1, obj);
        }
    }

    @Override // defpackage.AbstractC7532l
    public final Object loadAd(C2881l c2881l) throws IOException {
        int i = this.Signature;
        AbstractC7532l abstractC7532l = this.license;
        switch (i) {
            case 0:
                return new int[]{((Number) abstractC7532l.loadAd(c2881l)).intValue()};
            case 1:
                return new long[]{((Number) abstractC7532l.loadAd(c2881l)).longValue()};
            default:
                Object objLoadAd = abstractC7532l.loadAd;
                int iCrashlytics = c2881l.crashlytics();
                while (true) {
                    int iBilling = c2881l.billing();
                    if (iBilling == -1) {
                        c2881l.amazon(iCrashlytics);
                        return objLoadAd;
                    }
                    if (iBilling == 1) {
                        objLoadAd = abstractC7532l.loadAd(c2881l);
                    } else {
                        c2881l.smaato(iBilling);
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        int i = this.Signature;
        int i2 = 0;
        AbstractC7532l abstractC7532l = this.license;
        switch (i) {
            case 0:
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i2 < length) {
                    abstractC7532l.purchase(c13161l, Integer.valueOf(iArr[i2]));
                    i2++;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    abstractC7532l.purchase(c13161l, Long.valueOf(jArr[i2]));
                    i2++;
                }
                break;
            default:
                if (obj != null && !obj.equals(abstractC7532l.loadAd)) {
                    abstractC7532l.admob(c13161l, 1, obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7532l
    public void subs(C1080l c1080l, int i, Object obj) {
        switch (this.Signature) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length != 0) {
                    super.subs(c1080l, i, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr != null && jArr.length != 0) {
                    super.subs(c1080l, i, jArr);
                    break;
                }
                break;
            default:
                super.subs(c1080l, i, obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2394l(AbstractC7532l abstractC7532l, InterfaceC1388l interfaceC1388l, Object obj) {
        super(3, interfaceC1388l, 2, obj, 32);
        this.Signature = 2;
        this.license = abstractC7532l;
    }
}
