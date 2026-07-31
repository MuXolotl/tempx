package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lَّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12509l extends AbstractC5550l implements InterfaceC7988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13975l f24648l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f24649l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f24650l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f24651l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f24648l = new C13975l(4);
    }

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        return this.f24651l;
    }

    @Override // defpackage.AbstractC5550l
    public final byte[] amazon() {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f24648l.getClass();
        int i = C17500l.yandex;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = this.f24651l.getBytes(AbstractC12379l.crashlytics);
            byteArrayOutputStream.write(AbstractC14375l.purchase(bytes.length + 16));
            byteArrayOutputStream.write("data".getBytes(AbstractC12379l.loadAd));
            byteArrayOutputStream.write(new byte[]{0});
            EnumC11981l enumC11981l = EnumC11981l.IMPLICIT;
            byteArrayOutputStream.write(new byte[]{0, 0, 1});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.AbstractC5550l, defpackage.InterfaceC4656l
    public final byte[] billing() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.f24650l;
            Charset charset = AbstractC12379l.crashlytics;
            byte[] bytes = str.getBytes(charset);
            byteArrayOutputStream.write(AbstractC14375l.purchase(bytes.length + 12));
            Charset charset2 = AbstractC12379l.loadAd;
            byteArrayOutputStream.write("mean".getBytes(charset2));
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes);
            byte[] bytes2 = this.f24649l.getBytes(charset);
            byteArrayOutputStream.write(AbstractC14375l.purchase(bytes2.length + 12));
            byteArrayOutputStream.write("name".getBytes(charset2));
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bytes2);
            if (this.f24651l.length() > 0) {
                byteArrayOutputStream.write(amazon());
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(AbstractC14375l.purchase(byteArrayOutputStream.size() + 8));
            byteArrayOutputStream2.write("----".getBytes(charset2));
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            return byteArrayOutputStream2.toByteArray();
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.AbstractC5550l
    public final EnumC11981l crashlytics() {
        return EnumC11981l.TEXT;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return "".equals(this.f24651l.trim());
    }

    @Override // defpackage.AbstractC5550l
    public final byte[] loadAd() {
        return this.f24651l.getBytes(AbstractC12379l.crashlytics);
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        return this.f24651l;
    }

    @Override // defpackage.AbstractC5550l
    public final void yandex(ByteBuffer byteBuffer) {
        C8117l c8117l = new C8117l(byteBuffer);
        if (!c8117l.yandex.equals("mean")) {
            C8339l.isPro(c8117l.yandex, "Unable to process data box because identifier is:");
            return;
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        int iYandex = c8117l.yandex() - 4;
        Charset charset = AbstractC12379l.crashlytics;
        this.f24650l = AbstractC14375l.mopub(byteBufferSlice, 4, iYandex, charset);
        byteBuffer.position(c8117l.yandex() + byteBuffer.position());
        C8117l c8117l2 = new C8117l();
        c8117l2.billing(byteBuffer);
        if (!c8117l2.yandex.equals("name")) {
            C8339l.isPro(c8117l2.yandex, "Unable to process name box because identifier is:");
            return;
        }
        this.f24649l = AbstractC14375l.mopub(byteBuffer.slice(), 4, c8117l2.yandex() - 4, charset);
        byteBuffer.position(c8117l2.yandex() + byteBuffer.position());
        if (this.f11833l.yandex() == c8117l.loadAd + c8117l2.loadAd) {
            this.f11834l = "----:" + this.f24650l + ":" + this.f24649l;
            this.f24651l = "";
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            f24648l.getClass();
            int i = C17500l.yandex;
            return;
        }
        C8117l c8117l3 = new C8117l();
        c8117l3.billing(byteBuffer);
        this.f24651l = new C9993l(c8117l3, byteBuffer).f20393l;
        byteBuffer.position(c8117l3.yandex() + byteBuffer.position());
        this.f11834l = "----:" + this.f24650l + ":" + this.f24649l;
    }
}
