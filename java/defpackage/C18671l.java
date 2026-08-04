package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lۤؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18671l extends AbstractC9456l {
    public static final C13975l crashlytics;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        crashlytics = new C13975l(4);
    }

    @Override // defpackage.AbstractC9456l
    public final C16492l amazon(FileChannel fileChannel, String str) throws C13768l {
        C14663l c14663l;
        if (C12180l.yandex(AbstractC14375l.subs(fileChannel, C12180l.amazon)) == null) {
            throw new C13768l(AbstractC12900l.firebase(str, " Not a valid dsf file. Content does not start with 'DSD '"));
        }
        int i = AbstractC11306l.loadAd + 8;
        ByteBuffer byteBufferSubs = AbstractC14375l.subs(fileChannel, i);
        C13975l c13975l = C14663l.loadAd;
        String strIsPro = AbstractC14375l.isPro(byteBufferSubs);
        EnumC15153l[] enumC15153lArr = EnumC15153l.f29739l;
        if ("fmt ".equals(strIsPro)) {
            c14663l = new C14663l();
            c14663l.yandex = byteBufferSubs.getLong();
        } else {
            c14663l = null;
        }
        if (c14663l == null) {
            throw new C13768l(AbstractC12900l.firebase(str, " Not a valid dsf file. Content does not include 'fmt ' chunk"));
        }
        ByteBuffer byteBufferSubs2 = AbstractC14375l.subs(fileChannel, (int) (c14663l.yandex - ((long) i)));
        C13975l c13975l2 = C14663l.loadAd;
        C16492l c16492l = new C16492l();
        if (byteBufferSubs2.limit() < 40) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l2.getClass();
            int i2 = C17500l.yandex;
            return c16492l;
        }
        byteBufferSubs2.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferSubs2.getInt();
        byteBufferSubs2.getInt();
        byteBufferSubs2.getInt();
        int i3 = byteBufferSubs2.getInt();
        int i4 = byteBufferSubs2.getInt();
        int i5 = byteBufferSubs2.getInt();
        long j = byteBufferSubs2.getLong();
        byteBufferSubs2.getInt();
        c16492l.admob = "DSF";
        c16492l.amazon = i5 * i4 * i3;
        c16492l.mopub = i5;
        c16492l.purchase = i3;
        c16492l.billing = i4;
        c16492l.smaato = j;
        c16492l.firebase = j / i4;
        c16492l.subs = false;
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l2.getClass();
        int i6 = C17500l.yandex;
        return c16492l;
    }

    @Override // defpackage.AbstractC9456l
    public final InterfaceC13280l purchase(FileChannel fileChannel, String str, boolean z) throws C13768l, IOException {
        C12180l c12180lYandex = C12180l.yandex(AbstractC14375l.subs(fileChannel, C12180l.amazon));
        if (c12180lYandex == null) {
            throw new C13768l(AbstractC12900l.firebase(str, " Not a valid dsf file. Content does not start with 'DSD '."));
        }
        long j = c12180lYandex.crashlytics;
        C13975l c13975l = crashlytics;
        if (j <= 0) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
            return null;
        }
        fileChannel.position(j);
        C14964l c14964lYandex = C14964l.yandex(AbstractC14375l.subs(fileChannel, (int) (fileChannel.size() - fileChannel.position())));
        if (c14964lYandex == null) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            return null;
        }
        ByteBuffer byteBuffer = c14964lYandex.yandex;
        byte b = byteBuffer.get(3);
        try {
            if (b == 2) {
                C15649l c15649l = new C15649l();
                c15649l.f30591l = false;
                c15649l.f30590l = false;
                c15649l.f9508l = "";
                c15649l.read(byteBuffer);
                return c15649l;
            }
            if (b != 3) {
                if (b == 4) {
                    return new C11246l(byteBuffer);
                }
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i3 = C17500l.yandex;
                return null;
            }
            C9553l c9553l = new C9553l();
            c9553l.f19470l = false;
            c9553l.f19469l = false;
            c9553l.f19468l = false;
            c9553l.f19467l = false;
            c9553l.f19471l = 0;
            c9553l.f9508l = "";
            c9553l.read(byteBuffer);
            return c9553l;
        } catch (AbstractC4923l unused) {
            throw new C13768l(AbstractC12900l.firebase(str, " Could not read ID3v2 tag:corruption"));
        }
    }
}
