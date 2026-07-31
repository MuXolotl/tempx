package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3268l implements InterfaceC11512l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final Hashtable f6991l = new Hashtable();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long[] f6992l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C6129l[] f6993l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C9598l f6994l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f6995l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1660l f6996l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f6997l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long[] f6998l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final byte[] f6999l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C6129l[] f7000l;

    static {
        billing(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        billing(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        billing(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        billing(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        billing(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        billing(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        billing(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        billing(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        billing(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public C3268l(int i, int i2) {
        this.f6999l = new byte[1];
        if (i2 % 8 != 0) {
            C8339l.metrica(AbstractC0653l.vip(i2, "Output size must be a multiple of 8 bits. :"));
            throw null;
        }
        this.f6995l = i2 / 8;
        C1660l c1660l = new C1660l(i);
        this.f6996l = c1660l;
        this.f6994l = new C9598l(this, c1660l.f4012l);
    }

    public static void billing(int i, int i2, long[] jArr) {
        f6991l.put(Integer.valueOf((i / 8) | ((i2 / 8) << 16)), jArr);
    }

    public static void mopub(C6129l[] c6129lArr) {
        if (c6129lArr == null) {
            return;
        }
        for (int i = 1; i < c6129lArr.length; i++) {
            C6129l c6129l = c6129lArr[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = c6129l.loadAd;
                int i4 = i2 - 1;
                C6129l c6129l2 = c6129lArr[i4];
                if (i3 >= c6129l2.loadAd) {
                    break;
                }
                c6129lArr[i2] = c6129l2;
                i2 = i4;
            }
            c6129lArr[i2] = c6129l;
        }
    }

    public final void admob(int i, byte[] bArr) {
        subs(i);
        int length = bArr.length;
        long[] jArr = this.f6992l;
        C9598l c9598l = this.f6994l;
        c9598l.m2696catch(bArr, 0, length, jArr);
        c9598l.advert(this.f6992l);
    }

    public final int amazon(byte[] bArr, int i) {
        byte[] bArr2;
        int i2;
        int i3 = 0;
        C9598l c9598l = this.f6994l;
        if (c9598l == null) {
            C8339l.metrica("Skein engine is not initialised.");
            return 0;
        }
        int length = bArr.length;
        int i4 = this.f6995l;
        if (length < i + i4) {
            C18073l.ad("Output buffer is too short to hold output");
            return 0;
        }
        c9598l.advert(this.f6992l);
        if (this.f6993l != null) {
            int i5 = 0;
            while (true) {
                C6129l[] c6129lArr = this.f6993l;
                if (i5 >= c6129lArr.length) {
                    break;
                }
                C6129l c6129l = c6129lArr[i5];
                admob(c6129l.loadAd, c6129l.yandex);
                i5++;
            }
        }
        int i6 = this.f6996l.f4012l;
        int i7 = ((i4 + i6) - 1) / i6;
        int i8 = 0;
        while (i8 < i7) {
            int i9 = i8 * i6;
            int iMin = Math.min(i6, i4 - i9);
            int i10 = i + i9;
            int i11 = 8;
            byte[] bArr3 = new byte[8];
            AbstractC10000l.pro(i8, bArr3, i3);
            long[] jArr = new long[this.f6992l.length];
            subs(63);
            c9598l.m2696catch(bArr3, i3, 8, jArr);
            c9598l.advert(jArr);
            int i12 = (iMin + 7) / 8;
            int i13 = i3;
            while (i13 < i12) {
                int i14 = i13 * 8;
                int iMin2 = Math.min(i11, iMin - i14);
                byte[] bArr4 = bArr3;
                if (iMin2 == i11) {
                    AbstractC10000l.pro(jArr[i13], bArr, i14 + i10);
                    bArr2 = bArr4;
                    i2 = 0;
                } else {
                    bArr2 = bArr4;
                    i2 = 0;
                    AbstractC10000l.pro(jArr[i13], bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i14 + i10, iMin2);
                }
                i13++;
                bArr3 = bArr2;
                i3 = i2;
                i6 = i6;
                c9598l = c9598l;
                i11 = 8;
            }
            i8++;
            i6 = i6;
        }
        int i15 = i3;
        long[] jArr2 = this.f6998l;
        long[] jArr3 = this.f6992l;
        System.arraycopy(jArr2, i15, jArr3, i15, jArr3.length);
        subs(48);
        return i4;
    }

    public final void crashlytics(C3268l c3268l) {
        C9598l c9598l = c3268l.f6994l;
        C9598l c9598l2 = this.f6994l;
        c9598l2.getClass();
        byte[] bArr = (byte[]) c9598l.f19553l;
        byte[] bArrCrashlytics = (byte[]) c9598l2.f19553l;
        C6129l[] c6129lArr = null;
        if (bArr == null) {
            bArrCrashlytics = null;
        } else if (bArrCrashlytics == null || bArrCrashlytics.length != bArr.length) {
            bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
        } else {
            System.arraycopy(bArr, 0, bArrCrashlytics, 0, bArrCrashlytics.length);
        }
        c9598l2.f19553l = bArrCrashlytics;
        c9598l2.f19550l = c9598l.f19550l;
        c9598l2.f19552l = AbstractC14024l.purchase((long[]) c9598l.f19552l, (long[]) c9598l2.f19552l);
        C6921l c6921l = (C6921l) c9598l2.f19549l;
        C6921l c6921l2 = (C6921l) c9598l.f19549l;
        c6921l.getClass();
        c6921l.f14493l = AbstractC14024l.purchase((long[]) c6921l2.f14493l, (long[]) c6921l.f14493l);
        c6921l.f14494l = c6921l2.f14494l;
        this.f6992l = AbstractC14024l.purchase(c3268l.f6992l, this.f6992l);
        this.f6998l = AbstractC14024l.purchase(c3268l.f6998l, this.f6998l);
        byte[] bArr2 = c3268l.f6997l;
        byte[] bArrCrashlytics2 = this.f6997l;
        if (bArr2 == null) {
            bArrCrashlytics2 = null;
        } else if (bArrCrashlytics2 == null || bArrCrashlytics2.length != bArr2.length) {
            bArrCrashlytics2 = AbstractC14024l.crashlytics(bArr2);
        } else {
            System.arraycopy(bArr2, 0, bArrCrashlytics2, 0, bArrCrashlytics2.length);
        }
        this.f6997l = bArrCrashlytics2;
        C6129l[] c6129lArr2 = c3268l.f7000l;
        C6129l[] c6129lArr3 = this.f7000l;
        if (c6129lArr2 == null) {
            c6129lArr3 = null;
        } else {
            if (c6129lArr3 == null || c6129lArr3.length != c6129lArr2.length) {
                c6129lArr3 = new C6129l[c6129lArr2.length];
            }
            System.arraycopy(c6129lArr2, 0, c6129lArr3, 0, c6129lArr3.length);
        }
        this.f7000l = c6129lArr3;
        C6129l[] c6129lArr4 = c3268l.f6993l;
        C6129l[] c6129lArr5 = this.f6993l;
        if (c6129lArr4 != null) {
            if (c6129lArr5 == null || c6129lArr5.length != c6129lArr4.length) {
                c6129lArr5 = new C6129l[c6129lArr4.length];
            }
            c6129lArr = c6129lArr5;
            System.arraycopy(c6129lArr4, 0, c6129lArr, 0, c6129lArr.length);
        }
        this.f6993l = c6129lArr;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C3268l c3268l = (C3268l) interfaceC11512l;
        if (this.f6996l.f4012l == c3268l.f6996l.f4012l && this.f6995l == c3268l.f6995l) {
            crashlytics(c3268l);
        } else {
            C8339l.metrica("Incompatible parameters in provided SkeinEngine.");
        }
    }

    public final void purchase(C16706l c16706l) {
        this.f6992l = null;
        this.f6997l = null;
        this.f7000l = null;
        this.f6993l = null;
        int i = 0;
        if (c16706l != null) {
            Hashtable hashtable = c16706l.f32727l;
            if (((byte[]) hashtable.get(0)).length < 16) {
                C8339l.metrica("Skein key must be at least 128 bits.");
                return;
            }
            Enumeration enumerationKeys = hashtable.keys();
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                byte[] bArr = (byte[]) hashtable.get(num);
                if (num.intValue() == 0) {
                    this.f6997l = bArr;
                } else if (num.intValue() < 48) {
                    vector.addElement(new C6129l(num.intValue(), bArr));
                } else {
                    vector2.addElement(new C6129l(num.intValue(), bArr));
                }
            }
            C6129l[] c6129lArr = new C6129l[vector.size()];
            this.f7000l = c6129lArr;
            vector.copyInto(c6129lArr);
            mopub(this.f7000l);
            C6129l[] c6129lArr2 = new C6129l[vector2.size()];
            this.f6993l = c6129lArr2;
            vector2.copyInto(c6129lArr2);
            mopub(this.f6993l);
        }
        C1660l c1660l = this.f6996l;
        int i2 = c1660l.f4012l;
        int i3 = this.f6995l;
        long[] jArr = (long[]) f6991l.get(Integer.valueOf(i2 | (i3 << 16)));
        byte[] bArr2 = this.f6997l;
        if (bArr2 != null || jArr == null) {
            this.f6992l = new long[c1660l.f4012l / 8];
            if (bArr2 != null) {
                admob(0, bArr2);
            }
            byte[] bArr3 = new byte[32];
            bArr3[0] = 83;
            bArr3[1] = 72;
            bArr3[2] = 65;
            bArr3[3] = 51;
            bArr3[4] = 1;
            bArr3[5] = 0;
            AbstractC10000l.pro(i3 * 8, bArr3, 8);
            admob(4, bArr3);
        } else {
            this.f6992l = (long[]) jArr.clone();
        }
        if (this.f7000l != null) {
            while (true) {
                C6129l[] c6129lArr3 = this.f7000l;
                if (i >= c6129lArr3.length) {
                    break;
                }
                C6129l c6129l = c6129lArr3[i];
                admob(c6129l.loadAd, c6129l.yandex);
                i++;
            }
        }
        long[] jArr2 = this.f6992l;
        this.f6998l = jArr2 != null ? (long[]) jArr2.clone() : null;
        subs(48);
    }

    public final void subs(int i) {
        C9598l c9598l = this.f6994l;
        C6921l c6921l = (C6921l) c9598l.f19549l;
        long[] jArr = (long[]) c6921l.f14493l;
        jArr[0] = 0;
        jArr[1] = 0;
        c6921l.f14494l = false;
        jArr[1] = 4611686018427387904L;
        jArr[1] = (4611686018427387904L & (-274877906944L)) | ((((long) i) & 63) << 56);
        c9598l.f19550l = 0;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C3268l(this);
    }

    public C3268l(C3268l c3268l) {
        this(c3268l.f6996l.f4012l * 8, c3268l.f6995l * 8);
        crashlytics(c3268l);
    }
}
