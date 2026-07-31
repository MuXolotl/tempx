package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: lٗؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16834l implements InterfaceC8635l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17675l f32863l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5002l f32864l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32865l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final byte[][] f32866l;

    public C16834l(int i, C5002l c5002l, C17675l c17675l, byte[][] bArr) {
        this.f32865l = i;
        this.f32864l = c5002l;
        this.f32863l = c17675l;
        this.f32866l = bArr;
    }

    public static C16834l yandex(Object obj) throws Throwable {
        if (obj instanceof C16834l) {
            return (C16834l) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i = dataInputStream.readInt();
            C5002l c5002lYandex = C5002l.yandex(obj);
            C17675l c17675l = (C17675l) C17675l.purchase.get(Integer.valueOf(dataInputStream.readInt()));
            int i2 = c17675l.crashlytics;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[c17675l.loadAd];
                bArr[i3] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new C16834l(i, c5002lYandex, c17675l, bArr);
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
                C16834l c16834lYandex = yandex(dataInputStream3);
                dataInputStream3.close();
                return c16834lYandex;
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r1 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r4 == 0) goto L3e
            java.lang.Class<lٗؑٚ> r1 = defpackage.C16834l.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L3e
        L10:
            lٗؑٚ r4 = (defpackage.C16834l) r4
            int r1 = r3.f32865l
            int r2 = r4.f32865l
            if (r1 == r2) goto L19
            goto L3e
        L19:
            lؗٛٙ r1 = r4.f32864l
            lؗٛٙ r2 = r3.f32864l
            if (r2 == 0) goto L26
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L29
            goto L3e
        L26:
            if (r1 == 0) goto L29
            goto L3e
        L29:
            l٘ؕٝ r1 = r4.f32863l
            l٘ؕٝ r2 = r3.f32863l
            if (r2 == 0) goto L32
            if (r2 == r1) goto L35
            return r0
        L32:
            if (r1 == 0) goto L35
            goto L3e
        L35:
            byte[][] r3 = r3.f32866l
            byte[][] r4 = r4.f32866l
            boolean r3 = java.util.Arrays.deepEquals(r3, r4)
            return r3
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16834l.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        C1770l c1770l = new C1770l(8);
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c1770l.f4179l;
        c1770l.tapsense(this.f32865l);
        c1770l.crashlytics(this.f32864l.getEncoded());
        c1770l.tapsense(this.f32863l.yandex);
        try {
            for (byte[] bArr : this.f32866l) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C18073l.Signature(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        int i = this.f32865l * 31;
        C5002l c5002l = this.f32864l;
        int iHashCode = (i + (c5002l != null ? c5002l.hashCode() : 0)) * 31;
        C17675l c17675l = this.f32863l;
        return Arrays.deepHashCode(this.f32866l) + ((iHashCode + (c17675l != null ? c17675l.hashCode() : 0)) * 31);
    }
}
