package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؚٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7377l extends AbstractC7995l {

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final AtomicInteger f15298extends = new AtomicInteger();
    public final C16391l Signature;
    public final C17564l ad;
    public final C2432l adcel;
    public final C18480l ads;
    public final C12516l advert;
    public C18480l applovin;
    public C8915l appmetrica;
    public final int firebase;
    public int inmobi;
    public final long isPro;
    public final C13143l isVip;
    public final appmetrica license;
    public final int metrica;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public long f15299native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public volatile boolean f15300package;
    public final boolean premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public boolean f15301private;
    public final List pro;
    public final Uri remoteconfig;
    public final boolean signatures;
    public final int smaato;
    public final InterfaceC14090l startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public AbstractC1186l f15302strictfp;
    public final boolean subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public boolean f15303synchronized;
    public final boolean tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f15304throws;
    public final boolean vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f15305volatile;

    public C7377l(appmetrica appmetricaVar, InterfaceC14090l interfaceC14090l, C2432l c2432l, C5978l c5978l, boolean z, InterfaceC14090l interfaceC14090l2, C2432l c2432l2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C16391l c16391l, C17564l c17564l, C18480l c18480l, C12516l c12516l, C13143l c13143l, boolean z6, boolean z7, C17849l c17849l) {
        super(interfaceC14090l, c2432l, 1, c5978l, i, obj, j, j2);
        c5978l.getClass();
        this.isPro = j3;
        this.signatures = z;
        this.metrica = i2;
        this.f15299native = z3 ? j2 - j : -9223372036854775807L;
        this.smaato = i3;
        this.adcel = c2432l2;
        this.startapp = interfaceC14090l2;
        this.f15304throws = c2432l2 != null;
        this.premium = z2;
        this.remoteconfig = uri;
        this.subscription = z5;
        this.Signature = c16391l;
        this.tapsense = z4;
        this.license = appmetricaVar;
        this.pro = list;
        this.ad = c17564l;
        this.ads = c18480l;
        this.advert = c12516l;
        this.isVip = c13143l;
        this.f15301private = z6;
        this.vip = z7;
        C9258l c9258l = AbstractC1186l.f3181l;
        this.f15302strictfp = C13708l.f26763l;
        this.firebase = f15298extends.getAndIncrement();
    }

    public static byte[] amazon(String str) {
        if (AbstractC11452l.admob(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final boolean billing() {
        return this.f15299native != -9223372036854775807L;
    }

    public final void crashlytics(InterfaceC14090l interfaceC14090l, C2432l c2432l, boolean z, boolean z2) {
        C2432l c2432lCrashlytics;
        boolean z3;
        long j;
        int i = this.inmobi;
        if (z) {
            z3 = i != 0;
            c2432lCrashlytics = c2432l;
        } else {
            long j2 = i;
            long j3 = c2432l.mopub;
            c2432lCrashlytics = c2432l.crashlytics(j2, j3 != -1 ? j3 - j2 : -1L);
            z3 = false;
        }
        try {
            C11826l c11826lMopub = mopub(interfaceC14090l, c2432lCrashlytics, z2);
            if (z3) {
                c11826lMopub.purchase(this.inmobi, false);
            }
            while (!this.f15300package && ((InterfaceC14833l) this.applovin.f36084l).loadAd(c11826lMopub, C18480l.f36082l) == 0) {
                try {
                    try {
                    } catch (Throwable th) {
                        this.inmobi = (int) (c11826lMopub.f23659l - c2432l.billing);
                        throw th;
                    }
                } catch (EOFException e) {
                    if ((this.amazon.billing & 16384) == 0) {
                        throw e;
                    }
                    ((InterfaceC14833l) this.applovin.f36084l).amazon(0L, 0L);
                    j = c11826lMopub.f23659l;
                }
            }
            j = c11826lMopub.f23659l;
            this.inmobi = (int) (j - c2432l.billing);
            AbstractC12366l.yandex(interfaceC14090l);
        } catch (Throwable th2) {
            AbstractC12366l.yandex(interfaceC14090l);
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC13131l
    public final void loadAd() {
        this.f15300package = true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[PHI: r16 r36
  0x0084: PHI (r16v1 long) = (r16v0 long), (r16v3 long), (r16v3 long) binds: [B:40:0x00d6, B:22:0x0082, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r36v2 lِٓ٘) = (r36v1 lِٓ٘), (r36v4 lِٓ٘), (r36v4 lِٓ٘) binds: [B:40:0x00d6, B:22:0x0082, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object, lِٔ٘] */
    /* JADX WARN: Type inference failed for: r19v2, types: [lِٔ٘] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, lِٔ٘] */
    public final C11826l mopub(InterfaceC14090l interfaceC14090l, C2432l c2432l, boolean z) throws IOException {
        int i;
        C11826l c11826l;
        long j;
        long jSignature;
        C18480l c18480l;
        C16391l c16391l;
        ?? c1721l;
        boolean zCrashlytics;
        InterfaceC5304l interfaceC5304l;
        int i2;
        List listSingletonList;
        int i3;
        InterfaceC14833l c15843l;
        InterfaceC1525l interfaceC1525l;
        long jCrashlytics = interfaceC14090l.crashlytics(c2432l);
        long j2 = this.mopub;
        C16391l c16391l2 = this.Signature;
        if (z) {
            try {
                c16391l2.admob(j2, this.subscription);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C11826l c11826l2 = new C11826l(interfaceC14090l, c2432l.billing, jCrashlytics);
        if (this.applovin == null) {
            C13143l c13143l = this.isVip;
            c11826l2.f23660l = 0;
            try {
                c13143l.m3563native(10);
                c11826l2.billing(c13143l.yandex, 0, 10, false);
                if (c13143l.appmetrica() != 4801587) {
                    c11826l = null;
                    jSignature = -9223372036854775807L;
                    j = -9223372036854775807L;
                } else {
                    c13143l.m3568throw(3);
                    int iIsVip = c13143l.isVip();
                    int i4 = iIsVip + 10;
                    c11826l = null;
                    byte[] bArr = c13143l.yandex;
                    j = -9223372036854775807L;
                    if (i4 > bArr.length) {
                        c13143l.m3563native(i4);
                        System.arraycopy(bArr, 0, c13143l.yandex, 0, 10);
                    }
                    c11826l2.billing(c13143l.yandex, 10, iIsVip, false);
                    C7417l c7417lApplovin = this.advert.applovin(iIsVip, c13143l.yandex);
                    if (c7417lApplovin == null) {
                        jSignature = j;
                    } else {
                        InterfaceC1525l[] interfaceC1525lArr = c7417lApplovin.yandex;
                        int length = interfaceC1525lArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                interfaceC1525l = null;
                                break;
                            }
                            InterfaceC1525l interfaceC1525l2 = interfaceC1525lArr[i5];
                            if (C1455l.class.isAssignableFrom(interfaceC1525l2.getClass())) {
                                interfaceC1525l = (InterfaceC1525l) C1455l.class.cast(interfaceC1525l2);
                                if (!((C1455l) interfaceC1525l).loadAd.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    interfaceC1525l = null;
                                }
                            } else {
                                interfaceC1525l = null;
                            }
                            if (interfaceC1525l != null) {
                                break;
                            }
                            i5++;
                        }
                        C1455l c1455l = (C1455l) interfaceC1525l;
                        if (c1455l == null) {
                            jSignature = j;
                        } else {
                            System.arraycopy(c1455l.crashlytics, 0, c13143l.yandex, 0, 8);
                            c13143l.m3562for(0);
                            c13143l.m3561extends(8);
                            jSignature = c13143l.Signature() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                c11826l = null;
                j = -9223372036854775807L;
            }
            c11826l2.f23660l = 0;
            C18480l c18480l2 = this.ads;
            if (c18480l2 == null) {
                Uri uri = c2432l.yandex;
                Map mapIsPro = interfaceC14090l.isPro();
                appmetrica appmetricaVar = this.license;
                appmetricaVar.getClass();
                C5978l c5978l = this.amazon;
                int iPurchase = C5795l.purchase(c5978l.metrica);
                List list = (List) mapIsPro.get("Content-Type");
                int iPurchase2 = C5795l.purchase((list == null || list.isEmpty()) ? c11826l : (String) list.get(0));
                int iBilling = C5795l.billing(uri);
                int[] iArr = appmetrica.f488l;
                ArrayList arrayList = new ArrayList(7);
                appmetrica.billing(iPurchase, arrayList);
                appmetrica.billing(iPurchase2, arrayList);
                appmetrica.billing(iBilling, arrayList);
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    appmetrica.billing(iArr[i6], arrayList);
                    i6++;
                }
                c11826l2.f23660l = 0;
                ?? r19 = c11826l;
                int i8 = 0;
                while (true) {
                    int size = arrayList.size();
                    C16391l c16391l3 = this.Signature;
                    if (i8 >= size) {
                        j2 = j2;
                        i = 0;
                        r19.getClass();
                        c18480l = new C18480l((InterfaceC14833l) r19, c5978l, c16391l3, (C8565l) appmetricaVar.f492l, appmetricaVar.f490l);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                    int i9 = i8;
                    if (iIntValue == 0) {
                        c16391l = c16391l3;
                        c1721l = new C0565l();
                    } else if (iIntValue == 1) {
                        c16391l = c16391l3;
                        c1721l = new C9681l();
                    } else if (iIntValue == 2) {
                        c16391l = c16391l3;
                        c1721l = new C16877l(0);
                    } else if (iIntValue != 7) {
                        List list2 = this.pro;
                        C6162l c6162l = InterfaceC5304l.f11423l;
                        if (iIntValue == 8) {
                            c16391l = c16391l3;
                            C8565l c8565l = (C8565l) appmetricaVar.f492l;
                            boolean z2 = appmetricaVar.f490l;
                            int i10 = appmetricaVar.f489l;
                            if (z2) {
                                interfaceC5304l = c8565l;
                                i2 = 4;
                            } else {
                                i2 = 36;
                                interfaceC5304l = c6162l;
                            }
                            byte[] bArr2 = C1721l.f4108for;
                            int i11 = (i10 & 1) != 0 ? 64 : 0;
                            if ((i10 & 2) != 0) {
                                i11 |= 128;
                            }
                            c1721l = new C1721l(interfaceC5304l, i2 | i11, c16391l, list2 != null ? list2 : C13708l.f26763l);
                        } else if (iIntValue == 11) {
                            C8565l c8565l2 = (C8565l) appmetricaVar.f492l;
                            boolean z3 = appmetricaVar.f490l;
                            if (list2 != null) {
                                i3 = 48;
                                listSingletonList = list2;
                            } else {
                                C12984l c12984l = new C12984l();
                                c12984l.vip = AbstractC3825l.vip("application/cea-608");
                                listSingletonList = Collections.singletonList(new C5978l(c12984l));
                                i3 = 16;
                            }
                            String str = c5978l.firebase;
                            if (!TextUtils.isEmpty(str)) {
                                if (AbstractC3825l.loadAd(str, "audio/mp4a-latm") == null) {
                                    i3 |= 2;
                                }
                                if (AbstractC3825l.loadAd(str, "video/avc") == null) {
                                    i3 |= 4;
                                }
                            }
                            InterfaceC5304l interfaceC5304l2 = !z3 ? c6162l : c8565l2;
                            c16391l = c16391l3;
                            c1721l = new C7251l(2, !z3 ? 1 : 0, interfaceC5304l2, c16391l3, new C17368l(i3, listSingletonList));
                        } else if (iIntValue != 13) {
                            c16391l = c16391l3;
                            c1721l = c11826l;
                        } else {
                            c1721l = new C10751l(c5978l.amazon, c16391l3, (C8565l) appmetricaVar.f492l, appmetricaVar.f490l);
                            c16391l = c16391l3;
                        }
                    } else {
                        c16391l = c16391l3;
                        c1721l = new C15843l(0L);
                    }
                    c1721l.getClass();
                    try {
                        zCrashlytics = c1721l.crashlytics(c11826l2);
                        i = 0;
                        c11826l2.f23660l = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        c11826l2.f23660l = 0;
                        zCrashlytics = false;
                    } catch (Throwable th) {
                        c11826l2.f23660l = 0;
                        throw th;
                    }
                    if (zCrashlytics) {
                        c18480l = new C18480l((InterfaceC14833l) c1721l, c5978l, c16391l, (C8565l) appmetricaVar.f492l, appmetricaVar.f490l);
                        break;
                    }
                    C5978l c5978l2 = c5978l;
                    if (r19 == 0 && (iIntValue == iPurchase || iIntValue == iPurchase2 || iIntValue == iBilling || iIntValue == 11)) {
                        r19 = c1721l;
                    }
                    i8 = i9 + 1;
                    c5978l = c5978l2;
                    arrayList = arrayList;
                    j2 = j2;
                    r19 = r19;
                }
            } else {
                InterfaceC14833l interfaceC14833l = (InterfaceC14833l) c18480l2.f36084l;
                InterfaceC14833l interfaceC14833lYandex = interfaceC14833l.yandex();
                AbstractC12442l.subscription(!((interfaceC14833lYandex instanceof C7251l) || (interfaceC14833lYandex instanceof C1721l)));
                boolean z4 = interfaceC14833l.yandex() == interfaceC14833l;
                Class<?> cls = interfaceC14833l.getClass();
                if (!z4) {
                    C8339l.smaato(AbstractC11028l.smaato("Can't recreate wrapped extractors. Outer type: %s", cls));
                    return c11826l;
                }
                if (interfaceC14833l instanceof C10751l) {
                    c15843l = new C10751l(((C5978l) c18480l2.f36088l).amazon, (C16391l) c18480l2.f36087l, (InterfaceC5304l) c18480l2.f36089l, c18480l2.f36085l);
                } else if (interfaceC14833l instanceof C16877l) {
                    c15843l = new C16877l(0);
                } else if (interfaceC14833l instanceof C0565l) {
                    c15843l = new C0565l();
                } else if (interfaceC14833l instanceof C9681l) {
                    c15843l = new C9681l();
                } else {
                    if (!(interfaceC14833l instanceof C15843l)) {
                        C8339l.smaato("Unexpected extractor type for recreation: ".concat(interfaceC14833l.getClass().getSimpleName()));
                        return c11826l;
                    }
                    c15843l = new C15843l(0);
                }
                c18480l = new C18480l(c15843l, (C5978l) c18480l2.f36088l, (C16391l) c18480l2.f36087l, (InterfaceC5304l) c18480l2.f36089l, c18480l2.f36085l);
                j2 = j2;
                i = 0;
            }
            C18480l c18480l3 = c18480l;
            this.applovin = c18480l3;
            InterfaceC14833l interfaceC14833lYandex2 = ((InterfaceC14833l) c18480l3.f36084l).yandex();
            int i12 = ((interfaceC14833lYandex2 instanceof C16877l) || (interfaceC14833lYandex2 instanceof C0565l) || (interfaceC14833lYandex2 instanceof C9681l) || (interfaceC14833lYandex2 instanceof C15843l)) ? 1 : i;
            C8915l c8915l = this.appmetrica;
            if (i12 != 0) {
                long jLoadAd = jSignature != j ? c16391l2.loadAd(jSignature) : j2;
                if (c8915l.f18331l != jLoadAd) {
                    c8915l.f18331l = jLoadAd;
                    C4251l[] c4251lArr = c8915l.f18321l;
                    int length2 = c4251lArr.length;
                    for (int i13 = i; i13 < length2; i13++) {
                        C4251l c4251l = c4251lArr[i13];
                        if (c4251l.f30581synchronized != jLoadAd) {
                            c4251l.f30581synchronized = jLoadAd;
                            c4251l.premium = true;
                        }
                    }
                }
            } else if (c8915l.f18331l != 0) {
                c8915l.f18331l = 0L;
                C4251l[] c4251lArr2 = c8915l.f18321l;
                int length3 = c4251lArr2.length;
                for (int i14 = i; i14 < length3; i14++) {
                    C4251l c4251l2 = c4251lArr2[i14];
                    if (c4251l2.f30581synchronized != 0) {
                        c4251l2.f30581synchronized = 0L;
                        c4251l2.premium = true;
                    }
                }
            }
            this.appmetrica.f18337l.clear();
            ((InterfaceC14833l) this.applovin.f36084l).billing(this.appmetrica);
        } else {
            i = 0;
        }
        C8915l c8915l2 = this.appmetrica;
        C17564l c17564l = c8915l2.f18330l;
        C17564l c17564l2 = this.ad;
        if (!Objects.equals(c17564l, c17564l2)) {
            c8915l2.f18330l = c17564l2;
            int i15 = i;
            while (true) {
                C4251l[] c4251lArr3 = c8915l2.f18321l;
                if (i15 >= c4251lArr3.length) {
                    break;
                }
                if (c8915l2.f18335l[i15]) {
                    C4251l c4251l3 = c4251lArr3[i15];
                    c4251l3.f8723native = c17564l2;
                    c4251l3.premium = true;
                }
                i15++;
            }
        }
        return c11826l2;
    }

    public final int purchase(int i) {
        AbstractC12442l.subscription(!this.f15301private);
        if (i >= this.f15302strictfp.size()) {
            return 0;
        }
        return ((Integer) this.f15302strictfp.get(i)).intValue();
    }

    @Override // defpackage.InterfaceC13131l
    public final void yandex() {
        C18480l c18480l;
        this.appmetrica.getClass();
        if (this.applovin == null && (c18480l = this.ads) != null) {
            InterfaceC14833l interfaceC14833lYandex = ((InterfaceC14833l) c18480l.f36084l).yandex();
            if ((interfaceC14833lYandex instanceof C7251l) || (interfaceC14833lYandex instanceof C1721l)) {
                this.applovin = this.ads;
                this.f15304throws = false;
            }
        }
        C2432l c2432l = this.adcel;
        InterfaceC14090l interfaceC14090l = this.startapp;
        if (this.f15304throws) {
            interfaceC14090l.getClass();
            c2432l.getClass();
            crashlytics(interfaceC14090l, c2432l, this.premium, false);
            this.inmobi = 0;
            this.f15304throws = false;
        }
        if (this.f15300package) {
            return;
        }
        if (!this.tapsense) {
            crashlytics(this.subs, this.loadAd, this.signatures, true);
        }
        this.f15303synchronized = !this.f15300package;
    }
}
