package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class advert extends Ccase implements Cdefault, isVip {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f11l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final ad f9l = new ad(1, advert.class);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final byte[] f8l = {0};

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final char[] f10l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public advert(byte[] bArr, int i) {
        if (bArr == null) {
            C6541l.subs("'data' cannot be null");
            throw null;
        }
        if (i > 7 || i < 0) {
            C8339l.metrica("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            C8339l.metrica("zero length data with non-zero pad bits");
            throw null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.f11l = bArr2;
    }

    public static advert appmetrica(Object obj) {
        String strAdcel;
        if (obj == null || (obj instanceof advert)) {
            return (advert) obj;
        }
        if (!(obj instanceof applovin)) {
            if (obj instanceof byte[]) {
                try {
                    return (advert) f9l.m215l((byte[]) obj);
                } catch (IOException e) {
                    strAdcel = AbstractC5020l.adcel(e, new StringBuilder("failed to construct BIT STRING from byte[]: "));
                }
            }
            C8339l.metrica(strAdcel);
            return null;
        }
        Ccase ccaseBilling = ((applovin) obj).billing();
        if (ccaseBilling instanceof advert) {
            return (advert) ccaseBilling;
        }
        strAdcel = "illegal object in getInstance: ".concat(obj.getClass().getName());
        C8339l.metrica(strAdcel);
        return null;
    }

    public static advert premium(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i) & b))) {
                        return new C3980l(bArr);
                    }
                }
            }
            return new C13353l(bArr);
        }
        str = "truncated BIT STRING detected";
        C8339l.metrica(str);
        return null;
    }

    @Override // defpackage.isVip
    public final InputStream admob() {
        byte[] bArr = this.f11l;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public final byte[] applovin() {
        byte[] bArr = this.f11l;
        if (bArr.length == 1) {
            return Cthrow.f36591l;
        }
        int i = bArr[0] & 255;
        byte[] bArrVip = AbstractC14024l.vip(1, bArr.length, bArr);
        int length = bArrVip.length - 1;
        bArrVip[length] = (byte) (((byte) (255 << i)) & bArrVip[length]);
        return bArrVip;
    }

    @Override // defpackage.isVip
    public final int firebase() {
        return this.f11l[0] & 255;
    }

    @Override // defpackage.Ccase, defpackage.Cnative
    public final int hashCode() {
        byte[] bArr = this.f11l;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b = (byte) ((255 << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b;
    }

    public final byte[] inmobi() {
        byte[] bArr = this.f11l;
        if (bArr[0] == 0) {
            return bArr.length == 1 ? Cthrow.f36591l : AbstractC14024l.vip(1, bArr.length, bArr);
        }
        C8339l.smaato("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    @Override // defpackage.Ccase
    public Ccase isVip() {
        return new C13353l(this.f11l);
    }

    @Override // defpackage.Cdefault
    public final String mopub() {
        int i = 0;
        try {
            byte[] encoded = getEncoded();
            StringBuilder sb = new StringBuilder((encoded.length * 2) + 1);
            sb.append('#');
            while (i != encoded.length) {
                byte b = encoded[i];
                char[] cArr = f10l;
                sb.append(cArr[(b >>> 4) & 15]);
                sb.append(cArr[b & 15]);
                i++;
            }
            return sb.toString();
        } catch (IOException e) {
            throw new Celse(AbstractC5020l.adcel(e, new StringBuilder("Internal error encoding BitString: ")), e, i);
        }
    }

    @Override // defpackage.Ccase
    public Ccase signatures() {
        return new C3980l(this.f11l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m11throws() {
        byte[] bArr = this.f11l;
        int iMin = Math.min(5, bArr.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < iMin; i2++) {
            i |= (255 & bArr[i2]) << ((i2 - 1) * 8);
        }
        if (1 > iMin || iMin >= 5) {
            return i;
        }
        return ((((byte) (bArr[iMin] & (255 << (bArr[0] & 255)))) & 255) << ((iMin - 1) * 8)) | i;
    }

    public String toString() {
        return mopub();
    }

    @Override // defpackage.Ccase
    public final boolean vip(Ccase ccase) {
        if (!(ccase instanceof advert)) {
            return false;
        }
        byte[] bArr = ((advert) ccase).f11l;
        byte[] bArr2 = this.f11l;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() {
        return this;
    }

    public advert(byte[] bArr) {
        this.f11l = bArr;
    }
}
