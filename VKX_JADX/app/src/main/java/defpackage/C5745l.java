package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: lؘ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5745l extends AbstractC13210l implements InterfaceC8635l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C15980l f12132l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f12133l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public volatile C0391l f12134l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f12135l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f12136l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f12137l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5745l(C5908l c5908l) {
        C15980l c15980l = (C15980l) c5908l.f12457l;
        super(c15980l.purchase, true);
        this.f12132l = c15980l;
        int i = c15980l.billing;
        byte[] bArr = (byte[]) c5908l.f12452l;
        if (bArr == null) {
            this.f12136l = new byte[i];
        } else {
            if (bArr.length != i) {
                C8339l.metrica("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.f12136l = bArr;
        }
        byte[] bArr2 = (byte[]) c5908l.f12458l;
        if (bArr2 == null) {
            this.f12135l = new byte[i];
        } else {
            if (bArr2.length != i) {
                C8339l.metrica("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.f12135l = bArr2;
        }
        byte[] bArr3 = (byte[]) c5908l.f12459l;
        if (bArr3 == null) {
            this.f12137l = new byte[i];
        } else {
            if (bArr3.length != i) {
                C8339l.metrica("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.f12137l = bArr3;
        }
        byte[] bArr4 = (byte[]) c5908l.f12453l;
        if (bArr4 == null) {
            this.f12133l = new byte[i];
        } else {
            if (bArr4.length != i) {
                C8339l.metrica("size of root needs to be equal size of digest");
                throw null;
            }
            this.f12133l = bArr4;
        }
        C0391l c0391l = (C0391l) c5908l.f12454l;
        if (c0391l == null) {
            C13068l c13068l = new C13068l(new C13549l(1));
            int i2 = c5908l.f12456l;
            C7502l c7502l = new C7502l(c15980l.mopub);
            int i3 = c15980l.loadAd;
            c0391l = new C0391l(c7502l, i3, c15980l.crashlytics, (1 << i3) - 1);
            c0391l.yandex(bArr3, bArr, c13068l);
            while (c0391l.f1493l < i2) {
                c0391l.loadAd(bArr3, bArr, c13068l);
            }
        }
        this.f12134l = c0391l;
        int i4 = c5908l.f12455l;
        if (i4 < 0 || i4 == this.f12134l.f1490l) {
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
                int i = this.f12132l.billing;
                int i2 = i + 4;
                int i3 = i2 + i;
                int i4 = i3 + i;
                byte[] bArr = new byte[i + i4];
                AbstractC10000l.isPro(this.f12134l.f1493l, 0, bArr);
                AbstractC4047l.purchase(bArr, 4, this.f12136l);
                AbstractC4047l.purchase(bArr, i2, this.f12135l);
                AbstractC4047l.purchase(bArr, i3, this.f12137l);
                AbstractC4047l.purchase(bArr, i4, this.f12133l);
                try {
                    C0391l c0391l = this.f12134l;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(c0391l);
                    objectOutputStream.flush();
                    bArrMopub = AbstractC14024l.mopub(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrMopub;
    }
}
