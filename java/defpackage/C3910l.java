package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: lؖؖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3910l extends AbstractC13210l implements InterfaceC8635l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C15509l f8055l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f8056l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public volatile long f8057l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f8058l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f8059l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public volatile C0497l f8060l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f8061l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3910l(C12662l c12662l) {
        C15509l c15509l = c12662l.yandex;
        C15980l c15980l = c15509l.loadAd;
        super(c15980l.purchase, true);
        this.f8055l = c15509l;
        int i = c15980l.billing;
        this.f8057l = c12662l.loadAd;
        byte[] bArr = c12662l.amazon;
        if (bArr == null) {
            this.f8059l = new byte[i];
        } else {
            if (bArr.length != i) {
                C8339l.metrica("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.f8059l = bArr;
        }
        byte[] bArr2 = c12662l.purchase;
        if (bArr2 == null) {
            this.f8058l = new byte[i];
        } else {
            if (bArr2.length != i) {
                C8339l.metrica("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.f8058l = bArr2;
        }
        byte[] bArr3 = c12662l.billing;
        if (bArr3 == null) {
            this.f8061l = new byte[i];
        } else {
            if (bArr3.length != i) {
                C8339l.metrica("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.f8061l = bArr3;
        }
        byte[] bArr4 = c12662l.mopub;
        if (bArr4 == null) {
            this.f8056l = new byte[i];
        } else {
            if (bArr4.length != i) {
                C8339l.metrica("size of root needs to be equal size of digest");
                throw null;
            }
            this.f8056l = bArr4;
        }
        C0497l c0497l = c12662l.admob;
        if (c0497l == null) {
            c0497l = (!AbstractC4047l.firebase(c15509l.crashlytics, c12662l.loadAd) || bArr3 == null || bArr == null) ? new C0497l(c12662l.crashlytics + 1) : new C0497l(c15509l, c12662l.loadAd, bArr3, bArr);
        }
        this.f8060l = c0497l;
        long j = c12662l.crashlytics;
        if (j < 0 || j == this.f8060l.f1805l) {
            return;
        }
        C8339l.metrica("maxIndex set but not reflected in state");
        throw null;
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        byte[] bArrYandex;
        synchronized (this) {
            bArrYandex = yandex();
        }
        return bArrYandex;
    }

    public final byte[] yandex() {
        byte[] bArrMopub;
        synchronized (this) {
            try {
                C15509l c15509l = this.f8055l;
                int i = c15509l.loadAd.billing;
                int i2 = (c15509l.crashlytics + 7) / 8;
                int i3 = i2 + i;
                int i4 = i3 + i;
                int i5 = i4 + i;
                byte[] bArr = new byte[i + i5];
                AbstractC4047l.purchase(bArr, 0, AbstractC4047l.smaato(i2, this.f8057l));
                AbstractC4047l.purchase(bArr, i2, this.f8059l);
                AbstractC4047l.purchase(bArr, i3, this.f8058l);
                AbstractC4047l.purchase(bArr, i4, this.f8061l);
                AbstractC4047l.purchase(bArr, i5, this.f8056l);
                try {
                    C0497l c0497l = this.f8060l;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(c0497l);
                    objectOutputStream.flush();
                    bArrMopub = AbstractC14024l.mopub(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrMopub;
    }
}
