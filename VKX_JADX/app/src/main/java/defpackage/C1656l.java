package defpackage;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lؘؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1656l extends AbstractC9456l {
    @Override // defpackage.AbstractC9456l
    public final C16492l amazon(FileChannel fileChannel, String str) throws C13768l, IOException {
        C16492l c16492l = new C16492l();
        if (!AbstractC16763l.firebase(fileChannel)) {
            throw new C13768l(AbstractC12900l.firebase(str, " Wav RIFF Header not valid"));
        }
        while (fileChannel.position() < fileChannel.size()) {
            C16528l c16528l = new C16528l(ByteOrder.LITTLE_ENDIAN);
            c16528l.billing(fileChannel);
            String str2 = (String) c16528l.f32302l;
            C13975l c13975l = C16992l.yandex;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            AbstractC6419l.purchase(c16528l.f32306l);
            c13975l.getClass();
            int i = C17500l.yandex;
            EnumC2086l enumC2086lYandex = EnumC2086l.yandex(str2);
            if (enumC2086lYandex != null) {
                int iOrdinal = enumC2086lYandex.ordinal();
                if (iOrdinal == 0) {
                    C7881l c7881l = new C7881l(AbstractC14375l.subs(fileChannel, (int) c16528l.f32303l), c16528l, 0);
                    c7881l.f16436l = c16492l;
                    c7881l.mo1010l();
                } else if (iOrdinal == 1) {
                    c16492l.smaato = ((long) AbstractC14375l.subs(fileChannel, (int) c16528l.f32303l).getInt()) & 4294967295L;
                } else if (iOrdinal == 2) {
                    c16492l.yandex = c16528l.f32303l;
                    c16492l.loadAd = fileChannel.position();
                    c16492l.crashlytics = fileChannel.position() + c16528l.f32303l;
                    fileChannel.position(fileChannel.position() + c16528l.f32303l);
                } else if (iOrdinal != 6) {
                    fileChannel.position(fileChannel.position() + c16528l.f32303l);
                } else {
                    fileChannel.position(fileChannel.position() - 7);
                }
            } else {
                if (c16528l.f32303l < 0) {
                    StringBuilder sbAdvert = AbstractC5020l.advert(str, " Not a valid header, unable to read a sensible size:Header");
                    sbAdvert.append((String) c16528l.f32302l);
                    sbAdvert.append("Size:");
                    sbAdvert.append(c16528l.f32303l);
                    throw new C13768l(sbAdvert.toString());
                }
                fileChannel.position(fileChannel.position() + c16528l.f32303l);
                if (fileChannel.position() > fileChannel.size()) {
                    StringBuilder sbAdvert2 = AbstractC5020l.advert(str, " Failed to move to invalid position to ");
                    sbAdvert2.append(fileChannel.position());
                    sbAdvert2.append(" because file length is only ");
                    sbAdvert2.append(fileChannel.size());
                    sbAdvert2.append(" indicates invalid chunk");
                    throw new C13768l(sbAdvert2.toString());
                }
            }
            AbstractC11306l.yandex(fileChannel, c16528l);
        }
        long j = c16492l.smaato;
        if (j != -1) {
            int i2 = c16492l.billing;
            if (i2 > 0) {
                c16492l.firebase = j / i2;
            }
            return c16492l;
        }
        long j2 = c16492l.yandex;
        if (j2 <= 0) {
            throw new C13768l(AbstractC12900l.firebase(str, " Wav Data Header Missing"));
        }
        c16492l.firebase = j2 / c16492l.remoteconfig;
        return c16492l;
    }

    @Override // defpackage.AbstractC9456l
    public final InterfaceC13280l purchase(FileChannel fileChannel, String str, boolean z) throws C13768l, IOException {
        C7313l c7313lYandex = new C5325l(str).yandex(fileChannel);
        int iInmobi = AbstractC5020l.inmobi(C6356l.amazon().tapsense);
        if (iInmobi == 4 || iInmobi == 5 || iInmobi == 6 || iInmobi == 7) {
            C13975l c13975l = C7313l.f15159l;
            if (c7313lYandex.billing() instanceof C5368l) {
                try {
                    AbstractC10199l it = AbstractC3799l.f7908l.iterator();
                    while (it.hasNext()) {
                        EnumC17969l enumC17969l = (EnumC17969l) it.next();
                        if (((String) c7313lYandex.f15164l.purchase(enumC17969l).purchase("")).isEmpty() && !c7313lYandex.f15166l.m1336throws(enumC17969l).isEmpty()) {
                            C5368l c5368l = c7313lYandex.f15164l;
                            String strM1336throws = c7313lYandex.f15166l.m1336throws(enumC17969l);
                            if (!strM1336throws.endsWith("\u0000")) {
                                strM1336throws = strM1336throws.concat("\u0000");
                            }
                            c5368l.firebase(enumC17969l, strM1336throws);
                        }
                    }
                } catch (C9706l unused) {
                    EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i = C17500l.yandex;
                }
            } else {
                try {
                    AbstractC10199l it2 = AbstractC3799l.f7908l.iterator();
                    while (it2.hasNext()) {
                        EnumC17969l enumC17969l2 = (EnumC17969l) it2.next();
                        if (c7313lYandex.f15166l.m1336throws(enumC17969l2).isEmpty()) {
                            String strSubstring = (String) c7313lYandex.f15164l.purchase(enumC17969l2).purchase("");
                            if (!strSubstring.isEmpty()) {
                                AbstractC3348l abstractC3348l = c7313lYandex.f15166l;
                                if (strSubstring.endsWith("\u0000")) {
                                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                                }
                                abstractC3348l.firebase(enumC17969l2, strSubstring);
                            }
                        }
                    }
                } catch (C9706l unused2) {
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i2 = C17500l.yandex;
                }
            }
        }
        return c7313lYandex;
    }
}
