package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5674l extends AbstractC6791l {
    public final /* synthetic */ int isPro;

    public /* synthetic */ C5674l(int i) {
        this.isPro = i;
    }

    public static C0733l applovin(C13143l c13143l) {
        String strLicense = c13143l.license();
        strLicense.getClass();
        String strLicense2 = c13143l.license();
        strLicense2.getClass();
        return new C0733l(strLicense, strLicense2, c13143l.Signature(), c13143l.Signature(), Arrays.copyOfRange(c13143l.yandex, c13143l.loadAd, c13143l.crashlytics));
    }

    @Override // defpackage.AbstractC6791l
    public final C7417l subs(C15608l c15608l, ByteBuffer byteBuffer) {
        switch (this.isPro) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                C5257l c5257l = new C5257l(byteBuffer.array(), byteBuffer.limit());
                c5257l.metrica(12);
                int iAmazon = (c5257l.amazon() + c5257l.mopub(12)) - 4;
                c5257l.metrica(44);
                c5257l.startapp(c5257l.mopub(12));
                c5257l.metrica(16);
                ArrayList arrayList = new ArrayList();
                while (c5257l.amazon() < iAmazon) {
                    c5257l.metrica(48);
                    int iMopub = c5257l.mopub(8);
                    c5257l.metrica(4);
                    int iAmazon2 = c5257l.amazon() + c5257l.mopub(12);
                    String str = null;
                    String str2 = null;
                    while (c5257l.amazon() < iAmazon2) {
                        int iMopub2 = c5257l.mopub(8);
                        int iMopub3 = c5257l.mopub(8);
                        int iAmazon3 = c5257l.amazon() + iMopub3;
                        if (iMopub2 == 2) {
                            int iMopub4 = c5257l.mopub(16);
                            c5257l.metrica(8);
                            if (iMopub4 == 3) {
                                while (c5257l.amazon() < iAmazon3) {
                                    int iMopub5 = c5257l.mopub(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iMopub5];
                                    c5257l.isPro(iMopub5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int iMopub6 = c5257l.mopub(8);
                                    for (int i = 0; i < iMopub6; i++) {
                                        c5257l.startapp(c5257l.mopub(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iMopub2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iMopub3];
                            c5257l.isPro(iMopub3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        c5257l.remoteconfig(iAmazon3 * 8);
                    }
                    c5257l.remoteconfig(iAmazon2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C5455l(iMopub, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C7417l(arrayList);
            default:
                return new C7417l(applovin(new C13143l(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
