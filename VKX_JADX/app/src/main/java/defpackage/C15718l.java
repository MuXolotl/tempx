package defpackage;

import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٕٖٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15718l implements InterfaceC17727l, InterfaceC15446l, InterfaceC18149l, InterfaceC13540l, InterfaceC16230l, InterfaceC12702l, InterfaceC5152l, InterfaceC10315l, InterfaceC11545l, InterfaceC10120l, InterfaceC9746l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C15718l f30868l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30883l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C15718l f30861l = new C15718l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C15718l f30875l = new C15718l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C15718l f30874l = new C15718l(3);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C15294l f30878l = new C15294l(1.0f, 1.0f);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C15718l f30862l = new C15718l(4);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15718l f30865l = new C15718l(5);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C15718l f30877l = new C15718l(6);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C15718l f30872l = new C15718l(7);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C15718l f30879l = new C15718l(8);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C15718l f30876l = new C15718l(9);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ C15718l f30860l = new C15718l(10);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C15718l f30880l = new C15718l(11);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C10754l f30873l = new C10754l(12);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C15718l f30866l = new C15718l(13);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C15718l f30870l = new C15718l(14);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C15718l f30881l = new C15718l(15);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C15718l f30869l = new C15718l(16);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C15718l f30864l = new C15718l(17);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C15718l f30863l = new C15718l(18);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C15718l f30859l = new C15718l(19);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C15718l f30882l = new C15718l(20);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C15718l f30867l = new C15718l(21);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C15718l f30871l = new C15718l(22);

    public /* synthetic */ C15718l(int i) {
        this.f30883l = i;
    }

    public static double Signature(C8723l c8723l, double d, double d2) {
        return AbstractC8576l.crashlytics(smaato(c8723l.yandex, c8723l.loadAd, 0.0d, false), d, d2);
    }

    public static boolean adcel() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC13840l.f26992l == null) {
                ViewTreeObserverOnGlobalLayoutListenerC13840l.f26992l = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC13840l.f26994l == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26992l;
                ViewTreeObserverOnGlobalLayoutListenerC13840l.f26994l = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26994l;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return AbstractC8576l.yandex(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static double ads(C14997l c14997l) {
        return AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    public static final C9193l amazon(double d) {
        if (d == 1.5d) {
            return new C9193l(1.5d, 1.5d, 3.0d, 5.5d);
        }
        if (d == 3.0d) {
            return new C9193l(3.0d, 3.0d, 4.5d, 7.0d);
        }
        if (d == 4.5d) {
            return new C9193l(4.5d, 4.5d, 7.0d, 11.0d);
        }
        if (d == 6.0d) {
            return new C9193l(6.0d, 6.0d, 7.0d, 11.0d);
        }
        if (d == 7.0d) {
            return new C9193l(7.0d, 7.0d, 11.0d, 21.0d);
        }
        if (d == 9.0d) {
            return new C9193l(9.0d, 9.0d, 11.0d, 21.0d);
        }
        if (d == 11.0d) {
            return new C9193l(11.0d, 11.0d, 21.0d, 21.0d);
        }
        return d == 21.0d ? new C9193l(21.0d, 21.0d, 21.0d, 21.0d) : new C9193l(d, d, 7.0d, 21.0d);
    }

    public static C5101l firebase() throws InterruptedException {
        C14785l c14785l = C5101l.admob;
        C5101l c5101l = ((C5101l[]) c14785l.f28907l)[1];
        if (c5101l == null) {
            long jNanoTime = System.nanoTime();
            C5101l.firebase.await(C5101l.smaato, TimeUnit.MILLISECONDS);
            if (((C5101l[]) c14785l.f28907l)[1] != null || System.nanoTime() - jNanoTime < C5101l.remoteconfig) {
                return null;
            }
            return C5101l.subs;
        }
        long jNanoTime2 = c5101l.mopub - System.nanoTime();
        if (jNanoTime2 > 0) {
            C5101l.firebase.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c14785l.ad(c5101l);
        c5101l.purchase = 2;
        return c5101l;
    }

    public static final void isPro(C5101l c5101l) {
        C14785l c14785l = C5101l.admob;
        if (C5101l.subs == null) {
            C5101l.subs = new C5101l();
            C1445l c1445l = new C1445l("Okio Watchdog");
            c1445l.setDaemon(true);
            c1445l.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c5101l.crashlytics;
        boolean z = c5101l.yandex;
        if (j != 0 && z) {
            c5101l.mopub = Math.min(j, c5101l.crashlytics() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c5101l.mopub = jNanoTime + j;
        } else {
            if (!z) {
                C11586l.yandex();
                return;
            }
            c5101l.mopub = c5101l.crashlytics();
        }
        C14785l c14785l2 = C5101l.admob;
        int i = c14785l2.f28908l + 1;
        c14785l2.f28908l = i;
        C5101l[] c5101lArr = (C5101l[]) c14785l2.f28907l;
        if (i == c5101lArr.length) {
            C5101l[] c5101lArr2 = new C5101l[i * 2];
            AbstractC8669l.signatures(0, 0, 14, c5101lArr, c5101lArr2);
            c14785l2.f28907l = c5101lArr2;
        }
        c14785l2.Signature(i, c5101l);
        if (c5101l.billing == 1) {
            C5101l.firebase.signal();
        }
    }

    public static synchronized void license() {
        if (f30868l == null) {
            f30868l = new C15718l(0);
        }
    }

    public static ArrayList metrica(C15825l c15825l, String str, C0114l c0114l) {
        ArrayList arrayListPurchase = AbstractC15011l.purchase(str, c15825l, new C4568l(14, c0114l));
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListPurchase, 10));
        Iterator it = arrayListPurchase.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2372l) it.next()).f5132l);
        }
        return arrayList;
    }

    public static final double mopub(C14997l c14997l, int i) {
        double dAds = ads(c14997l);
        int i2 = 28;
        if (i != 1 && (dAds < 250.0d || dAds >= 270.0d)) {
            i2 = 20;
        }
        return i2;
    }

    public static final double purchase(C14997l c14997l, boolean z, int i) {
        int i2;
        double dStartapp = startapp(c14997l);
        if (i != 1) {
            i2 = 12;
        } else if (z) {
            i2 = (dStartapp < 105.0d || dStartapp >= 125.0d) ? 14 : 6;
        } else {
            i2 = 18;
        }
        return i2;
    }

    public static View remoteconfig(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26997l;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                ViewTreeObserverOnGlobalLayoutListenerC13840l.f26997l = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (AbstractC8576l.yandex(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewRemoteconfig = remoteconfig(viewGroup.getChildAt(i2), i);
                    if (viewRemoteconfig != null) {
                        return viewRemoteconfig;
                    }
                }
            }
        }
        return null;
    }

    public static double smaato(double d, double d2, double d3, boolean z) {
        C14997l c14997l = new C14997l(AbstractC6889l.firebase(d, d2, d3));
        double d4 = d3;
        while (true) {
            double d5 = c14997l.crashlytics;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            C14997l c14997l2 = new C14997l(AbstractC6889l.firebase(d, d2, d3));
            if (d5 < c14997l2.crashlytics) {
                d4 = d3;
                c14997l = c14997l2;
            }
        }
        return d4;
    }

    public static double startapp(C14997l c14997l) {
        return AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    public static double tapsense(C8723l c8723l, double d, double d2) {
        return AbstractC8576l.crashlytics(smaato(c8723l.yandex, c8723l.loadAd * 1.0d, 100.0d, true), d, d2);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        ((C2350l) obj2).loadAd(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC18149l
    public long admob() {
        return 9205357640488583168L;
    }

    @Override // defpackage.InterfaceC10315l
    public Object billing(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        String str = (String) obj2;
        long jLoadAd = AbstractC2296l.loadAd(((Integer) obj3).intValue(), ((Integer) obj4).intValue());
        List list2 = (List) obj5;
        Object obj6 = list2.get(0);
        return new C10178l(str, jLoadAd, new C2494l(obj6 != null ? (C0574l) C0574l.subs.billing(obj6) : null, (C9106l) AbstractC3864l.f8004l.billing(list2.get(1))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        c16864l.f32922l.firebase(C8403l.f17385l, new C2735l((Function3) abstractC5563l, null, 1));
    }

    @Override // defpackage.InterfaceC17727l
    public void crashlytics(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-2101003086);
        int i2 = (c6956l.billing(this) ? 32 : 16) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            c15578l.invoke(c6956l, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, c15578l, i, 20);
        }
    }

    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default */
    public Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        int iMo1287synchronized = abstractC9542l.mo1287synchronized();
        if (iMo1287synchronized == 1) {
            return AbstractC14878l.loadAd(abstractC9542l, f);
        }
        if (iMo1287synchronized == 3) {
            return AbstractC14878l.loadAd(abstractC9542l, f);
        }
        if (iMo1287synchronized != 7) {
            C8339l.metrica("Cannot convert json to point. Next token is ".concat(AbstractC2812l.applovin(iMo1287synchronized)));
            return null;
        }
        PointF pointF = new PointF(((float) abstractC9542l.signatures()) * f, ((float) abstractC9542l.signatures()) * f);
        while (abstractC9542l.ads()) {
            abstractC9542l.mo1275continue();
        }
        return pointF;
    }

    @Override // defpackage.InterfaceC18149l
    public EnumC9931l getLayoutDirection() {
        return EnumC9931l.f20223l;
    }

    @Override // defpackage.InterfaceC18149l
    public InterfaceC13490l loadAd() {
        return f30878l;
    }

    @Override // defpackage.InterfaceC10315l
    public Object subs(C15543l c15543l, Object obj) {
        char c;
        char c2;
        char c3;
        int i;
        List listRemoteconfig;
        C10178l c10178l = (C10178l) obj;
        String string = c10178l.loadAd().f12057l.toString();
        long j = c10178l.loadAd().f12061l;
        int i2 = C12814l.crashlytics;
        Integer numValueOf = Integer.valueOf((int) (j >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (c10178l.loadAd().f12061l & 4294967295L));
        C2494l c2494l = c10178l.yandex;
        C0574l c0574l = (C0574l) ((C10086l) c2494l.f5290l).getValue();
        if (c0574l != null) {
            Integer numValueOf3 = Integer.valueOf(c0574l.yandex);
            String str = c0574l.loadAd;
            String str2 = c0574l.crashlytics;
            long j2 = c0574l.amazon;
            int i3 = C12814l.crashlytics;
            c = 1;
            c2 = 0;
            Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
            Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = c0574l.purchase;
            i = 4;
            c3 = 3;
            listRemoteconfig = AbstractC14055l.remoteconfig(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(c0574l.billing));
        } else {
            c = 1;
            c2 = 0;
            c3 = 3;
            i = 4;
            listRemoteconfig = null;
        }
        Object objSubs = AbstractC3864l.f8004l.subs(c15543l, (C9106l) c2494l.f5291l);
        Object[] objArr = new Object[2];
        objArr[c2] = listRemoteconfig;
        objArr[c] = objSubs;
        List listRemoteconfig2 = AbstractC14055l.remoteconfig(objArr);
        Object[] objArr2 = new Object[i];
        objArr2[c2] = string;
        objArr2[c] = numValueOf;
        objArr2[2] = numValueOf2;
        objArr2[c3] = listRemoteconfig2;
        return AbstractC14055l.remoteconfig(objArr2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object subscription(String str, AbstractC0283l abstractC0283l) {
        C11171l c11171l;
        String str2;
        String str3;
        if (abstractC0283l instanceof C11171l) {
            c11171l = (C11171l) abstractC0283l;
            int i = c11171l.f22456l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11171l.f22456l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11171l = new C11171l(this, abstractC0283l);
            }
        } else {
            c11171l = new C11171l(this, abstractC0283l);
        }
        Object obj = c11171l.f22459l;
        int i2 = c11171l.f22456l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C6336l.yandex.crashlytics();
            if (str.length() == 0) {
                return new C16187l();
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            c11171l.f22458l = str;
            c11171l.f22457l = lowerCase;
            c11171l.f22456l = 1;
            Object objM3168l = C6336l.loadAd.m3168l(c11171l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
            str2 = lowerCase;
            obj = objM3168l;
            str3 = str;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = c11171l.f22457l;
            str3 = c11171l.f22458l;
            AbstractC2829l.crashlytics(obj);
        }
        C5198l c5198l = (C5198l) obj;
        C2336l c2336l = AbstractC18202l.yandex;
        return new C16187l(AbstractC0509l.billing(metrica(c5198l.m1735l(c2336l.loadAd(CachedTrack.class), "localizedSearchTitle CONTAINS $0", Arrays.copyOf(new Object[]{str2}, 1)).crashlytics(), str3, C7508l.f15525l)), AbstractC0509l.billing(metrica(c5198l.m1735l(c2336l.loadAd(CachedTrack.class), "localizedSearchArtist CONTAINS $0", Arrays.copyOf(new Object[]{str2}, 1)).crashlytics(), str3, C13879l.f27151l)), AbstractC0509l.billing(metrica(c5198l.m1735l(c2336l.loadAd(CachedPlaylist.class), "localizedSearchTitle CONTAINS $0", Arrays.copyOf(new Object[]{str2}, 1)).crashlytics(), str3, C8964l.f18486l)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C17397l c17397l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C15887l c15887l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C18204l c18204l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C1349l c1349l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f30883l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 6:
                if (abstractC0283l instanceof C17397l) {
                    c17397l = (C17397l) abstractC0283l;
                    int i2 = c17397l.f33882l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17397l.f33882l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17397l = new C17397l(this, abstractC0283l);
                    }
                } else {
                    c17397l = new C17397l(this, abstractC0283l);
                }
                Object objYandex = c17397l.f33883l;
                int i3 = c17397l.f33882l;
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
                c17397l.f33882l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c17397l);
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
                if (abstractC0283l instanceof C15887l) {
                    c15887l = (C15887l) abstractC0283l;
                    int i4 = c15887l.f31150l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15887l.f31150l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15887l = new C15887l(this, abstractC0283l);
                    }
                } else {
                    c15887l = new C15887l(this, abstractC0283l);
                }
                Object objYandex2 = c15887l.f31151l;
                int i5 = c15887l.f31150l;
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
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.loadAd(C11979l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C6388l.class)))));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c15887l.f31150l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c15887l);
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
                if (abstractC0283l instanceof C18204l) {
                    c18204l = (C18204l) abstractC0283l;
                    int i6 = c18204l.f35651l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c18204l.f35651l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c18204l = new C18204l(this, abstractC0283l);
                    }
                } else {
                    c18204l = new C18204l(this, abstractC0283l);
                }
                Object objYandex3 = c18204l.f35652l;
                int i7 = c18204l.f35651l;
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
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C4324l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c18204l.f35651l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c18204l);
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
                if (abstractC0283l instanceof C1349l) {
                    c1349l = (C1349l) abstractC0283l;
                    int i8 = c1349l.f3454l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1349l.f3454l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1349l = new C1349l(this, abstractC0283l);
                    }
                } else {
                    c1349l = new C1349l(this, abstractC0283l);
                }
                Object objYandex4 = c1349l.f3455l;
                int i9 = c1349l.f3454l;
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
                c1349l.f3454l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c1349l);
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

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) {
        return AbstractC4311l.mopub(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC10120l
    public byte[] yandex(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
