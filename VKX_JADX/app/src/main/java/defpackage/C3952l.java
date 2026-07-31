package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3952l extends AbstractC17897l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13381l f8132l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C17675l f8133l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final byte[] f8134l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[] f8135l;

    public C3952l(C17675l c17675l, C13381l c13381l, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f8133l = c17675l;
        this.f8132l = c13381l;
        this.f8135l = AbstractC14024l.crashlytics(bArr2);
        this.f8134l = AbstractC14024l.crashlytics(bArr);
    }

    public static C3952l yandex(Object obj) throws Throwable {
        if (obj instanceof C3952l) {
            return (C3952l) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C17675l c17675l = (C17675l) C17675l.purchase.get(Integer.valueOf(dataInputStream.readInt()));
            C13381l c13381l = (C13381l) C13381l.mopub.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[c17675l.loadAd];
            dataInputStream.readFully(bArr2);
            return new C3952l(c17675l, c13381l, bArr2, bArr);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return yandex(AbstractC7016l.crashlytics((InputStream) obj));
            }
            C8339l.metrica(AbstractC15560l.subscription(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C3952l c3952lYandex = yandex(dataInputStream3);
                dataInputStream3.close();
                return c3952lYandex;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3952l.class != obj.getClass()) {
            return false;
        }
        C3952l c3952l = (C3952l) obj;
        if (this.f8133l.equals(c3952l.f8133l) && this.f8132l.equals(c3952l.f8132l) && Arrays.equals(this.f8135l, c3952l.f8135l)) {
            return Arrays.equals(this.f8134l, c3952l.f8134l);
        }
        return false;
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        return loadAd();
    }

    public final int hashCode() {
        return AbstractC14024l.ads(this.f8134l) + ((AbstractC14024l.ads(this.f8135l) + ((this.f8132l.hashCode() + (this.f8133l.hashCode() * 31)) * 31)) * 31);
    }

    public final byte[] loadAd() {
        C1770l c1770l = new C1770l(8);
        c1770l.tapsense(this.f8133l.yandex);
        c1770l.tapsense(this.f8132l.yandex);
        c1770l.crashlytics(this.f8135l);
        c1770l.crashlytics(this.f8134l);
        return ((ByteArrayOutputStream) c1770l.f4179l).toByteArray();
    }
}
