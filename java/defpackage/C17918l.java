package defpackage;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lٌ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C16003l.class)
public final class C17918l extends AbstractC3160l implements Comparable<C17918l> {
    public static final BsonObjectId$Companion Companion = new BsonObjectId$Companion();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final short f34881l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34882l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f34883l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f34884l;

    static {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        C13731l c13731l = new C13731l(iCurrentTimeMillis, iCurrentTimeMillis >> 31);
        new AtomicInteger(c13731l.amazon());
        c13731l.purchase(16777216);
        c13731l.purchase(32768);
    }

    public C17918l(int i, int i2, short s, int i3) {
        this.f34883l = i;
        this.f34882l = i2;
        this.f34881l = s;
        this.f34884l = i3;
        if ((i2 & (-16777216)) != 0) {
            C8339l.metrica("The random value must be between 0 and 16777215 (it must fit in three bytes).");
            throw null;
        }
        if (((-16777216) & i3) == 0) {
            return;
        }
        C8339l.metrica("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        throw null;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C17918l c17918l) {
        byte[] bArrMopub = mopub();
        byte[] bArrMopub2 = c17918l.mopub();
        for (int i = 0; i < 12; i++) {
            byte b = bArrMopub[i];
            byte b2 = bArrMopub2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (!AbstractC8576l.yandex(c2336l.loadAd(C17918l.class), c2336l.loadAd(obj.getClass()))) {
            return false;
        }
        C17918l c17918l = (C17918l) obj;
        return this.f34883l == c17918l.f34883l && this.f34882l == c17918l.f34882l && this.f34881l == c17918l.f34881l && this.f34884l == c17918l.f34884l;
    }

    public final int hashCode() {
        return (((((this.f34883l * 31) + this.f34882l) * 31) + this.f34881l) * 31) + this.f34884l;
    }

    public final byte[] mopub() {
        int i = this.f34883l;
        int i2 = this.f34882l;
        short s = this.f34881l;
        int i3 = this.f34884l;
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2, (byte) (s >> 8), (byte) s, (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3};
    }

    public final String toString() {
        return "BsonObjectId(" + AbstractC8669l.m2397case(mopub(), "", C16274l.f31848l, 30).toLowerCase(Locale.ROOT) + ')';
    }
}
