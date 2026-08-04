package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؕۙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3599l extends AbstractC10033l {
    public static final byte[] admob;
    public static final C12105l billing;
    public static final byte[] mopub;
    public static final C12105l purchase;
    public static final byte[] subs;
    public long amazon;
    public final C12105l crashlytics;
    public final List loadAd;
    public final C3844l yandex;

    static {
        C11155l c11155l = C12105l.amazon;
        purchase = AbstractC0775l.m674strictfp("multipart/mixed");
        AbstractC0775l.m674strictfp("multipart/alternative");
        AbstractC0775l.m674strictfp("multipart/digest");
        AbstractC0775l.m674strictfp("multipart/parallel");
        billing = AbstractC0775l.m674strictfp("multipart/form-data");
        mopub = new byte[]{58, 32};
        admob = new byte[]{13, 10};
        subs = new byte[]{45, 45};
    }

    public C3599l(C3844l c3844l, C12105l c12105l, List list) {
        this.yandex = c3844l;
        this.loadAd = list;
        C11155l c11155l = C12105l.amazon;
        this.crashlytics = AbstractC0775l.m674strictfp(c12105l + "; boundary=" + c3844l.tapsense());
        this.amazon = -1L;
    }

    @Override // defpackage.AbstractC10033l
    public final boolean billing() {
        List list = this.loadAd;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16995l c16995l = ((C2843l) it.next()).loadAd;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long firebase(InterfaceC16805l interfaceC16805l, boolean z) throws Exception {
        C0869l c0869l;
        InterfaceC16805l c0869l2;
        if (z) {
            c0869l2 = new C0869l();
            c0869l = c0869l2;
        } else {
            c0869l = 0;
            c0869l2 = interfaceC16805l;
        }
        List list = this.loadAd;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C3844l c3844l = this.yandex;
            byte[] bArr = subs;
            byte[] bArr2 = admob;
            if (i >= size) {
                c0869l2.write(bArr);
                c0869l2.appmetrica(c3844l);
                c0869l2.write(bArr);
                c0869l2.write(bArr2);
                if (!z) {
                    return j;
                }
                long j2 = j + c0869l.f2526l;
                c0869l.yandex();
                return j2;
            }
            C2843l c2843l = (C2843l) list.get(i);
            C8309l c8309l = c2843l.yandex;
            C16995l c16995l = c2843l.loadAd;
            C16995l c16995l2 = (C16995l) c16995l.loadAd;
            c0869l2.write(bArr);
            c0869l2.appmetrica(c3844l);
            c0869l2.write(bArr2);
            int size2 = c8309l.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c0869l2.mo706finally(c8309l.billing(i2)).write(mopub).mo706finally(c8309l.firebase(i2)).write(bArr2);
            }
            C12105l c12105l = (C12105l) c16995l2.loadAd;
            if (c12105l != null) {
                c0869l2.mo706finally("Content-Type: ").mo706finally(c12105l.yandex).write(bArr2);
            }
            long jYandex = c16995l2.yandex();
            if (jYandex == -1 && z) {
                c0869l.yandex();
                return -1L;
            }
            c0869l2.write(bArr2);
            if (z) {
                j += jYandex;
            } else {
                c16995l.isPro(c0869l2);
            }
            c0869l2.write(bArr2);
            i++;
        }
    }

    @Override // defpackage.AbstractC10033l
    public final void isPro(InterfaceC16805l interfaceC16805l) throws Exception {
        firebase(interfaceC16805l, false);
    }

    @Override // defpackage.AbstractC10033l
    public final C12105l loadAd() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC10033l
    public final long yandex() throws Exception {
        long j = this.amazon;
        if (j != -1) {
            return j;
        }
        long jFirebase = firebase(null, true);
        this.amazon = jFirebase;
        return jFirebase;
    }
}
