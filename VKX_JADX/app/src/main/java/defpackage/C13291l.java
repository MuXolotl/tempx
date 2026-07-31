package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lُْٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13291l extends AbstractC17897l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C3202l[] f26078l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C3202l f26079l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17675l f26080l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final WeakHashMap f26081l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f26082l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f26083l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f26084l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f26085l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C13381l f26086l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final InterfaceC16922l f26087l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f26088l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C3952l f26089l;

    static {
        C3202l c3202l = new C3202l(1);
        f26079l = c3202l;
        C3202l[] c3202lArr = new C3202l[129];
        f26078l = c3202lArr;
        c3202lArr[1] = c3202l;
        int i = 2;
        while (true) {
            C3202l[] c3202lArr2 = f26078l;
            if (i >= c3202lArr2.length) {
                return;
            }
            c3202lArr2[i] = new C3202l(i);
            i++;
        }
    }

    public C13291l(C17675l c17675l, C13381l c13381l, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f26080l = c17675l;
        this.f26086l = c13381l;
        this.f26084l = i;
        this.f26083l = AbstractC14024l.crashlytics(bArr);
        this.f26085l = i2;
        this.f26088l = AbstractC14024l.crashlytics(bArr2);
        this.f26082l = 1 << (c17675l.crashlytics + 1);
        this.f26081l = new WeakHashMap();
        this.f26087l = AbstractC9151l.purchase(c17675l.loadAd, c17675l.amazon);
    }

    public static C13291l purchase(Object obj) throws Throwable {
        Throwable th;
        if (obj instanceof C13291l) {
            return (C13291l) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                C8339l.smaato("expected version 0 lms private key");
                return null;
            }
            C17675l c17675l = (C17675l) C17675l.purchase.get(Integer.valueOf(dataInputStream2.readInt()));
            C13381l c13381l = (C13381l) C13381l.mopub.get(Integer.valueOf(dataInputStream2.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int i = dataInputStream2.readInt();
            int i2 = dataInputStream2.readInt();
            int i3 = dataInputStream2.readInt();
            if (i3 < 0) {
                C8339l.smaato("secret length less than zero");
                return null;
            }
            if (i3 <= dataInputStream2.available()) {
                byte[] bArr2 = new byte[i3];
                dataInputStream2.readFully(bArr2);
                return new C13291l(c17675l, c13381l, i, bArr, i2, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream2.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return purchase(AbstractC7016l.crashlytics((InputStream) obj));
            }
            C8339l.metrica(AbstractC15560l.subscription(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C13291l c13291lPurchase = purchase(dataInputStream3);
                dataInputStream3.close();
                return c13291lPurchase;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized int amazon() {
        return this.f26084l;
    }

    public final C3952l billing() {
        C3952l c3952l;
        synchronized (this) {
            try {
                if (this.f26089l == null) {
                    this.f26089l = new C3952l(this.f26080l, this.f26086l, crashlytics(f26079l), this.f26083l);
                }
                c3952l = this.f26089l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3952l;
    }

    public final byte[] crashlytics(C3202l c3202l) {
        synchronized (this.f26081l) {
            try {
                byte[] bArr = (byte[]) this.f26081l.get(c3202l);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArrYandex = yandex(c3202l.yandex);
                this.f26081l.put(c3202l, bArrYandex);
                return bArrYandex;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13291l.class != obj.getClass()) {
            return false;
        }
        C13291l c13291l = (C13291l) obj;
        if (this.f26084l != c13291l.f26084l || this.f26085l != c13291l.f26085l || !Arrays.equals(this.f26083l, c13291l.f26083l)) {
            return false;
        }
        C17675l c17675l = c13291l.f26080l;
        C17675l c17675l2 = this.f26080l;
        if (c17675l2 == null ? c17675l != null : !c17675l2.equals(c17675l)) {
            return false;
        }
        C13381l c13381l = c13291l.f26086l;
        C13381l c13381l2 = this.f26086l;
        if (c13381l2 == null ? c13381l == null : c13381l2.equals(c13381l)) {
            return Arrays.equals(this.f26088l, c13291l.f26088l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        C1770l c1770l = new C1770l(8);
        c1770l.tapsense(0);
        c1770l.tapsense(this.f26080l.yandex);
        c1770l.tapsense(this.f26086l.yandex);
        c1770l.crashlytics(this.f26083l);
        c1770l.tapsense(this.f26084l);
        c1770l.tapsense(this.f26085l);
        byte[] bArr = this.f26088l;
        c1770l.tapsense(bArr.length);
        c1770l.crashlytics(bArr);
        return ((ByteArrayOutputStream) c1770l.f4179l).toByteArray();
    }

    public final int hashCode() {
        int iAds = (AbstractC14024l.ads(this.f26083l) + (this.f26084l * 31)) * 31;
        C17675l c17675l = this.f26080l;
        int iHashCode = (iAds + (c17675l != null ? c17675l.hashCode() : 0)) * 31;
        C13381l c13381l = this.f26086l;
        return AbstractC14024l.ads(this.f26088l) + ((((iHashCode + (c13381l != null ? c13381l.hashCode() : 0)) * 31) + this.f26085l) * 31);
    }

    public final byte[] loadAd(int i) {
        if (i < this.f26082l) {
            return crashlytics(i < 129 ? f26078l[i] : new C3202l(i));
        }
        return yandex(i);
    }

    public final synchronized void mopub() {
        this.f26084l++;
    }

    public final byte[] yandex(int i) {
        byte[] bArr;
        int i2 = 1 << this.f26080l.crashlytics;
        byte[] bArr2 = this.f26083l;
        InterfaceC16922l interfaceC16922l = this.f26087l;
        if (i < i2) {
            int i3 = i * 2;
            byte[] bArrLoadAd = loadAd(i3);
            byte[] bArrLoadAd2 = loadAd(i3 + 1);
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr2);
            interfaceC16922l.update(bArrCrashlytics, 0, bArrCrashlytics.length);
            AbstractC12366l.loadAd(i, interfaceC16922l);
            interfaceC16922l.update((byte) -125);
            interfaceC16922l.update((byte) -125);
            interfaceC16922l.update(bArrLoadAd, 0, bArrLoadAd.length);
            interfaceC16922l.update(bArrLoadAd2, 0, bArrLoadAd2.length);
            byte[] bArr3 = new byte[interfaceC16922l.getDigestSize()];
            interfaceC16922l.doFinal(bArr3, 0);
            return bArr3;
        }
        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArr2);
        interfaceC16922l.update(bArrCrashlytics2, 0, bArrCrashlytics2.length);
        AbstractC12366l.loadAd(i, interfaceC16922l);
        interfaceC16922l.update((byte) -126);
        interfaceC16922l.update((byte) -126);
        byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(bArr2);
        int i4 = i - i2;
        byte[] bArrCrashlytics4 = AbstractC14024l.crashlytics(this.f26088l);
        C13381l c13381l = this.f26086l;
        InterfaceC16922l interfaceC16922lAdmob = AbstractC9151l.admob(c13381l);
        Cfor cfor = c13381l.billing;
        int i5 = c13381l.loadAd;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArrCrashlytics3);
            byte b = (byte) (i4 >>> 24);
            byteArrayOutputStream.write(b);
            byte b2 = (byte) (i4 >>> 16);
            byteArrayOutputStream.write(b2);
            byte b3 = (byte) (i4 >>> 8);
            byteArrayOutputStream.write(b3);
            byte b4 = (byte) i4;
            byteArrayOutputStream.write(b4);
            byteArrayOutputStream.write(-128);
            byteArrayOutputStream.write(-128);
            while (true) {
                bArr = null;
                if (byteArrayOutputStream.size() >= 22) {
                    break;
                }
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            interfaceC16922lAdmob.update(byteArray, 0, byteArray.length);
            InterfaceC16922l interfaceC16922lPurchase = AbstractC9151l.purchase(i5, cfor);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(bArrCrashlytics3);
                byteArrayOutputStream2.write(b);
                byteArrayOutputStream2.write(b2);
                byteArrayOutputStream2.write(b3);
                byteArrayOutputStream2.write(b4);
                int digestSize = interfaceC16922lPurchase.getDigestSize() + 23;
                while (byteArrayOutputStream2.size() < digestSize) {
                    byteArrayOutputStream2.write(0);
                }
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                C1577l c1577l = new C1577l(bArrCrashlytics3, bArrCrashlytics4, AbstractC9151l.purchase(i5, cfor));
                c1577l.f3898l = i4;
                c1577l.f3897l = 0;
                int i6 = c13381l.amazon;
                int i7 = (1 << c13381l.crashlytics) - 1;
                int i8 = 0;
                while (i8 < i6) {
                    c1577l.loadAd(23, i8 < i6 + (-1), byteArray2);
                    short s = (short) i8;
                    byteArray2[20] = (byte) (s >>> 8);
                    byteArray2[21] = (byte) s;
                    for (int i9 = 0; i9 < i7; i9++) {
                        byteArray2[22] = (byte) i9;
                        interfaceC16922lPurchase.update(byteArray2, 0, byteArray2.length);
                        interfaceC16922lPurchase.doFinal(byteArray2, 23);
                    }
                    interfaceC16922lAdmob.update(byteArray2, 23, i5);
                    i8++;
                }
                int digestSize2 = interfaceC16922lAdmob.getDigestSize();
                byte[] bArr4 = new byte[digestSize2];
                interfaceC16922lAdmob.doFinal(bArr4, 0);
                interfaceC16922l.update(bArr4, 0, digestSize2);
                byte[] bArr5 = new byte[interfaceC16922l.getDigestSize()];
                interfaceC16922l.doFinal(bArr5, 0);
                return bArr5;
            } catch (Exception e) {
                e = e;
                C18073l.Signature(e.getMessage(), e);
                return bArr;
            }
        } catch (Exception e2) {
            e = e2;
            bArr = null;
        }
    }
}
