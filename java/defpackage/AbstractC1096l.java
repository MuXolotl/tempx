package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؒٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1096l implements Iterable, Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C1700l f3033l = new C1700l(AbstractC11565l.loadAd);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f3034l = 0;

    static {
        int i = AbstractC13973l.yandex;
    }

    public static int ad(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            C18262l.adcel(AbstractC15560l.tapsense("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        C18262l.adcel(AbstractC12589l.premium(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static C1700l isVip(int i, int i2, byte[] bArr) {
        ad(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C1700l(bArr2);
    }

    public static AbstractC1096l mopub(Iterator it, int i) {
        if (i <= 0) {
            C8339l.metrica(AbstractC15560l.tapsense("length (", i, ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (AbstractC1096l) it.next();
        }
        int i2 = i >>> 1;
        AbstractC1096l abstractC1096lMopub = mopub(it, i2);
        AbstractC1096l abstractC1096lMopub2 = mopub(it, i - i2);
        if (Alert.DURATION_SHOW_INDEFINITELY - abstractC1096lMopub.admob() < abstractC1096lMopub2.admob()) {
            C8339l.metrica(AbstractC12589l.premium(abstractC1096lMopub.admob(), abstractC1096lMopub2.admob(), "ByteString would be too long: ", "+"));
            return null;
        }
        if (abstractC1096lMopub2.admob() == 0) {
            return abstractC1096lMopub;
        }
        if (abstractC1096lMopub.admob() == 0) {
            return abstractC1096lMopub2;
        }
        int iAdmob = abstractC1096lMopub2.admob() + abstractC1096lMopub.admob();
        if (iAdmob < 128) {
            int iAdmob2 = abstractC1096lMopub.admob();
            int iAdmob3 = abstractC1096lMopub2.admob();
            int i3 = iAdmob2 + iAdmob3;
            byte[] bArr = new byte[i3];
            ad(0, iAdmob2, abstractC1096lMopub.admob());
            ad(0, iAdmob2, i3);
            if (iAdmob2 > 0) {
                abstractC1096lMopub.firebase(bArr, 0, 0, iAdmob2);
            }
            ad(0, iAdmob3, abstractC1096lMopub2.admob());
            ad(iAdmob2, i3, i3);
            if (iAdmob3 > 0) {
                abstractC1096lMopub2.firebase(bArr, 0, iAdmob2, iAdmob3);
            }
            return new C1700l(bArr);
        }
        if (abstractC1096lMopub instanceof C2485l) {
            C2485l c2485l = (C2485l) abstractC1096lMopub;
            AbstractC1096l abstractC1096l = c2485l.f5287l;
            AbstractC1096l abstractC1096l2 = c2485l.f5286l;
            if (abstractC1096lMopub2.admob() + abstractC1096l2.admob() < 128) {
                int iAdmob4 = abstractC1096l2.admob();
                int iAdmob5 = abstractC1096lMopub2.admob();
                int i4 = iAdmob4 + iAdmob5;
                byte[] bArr2 = new byte[i4];
                ad(0, iAdmob4, abstractC1096l2.admob());
                ad(0, iAdmob4, i4);
                if (iAdmob4 > 0) {
                    abstractC1096l2.firebase(bArr2, 0, 0, iAdmob4);
                }
                ad(0, iAdmob5, abstractC1096lMopub2.admob());
                ad(iAdmob4, i4, i4);
                if (iAdmob5 > 0) {
                    abstractC1096lMopub2.firebase(bArr2, 0, iAdmob4, iAdmob5);
                }
                return new C2485l(abstractC1096l, new C1700l(bArr2));
            }
            if (abstractC1096l.smaato() > abstractC1096l2.smaato() && c2485l.f5285l > abstractC1096lMopub2.smaato()) {
                return new C2485l(abstractC1096l, new C2485l(abstractC1096l2, abstractC1096lMopub2));
            }
        }
        if (iAdmob >= C2485l.applovin(Math.max(abstractC1096lMopub.smaato(), abstractC1096lMopub2.smaato()) + 1)) {
            return new C2485l(abstractC1096lMopub, abstractC1096lMopub2);
        }
        C5321l c5321l = new C5321l(4);
        c5321l.amazon(abstractC1096lMopub);
        c5321l.amazon(abstractC1096lMopub2);
        ArrayDeque arrayDeque = (ArrayDeque) c5321l.f11449l;
        AbstractC1096l c2485l2 = (AbstractC1096l) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            c2485l2 = new C2485l((AbstractC1096l) arrayDeque.pop(), c2485l2);
        }
        return c2485l2;
    }

    public static void premium(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC12589l.premium(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0653l.vip(i, "Index < 0: "));
        }
    }

    public static AbstractC1096l signatures(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            C1700l c1700lIsVip = i == 0 ? null : isVip(0, i, bArr);
            if (c1700lIsVip == null) {
                break;
            }
            arrayList.add(c1700lIsVip);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f3033l : mopub(arrayList.iterator(), size);
    }

    public abstract void Signature(C9747l c9747l);

    public abstract int admob();

    public abstract AbstractC1096l ads(int i, int i2);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: advert, reason: merged with bridge method [inline-methods] */
    public AbstractC10199l iterator() {
        return new C0331l(this);
    }

    public abstract byte amazon(int i);

    public abstract byte billing(int i);

    public abstract void firebase(byte[] bArr, int i, int i2, int i3);

    public final int hashCode() {
        int iVip = this.f3034l;
        if (iVip == 0) {
            int iAdmob = admob();
            iVip = vip(iAdmob, 0, iAdmob);
            if (iVip == 0) {
                iVip = 1;
            }
            this.f3034l = iVip;
        }
        return iVip;
    }

    public abstract int metrica(int i, int i2, int i3);

    public abstract boolean pro();

    public abstract boolean remoteconfig();

    public abstract int smaato();

    public abstract String tapsense(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iAdmob = admob();
        String strAdmob = admob() <= 50 ? AbstractC11790l.admob(this) : AbstractC11790l.admob(ads(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iAdmob);
        sb.append(" contents=\"");
        return AbstractC0653l.ads(sb, strAdmob, "\">");
    }

    public abstract int vip(int i, int i2, int i3);
}
