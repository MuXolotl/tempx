package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: lِٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15619l implements Iterable, Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C2530l f30516l = new C2530l(AbstractC16728l.yandex);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f30517l;

    static {
        int i = AbstractC5004l.yandex;
    }

    public static /* synthetic */ boolean Signature(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        tapsense(i, i4, bArr.length);
        tapsense(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static C2530l metrica(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return f30516l;
        }
        tapsense(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2530l(bArr2);
    }

    public static int tapsense(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static C2530l vip(int i, int i2, byte[] bArr) {
        try {
            return metrica(i, i2, bArr);
        } catch (C9893l e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public abstract void admob(int i, byte[] bArr);

    public final byte[] ads() {
        int iBilling = billing();
        if (iBilling == 0) {
            return AbstractC16728l.yandex;
        }
        byte[] bArr = new byte[iBilling];
        admob(iBilling, bArr);
        return bArr;
    }

    public abstract byte amazon(int i);

    public abstract int billing();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC15619l)) {
            return false;
        }
        AbstractC15619l abstractC15619l = (AbstractC15619l) obj;
        int iBilling = billing();
        if (iBilling != abstractC15619l.billing()) {
            return false;
        }
        if (iBilling == 0) {
            return true;
        }
        int i = this.f30517l;
        int i2 = abstractC15619l.f30517l;
        if (i == 0 || i2 == 0 || i == i2) {
            return smaato(abstractC15619l);
        }
        return false;
    }

    public abstract void firebase(AbstractC10908l abstractC10908l);

    public final int hashCode() {
        int iRemoteconfig = this.f30517l;
        if (iRemoteconfig == 0) {
            int iBilling = billing();
            iRemoteconfig = remoteconfig(iBilling, iBilling);
            if (iRemoteconfig == 0) {
                iRemoteconfig = 1;
            }
            this.f30517l = iRemoteconfig;
        }
        return iRemoteconfig;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C7515l(this);
    }

    public abstract AbstractC8010l mopub(int i, int i2);

    public abstract int remoteconfig(int i, int i2);

    public abstract boolean smaato(AbstractC15619l abstractC15619l);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iBilling = billing();
        String strMopub = billing() <= 50 ? AbstractC13611l.mopub(ads()) : AbstractC13611l.mopub(mopub(0, 47).ads()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iBilling);
        sb.append(" contents=\"");
        return AbstractC0653l.ads(sb, strMopub, "\">");
    }
}
