package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lؗۢۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5231l extends AbstractC16847l {
    public static ByteBuffer admob(AbstractC3348l abstractC3348l) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long size = abstractC3348l.getSize();
            if (size > 0 && AbstractC14375l.admob(size)) {
                size++;
            }
            abstractC3348l.m1322case((int) size, byteArrayOutputStream);
            if ((byteArrayOutputStream.toByteArray().length & 1) != 0) {
                int length = byteArrayOutputStream.toByteArray().length + 1;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                abstractC3348l.m1322case(length, byteArrayOutputStream2);
                byteArrayOutputStream = byteArrayOutputStream2;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            byteBufferWrap.rewind();
            return byteBufferWrap;
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.AbstractC16847l
    public final void billing(FileChannel fileChannel, String str) throws C9511l {
        try {
            C12180l c12180lYandex = C12180l.yandex(AbstractC14375l.subs(fileChannel, C12180l.amazon));
            if (c12180lYandex != null) {
                long j = c12180lYandex.crashlytics;
                if (j > 0) {
                    fileChannel.position(j);
                    if (C14964l.yandex(AbstractC14375l.subs(fileChannel, (int) (fileChannel.size() - fileChannel.position()))) != null) {
                        fileChannel.truncate(c12180lYandex.crashlytics);
                        c12180lYandex.crashlytics = 0L;
                        c12180lYandex.loadAd = fileChannel.size();
                        fileChannel.position(0L);
                        fileChannel.write(c12180lYandex.loadAd());
                    }
                }
            }
        } catch (IOException e) {
            throw new C9511l(AbstractC5020l.adcel(e, AbstractC5020l.advert(str, ":")));
        }
    }

    @Override // defpackage.AbstractC16847l
    public final void mopub(InterfaceC13280l interfaceC13280l, FileChannel fileChannel, String str) throws C9511l {
        try {
            C12180l c12180lYandex = C12180l.yandex(AbstractC14375l.subs(fileChannel, C12180l.amazon));
            if (c12180lYandex != null) {
                long j = c12180lYandex.crashlytics;
                if (j <= 0) {
                    fileChannel.position(fileChannel.size());
                    c12180lYandex.crashlytics = fileChannel.size();
                    fileChannel.write(admob((AbstractC3348l) interfaceC13280l));
                    c12180lYandex.loadAd = fileChannel.size();
                    fileChannel.position(0L);
                    fileChannel.write(c12180lYandex.loadAd());
                    return;
                }
                fileChannel.position(j);
                if (C14964l.yandex(AbstractC14375l.subs(fileChannel, (int) (fileChannel.size() - fileChannel.position()))) != null) {
                    fileChannel.position(c12180lYandex.crashlytics);
                    fileChannel.write(admob((AbstractC3348l) interfaceC13280l));
                } else {
                    throw new C9511l(str + "Could not find existing ID3v2 Tag");
                }
            }
        } catch (IOException e) {
            throw new C9511l(e.getMessage());
        }
    }
}
