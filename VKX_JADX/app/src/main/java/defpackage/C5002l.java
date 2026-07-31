package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: lؗٛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5002l implements InterfaceC8635l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f10237l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f10238l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13381l f10239l;

    public C5002l(C13381l c13381l, byte[] bArr, byte[] bArr2) {
        this.f10239l = c13381l;
        this.f10238l = bArr;
        this.f10237l = bArr2;
    }

    public static C5002l yandex(Object obj) throws Throwable {
        if (obj instanceof C5002l) {
            return (C5002l) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            C13381l c13381l = (C13381l) C13381l.mopub.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[c13381l.loadAd];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[c13381l.amazon * c13381l.loadAd];
            dataInputStream.readFully(bArr2);
            return new C5002l(c13381l, bArr, bArr2);
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
                C5002l c5002lYandex = yandex(dataInputStream3);
                dataInputStream3.close();
                return c5002lYandex;
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
        if (obj != null && C5002l.class == obj.getClass()) {
            C5002l c5002l = (C5002l) obj;
            C13381l c13381l = c5002l.f10239l;
            C13381l c13381l2 = this.f10239l;
            if (c13381l2 != null) {
                if (c13381l2 != c13381l) {
                    return false;
                }
            } else if (c13381l == null) {
            }
            if (Arrays.equals(this.f10238l, c5002l.f10238l)) {
                return Arrays.equals(this.f10237l, c5002l.f10237l);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f10239l.yandex;
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f10238l);
            byteArrayOutputStream.write(this.f10237l);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        C13381l c13381l = this.f10239l;
        int iHashCode = c13381l != null ? c13381l.hashCode() : 0;
        return Arrays.hashCode(this.f10237l) + ((Arrays.hashCode(this.f10238l) + (iHashCode * 31)) * 31);
    }
}
