package defpackage;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: lٌّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1719l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C16410l f4106l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f4107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1719l(ByteBuffer byteBuffer, C16528l c16528l, int i) {
        super(byteBuffer, c16528l, 7);
        this.f4107l = i;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final boolean mo1010l() {
        String str;
        int i = 2;
        boolean z = true;
        switch (this.f4107l) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f33214l;
                String strIsPro = AbstractC14375l.isPro(byteBuffer);
                if ("stoc".equals(strIsPro) || "pdos".equals(strIsPro)) {
                    int i2 = byteBuffer.get() & 255;
                    byte[] bArr = new byte[i2];
                    byteBuffer.get(bArr);
                    str = new String(bArr, 0, i2, AbstractC12379l.loadAd);
                } else {
                    str = null;
                }
                this.f4106l.tapsense.add(AbstractC9361l.pro(strIsPro, ": ", str));
                return true;
            case 1:
                ByteBuffer byteBuffer2 = (ByteBuffer) this.f33214l;
                short s = byteBuffer2.getShort();
                C13975l c13975l = AbstractC14375l.yandex;
                int i3 = s & 65535;
                for (int i4 = 0; i4 < i3; i4++) {
                    Date dateYandex = AbstractC4516l.yandex(((long) byteBuffer2.getInt()) & 4294967295L);
                    byteBuffer2.getShort();
                    C13975l c13975l2 = AbstractC14375l.yandex;
                    int i5 = byteBuffer2.getShort() & 65535;
                    String str2 = AbstractC14375l.mopub(byteBuffer2, 0, i5, AbstractC12379l.loadAd) + " " + AbstractC4516l.yandex.format(dateYandex);
                    if (i5 % 2 != 0) {
                        byteBuffer2.get();
                    }
                    this.f4106l.Signature.add(str2);
                }
                return true;
            case 2:
                C16410l c16410l = this.f4106l;
                ByteBuffer byteBuffer3 = (ByteBuffer) this.f33214l;
                short s2 = byteBuffer3.getShort();
                C13975l c13975l3 = AbstractC14375l.yandex;
                int i6 = s2 & 65535;
                long j = byteBuffer3.getInt();
                int i7 = 65535 & byteBuffer3.getShort();
                SimpleDateFormat simpleDateFormat = AbstractC4516l.yandex;
                byte[] bArr2 = new byte[10];
                byteBuffer3.get(bArr2);
                byte b = bArr2[0];
                int i8 = b >> 7;
                int i9 = (((b << 8) | bArr2[1]) & 32767) - 16445;
                long j2 = 0;
                int i10 = 55;
                while (i < 9) {
                    j2 |= (((long) bArr2[i]) & 255) << i10;
                    i10 -= 8;
                    i++;
                    i6 = i6;
                    z = z;
                }
                boolean z2 = z;
                int i11 = i6;
                double dPow = Math.pow(2.0d, i9) * (((long) (bArr2[9] >>> 1)) | j2);
                if (i8 != 0) {
                    dPow = -dPow;
                }
                if (c16410l.vip != EnumC7121l.f14927l) {
                    c16410l.isPro = z2;
                    EnumC1960l enumC1960l = EnumC1960l.f4467l;
                    c16410l.admob = "not compressed";
                    c16410l.subs = false;
                } else {
                    if (byteBuffer3.remaining() == 0) {
                        return false;
                    }
                    String strIsPro2 = AbstractC14375l.isPro(byteBuffer3);
                    EnumC1960l enumC1960l2 = EnumC1960l.f4467l;
                    if (strIsPro2.equals("sowt")) {
                        c16410l.startapp = EnumC10143l.f20651l;
                    }
                    int i12 = byteBuffer3.get() & 255;
                    byte[] bArr3 = new byte[i12];
                    byteBuffer3.get(bArr3);
                    String str3 = new String(bArr3, 0, i12, AbstractC12379l.loadAd);
                    EnumC1960l enumC1960l3 = (EnumC1960l) EnumC1960l.f4466l.get(strIsPro2);
                    if (enumC1960l3 != null) {
                        str3 = enumC1960l3.f4470l;
                        c16410l.isPro = enumC1960l3.f4469l;
                        if (enumC1960l3 == EnumC1960l.f4467l) {
                            c16410l.subs = false;
                        }
                    } else {
                        c16410l.isPro = false;
                    }
                    if (str3.isEmpty()) {
                        c16410l.admob = strIsPro2;
                    } else {
                        c16410l.admob = str3;
                    }
                }
                c16410l.mopub = i7;
                c16410l.billing = (int) dPow;
                c16410l.purchase = i11;
                c16410l.firebase = j / dPow;
                c16410l.smaato = j;
                return true;
            default:
                this.f4106l.metrica = AbstractC4516l.yandex(((ByteBuffer) this.f33214l).getInt());
                return true;
        }
    }
}
