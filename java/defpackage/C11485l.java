package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُۥ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11485l implements InterfaceC7630l, InterfaceC12387l, InterfaceC18560l, InterfaceC10240l, InterfaceC13540l, InterfaceC5152l, InterfaceC15892l, InterfaceC4852l, InterfaceC11545l, InterfaceC18080l, InterfaceC3501l, InterfaceC8849l, InterfaceC15446l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C11485l f23079l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23095l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11485l f23072l = new C11485l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C12791l f23086l = new C12791l(0);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C12791l f23085l = new C12791l(1);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C12791l f23090l = new C12791l(2);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C11485l f23073l = new C11485l(3);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C11485l f23076l = new C11485l(4);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C11485l f23089l = new C11485l(5);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C11485l f23083l = new C11485l(6);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C11485l f23091l = new C11485l(7);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C11485l f23088l = new C11485l(8);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C11485l f23071l = new C11485l(9);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C11485l f23092l = new C11485l(10);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C11485l f23084l = new C11485l(11);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C11485l f23077l = new C11485l(12);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C11485l f23081l = new C11485l(13);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C11485l f23093l = new C11485l(14);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C11485l f23080l = new C11485l(15);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C11485l f23075l = new C11485l(16);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final /* synthetic */ C11485l f23074l = new C11485l(17);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C11485l f23070l = new C11485l(18);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C11485l f23094l = new C11485l(19);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C11485l f23078l = new C11485l(20);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C11485l f23082l = new C11485l(21);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C11485l f23087l = new C11485l(22);

    public C11485l(float f) {
        this.f23095l = 26;
        if (0.0f <= f) {
            return;
        }
        C8339l.metrica("min must be less than or equal to max");
        throw null;
    }

    public static synchronized void pro() {
        if (f23079l == null) {
            C11485l c11485l = new C11485l(0);
            new ConcurrentHashMap();
            f23079l = c11485l;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable Signature(String str, int i, int i2, AbstractC0283l abstractC0283l) {
        C1863l c1863l;
        List listPurchase;
        if (abstractC0283l instanceof C1863l) {
            c1863l = (C1863l) abstractC0283l;
            int i3 = c1863l.f4272l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1863l.f4272l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1863l = new C1863l(this, abstractC0283l);
            }
        } else {
            c1863l = new C1863l(this, abstractC0283l);
        }
        Object objAds = c1863l.f4275l;
        int i4 = c1863l.f4272l;
        ArrayList arrayList = null;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objAds);
            C6336l.yandex.crashlytics();
            c1863l.f4274l = i;
            c1863l.f4273l = i2;
            c1863l.f4272l = 1;
            objAds = ads(str, c1863l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAds == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c1863l.f4273l;
            i = c1863l.f4274l;
            AbstractC2829l.crashlytics(objAds);
        }
        CachedPlaylist cachedPlaylist = (CachedPlaylist) objAds;
        if (cachedPlaylist != null && (listPurchase = cachedPlaylist.purchase()) != null) {
            if (i2 > 0) {
                listPurchase = listPurchase.subList(AbstractC8576l.billing(i, AbstractC14055l.firebase(listPurchase)), AbstractC8576l.billing(i + i2, AbstractC14055l.firebase(listPurchase)));
            }
            if (listPurchase != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listPurchase) {
                    if (hashSet.add(((CachedTrack) obj).premium())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedTrack) it.next()).crashlytics());
                }
            }
        }
        return arrayList == null ? C2580l.f5619l : arrayList;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        ((C2350l) obj2).loadAd(null);
    }

    @Override // defpackage.InterfaceC18080l
    public float adcel(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC12387l
    public boolean admob(C5254l c5254l) {
        if (!c5254l.m1754l(AbstractC14192l.yandex)) {
            String string = c5254l.m1755l().toString();
            if (!AbstractC12024l.m3345this(string, "application/", true) || !AbstractC16648l.Signature(string, "+json", true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object ads(String str, AbstractC0283l abstractC0283l) {
        C4457l c4457l;
        if (abstractC0283l instanceof C4457l) {
            c4457l = (C4457l) abstractC0283l;
            int i = c4457l.f9077l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4457l.f9077l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4457l = new C4457l(this, abstractC0283l);
            }
        } else {
            c4457l = new C4457l(this, abstractC0283l);
        }
        Object objM3168l = c4457l.f9078l;
        int i2 = c4457l.f9077l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l.yandex.crashlytics();
            c4457l.f9079l = str;
            c4457l.f9077l = 1;
            objM3168l = C6336l.loadAd.m3168l(c4457l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = c4457l.f9079l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        return AbstractC11356l.loadAd(((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{str}, 1)));
    }

    @Override // defpackage.InterfaceC3501l
    public /* synthetic */ float amazon() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC4852l
    public Function0 billing(AbstractC15391l abstractC15391l) {
        int i = 1;
        ViewOnAttachStateChangeListenerC15229l viewOnAttachStateChangeListenerC15229l = new ViewOnAttachStateChangeListenerC15229l(abstractC15391l, i);
        abstractC15391l.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15229l);
        C9340l c9340l = new C9340l(abstractC15391l);
        AbstractC9307l.amazon(abstractC15391l).yandex.add(c9340l);
        return new C0115l(abstractC15391l, viewOnAttachStateChangeListenerC15229l, c9340l, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        c16864l.f32922l.firebase(C8403l.f17380l, new C3341l((Function3) abstractC5563l, null, 3));
    }

    @Override // defpackage.InterfaceC18560l
    public Map crashlytics(C18221l c18221l) {
        return C14054l.f27396l;
    }

    @Override // defpackage.InterfaceC18080l
    public float firebase(float f, float f2, long j) {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object isPro(long j, int i, int i2, AbstractC0283l abstractC0283l) {
        C12813l c12813l;
        if (abstractC0283l instanceof C12813l) {
            c12813l = (C12813l) abstractC0283l;
            int i3 = c12813l.f25194l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12813l.f25194l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12813l = new C12813l(this, abstractC0283l);
            }
        } else {
            c12813l = new C12813l(this, abstractC0283l);
        }
        Object objM3168l = c12813l.f25190l;
        int i4 = c12813l.f25194l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l.yandex.crashlytics();
            c12813l.f25193l = j;
            c12813l.f25192l = i;
            c12813l.f25195l = i2;
            c12813l.f25194l = 1;
            objM3168l = C6336l.loadAd.m3168l(c12813l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c12813l.f25195l;
            i = c12813l.f25192l;
            j = c12813l.f25193l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        C14649l c14649lM1735l = ((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0));
        if (j != 0) {
            c14649lM1735l = c14649lM1735l.billing("uid != $0", j + "_-1337");
        }
        C15825l c15825lCrashlytics = c14649lM1735l.crashlytics();
        return i2 > 0 ? new C1873l(c15825lCrashlytics, AbstractC8576l.billing(i, AbstractC14055l.firebase(c15825lCrashlytics)), AbstractC8576l.billing(i + i2, AbstractC14055l.firebase(c15825lCrashlytics))) : c15825lCrashlytics;
    }

    @Override // defpackage.InterfaceC10240l
    public boolean loadAd(InterfaceC17477l interfaceC17477l, C4799l c4799l) {
        return !c4799l.getAnnotations().isPro(AbstractC2203l.yandex);
    }

    @Override // defpackage.InterfaceC18080l
    public long metrica(float f) {
        return 0L;
    }

    @Override // defpackage.InterfaceC18080l
    public float mopub() {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object purchase(AbstractC0283l abstractC0283l) {
        C12162l c12162l;
        if (abstractC0283l instanceof C12162l) {
            c12162l = (C12162l) abstractC0283l;
            int i = c12162l.f24173l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12162l.f24173l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12162l = new C12162l(this, abstractC0283l);
            }
        } else {
            c12162l = new C12162l(this, abstractC0283l);
        }
        Object objM3168l = c12162l.f24172l;
        int i2 = c12162l.f24173l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l.yandex.crashlytics();
            c12162l.f24173l = 1;
            objM3168l = C6336l.loadAd.m3168l(c12162l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objM3168l);
        }
        return ((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedAlbum.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).crashlytics();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008d A[Catch: Exception -> 0x0090, TRY_LEAVE, TryCatch #0 {Exception -> 0x0090, blocks: (B:37:0x0087, B:39:0x008d, B:34:0x0075), top: B:67:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
    
        if (r0 == r9) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object remoteconfig(defpackage.C16076l r21, java.lang.String r22, boolean r23, boolean r24, boolean r25, defpackage.AbstractC0283l r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11485l.remoteconfig(lٕۦ۠, java.lang.String, boolean, boolean, boolean, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object smaato(AbstractC0283l abstractC0283l) {
        C6382l c6382l;
        if (abstractC0283l instanceof C6382l) {
            c6382l = (C6382l) abstractC0283l;
            int i = c6382l.f13361l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6382l.f13361l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6382l = new C6382l(this, abstractC0283l);
            }
        } else {
            c6382l = new C6382l(this, abstractC0283l);
        }
        Object objM3168l = c6382l.f13360l;
        int i2 = c6382l.f13361l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l.yandex.crashlytics();
            c6382l.f13361l = 1;
            objM3168l = C6336l.loadAd.m3168l(c6382l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objM3168l);
        }
        return ((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).crashlytics();
    }

    @Override // defpackage.InterfaceC3501l
    public void startapp(InterfaceC13490l interfaceC13490l, int i, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC18080l
    public float subs(float f, long j) {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable subscription(String str, AbstractC0283l abstractC0283l) {
        C5438l c5438l;
        if (abstractC0283l instanceof C5438l) {
            c5438l = (C5438l) abstractC0283l;
            int i = c5438l.f11660l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5438l.f11660l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5438l = new C5438l(this, abstractC0283l);
            }
        } else {
            c5438l = new C5438l(this, abstractC0283l);
        }
        Object objM3168l = c5438l.f11661l;
        int i2 = c5438l.f11660l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l.yandex.crashlytics();
            c5438l.f11662l = str;
            c5438l.f11660l = 1;
            objM3168l = C6336l.loadAd.m3168l(c5438l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = c5438l.f11662l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        C15825l c15825lCrashlytics = ((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "albumFullId == $0", Arrays.copyOf(new Object[]{str}, 1)).crashlytics();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c15825lCrashlytics, 10));
        C11521l c11521l = new C11521l(0, c15825lCrashlytics);
        while (c11521l.hasNext()) {
            arrayList.add(((CachedTrack) c11521l.next()).crashlytics());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable tapsense(int i, long j, int i2, int i3, AbstractC0283l abstractC0283l) {
        C12083l c12083l;
        List listPurchase;
        if (abstractC0283l instanceof C12083l) {
            c12083l = (C12083l) abstractC0283l;
            int i4 = c12083l.f24005l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12083l.f24005l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12083l = new C12083l(this, abstractC0283l);
            }
        } else {
            c12083l = new C12083l(this, abstractC0283l);
        }
        Object objVip = c12083l.f24008l;
        int i5 = c12083l.f24005l;
        ArrayList arrayList = null;
        if (i5 == 0) {
            AbstractC2829l.crashlytics(objVip);
            C6336l.yandex.crashlytics();
            c12083l.f24007l = i2;
            c12083l.f24006l = i3;
            c12083l.f24005l = 1;
            objVip = vip(i, j, c12083l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objVip == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i5 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = c12083l.f24006l;
            i2 = c12083l.f24007l;
            AbstractC2829l.crashlytics(objVip);
        }
        CachedPlaylist cachedPlaylist = (CachedPlaylist) objVip;
        if (cachedPlaylist != null && (listPurchase = cachedPlaylist.purchase()) != null) {
            if (i3 > 0) {
                listPurchase = listPurchase.subList(AbstractC8576l.billing(i2, AbstractC14055l.firebase(listPurchase)), AbstractC8576l.billing(i2 + i3, AbstractC14055l.firebase(listPurchase)));
            }
            if (listPurchase != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listPurchase) {
                    if (hashSet.add(((CachedTrack) obj).premium())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedTrack) it.next()).crashlytics());
                }
            }
        }
        return arrayList == null ? C2580l.f5619l : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C5825l c5825l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C5261l c5261l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C15557l c15557l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C12532l c12532l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f23095l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 9:
                if (abstractC0283l instanceof C5825l) {
                    c5825l = (C5825l) abstractC0283l;
                    int i2 = c5825l.f12276l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5825l.f12276l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5825l = new C5825l(this, abstractC0283l);
                    }
                } else {
                    c5825l = new C5825l(this, abstractC0283l);
                }
                Object objYandex = c5825l.f12277l;
                int i3 = c5825l.f12276l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c5825l.f12276l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c5825l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 13:
                if (abstractC0283l instanceof C5261l) {
                    c5261l = (C5261l) abstractC0283l;
                    int i4 = c5261l.f11343l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5261l.f11343l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5261l = new C5261l(this, abstractC0283l);
                    }
                } else {
                    c5261l = new C5261l(this, abstractC0283l);
                }
                Object objYandex2 = c5261l.f11344l;
                int i5 = c5261l.f11343l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C3757l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c5261l.f11343l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c5261l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C15557l) {
                    c15557l = (C15557l) abstractC0283l;
                    int i6 = c15557l.f30392l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15557l.f30392l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15557l = new C15557l(this, abstractC0283l);
                    }
                } else {
                    c15557l = new C15557l(this, abstractC0283l);
                }
                Object objYandex3 = c15557l.f30393l;
                int i7 = c15557l.f30392l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C9497l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c15557l.f30392l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c15557l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C12532l) {
                    c12532l = (C12532l) abstractC0283l;
                    int i8 = c12532l.f24693l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12532l.f24693l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12532l = new C12532l(this, abstractC0283l);
                    }
                } else {
                    c12532l = new C12532l(this, abstractC0283l);
                }
                Object objYandex4 = c12532l.f24694l;
                int i9 = c12532l.f24693l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(EnumC17046l.class)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c12532l.f24693l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c12532l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f23095l) {
            case 11:
                return "TextFieldLineLimits.SingleLine";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }

    public Object vip(int i, long j, AbstractC0283l abstractC0283l) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        return ads(sb.toString(), abstractC0283l);
    }

    @Override // defpackage.InterfaceC8849l
    public byte[] yandex(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public /* synthetic */ C11485l(int i) {
        this.f23095l = i;
    }
}
