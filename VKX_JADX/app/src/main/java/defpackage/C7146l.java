package defpackage;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lٌؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7146l extends AbstractC16847l {
    @Override // defpackage.AbstractC16847l
    public final void billing(FileChannel fileChannel, String str) throws C9511l {
        C13201l c13201l = new C13201l(str);
        C13975l c13975l = C13201l.loadAd;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        try {
            C7313l c7313lAdmob = c13201l.admob(fileChannel);
            fileChannel.position(0L);
            boolean z = c7313lAdmob.f15160l;
            if (z && c7313lAdmob.f15165l) {
                C10458l c10458lYandex = C13201l.yandex(c7313lAdmob, fileChannel);
                if (c10458lYandex.crashlytics) {
                    boolean z2 = c10458lYandex.amazon;
                    boolean z3 = c10458lYandex.loadAd;
                    if (z2) {
                        if (z3) {
                            Long l = c7313lAdmob.f15164l.f11506l;
                            c13975l.getClass();
                            fileChannel.truncate(c7313lAdmob.f15164l.f11506l.longValue());
                        } else {
                            c7313lAdmob.startapp();
                            c13975l.getClass();
                            fileChannel.truncate(c7313lAdmob.startapp());
                        }
                    } else if (z3) {
                        c13201l.mopub(fileChannel, (int) c7313lAdmob.admob(), (int) (c7313lAdmob.admob() - c7313lAdmob.f15164l.f11506l.longValue()));
                    } else {
                        c13201l.mopub(fileChannel, c7313lAdmob.f15164l.f11507l.intValue(), (int) (((long) c7313lAdmob.f15164l.f11507l.intValue()) - c7313lAdmob.startapp()));
                    }
                } else {
                    C5368l c5368l = c7313lAdmob.f15164l;
                    C16528l c16528lStartapp = c13201l.startapp(c7313lAdmob, fileChannel);
                    C16528l c16528lMetrica = c13201l.metrica(c7313lAdmob, fileChannel);
                    if (C13201l.isPro(c7313lAdmob, fileChannel)) {
                        fileChannel.truncate(c5368l.f11506l.longValue());
                        c13201l.purchase(fileChannel, c7313lAdmob, c16528lMetrica);
                    } else if (C13201l.subs(c7313lAdmob, fileChannel)) {
                        fileChannel.truncate(c7313lAdmob.startapp());
                        c13201l.billing(fileChannel, c7313lAdmob, c16528lStartapp);
                    } else {
                        c13201l.purchase(fileChannel, c7313lAdmob, c16528lMetrica);
                        C7313l c7313lAdmob2 = c13201l.admob(fileChannel);
                        fileChannel.position(0L);
                        c13201l.billing(fileChannel, c7313lAdmob2, c16528lStartapp);
                    }
                }
            } else if (c7313lAdmob.f15165l) {
                C5368l c5368l2 = c7313lAdmob.f15164l;
                C16528l c16528lStartapp2 = c13201l.startapp(c7313lAdmob, fileChannel);
                if (c5368l2.f11507l.longValue() == fileChannel.size()) {
                    c13975l.getClass();
                    fileChannel.truncate(c5368l2.f11506l.longValue());
                } else {
                    c13201l.billing(fileChannel, c7313lAdmob, c16528lStartapp2);
                }
            } else if (z) {
                C16528l c16528lMetrica2 = c13201l.metrica(c7313lAdmob, fileChannel);
                if (C13201l.subs(c7313lAdmob, fileChannel)) {
                    c7313lAdmob.startapp();
                    c13975l.getClass();
                    fileChannel.truncate(c7313lAdmob.startapp());
                } else {
                    c13201l.purchase(fileChannel, c7313lAdmob, c16528lMetrica2);
                }
            }
            C13201l.firebase(fileChannel);
        } catch (IOException e) {
            throw new C9511l(AbstractC5020l.adcel(e, AbstractC5020l.advert(str, ":")));
        }
    }

    @Override // defpackage.AbstractC16847l
    public final void mopub(InterfaceC13280l interfaceC13280l, FileChannel fileChannel, String str) throws C9511l {
        C13201l c13201l = new C13201l(str);
        C13975l c13975l = C13201l.loadAd;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        int i2 = C6356l.amazon().Signature;
        try {
            C7313l c7313lAdmob = c13201l.admob(fileChannel);
            fileChannel.position(0L);
            try {
                C7313l c7313l = (C7313l) interfaceC13280l;
                if (i2 == 3) {
                    c13201l.vip(c7313l, fileChannel, c7313lAdmob);
                } else if (i2 == 2) {
                    c13201l.smaato(c7313l, fileChannel, c7313lAdmob);
                } else if (i2 == 1) {
                    c13201l.remoteconfig(c7313l, fileChannel, c7313lAdmob);
                } else if (i2 == 5) {
                    c7313l.adcel();
                    c13201l.vip(c7313l, fileChannel, c7313lAdmob);
                } else {
                    if (i2 != 4) {
                        throw new RuntimeException(str + " No setting for:WavSaveOptions");
                    }
                    c7313l.adcel();
                    c13201l.remoteconfig(c7313l, fileChannel, c7313lAdmob);
                }
                C13201l.firebase(fileChannel);
            } catch (IOException e) {
                throw new C9511l(AbstractC5020l.adcel(e, AbstractC5020l.advert(str, ":")));
            }
        } catch (IOException e2) {
            throw new C9511l(AbstractC5020l.adcel(e2, AbstractC5020l.advert(str, ":")));
        }
    }
}
