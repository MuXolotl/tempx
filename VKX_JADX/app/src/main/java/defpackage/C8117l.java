package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًٛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C8117l {
    public static final C13975l purchase;
    public ByteBuffer amazon;
    public long crashlytics;
    public int loadAd;
    public String yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        purchase = new C13975l(4);
    }

    public C8117l(String str) {
        if (str.length() != 4) {
            throw new C6451l(str, str.length());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        this.amazon = byteBufferAllocate;
        try {
            this.yandex = str;
            byteBufferAllocate.put(4, str.getBytes("ISO-8859-1")[0]);
            this.amazon.put(5, str.getBytes("ISO-8859-1")[1]);
            this.amazon.put(6, str.getBytes("ISO-8859-1")[2]);
            this.amazon.put(7, str.getBytes("ISO-8859-1")[3]);
        } catch (UnsupportedEncodingException e) {
            C11467l.metrica(e);
            throw null;
        }
    }

    public final EnumC8101l amazon() {
        EnumC8101l enumC8101l = (EnumC8101l) EnumC8101l.f16883l.get(this.yandex);
        return enumC8101l == null ? EnumC8101l.UNKNOWN : enumC8101l;
    }

    public final void billing(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[8];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.amazon = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        this.loadAd = this.amazon.getInt();
        this.yandex = AbstractC14375l.isPro(this.amazon);
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        purchase.getClass();
        int i = C17500l.yandex;
        if (this.yandex.equals("\u0000\u0000\u0000\u0000")) {
            throw new C1293l(this.yandex);
        }
        int i2 = this.loadAd;
        if (i2 < 8) {
            throw new C6451l(this.yandex, i2);
        }
    }

    public final ByteBuffer crashlytics() {
        this.amazon.rewind();
        return this.amazon;
    }

    public final long loadAd() {
        return this.crashlytics + ((long) this.loadAd);
    }

    public final void purchase(int i) {
        byte[] bArrPurchase = AbstractC14375l.purchase(i);
        this.amazon.put(0, bArrPurchase[0]);
        this.amazon.put(1, bArrPurchase[1]);
        this.amazon.put(2, bArrPurchase[2]);
        this.amazon.put(3, bArrPurchase[3]);
        this.loadAd = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("Mp4BoxHeader{id='");
        sb.append(this.yandex);
        sb.append("', length=");
        sb.append(this.loadAd);
        sb.append(", filePos=");
        sb.append(this.crashlytics);
        sb.append(", endsAt=");
        return AbstractC12900l.smaato(sb, this.crashlytics + ((long) this.loadAd), '}');
    }

    public final int yandex() {
        return this.loadAd - 8;
    }

    public C8117l(ByteBuffer byteBuffer) {
        billing(byteBuffer);
    }

    public C8117l(InterfaceC9473l interfaceC9473l) {
        this.loadAd = interfaceC9473l.readInt();
        String strMo712l = interfaceC9473l.mo712l(4L, AbstractC12379l.loadAd);
        this.yandex = strMo712l;
        if ("\u0000\u0000\u0000\u0000".equals(strMo712l)) {
            throw new C1293l(this.yandex);
        }
    }
}
