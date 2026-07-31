package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٔۧ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15335l {
    public C5138l yandex;
    public static final Logger loadAd = Logger.getLogger(AbstractC15335l.class.getName());
    public static final boolean crashlytics = AbstractC1900l.purchase;

    public static int amazon(String str) {
        int length;
        try {
            length = AbstractC3472l.loadAd(str);
        } catch (C13717l unused) {
            length = str.getBytes(AbstractC6061l.yandex).length;
        }
        return billing(length) + length;
    }

    public static int billing(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int crashlytics(long j) {
        return mopub((j >> 63) ^ (j << 1));
    }

    public static int loadAd(int i) {
        return billing((i >> 31) ^ (i << 1));
    }

    public static int mopub(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int purchase(int i) {
        return billing(i << 3);
    }

    public static int yandex(int i, AbstractC15257l abstractC15257l) {
        int iPurchase = purchase(i);
        int size = abstractC15257l.size();
        return billing(size) + size + iPurchase;
    }

    public abstract void Signature(int i, int i2);

    public abstract void ad(long j);

    public abstract void adcel(int i);

    public final void admob(String str, C13717l c13717l) throws C8413l {
        loadAd.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c13717l);
        byte[] bytes = str.getBytes(AbstractC6061l.yandex);
        try {
            license(bytes.length);
            ads(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        }
    }

    public abstract void ads(int i, int i2, byte[] bArr);

    public abstract void firebase(int i, AbstractC15257l abstractC15257l);

    public abstract void isPro(int i, boolean z);

    public abstract void license(int i);

    public abstract void metrica(long j);

    public abstract void pro(int i, long j);

    public abstract void remoteconfig(int i);

    public abstract void smaato(int i, int i2);

    public abstract void startapp(int i, int i2);

    public abstract void subs(byte b);

    public abstract void subscription(int i, String str);

    public abstract void tapsense(int i, int i2);

    public abstract void vip(int i, long j);
}
