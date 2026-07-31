package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًٌِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7874l extends C4357l implements InterfaceC7988l {
    public C7874l(String str, String str2) {
        C12645l c12645l = new C12645l(EnumC14116l.yandex(str).f27614l, str, 0, 0);
        this.f8893l = c12645l;
        try {
            switch (c12645l.f24874l) {
                case 0:
                    c12645l.subs(str2);
                    return;
                case 1:
                    throw new IllegalArgumentException("Cannot interpret binary as string.");
                case 2:
                    c12645l.f24875l = new byte[]{Boolean.parseBoolean(str2)};
                    c12645l.f24874l = 2;
                    return;
                case 3:
                    c12645l.billing(Long.parseLong(str2));
                    return;
                case 4:
                    c12645l.admob(new BigInteger(str2, 10));
                    return;
                case 5:
                    int i = Integer.parseInt(str2);
                    if (i < 0 || i > 65535) {
                        throw new IllegalArgumentException("value out of range (0-65535)");
                    }
                    long j = i;
                    String str3 = AbstractC3848l.yandex;
                    byte[] bArr = new byte[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        bArr[i2] = (byte) ((j >>> (i2 * 8)) & 255);
                    }
                    c12645l.f24875l = bArr;
                    c12645l.f24874l = 5;
                    return;
                case 6:
                    C4421l c4421lLoadAd = C4421l.loadAd(str2);
                    IllegalArgumentException illegalArgumentExceptionYandex = c12645l.f24876l.yandex(c12645l.f24877l, c4421lLoadAd.yandex(), 6);
                    if (illegalArgumentExceptionYandex != null) {
                        throw illegalArgumentExceptionYandex;
                    }
                    c12645l.f24875l = c4421lLoadAd.yandex();
                    c12645l.f24874l = 6;
                    return;
                default:
                    throw new IllegalStateException();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC15560l.Signature("Value cannot be parsed as Number or is out of range (\"", str2, "\")"), e);
        }
    }

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        return this.f8893l.purchase();
    }

    @Override // defpackage.C4357l, defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        String strPurchase = this.f8893l.purchase();
        String str = AbstractC3848l.yandex;
        if (strPurchase == null) {
            return true;
        }
        for (int i = 0; i < strPurchase.length(); i++) {
            if (!Character.isWhitespace(strPurchase.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
