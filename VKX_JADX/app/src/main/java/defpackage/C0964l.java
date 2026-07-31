package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lَٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0964l extends C2453l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2665l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f2666l;

    public C0964l(EnumC16541l enumC16541l, String str, int i) throws C9706l {
        super(enumC16541l.f32477l, str);
        this.f2665l = i;
        try {
            Long.parseLong(str);
        } catch (NumberFormatException unused) {
            throw new C9706l("Value of:" + str + " is invalid for field:" + enumC16541l);
        }
    }

    @Override // defpackage.C2453l, defpackage.AbstractC5550l
    public final EnumC11981l crashlytics() {
        return EnumC11981l.INTEGER;
    }

    @Override // defpackage.C2453l, defpackage.AbstractC5550l
    public final byte[] loadAd() {
        byte[] bArr = this.f2666l;
        if (bArr != null) {
            return bArr;
        }
        int i = this.f2665l;
        if (i == 1) {
            return new byte[]{new Short(this.f5241l).byteValue()};
        }
        if (i == 2) {
            short sShortValue = new Short(this.f5241l).shortValue();
            C13975l c13975l = AbstractC14375l.yandex;
            return new byte[]{(byte) ((sShortValue >> 8) & 255), (byte) (sShortValue & 255)};
        }
        if (i == 4) {
            return AbstractC14375l.purchase(new Integer(this.f5241l).intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11834l);
        sb.append(":");
        C18073l.license(AbstractC14814l.remoteconfig(this.f2665l, ":Dont know how to write byte fields of this length", sb));
        return null;
    }

    @Override // defpackage.C2453l, defpackage.AbstractC5550l
    public final void yandex(ByteBuffer byteBuffer) {
        C8117l c8117l = new C8117l(byteBuffer);
        C9993l c9993l = new C9993l(c8117l, byteBuffer);
        this.f2665l = c8117l.yandex() - 8;
        this.f2666l = c9993l.f20394l;
        this.f5241l = c9993l.f20393l;
    }
}
