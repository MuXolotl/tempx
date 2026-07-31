package defpackage;

import android.app.Activity;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَِٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11749l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f23527l = 0;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public String f23528l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f23529l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f23530l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f23531l;

    public C11749l(String str) {
        super(false, 1);
        this.f23531l = str;
        this.f23530l = AbstractC8020l.smaato(C13415l.yandex);
        this.f23529l = AbstractC8020l.smaato(C18185l.yandex);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C6001l m3237strictfp(C10217l c10217l) {
        C0415l c0415l;
        List list;
        String str = c10217l.admob;
        C15375l c15375l = c10217l.tapsense;
        String str2 = null;
        C5576l c5576l = new C5576l(new C0415l(str, 2), new C0415l(c10217l.billing, 2), new C0415l(null, 3), new C0415l(null, 3));
        List<C15375l> list2 = c10217l.smaato;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list2, 10));
        for (C15375l c15375l2 : list2) {
            String str3 = c15375l2.loadAd;
            String str4 = c15375l2.crashlytics;
            arrayList.add(new C18023l(str3, c15375l2.yandex, null, str4.length() > 0 ? new C0415l(str4, 2) : null, 12));
        }
        String str5 = c10217l.loadAd;
        switch (str5.hashCode()) {
            case -2024994754:
                if (str5.equals("multi_images")) {
                    EnumC2546l enumC2546l = EnumC2546l.f5549l;
                    String str6 = c10217l.yandex;
                    List listSingletonList = Collections.singletonList(new C18023l(c10217l.ads, null, null, null, 30));
                    List listSingletonList2 = Collections.singletonList(new C18023l(c10217l.adcel, null, null, null, 30));
                    ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                    for (C15375l c15375l3 : list2) {
                        String str7 = c15375l3.loadAd;
                        List list3 = c15375l3.mopub;
                        String str8 = c15375l3.yandex;
                        String str9 = c15375l3.crashlytics;
                        if (list3.isEmpty()) {
                            c0415l = null;
                        } else {
                            String str10 = (String) AbstractC16901l.m4217extends(list3);
                            if (str10 == null) {
                                str10 = "";
                            }
                            c0415l = new C0415l(str10, 2);
                        }
                        arrayList2.add(new C18023l(str7, str8, str9, c0415l, 8));
                    }
                    return new C6001l(enumC2546l, str6, listSingletonList, listSingletonList2, c5576l, c10217l.amazon, c10217l.crashlytics, arrayList2, 6928);
                }
                break;
            case -1820889799:
                if (str5.equals("extended")) {
                    EnumC2546l enumC2546l2 = EnumC2546l.f5551l;
                    String str11 = c10217l.yandex;
                    List listSingletonList3 = Collections.singletonList(new C18023l(c10217l.ads, null, null, null, 30));
                    List listSingletonList4 = Collections.singletonList(new C18023l(c10217l.adcel, null, null, null, 30));
                    ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list2, 10));
                    for (C15375l c15375l4 : list2) {
                        String str12 = c15375l4.loadAd;
                        String str13 = c15375l4.crashlytics;
                        arrayList3.add(new C18023l(c15375l4.yandex, str12, null, str13.length() > 0 ? new C0415l(str13, 2) : null, 4));
                    }
                    return new C6001l(enumC2546l2, str11, listSingletonList3, listSingletonList4, c5576l, c10217l.amazon, c10217l.crashlytics, arrayList3, 6928);
                }
                break;
            case 3016401:
                if (str5.equals("base")) {
                    EnumC2546l enumC2546l3 = EnumC2546l.f5547l;
                    String str14 = c10217l.yandex;
                    List listSingletonList5 = Collections.singletonList(new C18023l(c10217l.ads, null, null, null, 30));
                    List listSingletonList6 = Collections.singletonList(new C18023l(c10217l.adcel, null, null, null, 30));
                    ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(list2, 10));
                    for (C15375l c15375l5 : list2) {
                        arrayList4.add(new C18023l(c15375l5.loadAd, c15375l5.yandex, null, null, 28));
                    }
                    return new C6001l(enumC2546l3, str14, listSingletonList5, listSingletonList6, c5576l, c10217l.amazon, c10217l.crashlytics, arrayList4, 6928);
                }
                break;
            case 97436022:
                if (str5.equals("final")) {
                    return new C6001l(EnumC2546l.f5545l, c10217l.yandex, Collections.singletonList(new C18023l(c10217l.ads, null, null, null, 30)), Collections.singletonList(new C18023l(c10217l.adcel, null, null, null, 30)), c5576l, c10217l.amazon, c10217l.crashlytics, null, 7952);
                }
                break;
            case 1233099618:
                if (str5.equals("welcome")) {
                    EnumC2546l enumC2546l4 = EnumC2546l.f5551l;
                    String str15 = c10217l.yandex;
                    List listSingletonList7 = Collections.singletonList(new C18023l(c10217l.ads, null, null, null, 30));
                    List listSingletonList8 = Collections.singletonList(new C18023l(c10217l.adcel, null, null, null, 30));
                    String str16 = c15375l != null ? c15375l.amazon : null;
                    String str17 = str16 == null ? "" : str16;
                    if (c15375l != null && (list = c15375l.mopub) != null) {
                        str2 = (String) AbstractC16901l.m4217extends(list);
                    }
                    return new C6001l(enumC2546l4, str15, listSingletonList7, listSingletonList8, c5576l, c10217l.amazon, c10217l.crashlytics, Collections.singletonList(new C18023l(str17, null, null, new C0415l(str2 != null ? str2 : "", 2), 6)), 6928);
                }
                break;
        }
        return new C6001l(EnumC2546l.f5547l, c10217l.yandex, Collections.singletonList(new C18023l(c10217l.ads, null, null, null, 30)), Collections.singletonList(new C18023l(c10217l.adcel, null, null, null, 30)), c5576l, c10217l.amazon, c10217l.crashlytics, arrayList, 6928);
    }

    public final void ad(int i, int i2, C6956l c6956l) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(655679419);
        int i3 = (c6956l2.amazon(i) ? 4 : 2) | i2;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l, C18450l.f36043l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.logo_vk_music_outline_24, 0, c6956l2);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(c4346l, 36.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c6956l2, 440, 0);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, i), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, AbstractC7039l.isPro(15), null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, 24576, 0, 261098);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(this, i, i2, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    public final void advert(C18023l c18023l, EnumC2546l enumC2546l, String str, C6956l c6956l, int i) {
        int i2;
        boolean z;
        c6956l.m2133new(891582932);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c18023l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.amazon(enumC2546l.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(24.0f);
            if (enumC2546l == EnumC2546l.f5544l) {
                z = false;
            } else {
                if (str == null) {
                    C0415l c0415l = c18023l.purchase;
                    if ((c0415l != null ? c0415l.yandex : null) == null || !AbstractC8576l.yandex(c18023l.amazon, "artist")) {
                        z = false;
                    }
                }
                z = true;
            }
            AbstractC3383l.yandex(AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.amazon, AbstractC13880l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l, 54, 12), null, null, AbstractC14566l.amazon(-1144498106, new C0598l(1, c18023l, str, AbstractC14566l.amazon(-53770874, new C0849l(z, i3), c6956l), enumC2546l, z), c6956l), c6956l, 196614, 24);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, c18023l, enumC2546l, str, i, 10);
        }
    }

    public final void applovin(final C6001l c6001l, final boolean z, final int i, final int i2, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i3) {
        int i4;
        c6956l.m2133new(1022731781);
        if ((i3 & 6) == 0) {
            i4 = (c6956l.admob(c6001l) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = 16;
        if ((i3 & 48) == 0) {
            i4 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c6956l.amazon(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i4 |= c6956l.admob(this) ? 131072 : 65536;
        }
        if (c6956l.m2127for(i4 & 1, (74899 & i4) != 74898)) {
            appmetrica(c6001l, z, i, i2, interfaceC17242l, AbstractC14566l.amazon(1326873690, new C0541l(c6001l, this, i5), c6956l), c6956l, 196608 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | ((i4 << 3) & 3670016));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؘۘ۟
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    this.f12469l.applovin(c6001l, z, i, i2, interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b4 A[PHI: r0
  0x01b4: PHI (r0v11 java.lang.String) = (r0v8 java.lang.String), (r0v14 java.lang.String) binds: [B:113:0x01c2, B:104:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    public final void appmetrica(final C6001l c6001l, final boolean z, int i, int i2, final InterfaceC17242l interfaceC17242l, final C15578l c15578l, C6956l c6956l, final int i3) {
        int i4;
        final int i5;
        final int i6;
        InterfaceC16497l interfaceC16497l;
        int i7;
        int i8;
        int i9;
        String str;
        C0415l c0415l;
        C0415l c0415l2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1161295304);
        if ((i3 & 6) == 0) {
            i4 = (c6956l2.admob(c6001l) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c6956l2.mopub(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c6956l2.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c6956l2.amazon(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c6956l2.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c6956l2.admob(c15578l) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c6956l2.admob(this) ? 1048576 : 524288;
        }
        if (c6956l2.m2127for(i4 & 1, (599187 & i4) != 599186)) {
            C18113l c18113lPurchase = AbstractC7303l.purchase(c6956l2);
            Activity activity = this.f5081l;
            c6956l2.isPro(AbstractC1242l.yandex);
            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
            InterfaceC13564l.yandex.getClass();
            C13567l c13567l = C9311l.loadAd;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                interfaceC16497l = C17621l.f34289l;
            } else {
                interfaceC16497l = i10 >= 30 ? C4209l.f8639l : C11140l.f22368l;
            }
            long jLicense = interfaceC13490l.license(AbstractC5833l.smaato(interfaceC16497l.crashlytics(activity, c13567l.loadAd).yandex()).mopub());
            Set set = C3963l.f8145l;
            Set set2 = C15702l.f30842l;
            float fLoadAd = C2261l.loadAd(jLicense);
            if (C14467l.yandex(fLoadAd, 0.0f) < 0) {
                C8339l.metrica("Width must not be negative");
                return;
            }
            if (set.isEmpty()) {
                C8339l.metrica("Must support at least one size class");
                return;
            }
            List list = C3963l.f8144l;
            int size = list.size();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= size) {
                    i7 = i4;
                    i8 = i12;
                    break;
                }
                int i13 = i11;
                i8 = ((C3963l) list.get(i11)).f8146l;
                i7 = i4;
                if (set.contains(new C3963l(i8))) {
                    if (C14467l.yandex(fLoadAd, AbstractC14566l.loadAd(i8)) >= 0) {
                        break;
                    } else {
                        i12 = i8;
                    }
                }
                i11 = i13 + 1;
                i4 = i7;
            }
            Set set3 = C15702l.f30842l;
            float fYandex = C2261l.yandex(jLicense);
            if (C14467l.yandex(fYandex, 0.0f) < 0) {
                C8339l.metrica("Width must not be negative");
                return;
            }
            if (set2.isEmpty()) {
                C8339l.metrica("Must support at least one size class");
                return;
            }
            List list2 = C15702l.f30841l;
            int size2 = list2.size();
            int i14 = 0;
            int i15 = 2;
            while (true) {
                if (i14 >= size2) {
                    i9 = i15;
                    break;
                }
                i9 = ((C15702l) list2.get(i14)).f30843l;
                List list3 = list2;
                if (set2.contains(new C15702l(i9))) {
                    if (C14467l.yandex(fYandex, AbstractC15576l.billing(i9)) >= 0) {
                        break;
                    } else {
                        i15 = i9;
                    }
                }
                i14++;
                list2 = list3;
            }
            boolean zBilling = c6956l2.billing(new C1454l(i8, i9)) | c6956l2.billing(c6001l);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            InterfaceC14029l interfaceC14029l = null;
            if (zBilling || objM2132native == c13863l) {
                Set set4 = C3963l.f8145l;
                if (i8 == 0) {
                    C5576l c5576l = c6001l.billing;
                    str = (c5576l == null || (c0415l2 = c5576l.loadAd) == null) ? null : c0415l2.yandex;
                    if (str == null) {
                        objM2132native = "";
                    } else {
                        objM2132native = str;
                    }
                } else {
                    C5576l c5576l2 = c6001l.billing;
                    str = (c5576l2 == null || (c0415l = c5576l2.yandex) == null) ? null : c0415l.yandex;
                    if (str == null) {
                        objM2132native = "";
                    } else {
                        objM2132native = str;
                    }
                }
                c6956l2.m2147try(objM2132native);
            }
            String str2 = (String) objM2132native;
            Object[] objArr = new Object[0];
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C6573l(19);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) AbstractC0825l.firebase(objArr, (Function0) objM2132native2, c6956l2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zBilling2 = ((i7 & 112) == 32) | c6956l2.billing(interfaceC8714l);
            Object objM2132native3 = c6956l2.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                objM2132native3 = new C10291l(z, interfaceC8714l, interfaceC14029l, 3);
                c6956l2.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l2, boolValueOf, (Function2) objM2132native3);
            C14855l c14855l = C18450l.f36026l;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
            long j = c6956l2.f14595continue;
            int i16 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i16);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C10707l c10707l = AbstractC16964l.yandex;
            C18627l c18627l = new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.premium);
            C4346l c4346l = C4346l.f8873l;
            AbstractC7741l.purchase(str2, null, AbstractC0080l.crashlytics(c4346l, 1.0f).premium(new C15850l(c18113lPurchase)), c18627l, null, C4176l.billing, c6956l2, 4144, 6, 31728);
            C8896l c8896l = AbstractC11922l.yandex;
            C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
            C14855l c14855l2 = C18450l.f36043l;
            C16170l c16170l = C16170l.yandex;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC8532l.loadAd(AbstractC0019l.crashlytics(AbstractC3605l.vip(AbstractC0080l.remoteconfig(AbstractC0080l.amazon(c16170l.yandex(c4346l, c14855l2), 1.0f), 0.0f, 0.0f, 400.0f, 0.0f, 11), 32.0f, 0.0f, 2), ((C14370l) c6956l2.isPro(c10707l)).crashlytics.amazon), c13315lAdmob, 2);
            Object objM2132native4 = c6956l2.m2132native();
            if (objM2132native4 == c13863l) {
                objM2132native4 = new C1306l(12);
                c6956l2.m2147try(objM2132native4);
            }
            InterfaceC17242l interfaceC17242lMopub = AbstractC6710l.mopub(interfaceC17242lLoadAd, c18113lPurchase, (Function1) objM2132native4);
            long j2 = C9735l.isPro;
            long j3 = C9735l.purchase;
            c6956l2 = c6956l;
            AbstractC3383l.amazon(interfaceC17242lMopub, ((C14370l) c6956l2.isPro(c10707l)).crashlytics.amazon, AbstractC13880l.purchase(j2, j3, c6956l, 54, 12), null, AbstractC2576l.yandex(1.0f, C9735l.loadAd(0.25f, j3)), AbstractC14566l.amazon(-421483138, new C11223l(interfaceC8714l, this, c6001l, c15578l), c6956l2), c6956l2, 221184, 8);
            InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(c16170l.yandex(c4346l, C18450l.f36042l), 16.0f, 16.0f);
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
            long j4 = c6956l2.f14595continue;
            int i17 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lRemoteconfig);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i17, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            if (i == 0) {
                c6956l2.m2123default(637425386);
                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_down_24, 0, c6956l2), null, AbstractC0080l.isPro(c4346l, 32.0f), j3, c6956l, 3512, 0);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
                i6 = i;
                i5 = i2;
            } else {
                c6956l2.m2123default(637746267);
                i6 = i;
                i5 = i2;
                AbstractC11621l.loadAd(null, C9735l.loadAd(0.75f, C9735l.loadAd), j3, AbstractC14566l.amazon(57982011, new Function3() { // from class: lَّۖ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i18 = i6;
                        int i19 = i5;
                        C6956l c6956l3 = (C6956l) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                            C18734l c18734l = new C18734l();
                            long j5 = C9735l.purchase;
                            int iPurchase = c18734l.purchase(new C14264l(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            try {
                                c18734l.crashlytics(String.valueOf(i18 + 1));
                                Unit unit = Unit.INSTANCE;
                                c18734l.amazon(iPurchase);
                                int iPurchase2 = c18734l.purchase(new C14264l(C9735l.loadAd(0.5f, j5), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                try {
                                    c18734l.f36518l.append('/');
                                    c18734l.crashlytics(String.valueOf(i19));
                                    c18734l.amazon(iPurchase2);
                                    AbstractC13010l.crashlytics(c18734l.billing(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).loadAd.remoteconfig, c6956l3, 0, 0, 262142);
                                } catch (Throwable th) {
                                    c18734l.amazon(iPurchase2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                c18734l.amazon(iPurchase);
                                throw th2;
                            }
                        } else {
                            c6956l3.m2124else();
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l2), c6956l2, 3504);
                c6956l2.startapp(false);
            }
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            i5 = i2;
            i6 = i;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            final int i18 = i6;
            final int i19 = i5;
            c4224lAds.amazon = new Function2() { // from class: lًَؔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f5272l.appmetrica(c6001l, z, i18, i19, interfaceC17242l, c15578l, (C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void inmobi(C6001l c6001l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-259546018);
        int i2 = 2;
        int i3 = (c6956l2.admob(c6001l) ? 4 : 2) | i;
        int i4 = 0;
        int i5 = 1;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            for (Object obj : c6001l.firebase) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                AbstractC3383l.yandex(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, i2), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).crashlytics.amazon, AbstractC13880l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l, 54, 12), null, null, AbstractC14566l.amazon(-986035349, new C16445l((C18023l) obj, i5), c6956l), c6956l, 196614, 24);
                c6956l2 = c6956l;
                i4 = i6;
                i2 = 2;
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(this, c6001l, i, 5);
        }
    }

    public final void isVip(C6001l c6001l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-2090448568);
        int i2 = (c6956l2.admob(c6001l) ? 4 : 2) | i;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C18023l c18023l = (C18023l) AbstractC16901l.m4217extends(c6001l.crashlytics);
            if (c18023l == null) {
                C4224l c4224lAds = c6956l2.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C12443l(this, c6001l, i, 6);
                    return;
                }
                return;
            }
            C0415l c0415l = c18023l.purchase;
            String str = c18023l.yandex;
            float fMo868instanceof = ((InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob)).mo868instanceof(24.0f);
            C4346l c4346l = C4346l.f8873l;
            C13863l c13863l = C1867l.yandex;
            if (c0415l != null) {
                c6956l2.m2123default(472764540);
                InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                long j = c6956l2.f14595continue;
                int i3 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
                AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                boolean zBilling = c6956l2.billing(c18023l);
                Object objM2132native = c6956l2.m2132native();
                if (zBilling || objM2132native == c13863l) {
                    objM2132native = str.toUpperCase(Locale.ROOT);
                    c6956l2.m2147try(objM2132native);
                }
                AbstractC13010l.loadAd((String) objM2132native, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0L, 0L, new C11617l(1), C6886l.f14420l, AbstractC1193l.crashlytics, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.loadAd, c6956l, 14155824, 0, 129820);
                c6956l2 = c6956l;
                String str2 = c0415l.yandex;
                InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                boolean zCrashlytics = c6956l2.crashlytics(fMo868instanceof);
                Object objM2132native2 = c6956l2.m2132native();
                if (zCrashlytics || objM2132native2 == c13863l) {
                    objM2132native2 = new C14157l(3, fMo868instanceof);
                    c6956l2.m2147try(objM2132native2);
                }
                AbstractC7741l.amazon(str2, null, AbstractC7477l.loadAd(interfaceC17242lAmazon2, (Function1) objM2132native2), C4176l.crashlytics, null, c6956l2, 1572912, 1976);
                c6956l2.startapp(true);
                c6956l2.startapp(false);
            } else {
                if (str.length() > 0) {
                    c6956l2.m2123default(473797026);
                    boolean zBilling2 = c6956l2.billing(c18023l);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native3 == c13863l) {
                        objM2132native3 = str.toUpperCase(Locale.ROOT);
                        c6956l2.m2147try(objM2132native3);
                    }
                    String str3 = (String) objM2132native3;
                    C11090l c11090l = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.mopub;
                    AbstractC13010l.loadAd(str3, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0L, 0L, null, C6886l.f14420l, AbstractC1193l.crashlytics, 0L, new C10258l(3), 0L, 0, false, 0, 0, c11090l, c6956l, 14155824, 0, 129852);
                    c6956l2 = c6956l;
                } else {
                    c6956l2.m2123default(447609466);
                }
                c6956l2.startapp(false);
            }
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds2 = c6956l2.ads();
        if (c4224lAds2 != null) {
            c4224lAds2.amazon = new C12443l(this, c6001l, i, 7);
        }
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-1319887812);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC0831l.yandex(c6956l);
            C18113l c18113lPurchase = AbstractC7303l.purchase(c6956l);
            float fMo868instanceof = ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(16.0f);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C10740l(10, this);
                c6956l.m2147try(objM2132native);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l, 0, 3);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C8912l(this, null, 27);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(987814400, new C7109l(c18113lPurchase, fMo868instanceof, this), c6956l), null, null, null, 0, C9735l.loadAd, C9735l.purchase, null, AbstractC14566l.amazon(1708483979, new Cprotected(this, c18113lPurchase, c2887lLoadAd, 24), c6956l), c6956l, 819462192, 317);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8973l(this, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f A[Catch: all -> 0x004e, PHI: r0
  0x012f: PHI (r0v53 java.lang.Object) = (r0v47 java.lang.Object), (r0v1 java.lang.Object) binds: [B:64:0x012c, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:22:0x0049, B:66:0x012f, B:27:0x0053, B:55:0x00d5, B:57:0x00df, B:59:0x00e7, B:61:0x00eb, B:63:0x0100, B:51:0x009d), top: B:97:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0182, code lost:
    
        if (r0 == r11) goto L77;
     */
    /* JADX INFO: renamed from: native, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3238native(defpackage.AbstractC0283l r19) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11749l.m3238native(lّؑۧ):java.lang.Object");
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3239package(C6001l c6001l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(197133517);
        int i2 = 2;
        int i3 = (c6956l2.admob(c6001l) ? 4 : 2) | i;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            int i4 = 0;
            for (Object obj : c6001l.firebase) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                AbstractC3383l.yandex(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, i2), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).crashlytics.amazon, AbstractC13880l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l, 54, 12), null, null, AbstractC14566l.amazon(-959301030, new C1866l((C18023l) obj, i4, 5), c6956l), c6956l, 196614, 24);
                c6956l2 = c6956l;
                i4 = i5;
                i2 = 2;
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(this, c6001l, i, 3);
        }
    }

    public final void premium(C6001l c6001l, C6956l c6956l, int i) {
        C6956l c6956l2;
        boolean z;
        c6956l.m2133new(-529973338);
        int i2 = (c6956l.admob(c6001l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C15506l c15506l = c6001l.remoteconfig;
            String str = c15506l != null ? c15506l.crashlytics : null;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC17463l.loadAd(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), false);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC7741l.amazon(str, null, AbstractC0019l.crashlytics(interfaceC17242lLoadAd, ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon), C4176l.billing, null, c6956l, 1572912, 1976);
            InterfaceC8442l interfaceC8442l = (InterfaceC8442l) this.f23529l.getValue();
            boolean z2 = interfaceC8442l instanceof C4862l;
            C13863l c13863l = C1867l.yandex;
            if (z2) {
                c6956l.m2123default(-337311184);
                boolean zAdmob = c6956l.admob(this) | c6956l.admob(interfaceC8442l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new C9810l(this, (C4862l) interfaceC8442l, 24);
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                C6839l c6839l = ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon;
                C17253l c17253l = C12719l.yandex;
                AbstractC17457l.loadAd((Function0) objM2132native, interfaceC17242lStartapp, false, c6839l, C12719l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l, 12), null, null, null, AbstractC1214l.crashlytics, c6956l, 805306416, 484);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
                z = true;
            } else {
                if (!AbstractC8576l.yandex(interfaceC8442l, C18185l.yandex)) {
                    throw AbstractC12900l.billing(-10882830, c6956l, false);
                }
                c6956l.m2123default(-336320672);
                boolean zAdmob2 = c6956l.admob(this) | c6956l.admob(c6001l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C9810l(this, c6001l, 25);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                C6839l c6839l2 = ((C14370l) c6956l.isPro(c10707l)).crashlytics.amazon;
                C17253l c17253l2 = C12719l.yandex;
                AbstractC17457l.loadAd((Function0) objM2132native2, interfaceC17242lStartapp2, false, c6839l2, C12719l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l, 12), null, null, null, AbstractC1214l.amazon, c6956l, 805306416, 484);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
                z = true;
            }
            c6956l2.startapp(z);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(this, c6001l, i, 4);
        }
    }

    public final void pro(C6001l c6001l, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(740797797);
        int i2 = (c6956l.admob(c6001l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 0;
            for (Object obj : c6001l.firebase) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                advert((C18023l) obj, c6001l.yandex, (String) AbstractC16901l.m4220for(i3, c6001l.purchase), c6956l, (i2 << 6) & 7168);
                i3 = i4;
            }
            c6956l2 = c6956l;
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(this, c6001l, i, 0);
        }
    }

    public final void signatures(C6001l c6001l, C6956l c6956l, int i) {
        C11090l c11090l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-770396730);
        int i2 = 2;
        int i3 = i | (c6956l2.admob(c6001l) ? 4 : 2);
        boolean z = true;
        boolean z2 = false;
        if (!c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            c6956l2.m2124else();
        } else if (c6001l.amazon.isEmpty()) {
            c6956l2.m2123default(1389593340);
            c6956l2.startapp(false);
        } else {
            c6956l2.m2123default(1416388655);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            c6956l2.m2123default(-1388061949);
            int i5 = 0;
            for (Object obj : c6001l.amazon) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                String str = ((C18023l) obj).yandex;
                if (i5 == 0) {
                    c6956l2.m2123default(871037275);
                    c11090l = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.isPro;
                } else {
                    c6956l2.m2123default(871038556);
                    c11090l = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.firebase;
                }
                c6956l2.startapp(z2);
                AbstractC13010l.loadAd(str, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 8.0f, 0.0f, i2), 0L, 0L, null, C6886l.f14420l, i5 == 0 ? AbstractC1193l.crashlytics : AbstractC1193l.loadAd, 0L, new C10258l(3), 0L, 0, false, 0, 0, c11090l, c6956l, 1572912, 0, 129852);
                z = z;
                c6956l2 = c6956l;
                i5 = i6;
                c4346l = c4346l;
                i2 = i2;
                z2 = false;
            }
            boolean z3 = z2;
            AbstractC12900l.ads(c6956l2, z3, z, z3);
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(this, c6001l, i, 8);
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m3240synchronized(C6001l c6001l, C6956l c6956l, int i) {
        C11749l c11749l;
        C6956l c6956l2;
        c6956l.m2133new(-891221502);
        int i2 = (c6956l.admob(c6001l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            c11749l = this;
            c6956l2 = c6956l;
            c11749l.advert(new C18023l("неизвестный блок", c6001l.yandex.name(), null, null, 28), c6001l.yandex, null, c6956l2, ((i2 << 6) & 7168) | 384);
        } else {
            c11749l = this;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(c11749l, c6001l, i, 2);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m3241throws(C6001l c6001l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(684368564);
        int i2 = 2;
        int i3 = (c6956l2.admob(c6001l) ? 4 : 2) | i;
        int i4 = 0;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            int i5 = 0;
            for (Object obj : c6001l.firebase) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                AbstractC3383l.yandex(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, i2), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).crashlytics.amazon, AbstractC13880l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l, 54, 12), null, null, AbstractC14566l.amazon(-1687176575, new C16445l((C18023l) obj, i4), c6956l), c6956l, 196614, 24);
                c6956l2 = c6956l;
                i5 = i6;
                i2 = 2;
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12443l(this, c6001l, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Object m3242volatile(AbstractC0283l abstractC0283l) {
        C10385l c10385l;
        Object c18435l;
        C11749l c11749l;
        if (abstractC0283l instanceof C10385l) {
            c10385l = (C10385l) abstractC0283l;
            int i = c10385l.f21199l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10385l.f21199l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10385l = new C10385l(this, abstractC0283l);
            }
        } else {
            c10385l = new C10385l(this, abstractC0283l);
        }
        Object objBilling = c10385l.f21202l;
        int i2 = c10385l.f21199l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objBilling);
                this.f23529l.setValue(C18185l.yandex);
                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                String str = this.f23531l;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                c10385l.f21201l = this;
                c10385l.f21200l = this;
                c10385l.f21199l = 1;
                C17464l c17464l = new C17464l("studio.getArtistYearRecapData", C14823l.f29005l);
                c17464l.yandex("artist_id", str);
                objBilling = c7644lLoadAd.billing(c17464l, c10385l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objBilling == enumC9342l) {
                    return enumC9342l;
                }
                c11749l = this;
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = c10385l.f21200l;
                c11749l = c10385l.f21201l;
                AbstractC2829l.crashlytics(objBilling);
            }
            List listM4243this = AbstractC16901l.m4243this(((C15489l) AbstractC10802l.subs((AbstractC14237l) objBilling)).yandex, new C15696l(2));
            ArrayList<C10217l> arrayList = new ArrayList();
            for (Object obj : listM4243this) {
                if (((C10217l) obj).amazon) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
            for (C10217l c10217l : arrayList) {
                c11749l.getClass();
                arrayList2.add(m3237strictfp(c10217l));
            }
            c18435l = new C9424l(arrayList2);
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Object obj2 = (C9424l) (c18435l instanceof C18435l ? null : c18435l);
        if (obj2 == null) {
            obj2 = C1813l.yandex;
        }
        this.f23530l.setValue(obj2);
        return Unit.INSTANCE;
    }
}
