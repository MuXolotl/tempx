package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lُٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C11049l extends AbstractC5550l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f22244l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f22245l;

    @Override // defpackage.AbstractC5550l
    public EnumC11981l crashlytics() {
        return EnumC11981l.IMPLICIT;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return this.f22244l.length == 0;
    }

    @Override // defpackage.AbstractC5550l
    public final byte[] loadAd() {
        return this.f22244l;
    }

    @Override // defpackage.AbstractC5550l
    public void yandex(ByteBuffer byteBuffer) {
        this.f22245l = new C8117l(byteBuffer).yandex();
        byteBuffer.position(byteBuffer.position() + 8);
        this.f22244l = new byte[this.f22245l - 8];
        int i = 0;
        while (true) {
            byte[] bArr = this.f22244l;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = byteBuffer.get();
            i++;
        }
    }
}
