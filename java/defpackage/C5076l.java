package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؗۖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5076l extends AbstractC10015l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C13975l f11088l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f11089l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f11090l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f11088l = new C13975l(4);
    }

    public final void yandex() {
        C12645l c12645l = this.f8893l;
        int i = 0;
        byte b = c12645l.amazon()[0];
        byte[] bArrAmazon = c12645l.amazon();
        C13975l c13975l = AbstractC14375l.yandex;
        AbstractC14375l.amazon(ByteBuffer.wrap(bArrAmazon), 1, 2);
        this.f11089l = null;
        this.f11090l = null;
        for (int i2 = 5; i2 < c12645l.amazon().length - 1; i2 += 2) {
            if (c12645l.amazon()[i2] == 0 && c12645l.amazon()[i2 + 1] == 0) {
                if (this.f11089l == null) {
                    this.f11089l = new String(c12645l.amazon(), 5, i2 - 5, "UTF-16LE");
                    i = i2 + 2;
                } else if (this.f11090l == null) {
                    this.f11090l = new String(c12645l.amazon(), i, i2 - i, "UTF-16LE");
                    return;
                }
            }
        }
    }
}
