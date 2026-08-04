package defpackage;

/* JADX INFO: renamed from: lًُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10908l {
    public static final boolean loadAd = AbstractC1823l.amazon;
    public C15714l yandex;

    public static int loadAd(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int yandex(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract void Signature(long j);

    public abstract void adcel(int i);

    public abstract void admob(int i, long j);

    public abstract void ads(int i);

    public abstract void amazon(int i, int i2);

    public abstract void billing(int i, int i2);

    public abstract void crashlytics(int i, int i2, byte[] bArr);

    public abstract void firebase(int i, String str);

    public abstract void isPro(int i, boolean z);

    public abstract void license(String str);

    public abstract void metrica(AbstractC12570l abstractC12570l);

    public abstract void mopub(int i, int i2);

    public abstract void purchase(int i, int i2);

    public abstract void remoteconfig(AbstractC15619l abstractC15619l);

    public abstract void smaato(int i, AbstractC15619l abstractC15619l);

    public abstract void startapp(byte b);

    public abstract void subs(int i, long j);

    public abstract void subscription(int i);

    public abstract void tapsense(long j);

    public abstract void vip(int i, byte[] bArr);
}
