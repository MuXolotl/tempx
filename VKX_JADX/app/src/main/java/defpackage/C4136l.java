package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lِٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C4136l extends AbstractC7877l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C5978l f8495l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f8496l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ByteBuffer f8497l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ByteBuffer f8498l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C4276l f8499l = new C4276l();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f8500l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f8501l;

    static {
        AbstractC17959l.yandex("media3.decoder");
    }

    public C4136l(int i) {
        this.f8500l = i;
    }

    public final void adcel() {
        ByteBuffer byteBuffer = this.f8498l;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f8497l;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void remoteconfig() {
        this.f16423l = 0;
        ByteBuffer byteBuffer = this.f8498l;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f8497l;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f8501l = false;
    }

    public final void startapp(int i) {
        ByteBuffer byteBuffer = this.f8498l;
        if (byteBuffer == null) {
            this.f8498l = vip(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f8498l = byteBuffer;
            return;
        }
        ByteBuffer byteBufferVip = vip(i2);
        byteBufferVip.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferVip.put(byteBuffer);
        }
        this.f8498l = byteBufferVip;
    }

    public final ByteBuffer vip(int i) {
        int i2 = this.f8500l;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f8498l;
        throw new C17241l(AbstractC12589l.applovin(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }
}
