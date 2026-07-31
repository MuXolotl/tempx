package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lَُؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10801l extends C11049l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13975l f21830l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f21831l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public EnumC11981l f21832l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f21830l = new C13975l(4);
    }

    @Override // defpackage.C11049l, defpackage.AbstractC5550l
    public final EnumC11981l crashlytics() {
        return this.f21832l;
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21832l);
        sb.append(":");
        return AbstractC14814l.remoteconfig(this.f22244l.length, "bytes", sb);
    }

    @Override // defpackage.C11049l, defpackage.AbstractC5550l
    public final void yandex(ByteBuffer byteBuffer) {
        C8117l c8117l = new C8117l(byteBuffer);
        this.f22245l = c8117l.yandex();
        this.f21831l = c8117l.loadAd;
        byteBuffer.position(byteBuffer.position() + 8);
        byte[] bArr = new byte[this.f22245l - 8];
        this.f22244l = bArr;
        byteBuffer.get(bArr, 0, bArr.length);
        int iPosition = byteBuffer.position();
        if (byteBuffer.position() + 8 <= byteBuffer.limit()) {
            C8117l c8117l2 = new C8117l();
            c8117l2.billing(byteBuffer);
            if (!c8117l2.yandex.equals("name")) {
                byteBuffer.position(iPosition);
                return;
            }
            this.f22245l = c8117l2.yandex() + this.f22245l;
            this.f21831l += c8117l2.loadAd;
        }
    }
}
