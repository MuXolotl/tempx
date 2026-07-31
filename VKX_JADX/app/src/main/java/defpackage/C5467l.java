package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lؘؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5467l extends C4136l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f11706l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f11707l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f11708l;

    public final boolean ads(C4136l c4136l) {
        ByteBuffer byteBuffer;
        AbstractC12442l.admob(!c4136l.crashlytics(1073741824));
        AbstractC12442l.admob(!c4136l.crashlytics(268435456));
        AbstractC12442l.admob(!c4136l.crashlytics(4));
        if (tapsense()) {
            if (this.f11708l >= this.f11707l) {
                return false;
            }
            ByteBuffer byteBuffer2 = c4136l.f8498l;
            if (byteBuffer2 != null && (byteBuffer = this.f8498l) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f11708l;
        this.f11708l = i + 1;
        if (i == 0) {
            this.f8496l = c4136l.f8496l;
            if (c4136l.crashlytics(1)) {
                this.f16423l = 1;
            }
        }
        ByteBuffer byteBuffer3 = c4136l.f8498l;
        if (byteBuffer3 != null) {
            startapp(byteBuffer3.remaining());
            this.f8498l.put(byteBuffer3);
        }
        this.f11706l = c4136l.f8496l;
        return true;
    }

    @Override // defpackage.C4136l
    public final void remoteconfig() {
        super.remoteconfig();
        this.f11708l = 0;
    }

    public final boolean tapsense() {
        return this.f11708l > 0;
    }
}
