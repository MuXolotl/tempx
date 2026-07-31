package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٔۗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15092l extends AbstractC11737l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f29622l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f29623l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f29624l;

    public C15092l(InterfaceC14991l interfaceC14991l, long j, boolean z) {
        super(interfaceC14991l);
        this.f29623l = j;
        this.f29622l = z;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        long j2 = this.f29624l;
        long j3 = this.f29623l;
        if (j2 > j3) {
            j = 0;
        } else if (this.f29622l) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jAd = this.f23514l.ad(c0869l, j);
        if (jAd != -1) {
            this.f29624l += jAd;
        }
        long j5 = this.f29624l;
        if ((j5 >= j3 || jAd != -1) && j5 <= j3) {
            return jAd;
        }
        if (jAd > 0 && j5 > j3) {
            long j6 = c0869l.f2526l - (j5 - j3);
            C0869l c0869l2 = new C0869l();
            c0869l2.mo736volatile(c0869l);
            c0869l.mo390break(c0869l2, j6);
            c0869l2.yandex();
        }
        StringBuilder sbSignature = AbstractC0653l.Signature(j3, "expected ", " bytes but got ");
        sbSignature.append(this.f29624l);
        throw new IOException(sbSignature.toString());
    }
}
