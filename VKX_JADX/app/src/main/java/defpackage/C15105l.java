package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: lٔۗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15105l implements InterfaceC10135l {
    public final byte[] crashlytics;
    public final EnumC9483l loadAd;
    public final InterfaceC10135l yandex;

    public C15105l(InterfaceC10135l interfaceC10135l, EnumC9483l enumC9483l, byte[] bArr) {
        this.yandex = interfaceC10135l;
        this.loadAd = enumC9483l;
        this.crashlytics = bArr;
    }

    @Override // defpackage.InterfaceC10135l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        EnumC9483l enumC9483l = this.loadAd;
        EnumC9483l enumC9483l2 = EnumC9483l.RAW;
        InterfaceC10135l interfaceC10135l = this.yandex;
        if (enumC9483l == enumC9483l2) {
            return interfaceC10135l.loadAd(bArr, bArr2);
        }
        if (AbstractC0647l.yandex(this.crashlytics, bArr)) {
            return interfaceC10135l.loadAd(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        C18262l.ads("wrong prefix");
        return null;
    }

    @Override // defpackage.InterfaceC10135l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) {
        EnumC9483l enumC9483l = this.loadAd;
        EnumC9483l enumC9483l2 = EnumC9483l.RAW;
        InterfaceC10135l interfaceC10135l = this.yandex;
        return enumC9483l == enumC9483l2 ? interfaceC10135l.yandex(bArr, bArr2) : AbstractC17265l.amazon(this.crashlytics, interfaceC10135l.yandex(bArr, bArr2));
    }
}
