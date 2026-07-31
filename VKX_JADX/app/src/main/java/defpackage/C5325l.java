package defpackage;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؗۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5325l {
    public static final C13975l loadAd;
    public final String yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public C5325l(String str) {
        this.yandex = str;
    }

    public final C7313l yandex(FileChannel fileChannel) throws C13768l, IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = loadAd;
        c13975l.getClass();
        int i = C17500l.yandex;
        C7313l c7313l = new C7313l(C6356l.amazon().tapsense);
        boolean zFirebase = AbstractC16763l.firebase(fileChannel);
        String str = this.yandex;
        if (!zFirebase) {
            throw new C13768l(AbstractC12900l.firebase(str, " Wav RIFF Header not valid"));
        }
        while (fileChannel.position() < fileChannel.size()) {
            C16528l c16528l = new C16528l(ByteOrder.LITTLE_ENDIAN);
            c16528l.billing(fileChannel);
            String str2 = (String) c16528l.f32302l;
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            fileChannel.position();
            c13975l.getClass();
            int i2 = C17500l.yandex;
            EnumC2086l enumC2086lYandex = EnumC2086l.yandex(str2);
            if (enumC2086lYandex != null) {
                int iOrdinal = enumC2086lYandex.ordinal();
                int i3 = 1;
                ArrayList arrayList = c7313l.f15163l;
                if (iOrdinal == 3) {
                    arrayList.add(new C2047l((String) c16528l.f32302l, c16528l.f32306l, c16528l.f32303l));
                    if (c7313l.f15164l == null) {
                        C7881l c7881l = new C7881l(AbstractC14375l.subs(fileChannel, (int) c16528l.f32303l), c16528l, i3);
                        c7881l.f16434l = c7313l;
                        c7881l.f16436l = str;
                        if (!c7881l.mo1010l()) {
                            break;
                        }
                    } else {
                        AbstractC6419l.purchase(c16528l.f32306l - 1);
                    }
                } else if (iOrdinal == 5) {
                    arrayList.add(new C2047l((String) c16528l.f32302l, c16528l.f32306l, c16528l.f32303l));
                    if (c7313l.f15166l == null) {
                        C5769l c5769l = new C5769l(AbstractC14375l.subs(fileChannel, (int) c16528l.f32303l), c16528l, 7);
                        c5769l.f12163l = c7313l;
                        if (!c5769l.mo1010l()) {
                            break;
                        }
                    } else {
                        AbstractC6419l.purchase(c16528l.f32306l);
                    }
                } else if (iOrdinal == 6) {
                    if (c7313l.f15164l == null && c7313l.f15166l == null) {
                        c7313l.f15162l = true;
                    }
                    fileChannel.position(fileChannel.position() - 7);
                } else if (iOrdinal != 7) {
                    String str3 = (String) c16528l.f32302l;
                    if (iOrdinal != 8) {
                        arrayList.add(new C2047l(str3, c16528l.f32306l, c16528l.f32303l));
                        fileChannel.position(fileChannel.position() + c16528l.f32303l);
                    } else {
                        if (c7313l.f15164l == null && c7313l.f15166l == null) {
                            c7313l.f15162l = true;
                        }
                        fileChannel.position(fileChannel.position() - 7);
                    }
                } else {
                    if (c7313l.f15164l == null && c7313l.f15166l == null) {
                        c7313l.f15162l = true;
                    }
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
        if (!c7313l.f15160l) {
            c7313l.f15166l = C6356l.crashlytics();
        }
        if (!c7313l.f15165l) {
            c7313l.f15164l = new C5368l();
        }
        EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i4 = C17500l.yandex;
        return c7313l;
    }
}
