package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lؚؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7039l {
    public static final C15578l yandex = new C15578l(-2076581929, false, new C4076l(1));
    public static final C15578l loadAd = new C15578l(-1470807147, false, new C4076l(2));
    public static final C15578l crashlytics = new C15578l(-466088303, false, new C3817l(9));
    public static final C15578l amazon = new C15578l(-163200912, false, new C3817l(10));
    public static final C15578l purchase = new C15578l(139686479, false, new C3817l(11));
    public static final C15578l billing = new C15578l(-2117491689, false, new C3817l(12));
    public static final C15578l mopub = new C15578l(613853047, false, new C3817l(1));
    public static final C15578l admob = new C15578l(2127212656, false, new C3817l(2));
    public static final C15578l subs = new C15578l(-842956057, false, new C3817l(3));
    public static final C15578l isPro = new C15578l(-2058819388, false, new C3817l(4));
    public static final C15578l firebase = new C15578l(1100974736, false, new C3817l(5));
    public static final C15578l smaato = new C15578l(887418157, false, new C3817l(6));
    public static final C15578l remoteconfig = new C15578l(-225674807, false, new C3817l(7));
    public static final C15578l vip = new C15578l(353091338, false, new C3817l(8));

    public static final boolean admob(C6543l c6543l, C6543l c6543l2, int i, C12683l c12683l) {
        if (vip(c6543l, c6543l2, i, c12683l)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC15235l.purchase(c6543l, i, new C12559l(((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).billing(), c6543l, c6543l2, i, c12683l, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void amazon(InterfaceC17242l interfaceC17242l, final InterfaceC5404l interfaceC5404l, InterfaceC3501l interfaceC3501l, C0086l c0086l, int i, int i2, final C15578l c15578l, C6956l c6956l, final int i3, final int i4) {
        int i5;
        final InterfaceC17242l interfaceC17242l2;
        final InterfaceC3501l interfaceC3501l2;
        final int i6;
        final int i7;
        c6956l.m2133new(-1303174015);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c6956l.billing(interfaceC5404l) ? 32 : 16;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= c6956l.billing(interfaceC3501l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i10 = i5 | 3072;
        int i11 = i4 & 16;
        if (i11 != 0) {
            i10 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            i10 |= c6956l.amazon(i) ? 16384 : 8192;
        }
        int i12 = i10 | 196608;
        if (c6956l.m2127for(i12 & 1, (599187 & i12) != 599186)) {
            if (i8 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            InterfaceC17242l interfaceC17242l3 = interfaceC17242l;
            if (i9 != 0) {
                interfaceC3501l = AbstractC8313l.crashlytics;
            }
            InterfaceC3501l interfaceC3501l3 = interfaceC3501l;
            c0086l = C18450l.f36044l;
            int i13 = (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | 3072 | (i12 & 57344) | 12779520;
            int i14 = i11 != 0 ? Integer.MAX_VALUE : i;
            crashlytics(interfaceC17242l3, interfaceC5404l, interfaceC3501l3, i14, c15578l, c6956l, i13);
            i7 = Integer.MAX_VALUE;
            interfaceC17242l2 = interfaceC17242l3;
            i6 = i14;
            interfaceC3501l2 = interfaceC3501l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            interfaceC3501l2 = interfaceC3501l;
            i6 = i;
            i7 = i2;
        }
        final C0086l c0086l2 = c0086l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؙؖۗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC7039l.amazon(interfaceC17242l2, interfaceC5404l, interfaceC3501l2, c0086l2, i6, i7, c15578l, (C6956l) obj, AbstractC0545l.purchase(i3 | 1), i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void billing(long j) {
        C12735l[] c12735lArr = C1794l.loadAd;
        if ((j & 1095216660480L) == 0) {
            AbstractC10280l.yandex("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void crashlytics(InterfaceC17242l interfaceC17242l, InterfaceC5404l interfaceC5404l, InterfaceC3501l interfaceC3501l, int i, C15578l c15578l, C6956l c6956l, int i2) {
        int i3;
        int i4;
        int i5;
        C0086l c0086l = C18450l.f36044l;
        Object obj = C8565l.f17670l;
        c6956l.m2133new(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.billing(interfaceC5404l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.billing(interfaceC3501l) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l.billing(c0086l) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c6956l.amazon(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c6956l.amazon(Alert.DURATION_SHOW_INDEFINITELY) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c6956l.billing(obj) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c6956l.admob(c15578l) ? 8388608 : 4194304;
        }
        int i6 = i3;
        if (c6956l.m2127for(i6 & 1, (i6 & 4793491) != 4793490)) {
            int i7 = i6 & 3670016;
            boolean z = i7 == 1048576;
            Object objM2132native = c6956l.m2132native();
            Object obj2 = C1867l.yandex;
            if (z || objM2132native == obj2) {
                objM2132native = new C6609l();
                c6956l.m2147try(objM2132native);
            }
            C6609l c6609l = (C6609l) objM2132native;
            int i8 = i6 >> 3;
            int i9 = 6;
            boolean zBilling = ((((57344 & i8) ^ 24576) > 16384 && c6956l.amazon(Alert.DURATION_SHOW_INDEFINITELY)) || (i8 & 24576) == 16384) | ((((i8 & 14) ^ 6) > 4 && c6956l.billing(interfaceC5404l)) || (i8 & 6) == 4) | ((((i8 & 112) ^ 48) > 32 && c6956l.billing(interfaceC3501l)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) > 256 && c6956l.billing(c0086l)) || (i8 & 384) == 256) | ((((i8 & 7168) ^ 3072) > 2048 && c6956l.amazon(i)) || (i8 & 3072) == 2048) | c6956l.billing(c6609l);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj2) {
                i4 = i7;
                i5 = 8388608;
                Object c15786l = new C15786l(interfaceC5404l, interfaceC3501l, interfaceC5404l.amazon(), new C17974l(c0086l), interfaceC3501l.amazon(), i, c6609l);
                c6956l.m2147try(c15786l);
                objM2132native2 = c15786l;
            } else {
                i4 = i7;
                i5 = 8388608;
            }
            C15786l c15786l2 = (C15786l) objM2132native2;
            boolean z2 = (i4 == 1048576) | ((i6 & 29360128) == i5) | ((i6 & 458752) == 131072);
            Object objM2132native3 = c6956l.m2132native();
            Object obj3 = objM2132native3;
            if (z2 || objM2132native3 == obj2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C15578l(-1192950673, true, new C15701l(c15578l, i9)));
                AbstractC5020l.inmobi(2);
                c6956l.m2147try(arrayList);
                obj3 = arrayList;
            }
            C15578l c15578lAmazon = AbstractC16164l.amazon((List) obj3);
            boolean zBilling2 = c6956l.billing(c15786l2);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling2 || objM2132native4 == obj2) {
                objM2132native4 = new C1855l(c15786l2);
                c6956l.m2147try(objM2132native4);
            }
            InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native4;
            long j = c6956l.f14595continue;
            int i10 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i10), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC2812l.pro(0, c15578lAmazon, c6956l, true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10515l(interfaceC17242l, interfaceC5404l, interfaceC3501l, i, c15578l, i2);
        }
    }

    public static final long firebase(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        C12735l[] c12735lArr = C1794l.loadAd;
        return jFloatToRawIntBits;
    }

    public static final long isPro(int i) {
        return firebase(i, 4294967296L);
    }

    public static final void loadAd(InterfaceC13238l interfaceC13238l, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(958847021);
        int i2 = (c6956l.admob(function1) ? 32 : 16) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            boolean z = (i2 & 112) == 32;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C0464l(interfaceC13238l, function1, 9);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.loadAd(interfaceC17242lAmazon, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24966, 490);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(interfaceC13238l, function1, i, 10);
        }
    }

    public static final boolean mopub(C6543l c6543l, C12683l c12683l) {
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6543l c6543lAmazon = AbstractC11156l.amazon(c6543l);
                if (c6543lAmazon != null) {
                    return mopub(c6543lAmazon, c12683l) || admob(c6543l, c6543lAmazon, 1, c12683l);
                }
                C8339l.smaato("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c6543l.m2024l().yandex ? ((Boolean) c12683l.invoke(c6543l)).booleanValue() : remoteconfig(c6543l, c12683l);
                }
                C18725l.billing();
                return false;
            }
        }
        return remoteconfig(c6543l, c12683l);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean purchase(C6543l c6543l, C12683l c12683l) {
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6543l c6543lAmazon = AbstractC11156l.amazon(c6543l);
                if (c6543lAmazon == null) {
                    C8339l.smaato("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = c6543lAmazon.m2028l().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (purchase(c6543lAmazon, c12683l) || admob(c6543l, c6543lAmazon, 2, c12683l) || (c6543lAmazon.m2024l().yandex && ((Boolean) c12683l.invoke(c6543lAmazon)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C18725l.billing();
                            return false;
                        }
                        C8339l.smaato("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return admob(c6543l, c6543lAmazon, 2, c12683l);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return false;
                }
                if (!smaato(c6543l, c12683l)) {
                    if (!(c6543l.m2024l().yandex ? ((Boolean) c12683l.invoke(c6543l)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return smaato(c6543l, c12683l);
    }

    public static final boolean remoteconfig(C6543l c6543l, C12683l c12683l) {
        Object[] objArr = new C6543l[16];
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitChildren called on an unattached node");
        }
        C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l = c6543l.f29454l;
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        if (abstractC14971l2 == null) {
            AbstractC5573l.yandex(c17893l, abstractC14971l);
        } else {
            c17893l.crashlytics(abstractC14971l2);
        }
        int i = 0;
        while (true) {
            int i2 = c17893l.f34846l;
            if (i2 == 0) {
                break;
            }
            AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l.vip(i2 - 1);
            if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                AbstractC5573l.yandex(c17893l, abstractC14971lLoadAd);
            } else {
                while (abstractC14971lLoadAd != null) {
                    if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                        C17893l c17893l2 = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof C6543l) {
                                C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c6543l2;
                                i = i3;
                            } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i4 = 0;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if ((abstractC14971l3.f29450l & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l2 == null) {
                                                c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l2.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l2.crashlytics(abstractC14971l3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                        }
                        break;
                    }
                    abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                }
            }
        }
        Arrays.sort(objArr, 0, i, C13617l.f26642l);
        for (int i5 = 0; i5 < i; i5++) {
            C6543l c6543l3 = (C6543l) objArr[i5];
            if (AbstractC11156l.purchase(c6543l3) && mopub(c6543l3, c12683l)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean smaato(C6543l c6543l, C12683l c12683l) {
        Object[] objArr = new C6543l[16];
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitChildren called on an unattached node");
        }
        C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l = c6543l.f29454l;
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        if (abstractC14971l2 == null) {
            AbstractC5573l.yandex(c17893l, abstractC14971l);
        } else {
            c17893l.crashlytics(abstractC14971l2);
        }
        int i = 0;
        while (true) {
            int i2 = c17893l.f34846l;
            if (i2 == 0) {
                break;
            }
            AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l.vip(i2 - 1);
            if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                AbstractC5573l.yandex(c17893l, abstractC14971lLoadAd);
            } else {
                while (abstractC14971lLoadAd != null) {
                    if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                        C17893l c17893l2 = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof C6543l) {
                                C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = c6543l2;
                                i = i3;
                            } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i4 = 0;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if ((abstractC14971l3.f29450l & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l2 == null) {
                                                c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l2.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l2.crashlytics(abstractC14971l3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                        }
                        break;
                    }
                    abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                }
            }
        }
        Arrays.sort(objArr, 0, i, C13617l.f26642l);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                C6543l c6543l3 = (C6543l) objArr[i5];
                if (AbstractC11156l.purchase(c6543l3) && purchase(c6543l3, c12683l)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final long subs(double d) {
        return firebase((float) d, 4294967296L);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 lٟٔٙ) = (r13v7 lٟٔٙ), (r13v14 lٟٔٙ) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean vip(C6543l c6543l, C6543l c6543l2, int i, C12683l c12683l) {
        AbstractC14971l abstractC14971l;
        AbstractC14971l abstractC14971l2;
        C3654l c3654lMetrica;
        C18289l c18289l;
        AbstractC14971l abstractC14971lLoadAd;
        C17893l c17893l;
        if (c6543l.m2028l() != EnumC11822l.f23650l) {
            C8339l.smaato("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new C6543l[16];
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitChildren called on an unattached node");
        }
        C17893l c17893l2 = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l3 = c6543l.f29454l;
        AbstractC14971l abstractC14971l4 = abstractC14971l3.f29460l;
        if (abstractC14971l4 == null) {
            AbstractC5573l.yandex(c17893l2, abstractC14971l3);
        } else {
            c17893l2.crashlytics(abstractC14971l4);
        }
        int i2 = 0;
        while (true) {
            int i3 = c17893l2.f34846l;
            abstractC14971l = null;
            if (i3 == 0) {
                break;
            }
            AbstractC14971l abstractC14971lLoadAd2 = (AbstractC14971l) c17893l2.vip(i3 - 1);
            if ((abstractC14971lLoadAd2.f29457l & 1024) == 0) {
                AbstractC5573l.yandex(c17893l2, abstractC14971lLoadAd2);
            } else {
                while (abstractC14971lLoadAd2 != null) {
                    if ((abstractC14971lLoadAd2.f29450l & 1024) != 0) {
                        C17893l c17893l3 = null;
                        while (abstractC14971lLoadAd2 != null) {
                            if (abstractC14971lLoadAd2 instanceof C6543l) {
                                C6543l c6543l3 = (C6543l) abstractC14971lLoadAd2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = c6543l3;
                                i2 = i4;
                            } else if ((abstractC14971lLoadAd2.f29450l & 1024) != 0 && (abstractC14971lLoadAd2 instanceof AbstractC11340l)) {
                                int i5 = 0;
                                for (AbstractC14971l abstractC14971l5 = ((AbstractC11340l) abstractC14971lLoadAd2).f22875l; abstractC14971l5 != null; abstractC14971l5 = abstractC14971l5.f29460l) {
                                    if ((abstractC14971l5.f29450l & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            abstractC14971lLoadAd2 = abstractC14971l5;
                                        } else {
                                            if (c17893l3 == null) {
                                                c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd2 != null) {
                                                c17893l3.crashlytics(abstractC14971lLoadAd2);
                                                abstractC14971lLoadAd2 = null;
                                            }
                                            c17893l3.crashlytics(abstractC14971l5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            abstractC14971lLoadAd2 = AbstractC5573l.loadAd(c17893l3);
                        }
                        break;
                    }
                    abstractC14971lLoadAd2 = abstractC14971lLoadAd2.f29460l;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, C13617l.f26642l);
        if (i != 1) {
            if (i != 2) {
                C8339l.smaato("This function should only be used for 1-D focus search");
                return false;
            }
            C8934l c8934lAdcel = AbstractC8576l.adcel(0, i2);
            int i6 = c8934lAdcel.f15488l;
            int i7 = c8934lAdcel.f15487l;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        C6543l c6543l4 = (C6543l) objArr[i7];
                        if (AbstractC11156l.purchase(c6543l4) && purchase(c6543l4, c12683l)) {
                            return true;
                        }
                    }
                    if (AbstractC8576l.yandex(objArr[i7], c6543l2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!c6543l.f29454l.f29462l) {
                    AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
                }
                abstractC14971l2 = c6543l.f29454l.f29456l;
                c3654lMetrica = AbstractC5573l.metrica(c6543l);
                loop5: while (c3654lMetrica != null) {
                    if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 1024) != 0) {
                        while (abstractC14971l2 != null) {
                            if ((abstractC14971l2.f29450l & 1024) != 0) {
                                abstractC14971lLoadAd = abstractC14971l2;
                                c17893l = null;
                                while (abstractC14971lLoadAd != null) {
                                    if (abstractC14971lLoadAd instanceof C6543l) {
                                        abstractC14971l = abstractC14971lLoadAd;
                                        break loop5;
                                    }
                                    if ((abstractC14971lLoadAd.f29450l & 1024) == 0) {
                                    }
                                    abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                                }
                            }
                            abstractC14971l2 = abstractC14971l2.f29456l;
                        }
                    }
                    c3654lMetrica = c3654lMetrica.license();
                    if (c3654lMetrica != null) {
                    }
                }
                if (abstractC14971l != null) {
                    return ((Boolean) c12683l.invoke(c6543l)).booleanValue();
                }
            }
            return false;
        }
        C8934l c8934lAdcel2 = AbstractC8576l.adcel(0, i2);
        int i8 = c8934lAdcel2.f15488l;
        int i9 = c8934lAdcel2.f15487l;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    C6543l c6543l5 = (C6543l) objArr[i8];
                    if (AbstractC11156l.purchase(c6543l5) && mopub(c6543l5, c12683l)) {
                        return true;
                    }
                }
                if (AbstractC8576l.yandex(objArr[i8], c6543l2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && c6543l.m2024l().yandex) {
            if (!c6543l.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
            }
            abstractC14971l2 = c6543l.f29454l.f29456l;
            c3654lMetrica = AbstractC5573l.metrica(c6543l);
            loop5: while (c3654lMetrica != null) {
                if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 1024) != 0) {
                    while (abstractC14971l2 != null) {
                        if ((abstractC14971l2.f29450l & 1024) != 0) {
                            abstractC14971lLoadAd = abstractC14971l2;
                            c17893l = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof C6543l) {
                                    abstractC14971l = abstractC14971lLoadAd;
                                    break loop5;
                                }
                                if ((abstractC14971lLoadAd.f29450l & 1024) == 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i10 = 0;
                                    for (AbstractC14971l abstractC14971l6 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l6 != null; abstractC14971l6 = abstractC14971l6.f29460l) {
                                        if ((abstractC14971l6.f29450l & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC14971lLoadAd = abstractC14971l6;
                                            } else {
                                                if (c17893l == null) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l.crashlytics(abstractC14971l6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                            }
                        }
                        abstractC14971l2 = abstractC14971l2.f29456l;
                    }
                }
                c3654lMetrica = c3654lMetrica.license();
                abstractC14971l2 = (c3654lMetrica != null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
            }
            if (abstractC14971l != null) {
                return ((Boolean) c12683l.invoke(c6543l)).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    public static final void yandex(C7946l c7946l, Function0 function0, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        Object next;
        AlbumThumb albumThumb;
        String strLoadAd;
        List list;
        c6956l.m2133new(159797332);
        int i2 = i | (c6956l.billing(c7946l) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (z || objM2132native == obj) {
                Iterator it = c7946l.loadAd.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((CatalogArtist) next).amazon == null);
                CatalogArtist catalogArtist = (CatalogArtist) next;
                if (catalogArtist == null || (list = catalogArtist.amazon) == null) {
                    albumThumb = c7946l.yandex.Signature;
                    if (albumThumb != null) {
                        strLoadAd = albumThumb.crashlytics;
                        objM2132native = strLoadAd;
                    } else {
                        objM2132native = null;
                    }
                } else {
                    strLoadAd = AbstractC8320l.loadAd(300, list);
                    if (strLoadAd.length() <= 0) {
                        strLoadAd = null;
                    }
                    if (strLoadAd == null) {
                        albumThumb = c7946l.yandex.Signature;
                        if (albumThumb != null) {
                            strLoadAd = albumThumb.crashlytics;
                            objM2132native = strLoadAd;
                        } else {
                            objM2132native = null;
                        }
                    } else {
                        objM2132native = strLoadAd;
                    }
                }
                c6956l.m2147try(objM2132native);
            }
            String str = (String) objM2132native;
            boolean z2 = i3 == 4;
            Object objM2132native2 = c6956l.m2132native();
            if (z2 || objM2132native2 == obj) {
                objM2132native2 = new C9636l(11, c7946l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC3383l.loadAd((Function0) objM2132native2, interfaceC17242l, false, null, null, null, AbstractC2576l.yandex(1.0f, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.signatures), AbstractC14566l.amazon(426352841, new Cprotected(str, function0, c7946l, 5), c6956l), c6956l, 100663344, 188);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) c7946l, (Object) function0, interfaceC17242l, i, 1);
        }
    }
}
