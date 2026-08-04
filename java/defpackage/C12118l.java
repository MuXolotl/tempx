package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lِۛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12118l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24098l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16410l f24099l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12118l(C16528l c16528l, ByteBuffer byteBuffer, C16410l c16410l, int i) {
        super(byteBuffer, c16528l, 7);
        this.f24098l = i;
        this.f24099l = c16410l;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final boolean mo1010l() {
        int i = this.f24098l;
        C16410l c16410l = this.f24099l;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f33214l;
                c16410l.license.add(AbstractC14375l.mopub(byteBuffer, 0, byteBuffer.remaining(), AbstractC12379l.loadAd));
                break;
            case 1:
                ByteBuffer byteBuffer2 = (ByteBuffer) this.f33214l;
                c16410l.ads = AbstractC14375l.mopub(byteBuffer2, 0, byteBuffer2.remaining(), AbstractC12379l.loadAd);
                break;
            case 2:
                ByteBuffer byteBuffer3 = (ByteBuffer) this.f33214l;
                c16410l.subscription = AbstractC14375l.mopub(byteBuffer3, 0, byteBuffer3.remaining(), AbstractC12379l.loadAd);
                break;
            default:
                ByteBuffer byteBuffer4 = (ByteBuffer) this.f33214l;
                c16410l.adcel = AbstractC14375l.mopub(byteBuffer4, 0, byteBuffer4.remaining(), AbstractC12379l.loadAd);
                break;
        }
        return true;
    }
}
