package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: lَٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15082l extends AbstractC17897l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3952l f29611l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f29612l;

    public C15082l(int i, C3952l c3952l) {
        super(false);
        if (c3952l == null) {
            C6541l.subs("lmsPublicKey");
            throw null;
        }
        this.f29612l = i;
        this.f29611l = c3952l;
    }

    public static C15082l yandex(Object obj) {
        if (obj instanceof C15082l) {
            return (C15082l) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C15082l(((DataInputStream) obj).readInt(), C3952l.yandex(obj));
        }
        DataInputStream dataInputStream = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return yandex(AbstractC7016l.crashlytics((InputStream) obj));
            }
            C8339l.metrica(AbstractC15560l.subscription(obj, "cannot parse "));
            return null;
        }
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C15082l c15082lYandex = yandex(dataInputStream2);
                dataInputStream2.close();
                return c15082lYandex;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
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
        if (obj == null || C15082l.class != obj.getClass()) {
            return false;
        }
        C15082l c15082l = (C15082l) obj;
        if (this.f29612l != c15082l.f29612l) {
            return false;
        }
        return this.f29611l.equals(c15082l.f29611l);
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f29612l;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f29611l.loadAd());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        return this.f29611l.hashCode() + (this.f29612l * 31);
    }
}
