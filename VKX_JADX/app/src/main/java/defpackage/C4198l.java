package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؖ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4198l extends AbstractC5550l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13975l f8616l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f8617l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f8618l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f8616l = new C13975l(4);
    }

    public C4198l(C8117l c8117l, ByteBuffer byteBuffer) {
        super(c8117l.yandex);
        this.f8618l = c8117l.yandex();
        yandex(byteBuffer);
    }

    @Override // defpackage.AbstractC5550l, defpackage.InterfaceC4656l
    public final byte[] billing() {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f8616l.getClass();
        int i = C17500l.yandex;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC14375l.purchase(this.f8618l + 8));
            byteArrayOutputStream.write(this.f11834l.getBytes(AbstractC12379l.loadAd));
            byteArrayOutputStream.write(this.f8617l);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.AbstractC5550l
    public final EnumC11981l crashlytics() {
        return EnumC11981l.IMPLICIT;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return this.f8617l.length == 0;
    }

    @Override // defpackage.AbstractC5550l
    public final byte[] loadAd() {
        return this.f8617l;
    }

    @Override // defpackage.AbstractC5550l
    public final void yandex(ByteBuffer byteBuffer) {
        this.f8617l = new byte[this.f8618l];
        int i = 0;
        while (true) {
            byte[] bArr = this.f8617l;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = byteBuffer.get();
            i++;
        }
    }
}
