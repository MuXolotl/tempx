package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٓٝٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14289l {
    public static int admob(int i, int i2) {
        int i3 = i + RecyclerView.UNDEFINED_DURATION;
        int i4 = i2 + RecyclerView.UNDEFINED_DURATION;
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    public static final void amazon(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(88561188);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36034l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC8960l.loadAd(null, 0L, null, c6956l, 0, 7);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC10464l.amazon(((C14370l) c6956l.isPro(c10707l)).yandex.subscription, ((C14370l) c6956l.isPro(c10707l)).loadAd.smaato, c15578l, c6956l, 384);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15701l(c15578l, i, 5);
        }
    }

    public static final void billing(String str, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        c6956l.m2133new(453340238);
        int i2 = i | (c6956l.billing(str) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function1) ? 2048 : 1024);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(645202281, new C9772l(function0, function1, 9), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(1783371871, new C12273l(str, i3), c6956l), c6956l, 905970048, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(str, function0, function1, i, 7);
        }
    }

    public static final void crashlytics(Exception exc, Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(1292760983);
        int i2 = i | (c6956l.admob(exc) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(1361610076, new C0944l(exc, function0), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(1075457062, new C1350l(14, exc), c6956l), c6956l, 905970048, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0944l(exc, function0, i);
        }
    }

    public static final InterfaceC17242l firebase(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C13885l(function1));
    }

    public static final InterfaceC17242l isPro(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C0416l(function1));
    }

    public static final void loadAd(int i, Function0 function0, C6956l c6956l, int i2) {
        c6956l.m2133new(-1162709257);
        int i3 = 4;
        int i4 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16);
        if (c6956l.m2127for(i4 & 1, (i4 & 19) != 18)) {
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(-769131396, new C0454l(i3, function0), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(-1511456058, new C8821l(i, i3), c6956l), c6956l, 905970048, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1106l(i, i2, function0);
        }
    }

    public static int mopub(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static final void purchase(int i, int i2, final boolean z, C6956l c6956l, final int i3) {
        final int i4;
        final int i5 = i;
        final int i6 = i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1667876879);
        int i7 = i3 | (c6956l2.amazon(i5) ? 4 : 2) | (c6956l2.amazon(i6) ? 32 : 16);
        if (c6956l2.m2127for(i7 & 1, (i7 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
            int i8 = 12;
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(i8));
            C15089l c15089l = C18450l.f36034l;
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i9 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i9);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.cdcm_progress);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 0, 0, 130042);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(i8)), c15089l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i10 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i10, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            boolean z2 = ((i7 & 112) == 32) | ((i7 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                i5 = i;
                i4 = i2;
                objM2132native = new Function0() { // from class: lٔؔٚ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float f = i5;
                        int i11 = i4;
                        if (i11 < 1) {
                            i11 = 1;
                        }
                        return Float.valueOf(f / i11);
                    }
                };
                c6956l.m2147try(objM2132native);
            } else {
                i5 = i;
                i4 = i2;
            }
            i6 = i4;
            AbstractC15831l.yandex((Function0) objM2132native, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, c6956l, 48);
            byte b = 0;
            AbstractC10464l.amazon(((C14370l) c6956l.isPro(c10707l)).yandex.subscription, ((C14370l) c6956l.isPro(c10707l)).loadAd.smaato, AbstractC14566l.amazon(-281461243, new C10165l(i5, i6, b, b), c6956l), c6956l, 384);
            c6956l.startapp(true);
            AbstractC3383l.yandex(AbstractC0080l.amazon(c4346l, 1.0f), null, AbstractC13880l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.advert, 0L, 0L, 0L, c6956l, 0, 14), null, null, AbstractC15422l.isPro, c6956l, 196614, 26);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i5, i6, i3, z) { // from class: lؑۙۡ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f1959l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f1960l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ int f1961l;

                {
                    this.f1959l = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(385);
                    AbstractC14289l.purchase(this.f1961l, this.f1960l, this.f1959l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C7473l remoteconfig(final boolean z, Function0 function0, C6956l c6956l) {
        if (C14467l.yandex(80.0f, 0.0f) <= 0) {
            C8339l.metrica("The refresh trigger must be greater than zero!");
            return null;
        }
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (objM2132native == obj) {
            objM2132native = AbstractC12311l.isPro(c6956l);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
        InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(function0, c6956l);
        final C13250l c13250l = new C13250l();
        final C13250l c13250l2 = new C13250l();
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        c13250l.f26029l = interfaceC13490l.mo868instanceof(80.0f);
        c13250l2.f26029l = interfaceC13490l.mo868instanceof(56.0f);
        boolean zBilling = c6956l.billing(interfaceC2262l);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj) {
            objM2132native2 = new C7473l(interfaceC2262l, interfaceC8714lVip, c13250l2.f26029l, c13250l.f26029l);
            c6956l.m2147try(objM2132native2);
        }
        final C7473l c7473l = (C7473l) objM2132native2;
        boolean zAdmob = c6956l.admob(c7473l) | c6956l.mopub(z) | c6956l.crashlytics(c13250l.f26029l) | c6956l.crashlytics(c13250l2.f26029l);
        Object objM2132native3 = c6956l.m2132native();
        if (zAdmob || objM2132native3 == obj) {
            objM2132native3 = new Function0() { // from class: lٍۥۜ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    C7473l c7473l2 = c7473l;
                    boolean zLoadAd = c7473l2.loadAd();
                    InterfaceC2262l interfaceC2262l2 = c7473l2.yandex;
                    C13765l c13765l = c7473l2.admob;
                    boolean z2 = z;
                    if (zLoadAd != z2) {
                        c7473l2.amazon.setValue(Boolean.valueOf(z2));
                        c7473l2.billing.subs(0.0f);
                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C18716l(c7473l2, z2 ? c13765l.admob() : 0.0f, null), 3);
                    }
                    c7473l2.mopub.subs(c13250l.f26029l);
                    float f = c13250l2.f26029l;
                    if (c13765l.admob() != f) {
                        c13765l.subs(f);
                        if (c7473l2.loadAd()) {
                            AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C18716l(c7473l2, f, null), 3);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            c6956l.m2147try(objM2132native3);
        }
        AbstractC12311l.billing((Function0) objM2132native3, c6956l);
        return c7473l;
    }

    public static final InterfaceC17242l smaato(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C18244l(function1));
    }

    public static final Object subs(InterfaceC16588l interfaceC16588l, byte[] bArr) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        try {
            zipInputStream.getNextEntry();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream, 8192);
            try {
                Object objCrashlytics = AbstractC7876l.crashlytics(AbstractC15703l.yandex, interfaceC16588l, bufferedInputStream);
                bufferedInputStream.close();
                zipInputStream.close();
                return objCrashlytics;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(bufferedInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC7876l.loadAd(zipInputStream, th3);
                throw th4;
            }
        }
    }

    public static final byte[] vip(InterfaceC16588l interfaceC16588l, Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            try {
                zipOutputStream.setLevel(7);
                zipOutputStream.putNextEntry(new ZipEntry("Entry"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream, 8192);
                try {
                    C13047l c13047l = AbstractC15703l.yandex;
                    C17219l c17219l = new C17219l(bufferedOutputStream);
                    byte[] bArr = (byte[]) c17219l.f33427l;
                    try {
                        AbstractC10802l.crashlytics(c13047l, c17219l, interfaceC16588l, obj);
                        c17219l.signatures();
                        C11962l.crashlytics.loadAd((char[]) c17219l.f33426l);
                        C5707l.crashlytics.yandex(bArr);
                        Unit unit = Unit.INSTANCE;
                        bufferedOutputStream.close();
                        zipOutputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        c17219l.signatures();
                        C11962l.crashlytics.loadAd((char[]) c17219l.f33426l);
                        C5707l.crashlytics.yandex(bArr);
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7876l.loadAd(bufferedOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AbstractC7876l.loadAd(zipOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                AbstractC7876l.loadAd(byteArrayOutputStream, th6);
                throw th7;
            }
        }
    }

    public static final void yandex(C3713l c3713l, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(870112976);
        int i2 = i | (c6956l2.admob(c3713l) ? 4 : 2) | (c6956l2.admob(function0) ? 32 : 16) | (c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.cdcm_receive_accept);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            C15089l c15089l = C18450l.f36034l;
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC3605l.remoteconfig(new C14020l(c15089l), 16.0f, 16.0f), ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon), AbstractC12953l.firebase(C9735l.loadAd(0.1f, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex), ((C14370l) c6956l.isPro(c10707l)).yandex.ads), AbstractC16837l.yandex), 16.0f);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            int i5 = 1;
            int i6 = 0;
            for (byte b : c3713l.yandex) {
                int i7 = (b * i5) + i6;
                i5 = (i5 * 31) % 9973;
                i6 = i7 % 9973;
            }
            AbstractC13010l.loadAd(String.format(Locale.US, "%04d", Integer.valueOf(Math.abs(i6))), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).amazon, c6956l, 48, 0, 130040);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cdcm_receive_info), null, AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 0, 0, 130042);
            c6956l.startapp(true);
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j3 = c6956l.f14595continue;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l2 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l2);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i8), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, C3438l.amazon);
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            AbstractC17457l.crashlytics(function0, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l).crashlytics, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC15422l.yandex, c6956l, ((i2 >> 3) & 14) | 817889280, 372);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            AbstractC17457l.loadAd(function1, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l2).crashlytics, null, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC15422l.loadAd, c6956l2, ((i2 >> 6) & 14) | 817889280, 372);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(c3713l, function0, function1, i, 6);
        }
    }
}
