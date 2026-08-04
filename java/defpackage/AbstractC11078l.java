package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lُٖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11078l {
    public C13161l yandex;
    public static final Logger loadAd = Logger.getLogger(AbstractC11078l.class.getName());
    public static final boolean crashlytics = AbstractC10176l.purchase;

    public static int amazon(String str) {
        int length;
        try {
            length = AbstractC11523l.loadAd(str);
        } catch (C16458l unused) {
            length = str.getBytes(AbstractC6320l.yandex).length;
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

    public static int yandex(int i, AbstractC16071l abstractC16071l) {
        int iPurchase = purchase(i);
        int size = abstractC16071l.size();
        return billing(size) + size + iPurchase;
    }

    public abstract void Signature(int i, int i2);

    public abstract void ad(int i, long j);

    public abstract void adcel(int i);

    public final void admob(String str, C16458l c16458l) throws C8413l {
        loadAd.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c16458l);
        byte[] bytes = str.getBytes(AbstractC6320l.yandex);
        try {
            pro(bytes.length);
            ads(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C8413l(e);
        }
    }

    public abstract void ads(int i, int i2, byte[] bArr);

    public abstract void advert(long j);

    public abstract void firebase(int i, AbstractC16071l abstractC16071l);

    public abstract void isPro(int i, boolean z);

    public abstract void license(int i, int i2);

    public abstract void metrica(long j);

    public abstract void pro(int i);

    public abstract void remoteconfig(int i);

    public abstract void smaato(int i, int i2);

    public abstract void startapp(int i, int i2);

    public abstract void subs(byte b);

    public abstract void subscription(int i, AbstractC9446l abstractC9446l, InterfaceC9608l interfaceC9608l);

    public abstract void tapsense(int i, String str);

    public abstract void vip(int i, long j);
}
