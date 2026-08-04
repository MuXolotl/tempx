package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؕۤؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3745l {
    public int admob;
    public final C1503l amazon;
    public long crashlytics;
    public int mopub;
    public int yandex = 4096;
    public final ArrayList loadAd = new ArrayList();
    public C18464l[] purchase = new C18464l[8];
    public int billing = 7;

    public C3745l(C7846l c7846l) {
        this.amazon = new C1503l(c7846l);
    }

    public final void amazon(C18464l c18464l) {
        yandex(c18464l);
        int i = c18464l.crashlytics;
        int i2 = this.yandex;
        if (i > i2) {
            AbstractC8669l.m2414strictfp(this.purchase, null);
            this.billing = this.purchase.length - 1;
            this.mopub = 0;
            this.admob = 0;
            return;
        }
        loadAd((this.admob + i) - i2);
        int i3 = this.mopub + 1;
        C18464l[] c18464lArr = this.purchase;
        if (i3 > c18464lArr.length) {
            C18464l[] c18464lArr2 = new C18464l[c18464lArr.length * 2];
            System.arraycopy(c18464lArr, 0, c18464lArr2, c18464lArr.length, c18464lArr.length);
            this.billing = this.purchase.length - 1;
            this.purchase = c18464lArr2;
        }
        int i4 = this.billing;
        this.billing = i4 - 1;
        this.purchase[i4] = c18464l;
        this.mopub++;
        this.admob += i;
    }

    public final int billing(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte b = this.amazon.readByte();
            byte[] bArr = AbstractC7712l.yandex;
            i4++;
            long j2 = ((long) (b & 127)) << i5;
            if (j2 > 2147483647L - j) {
                C18262l.metrica("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((b & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        C18262l.metrica("HPACK integer overflow");
        return 0;
    }

    public final C3844l crashlytics(int i) throws IOException {
        if (i >= 0) {
            C18464l[] c18464lArr = AbstractC14199l.yandex;
            if (i <= c18464lArr.length - 1) {
                return c18464lArr[i].yandex;
            }
        }
        int length = this.billing + 1 + (i - AbstractC14199l.yandex.length);
        if (length >= 0) {
            C18464l[] c18464lArr2 = this.purchase;
            if (length < c18464lArr2.length) {
                return c18464lArr2[length].yandex;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final int loadAd(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.purchase.length;
            while (true) {
                length--;
                i2 = this.billing;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.purchase[length].crashlytics;
                i -= i4;
                this.admob -= i4;
                this.mopub--;
                i3++;
            }
            C18464l[] c18464lArr = this.purchase;
            System.arraycopy(c18464lArr, i2 + 1, c18464lArr, i2 + 1 + i3, this.mopub);
            this.billing += i3;
        }
        return i3;
    }

    public final C3844l purchase() {
        C1503l c1503l = this.amazon;
        byte b = c1503l.readByte();
        byte[] bArr = AbstractC7712l.yandex;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jBilling = billing(i, 127);
        if (this.crashlytics + jBilling > 262144) {
            C18262l.metrica("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return c1503l.premium(jBilling);
        }
        C0869l c0869l = new C0869l();
        C5601l c5601l = AbstractC18711l.crashlytics;
        C5601l c5601l2 = c5601l;
        int i3 = 0;
        for (long j = 0; j < jBilling; j++) {
            byte b2 = c1503l.readByte();
            byte[] bArr2 = AbstractC7712l.yandex;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                c5601l2 = ((C5601l[]) c5601l2.f11899l)[(i2 >>> (i3 - 8)) & 255];
                if (((C5601l[]) c5601l2.f11899l) == null) {
                    c0869l.m709instanceof(c5601l2.f11897l);
                    i3 -= c5601l2.f11896l;
                    c5601l2 = c5601l;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C5601l c5601l3 = ((C5601l[]) c5601l2.f11899l)[(i2 << (8 - i3)) & 255];
            C5601l[] c5601lArr = (C5601l[]) c5601l3.f11899l;
            int i4 = c5601l3.f11896l;
            if (c5601lArr != null || i4 > i3) {
                break;
            }
            c0869l.m709instanceof(c5601l3.f11897l);
            i3 -= i4;
            c5601l2 = c5601l;
        }
        return c0869l.premium(c0869l.f2526l);
    }

    public final void yandex(C18464l c18464l) {
        this.loadAd.add(c18464l);
        long jPurchase = this.crashlytics + ((long) (c18464l.loadAd.purchase() + c18464l.yandex.purchase()));
        this.crashlytics = jPurchase;
        if (jPurchase <= 262144) {
            return;
        }
        C18262l.metrica("header byte count limit of 262144 exceeded");
    }
}
