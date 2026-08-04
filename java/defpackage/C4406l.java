package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lُؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4406l extends AbstractC5792l {
    public boolean firebase;
    public int isPro;
    public long metrica;
    public byte[] remoteconfig;
    public int smaato;
    public int subs;
    public int vip;

    @Override // defpackage.AbstractC5792l, defpackage.InterfaceC15103l
    public final boolean admob() {
        return super.admob() && this.vip == 0;
    }

    @Override // defpackage.AbstractC5792l
    public final void amazon() {
        this.remoteconfig = AbstractC15323l.loadAd;
    }

    @Override // defpackage.AbstractC5792l
    public final void crashlytics() {
        if (this.firebase) {
            int i = this.vip;
            if (i > 0) {
                this.metrica += (long) (i / this.loadAd.amazon);
            }
            this.vip = 0;
        }
    }

    @Override // defpackage.InterfaceC15103l
    public final void firebase(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.smaato);
        this.metrica += (long) (iMin / this.loadAd.amazon);
        this.smaato -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.smaato > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.vip + i2) - this.remoteconfig.length;
        ByteBuffer byteBufferPurchase = purchase(length);
        int iIsPro = AbstractC15323l.isPro(length, 0, this.vip);
        byteBufferPurchase.put(this.remoteconfig, 0, iIsPro);
        int iIsPro2 = AbstractC15323l.isPro(length - iIsPro, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iIsPro2);
        byteBufferPurchase.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iIsPro2;
        int i4 = this.vip - iIsPro;
        this.vip = i4;
        byte[] bArr = this.remoteconfig;
        System.arraycopy(bArr, iIsPro, bArr, 0, i4);
        byteBuffer.get(this.remoteconfig, this.vip, i3);
        this.vip += i3;
        byteBufferPurchase.flip();
    }

    @Override // defpackage.AbstractC5792l
    public final void loadAd() {
        if (this.firebase) {
            this.firebase = false;
            int i = this.isPro;
            int i2 = this.loadAd.amazon;
            this.remoteconfig = new byte[i * i2];
            this.smaato = this.subs * i2;
        }
        this.vip = 0;
    }

    @Override // defpackage.AbstractC5792l, defpackage.InterfaceC15103l
    public final ByteBuffer subs() {
        int i;
        if (super.admob() && (i = this.vip) > 0) {
            purchase(i).put(this.remoteconfig, 0, this.vip).flip();
            this.vip = 0;
        }
        return super.subs();
    }

    @Override // defpackage.AbstractC5792l, defpackage.InterfaceC15103l
    public final long vip(long j) {
        return Math.max(0L, j - AbstractC15323l.m3969goto(this.loadAd.yandex, this.isPro + this.subs));
    }

    @Override // defpackage.AbstractC5792l
    public final C6696l yandex(C6696l c6696l) throws C16758l {
        if (!AbstractC15323l.m3968for(c6696l.crashlytics)) {
            throw new C16758l(c6696l);
        }
        this.firebase = true;
        return (this.subs == 0 && this.isPro == 0) ? C6696l.purchase : c6696l;
    }
}
