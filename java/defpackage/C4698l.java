package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؘؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4698l extends AbstractC1091l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public long f9544l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C16621l f9545l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C13143l f9546l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C4136l f9547l;

    public C4698l() {
        super(6);
        this.f9547l = new C4136l(1);
        this.f9546l = new C13143l();
    }

    @Override // defpackage.AbstractC1091l
    public final void ad(long j, long j2) {
        float[] fArr;
        while (!firebase() && this.f9544l < 100000 + j) {
            C4136l c4136l = this.f9547l;
            c4136l.remoteconfig();
            C10023l c10023l = this.f3008l;
            c10023l.Signature();
            if (pro(c10023l, c4136l, 0) != -4 || c4136l.crashlytics(4)) {
                return;
            }
            long j3 = c4136l.f8496l;
            this.f9544l = j3;
            boolean z = j3 < this.f3019l;
            if (this.f9545l != null && !z) {
                c4136l.adcel();
                ByteBuffer byteBuffer = c4136l.f8498l;
                String str = AbstractC15323l.yandex;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C13143l c13143l = this.f9546l;
                    c13143l.m3565private(iLimit, bArrArray);
                    c13143l.m3562for(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(c13143l.metrica());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f9545l.crashlytics(this.f9544l - this.f3022l, fArr);
                }
            }
        }
    }

    @Override // defpackage.AbstractC1091l
    public final String isPro() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.AbstractC1091l
    public final int premium(C5978l c5978l) {
        return "application/x-camera-motion".equals(c5978l.metrica) ? AbstractC4338l.ads(4, 0, 0, 0) : AbstractC4338l.ads(0, 0, 0, 0);
    }

    @Override // defpackage.AbstractC1091l
    public final boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.AbstractC1091l
    public final void startapp(long j, boolean z, boolean z2) {
        this.f9544l = Long.MIN_VALUE;
        C16621l c16621l = this.f9545l;
        if (c16621l != null) {
            c16621l.amazon();
        }
    }

    @Override // defpackage.AbstractC1091l
    public final void vip() {
        C16621l c16621l = this.f9545l;
        if (c16621l != null) {
            c16621l.amazon();
        }
    }

    @Override // defpackage.AbstractC1091l, defpackage.InterfaceC3184l
    public final void yandex(int i, Object obj) {
        if (i == 8) {
            this.f9545l = (C16621l) obj;
        }
    }
}
