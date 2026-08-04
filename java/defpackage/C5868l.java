package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5868l extends AbstractC17054l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13975l f12359l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f12360l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f12361l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayList f12362l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f12359l = new C13975l(4);
    }

    public C5868l(C1503l c1503l) throws EOFException {
        super(0);
        this.f12362l = new ArrayList();
        C8117l c8117l = new C8117l(c1503l);
        this.f33215l = c8117l;
        int iYandex = c8117l.yandex();
        this.f12361l = c1503l.mo712l(4L, AbstractC12379l.loadAd);
        this.f12360l = c1503l.readInt();
        int i = iYandex - 8;
        while (i >= 4) {
            String strMo712l = c1503l.mo712l(4L, AbstractC12379l.loadAd);
            i -= 4;
            if (!"\u0000\u0000\u0000\u0000".equals(strMo712l)) {
                this.f12362l.add(strMo712l);
            }
        }
        if (i != 0) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            f12359l.getClass();
            int i2 = C17500l.yandex;
            c1503l.skip(i);
        }
    }

    @Override // defpackage.AbstractC17054l
    public final String toString() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.Signature(this.f12361l, "majorBrand");
        c18449lBilling.subscription(this.f12360l, "majorBrandVersion");
        c18449lBilling.Signature(this.f12362l, "compatibleBrands");
        return c18449lBilling.toString();
    }
}
