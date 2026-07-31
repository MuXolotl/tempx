package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lِْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11816l extends AbstractC16847l {
    public C17305l amazon;

    @Override // defpackage.AbstractC16847l
    public final void billing(FileChannel fileChannel, String str) throws C9511l {
        this.amazon.getClass();
        try {
            C13975l c13975l = C17305l.yandex;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
            C7288l c7288lAmazon = C17305l.amazon(fileChannel, str);
            fileChannel.position(0L);
            if (c7288lAmazon.f15137l && c7288lAmazon.f15140l.f7147l != null) {
                C16528l c16528lMopub = C17305l.mopub(fileChannel, c7288lAmazon, str);
                if (C17305l.purchase(c7288lAmazon, fileChannel)) {
                    c7288lAmazon.billing();
                    c13975l.getClass();
                    fileChannel.truncate(c7288lAmazon.billing());
                } else {
                    c13975l.getClass();
                    C17305l.crashlytics(fileChannel, c7288lAmazon, c16528lMopub, str);
                }
                C17305l.billing(fileChannel);
            }
            c13975l.getClass();
        } catch (IOException e) {
            throw new C9511l(AbstractC5020l.adcel(e, AbstractC5020l.advert(str, ":")));
        }
    }

    @Override // defpackage.AbstractC16847l
    public final void mopub(InterfaceC13280l interfaceC13280l, FileChannel fileChannel, String str) throws C9511l {
        this.amazon.getClass();
        C13975l c13975l = C17305l.yandex;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        try {
            C7288l c7288lAmazon = C17305l.amazon(fileChannel, str);
            fileChannel.position(0L);
            try {
                long size = fileChannel.size();
                ByteBuffer byteBufferYandex = C17305l.yandex((C7288l) interfaceC13280l, c7288lAmazon);
                if (!c7288lAmazon.f15137l || c7288lAmazon.f15140l.f7147l == null) {
                    fileChannel.position(fileChannel.size());
                    if (AbstractC14375l.admob(fileChannel.size())) {
                        fileChannel.write(ByteBuffer.allocateDirect(1));
                    }
                    C17305l.admob(fileChannel, byteBufferYandex);
                } else {
                    if (c7288lAmazon.f15138l) {
                        boolean z = false;
                        for (C2047l c2047l : c7288lAmazon.f15139l) {
                            if (z) {
                                String str2 = c2047l.yandex;
                                EnumC17542l enumC17542l = EnumC17542l.TAG;
                                if (!str2.equals("ID3 ")) {
                                    throw new C9511l(str + " Metadata tags are corrupted and not at end of fc so cannot be fixed");
                                }
                            } else if (c2047l.loadAd == c7288lAmazon.billing()) {
                                z = true;
                            }
                        }
                        if (z) {
                            C17305l.loadAd(fileChannel, c7288lAmazon, str);
                            fileChannel.position(fileChannel.size());
                            if (AbstractC14375l.admob(fileChannel.size())) {
                                fileChannel.write(ByteBuffer.allocateDirect(1));
                            }
                            C17305l.admob(fileChannel, byteBufferYandex);
                        }
                        throw new C9511l(str + " Metadata tags are corrupted and not at end of fc so cannot be fixed");
                    }
                    C16528l c16528lMopub = C17305l.mopub(fileChannel, c7288lAmazon, str);
                    if (c7288lAmazon.f15137l) {
                        c7288lAmazon.f15140l.f7144l.getClass();
                        c7288lAmazon.f15140l.f7147l.getClass();
                    }
                    byteBufferYandex.limit();
                    c13975l.getClass();
                    if (C17305l.purchase(c7288lAmazon, fileChannel)) {
                        C17305l.admob(fileChannel, byteBufferYandex);
                    } else {
                        C17305l.crashlytics(fileChannel, c7288lAmazon, c16528lMopub, str);
                        fileChannel.position(fileChannel.size());
                        if (AbstractC14375l.admob(fileChannel.size())) {
                            fileChannel.write(ByteBuffer.allocateDirect(1));
                        }
                        C17305l.admob(fileChannel, byteBufferYandex);
                    }
                }
                if (size != fileChannel.size()) {
                    C17305l.billing(fileChannel);
                }
            } catch (IOException e) {
                throw new C9511l(AbstractC5020l.adcel(e, AbstractC5020l.advert(str, ":")));
            }
        } catch (IOException e2) {
            throw new C9511l(AbstractC5020l.adcel(e2, AbstractC5020l.advert(str, ":")));
        }
    }
}
