package defpackage;

import android.content.SharedPreferences;
import android.os.Parcel;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.ComponentRegistrar;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؙؐ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6168l implements InterfaceC15446l, InterfaceC1184l, InterfaceC5152l, InterfaceC13540l, InterfaceC11545l, InterfaceC8086l, InterfaceC11893l, InterfaceC4374l, InterfaceC17087l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile String f12984l = "";

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13006l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6168l f12991l = new C6168l(0);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C6168l f12998l = new C6168l(1);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6168l f12997l = new C6168l(2);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C6168l f13001l = new C6168l(3);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6168l f12985l = new C6168l(5);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6168l f12988l = new C6168l(6);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C6168l f13000l = new C6168l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C6168l f12995l = new C6168l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final /* synthetic */ C6168l f13002l = new C6168l(9);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C6168l f12999l = new C6168l(10);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C1759l f12983l = new C1759l(4);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C1759l f13003l = new C1759l(5);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C6168l f12996l = new C6168l(13);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C6168l f12989l = new C6168l(14);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C6168l f12993l = new C6168l(15);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C6168l f13004l = new C6168l(16);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C6168l f12992l = new C6168l(17);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C6168l f12987l = new C6168l(18);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C6168l f12986l = new C6168l(19);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ C6168l f12982l = new C6168l(20);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C6168l f13005l = new C6168l(21);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C6168l f12990l = new C6168l(22);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C6168l f12994l = new C6168l(23);

    public /* synthetic */ C6168l(int i) {
        this.f13006l = i;
    }

    public static LinkedHashSet Signature(String str, String... strArr) {
        return tapsense("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static boolean ad(InterfaceC14555l interfaceC14555l, InterfaceC13789l interfaceC13789l) {
        if (!interfaceC14555l.inmobi(interfaceC14555l.mo1219this(interfaceC13789l))) {
            return false;
        }
        interfaceC14555l.adcel(interfaceC13789l);
        return (interfaceC14555l.mo1223volatile(interfaceC13789l) || interfaceC14555l.mo1170instanceof(interfaceC13789l) || interfaceC14555l.mo1192l(interfaceC13789l)) ? false : true;
    }

    public static List admob(C5425l c5425l, InterfaceC14555l interfaceC14555l, InterfaceC0583l interfaceC0583l, InterfaceC2224l interfaceC2224l) {
        AbstractC12027l abstractC12027lMo1220throw;
        C5987l c5987l = C5987l.isPro;
        if (interfaceC14555l.license(interfaceC2224l) || !interfaceC14555l.ad(interfaceC0583l)) {
            if (!interfaceC14555l.mo1178l(interfaceC2224l)) {
                C5047l c5047l = new C5047l();
                c5425l.crashlytics();
                InterfaceC14555l interfaceC14555l2 = c5425l.crashlytics;
                ArrayDeque arrayDeque = c5425l.mopub;
                C4853l c4853l = c5425l.admob;
                arrayDeque.push(interfaceC0583l);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC0583l interfaceC0583l2 = (InterfaceC0583l) arrayDeque.pop();
                    if (c4853l.add(interfaceC0583l2)) {
                        InterfaceC0583l interfaceC0583lMo1211protected = interfaceC14555l.mo1211protected(interfaceC0583l2);
                        if (interfaceC0583lMo1211protected == null) {
                            interfaceC0583lMo1211protected = interfaceC0583l2;
                        }
                        if (interfaceC14555l.mo1169import(interfaceC14555l.mo1209package(interfaceC0583lMo1211protected), interfaceC2224l)) {
                            c5047l.add(interfaceC0583lMo1211protected);
                            abstractC12027lMo1220throw = c5987l;
                        } else {
                            abstractC12027lMo1220throw = interfaceC14555l.mopub(interfaceC0583lMo1211protected) == 0 ? C5987l.subs : interfaceC14555l2.mo1220throw(interfaceC0583lMo1211protected);
                        }
                        if (abstractC12027lMo1220throw.equals(c5987l)) {
                            abstractC12027lMo1220throw = null;
                        }
                        if (abstractC12027lMo1220throw != null) {
                            Iterator it = interfaceC14555l2.appmetrica(interfaceC14555l2.mo1209package(interfaceC0583l2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(abstractC12027lMo1220throw.purchase(c5425l, (InterfaceC13789l) it.next()));
                            }
                        }
                    }
                }
                c5425l.yandex();
                return c5047l;
            }
            if (interfaceC14555l.mo1169import(interfaceC14555l.mo1209package(interfaceC0583l), interfaceC2224l)) {
                InterfaceC0583l interfaceC0583lMo1211protected2 = interfaceC14555l.mo1211protected(interfaceC0583l);
                if (interfaceC0583lMo1211protected2 != null) {
                    interfaceC0583l = interfaceC0583lMo1211protected2;
                }
                return Collections.singletonList(interfaceC0583l);
            }
        }
        return C2580l.f5619l;
    }

    public static String ads(int i) {
        ArrayList arrayListM4238static = AbstractC16901l.m4238static(new C13053l('a', 'z'), new C13053l('0', '9'));
        C8934l c8934l = new C8934l(1, i, 1);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934l, 10));
        Iterator it = c8934l.iterator();
        while (true) {
            C16991l c16991l = (C16991l) it;
            if (!c16991l.f33123l) {
                return AbstractC16901l.m4210case(arrayList, "", null, null, null, 62);
            }
            c16991l.nextInt();
            AbstractC8502l abstractC8502l = AbstractC4777l.f9804l;
            Character ch = (Character) AbstractC16901l.m4221goto(arrayListM4238static);
            ch.getClass();
            arrayList.add(ch);
        }
    }

    public static boolean advert(C5425l c5425l, InterfaceC14555l interfaceC14555l, InterfaceC6440l interfaceC6440l, InterfaceC0583l interfaceC0583l) {
        boolean zIsVip;
        InterfaceC2224l interfaceC2224lMo1209package = interfaceC14555l.mo1209package(interfaceC0583l);
        int iMetrica = interfaceC14555l.metrica(interfaceC6440l);
        int iMo1217switch = interfaceC14555l.mo1217switch(interfaceC2224lMo1209package);
        if (iMetrica == iMo1217switch && iMetrica == interfaceC14555l.mopub(interfaceC0583l)) {
            for (int i = 0; i < iMo1217switch; i++) {
                InterfaceC0218l interfaceC0218lMo1199l = interfaceC14555l.mo1199l(interfaceC0583l, i);
                InterfaceC13789l interfaceC13789lAds = interfaceC14555l.ads(interfaceC0218lMo1199l);
                if (interfaceC13789lAds != null) {
                    InterfaceC0218l interfaceC0218lMo1197l = interfaceC14555l.mo1197l(interfaceC6440l, i);
                    interfaceC14555l.startapp(interfaceC0218lMo1197l);
                    InterfaceC13789l interfaceC13789lAds2 = interfaceC14555l.ads(interfaceC0218lMo1197l);
                    int iIsVip = interfaceC14555l.isVip(interfaceC14555l.mo1216super(interfaceC2224lMo1209package, i));
                    int iStartapp = interfaceC14555l.startapp(interfaceC0218lMo1199l);
                    if (iIsVip == 3) {
                        iIsVip = iStartapp;
                    } else if (iStartapp != 3 && iIsVip != iStartapp) {
                        iIsVip = 0;
                    }
                    if (iIsVip == 0) {
                        return c5425l.yandex;
                    }
                    if (iIsVip == 3) {
                        signatures(interfaceC14555l, interfaceC13789lAds2, interfaceC13789lAds);
                        signatures(interfaceC14555l, interfaceC13789lAds, interfaceC13789lAds2);
                    }
                    int i2 = c5425l.billing;
                    if (i2 > 100) {
                        C17132l.metrica(interfaceC13789lAds2, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    c5425l.billing = i2 + 1;
                    int iInmobi = AbstractC5020l.inmobi(iIsVip);
                    C6168l c6168l = f12998l;
                    if (iInmobi == 0) {
                        zIsVip = isVip(c6168l, c5425l, interfaceC13789lAds, interfaceC13789lAds2);
                    } else if (iInmobi == 1) {
                        zIsVip = isVip(c6168l, c5425l, interfaceC13789lAds2, interfaceC13789lAds);
                    } else {
                        if (iInmobi != 2) {
                            C18725l.billing();
                            return false;
                        }
                        zIsVip = vip(c5425l, interfaceC13789lAds2, interfaceC13789lAds);
                    }
                    c5425l.billing--;
                    if (!zIsVip) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean amazon(InterfaceC14555l interfaceC14555l, InterfaceC0583l interfaceC0583l) {
        InterfaceC13789l interfaceC13789lAds;
        InterfaceC0583l interfaceC0583lMo1162class;
        return interfaceC14555l.mo1167for(interfaceC0583l) || ((interfaceC0583l instanceof InterfaceC13340l) && (interfaceC13789lAds = interfaceC14555l.ads(interfaceC14555l.mo1208new(interfaceC14555l.tapsense((InterfaceC13340l) interfaceC0583l)))) != null && (interfaceC0583lMo1162class = interfaceC14555l.mo1162class(interfaceC13789lAds)) != null && interfaceC14555l.mo1167for(interfaceC0583lMo1162class));
    }

    public static final boolean billing(InterfaceC14555l interfaceC14555l, C5425l c5425l, InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2, boolean z) {
        Collection<InterfaceC13789l> collectionMo1161catch = interfaceC14555l.mo1161catch(interfaceC0583l);
        if ((collectionMo1161catch instanceof Collection) && collectionMo1161catch.isEmpty()) {
            return false;
        }
        for (InterfaceC13789l interfaceC13789l : collectionMo1161catch) {
            if (AbstractC8576l.yandex(interfaceC14555l.mo1219this(interfaceC13789l), interfaceC14555l.mo1209package(interfaceC0583l2))) {
                return true;
            }
            if (z && isVip(f12998l, c5425l, interfaceC0583l2, interfaceC13789l)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVip(C6168l c6168l, C5425l c5425l, InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        if (interfaceC13789l == interfaceC13789l2) {
            return true;
        }
        if (!c5425l.loadAd(interfaceC13789l, interfaceC13789l2)) {
            return false;
        }
        return f12998l.firebase(c5425l, c5425l.crashlytics, interfaceC13789l, interfaceC13789l2);
    }

    public static LinkedHashSet license(String str, String... strArr) {
        return tapsense("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static InterfaceC5475l metrica(Throwable th) {
        if (AbstractC17948l.purchase(th)) {
            return new C13974l(th);
        }
        if (th instanceof C13661l) {
            C13661l c13661l = (C13661l) th;
            if (c13661l.yandex().yandex == 1117 || AbstractC12024l.appmetrica(c13661l.yandex().loadAd, "access_token", false)) {
                return new C12571l(th);
            }
            return (c13661l.yandex().yandex == 5 && AbstractC12024l.appmetrica(c13661l.yandex().loadAd, "blocked", false)) ? new C5190l(th) : new C3022l(th);
        }
        if (!(th instanceof C15710l)) {
            return new C10488l(th);
        }
        C15710l c15710l = (C15710l) th;
        String str = c15710l.f30852l;
        int i = c15710l.f30853l;
        if (i == 1117 || AbstractC12024l.appmetrica(str, "access_token", false)) {
            return new C12571l(th);
        }
        return (i == 5 && AbstractC12024l.appmetrica(str, "blocked", false)) ? new C5190l(th) : new C3022l(th);
    }

    public static boolean pro(AudioTrack audioTrack) {
        int i = audioTrack.loadAd;
        long j = audioTrack.crashlytics;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        String string = sb.toString();
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null;
        if (cachedTrack != null) {
            return cachedTrack.appmetrica();
        }
        return false;
    }

    public static void signatures(InterfaceC14555l interfaceC14555l, InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        InterfaceC0583l interfaceC0583lMo1163const = interfaceC14555l.mo1163const(interfaceC13789l);
        if (interfaceC0583lMo1163const instanceof InterfaceC13340l) {
            InterfaceC13340l interfaceC13340l = (InterfaceC13340l) interfaceC0583lMo1163const;
            if (!interfaceC14555l.admob(interfaceC13340l) && interfaceC14555l.vip(interfaceC14555l.mo1208new(interfaceC14555l.tapsense(interfaceC13340l))) && interfaceC14555l.mo1218synchronized(interfaceC13340l) == 1) {
                interfaceC14555l.mo1219this(interfaceC13789l2);
            }
        }
    }

    public static String[] smaato(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String startapp() {
        return ads(16) + ':' + ads(32);
    }

    public static List subs(C5425l c5425l, InterfaceC14555l interfaceC14555l, InterfaceC0583l interfaceC0583l, InterfaceC2224l interfaceC2224l) {
        List listAdmob = admob(c5425l, interfaceC14555l, interfaceC0583l, interfaceC2224l);
        if (listAdmob.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAdmob) {
                InterfaceC6440l interfaceC6440lMo1174l = interfaceC14555l.mo1174l((InterfaceC0583l) obj);
                int iMetrica = interfaceC14555l.metrica(interfaceC6440lMo1174l);
                int i = 0;
                while (true) {
                    if (i >= iMetrica) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC13789l interfaceC13789lAds = interfaceC14555l.ads(interfaceC14555l.mo1197l(interfaceC6440lMo1174l, i));
                    if ((interfaceC13789lAds != null ? interfaceC14555l.mo1166finally(interfaceC13789lAds) : null) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listAdmob;
    }

    public static InterfaceC13199l subscription(InterfaceC14555l interfaceC14555l, InterfaceC13789l interfaceC13789l, InterfaceC0583l interfaceC0583l) {
        InterfaceC13789l interfaceC13789lAds;
        int iMopub = interfaceC14555l.mopub(interfaceC13789l);
        int i = 0;
        while (true) {
            if (i >= iMopub) {
                return null;
            }
            InterfaceC0218l interfaceC0218lMo1199l = interfaceC14555l.mo1199l(interfaceC13789l, i);
            InterfaceC0218l interfaceC0218l = interfaceC14555l.vip(interfaceC0218lMo1199l) ? null : interfaceC0218lMo1199l;
            if (interfaceC0218l != null && (interfaceC13789lAds = interfaceC14555l.ads(interfaceC0218l)) != null) {
                boolean z = interfaceC14555l.mo1158abstract(interfaceC14555l.signatures(interfaceC13789lAds)) && interfaceC14555l.mo1158abstract(interfaceC14555l.signatures(interfaceC0583l));
                if (interfaceC13789lAds.equals(interfaceC0583l) || (z && AbstractC8576l.yandex(interfaceC14555l.mo1219this(interfaceC13789lAds), interfaceC14555l.mo1219this(interfaceC0583l)))) {
                    return interfaceC14555l.mo1216super(interfaceC14555l.mo1219this(interfaceC13789l), i);
                }
                InterfaceC13199l interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC13789lAds, interfaceC0583l);
                if (interfaceC13199lSubscription != null) {
                    return interfaceC13199lSubscription;
                }
            }
            i++;
        }
    }

    public static LinkedHashSet tapsense(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static boolean vip(C5425l c5425l, InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        AbstractC5832l abstractC5832l = c5425l.amazon;
        AbstractC6974l abstractC6974l = c5425l.purchase;
        InterfaceC14555l interfaceC14555l = c5425l.crashlytics;
        if (interfaceC13789l == interfaceC13789l2) {
            return true;
        }
        if (ad(interfaceC14555l, interfaceC13789l) && ad(interfaceC14555l, interfaceC13789l2)) {
            InterfaceC13789l interfaceC13789lMopub = abstractC5832l.mopub(abstractC6974l.adcel(interfaceC13789l));
            InterfaceC13789l interfaceC13789lMopub2 = abstractC5832l.mopub(abstractC6974l.adcel(interfaceC13789l2));
            InterfaceC0583l interfaceC0583lSignatures = interfaceC14555l.signatures(interfaceC13789lMopub);
            if (!interfaceC14555l.mo1169import(interfaceC14555l.mo1219this(interfaceC13789lMopub), interfaceC14555l.mo1219this(interfaceC13789lMopub2))) {
                return false;
            }
            if (interfaceC14555l.mopub(interfaceC0583lSignatures) == 0) {
                return interfaceC14555l.mo1215strictfp(interfaceC13789lMopub) || interfaceC14555l.mo1215strictfp(interfaceC13789lMopub2) || interfaceC14555l.mo1173l(interfaceC0583lSignatures) == interfaceC14555l.mo1173l(interfaceC14555l.signatures(interfaceC13789lMopub2));
            }
        }
        C6168l c6168l = f12998l;
        return isVip(c6168l, c5425l, interfaceC13789l, interfaceC13789l2) && isVip(c6168l, c5425l, interfaceC13789l2, interfaceC13789l);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C13452l c13452l = (C13452l) ((C11963l) obj).metrica();
        Parcel parcelM743l = c13452l.m743l();
        int i = AbstractC14866l.yandex;
        parcelM743l.writeInt(1);
        AbstractC9968l.Signature(parcelM743l, AbstractC9968l.tapsense(parcelM743l, 20293));
        c13452l.m742l(parcelM743l, 2002);
        ((C2350l) obj2).loadAd(Boolean.TRUE);
    }

    public synchronized String adcel() {
        synchronized (C6168l.class) {
            try {
                if (f12984l.length() > 0) {
                    return f12984l;
                }
                C16287l c16287l = C16287l.yandex;
                c16287l.getClass();
                C5991l c5991l = C16287l.amazon;
                InterfaceC13922l[] interfaceC13922lArr = C16287l.loadAd;
                InterfaceC13922l interfaceC13922l = interfaceC13922lArr[1];
                f12984l = (String) c5991l.advert(c16287l);
                if (f12984l.length() == 0) {
                    f12984l = startapp();
                    String str = f12984l;
                    InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[1];
                    ((SharedPreferences) c5991l.f12716l).edit().putString((String) c5991l.f12715l, str).apply();
                }
                return f12984l;
            } catch (Exception unused) {
                return "";
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object applovin(List list, AbstractC0283l abstractC0283l) {
        C10790l c10790l;
        if (abstractC0283l instanceof C10790l) {
            c10790l = (C10790l) abstractC0283l;
            int i = c10790l.f21816l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10790l.f21816l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10790l = new C10790l(this, abstractC0283l);
            }
        } else {
            c10790l = new C10790l(this, abstractC0283l);
        }
        Object objM3168l = c10790l.f21817l;
        int i2 = c10790l.f21816l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c10790l.f21818l = list;
            c10790l.f21816l = 1;
            objM3168l = C6336l.loadAd.m3168l(c10790l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = c10790l.f21818l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        return AbstractC16901l.m4243this(((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid IN $0", Arrays.copyOf(new Object[]{list}, 1)).crashlytics(), new C15705l(2, list));
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    public boolean appmetrica(C5978l c5978l) {
        String str = c5978l.metrica;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        c16864l.f32922l.firebase(C8403l.f17380l, new C3341l((Function3) abstractC5563l, null, 2));
    }

    public void crashlytics(InterfaceC17242l interfaceC17242l, float f, float f2, InterfaceC6347l interfaceC6347l, long j, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        final float f3;
        final float f4;
        final InterfaceC6347l interfaceC6347l2;
        final long j2;
        final InterfaceC17242l interfaceC17242l3;
        InterfaceC6347l interfaceC6347l3;
        long jPurchase;
        InterfaceC17242l interfaceC17242l4;
        final float f5;
        final float f6;
        c6956l.m2133new(-1364277227);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i | (c6956l.billing(interfaceC17242l2) ? 4 : 2);
        }
        int i5 = i3 | 9648;
        if (c6956l.m2127for(i5 & 1, (i5 & 9363) != 9362)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                InterfaceC17242l interfaceC17242l5 = i4 != 0 ? C4346l.f8873l : interfaceC17242l2;
                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.purchase;
                jPurchase = AbstractC15038l.purchase(c6956l, 19);
                interfaceC17242l4 = interfaceC17242l5;
                f5 = 32.0f;
                f6 = 4.0f;
            } else {
                c6956l.m2124else();
                f5 = f;
                f6 = f2;
                jPurchase = j;
                interfaceC17242l4 = interfaceC17242l2;
                interfaceC6347l3 = interfaceC6347l;
            }
            c6956l.adcel();
            String strCrashlytics = AbstractC7902l.crashlytics(c6956l, R.string.m3c_bottom_sheet_drag_handle_description);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(interfaceC17242l4, 0.0f, AbstractC8882l.yandex, 1);
            boolean zBilling = c6956l.billing(strCrashlytics);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C6908l(strCrashlytics, 3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3274l.yandex(AbstractC4962l.yandex(interfaceC17242lVip, false, (Function1) objM2132native), interfaceC6347l3, jPurchase, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-1039573072, new Function2() { // from class: lؒۨۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        AbstractC9383l.yandex(AbstractC0080l.firebase(C4346l.f8873l, f5, f6), c6956l2, 0);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 12582912, 120);
            interfaceC6347l2 = interfaceC6347l3;
            j2 = jPurchase;
            interfaceC17242l3 = interfaceC17242l4;
            f3 = f5;
            f4 = f6;
        } else {
            c6956l.m2124else();
            f3 = f;
            f4 = f2;
            interfaceC6347l2 = interfaceC6347l;
            j2 = j;
            interfaceC17242l3 = interfaceC17242l2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l3, f3, f4, interfaceC6347l2, j2, i, i2) { // from class: lؒؐؕ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ float f2263l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ int f2264l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f2265l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6347l f2267l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ float f2268l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ long f2269l;

                {
                    this.f2264l = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(196609);
                    this.f2266l.crashlytics(this.f2265l, this.f2263l, this.f2268l, this.f2267l, this.f2269l, (C6956l) obj, iPurchase, this.f2264l);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0258  */
    /* JADX WARN: Code duplicated, block: B:210:0x0342  */
    /* JADX WARN: Code duplicated, block: B:213:0x0353  */
    /* JADX WARN: Code duplicated, block: B:217:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0360  */
    /* JADX WARN: Code duplicated, block: B:220:0x0371  */
    /* JADX WARN: Code duplicated, block: B:223:0x0382  */
    /* JADX WARN: Code duplicated, block: B:226:0x0395  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:231:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:242:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:245:0x0408  */
    /* JADX WARN: Code duplicated, block: B:251:0x041e  */
    /* JADX WARN: Code duplicated, block: B:253:0x042d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0439  */
    /* JADX WARN: Code duplicated, block: B:257:0x043e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:260:0x0449  */
    /* JADX WARN: Code duplicated, block: B:263:0x0459  */
    /* JADX WARN: Code duplicated, block: B:267:0x046b  */
    /* JADX WARN: Code duplicated, block: B:268:0x046d  */
    /* JADX WARN: Code duplicated, block: B:272:0x0475  */
    /* JADX WARN: Code duplicated, block: B:278:0x048b  */
    /* JADX WARN: Code duplicated, block: B:282:0x04a3 A[LOOP:7: B:276:0x0485->B:282:0x04a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:298:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:311:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:? A[LOOP:12: B:31:0x0095->B:334:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[LOOP:13: B:47:0x00d6->B:337:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [lٓۦٙ] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    public boolean firebase(C5425l c5425l, InterfaceC14555l interfaceC14555l, InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z;
        List<InterfaceC0583l> listAdmob;
        C5987l c5987l;
        ArrayList<InterfaceC0583l> arrayList;
        int size;
        InterfaceC2224l interfaceC2224lMo1209package;
        ArrayDeque arrayDeque;
        C4853l c4853l;
        InterfaceC0583l interfaceC0583l;
        C5987l c5987l2;
        Iterator it;
        InterfaceC0583l interfaceC0583lPurchase;
        C8469l c8469l;
        int iMo1217switch;
        ?? r6;
        boolean zAdvert;
        boolean zAdvert2;
        InterfaceC0218l interfaceC0218lAdvert;
        InterfaceC13789l interfaceC13789lAds;
        InterfaceC0583l interfaceC0583lMo1163const;
        InterfaceC2224l interfaceC2224lMo1209package2;
        InterfaceC2224l interfaceC2224lMo1209package3;
        InterfaceC13199l interfaceC13199lSubscription;
        Collection collectionAppmetrica;
        Iterator it2;
        Collection collectionAppmetrica2;
        Iterator it3;
        boolean z2;
        AbstractC6974l abstractC6974l = c5425l.purchase;
        InterfaceC13789l interfaceC13789lAdcel = abstractC6974l.adcel(interfaceC13789l);
        AbstractC5832l abstractC5832l = c5425l.amazon;
        InterfaceC13789l interfaceC13789lMopub = abstractC5832l.mopub(interfaceC13789lAdcel);
        InterfaceC13789l interfaceC13789lMopub2 = abstractC5832l.mopub(abstractC6974l.adcel(interfaceC13789l2));
        InterfaceC0583l interfaceC0583lSignatures = interfaceC14555l.signatures(interfaceC13789lMopub);
        InterfaceC0583l interfaceC0583lMo1162class = interfaceC14555l.mo1162class(interfaceC13789lMopub2);
        boolean z3 = false;
        boolean z4 = true;
        if (!interfaceC14555l.remoteconfig(interfaceC0583lSignatures) && !interfaceC14555l.remoteconfig(interfaceC0583lMo1162class)) {
            interfaceC14555l.mo1212public(interfaceC0583lSignatures);
            interfaceC14555l.mo1160case(interfaceC0583lSignatures);
            interfaceC14555l.mo1160case(interfaceC0583lMo1162class);
            InterfaceC13340l interfaceC13340lMo1213return = interfaceC14555l.mo1213return(interfaceC0583lMo1162class);
            InterfaceC13789l interfaceC13789lPremium = interfaceC13340lMo1213return != null ? interfaceC14555l.premium(interfaceC13340lMo1213return) : null;
            if (interfaceC13340lMo1213return == null || interfaceC13789lPremium == null) {
                interfaceC2224lMo1209package2 = interfaceC14555l.mo1209package(interfaceC0583lMo1162class);
                if (interfaceC14555l.subscription(interfaceC2224lMo1209package2)) {
                    interfaceC14555l.mo1173l(interfaceC0583lMo1162class);
                    collectionAppmetrica2 = interfaceC14555l.appmetrica(interfaceC2224lMo1209package2);
                    if (!(collectionAppmetrica2 instanceof Collection) && collectionAppmetrica2.isEmpty()) {
                        z2 = true;
                        break;
                    }
                    it3 = collectionAppmetrica2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z2 = true;
                            break;
                        }
                        if (!isVip(f12998l, c5425l, interfaceC0583lSignatures, (InterfaceC13789l) it3.next())) {
                            z2 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                } else {
                    interfaceC2224lMo1209package3 = interfaceC14555l.mo1209package(interfaceC0583lSignatures);
                    if (interfaceC0583lSignatures instanceof InterfaceC13340l) {
                        interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC0583lMo1162class, interfaceC0583lSignatures);
                        if (interfaceC13199lSubscription == null && interfaceC14555l.purchase(interfaceC13199lSubscription, interfaceC14555l.mo1209package(interfaceC0583lMo1162class))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (interfaceC14555l.subscription(interfaceC2224lMo1209package3)) {
                            collectionAppmetrica = interfaceC14555l.appmetrica(interfaceC2224lMo1209package3);
                            if ((collectionAppmetrica instanceof Collection) || !collectionAppmetrica.isEmpty()) {
                                it2 = collectionAppmetrica.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC0583lMo1162class, interfaceC0583lSignatures);
                                        if (interfaceC13199lSubscription == null) {
                                        }
                                    } else if (!(((InterfaceC13789l) it2.next()) instanceof InterfaceC13340l)) {
                                    }
                                }
                            } else {
                                interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC0583lMo1162class, interfaceC0583lSignatures);
                                if (interfaceC13199lSubscription == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (interfaceC14555l.mo1173l(interfaceC0583lMo1162class)) {
                    interfaceC13789lPremium = interfaceC14555l.mo1195l(interfaceC13789lPremium);
                } else if (interfaceC14555l.mo1210private(interfaceC0583lMo1162class)) {
                    interfaceC13789lPremium = interfaceC14555l.mo1164else(interfaceC13789lPremium);
                }
                if (isVip(this, c5425l, interfaceC0583lSignatures, interfaceC13789lPremium)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    interfaceC2224lMo1209package2 = interfaceC14555l.mo1209package(interfaceC0583lMo1162class);
                    if (interfaceC14555l.subscription(interfaceC2224lMo1209package2)) {
                        interfaceC14555l.mo1173l(interfaceC0583lMo1162class);
                        collectionAppmetrica2 = interfaceC14555l.appmetrica(interfaceC2224lMo1209package2);
                        if (!(collectionAppmetrica2 instanceof Collection)) {
                            it3 = collectionAppmetrica2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                if (!isVip(f12998l, c5425l, interfaceC0583lSignatures, (InterfaceC13789l) it3.next())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = collectionAppmetrica2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                if (!isVip(f12998l, c5425l, interfaceC0583lSignatures, (InterfaceC13789l) it3.next())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        interfaceC2224lMo1209package3 = interfaceC14555l.mo1209package(interfaceC0583lSignatures);
                        if (interfaceC0583lSignatures instanceof InterfaceC13340l) {
                            interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC0583lMo1162class, interfaceC0583lSignatures);
                            if (interfaceC13199lSubscription == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (interfaceC14555l.subscription(interfaceC2224lMo1209package3)) {
                                collectionAppmetrica = interfaceC14555l.appmetrica(interfaceC2224lMo1209package3);
                                if (collectionAppmetrica instanceof Collection) {
                                    it2 = collectionAppmetrica.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC0583lMo1162class, interfaceC0583lSignatures);
                                            if (interfaceC13199lSubscription == null) {
                                            }
                                        } else if (!(((InterfaceC13789l) it2.next()) instanceof InterfaceC13340l)) {
                                        }
                                    }
                                } else {
                                    it2 = collectionAppmetrica.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            interfaceC13199lSubscription = subscription(interfaceC14555l, interfaceC0583lMo1162class, interfaceC0583lSignatures);
                                            if (interfaceC13199lSubscription == null) {
                                            }
                                        } else if (!(((InterfaceC13789l) it2.next()) instanceof InterfaceC13340l)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        } else if (c5425l.yandex) {
            boolValueOf = Boolean.TRUE;
        } else if (!interfaceC14555l.mo1173l(interfaceC0583lSignatures) || interfaceC14555l.mo1173l(interfaceC0583lMo1162class)) {
            if (!interfaceC14555l.remoteconfig(interfaceC0583lSignatures)) {
                interfaceC0583lSignatures = interfaceC14555l.isPro(interfaceC0583lSignatures);
            }
            if (!interfaceC14555l.remoteconfig(interfaceC0583lMo1162class)) {
                interfaceC0583lMo1162class = interfaceC14555l.isPro(interfaceC0583lMo1162class);
            }
            boolValueOf = Boolean.valueOf(AbstractC7209l.firebase(interfaceC14555l, interfaceC0583lSignatures, interfaceC0583lMo1162class));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        InterfaceC0583l interfaceC0583lSignatures2 = interfaceC14555l.signatures(interfaceC13789lMopub);
        InterfaceC0583l interfaceC0583lMo1162class2 = interfaceC14555l.mo1162class(interfaceC13789lMopub2);
        C5987l c5987l3 = C5987l.isPro;
        InterfaceC14555l interfaceC14555l2 = c5425l.crashlytics;
        C5987l c5987l4 = C5987l.subs;
        if (!interfaceC14555l2.mo1173l(interfaceC0583lMo1162class2) && !interfaceC14555l2.mo1170instanceof(interfaceC0583lSignatures2) && !interfaceC14555l2.mo1210private(interfaceC0583lSignatures2) && ((!(interfaceC0583lSignatures2 instanceof InterfaceC13340l) || !interfaceC14555l2.mo1186l((InterfaceC13340l) interfaceC0583lSignatures2)) && !AbstractC17860l.purchase(c5425l, interfaceC0583lSignatures2, c5987l4))) {
            if (interfaceC14555l2.mo1210private(interfaceC0583lMo1162class2) || AbstractC17860l.purchase(c5425l, interfaceC0583lMo1162class2, C5987l.firebase) || interfaceC14555l2.ad(interfaceC0583lSignatures2)) {
                return false;
            }
            InterfaceC2224l interfaceC2224lMo1209package4 = interfaceC14555l2.mo1209package(interfaceC0583lMo1162class2);
            if (!AbstractC17860l.billing(c5425l, interfaceC0583lSignatures2, interfaceC2224lMo1209package4)) {
                c5425l.crashlytics();
                ArrayDeque arrayDeque2 = c5425l.mopub;
                C4853l c4853l2 = c5425l.admob;
                arrayDeque2.push(interfaceC0583lSignatures2);
                loop0: while (true) {
                    if (arrayDeque2.isEmpty()) {
                        c5425l.yandex();
                        return false;
                    }
                    InterfaceC0583l interfaceC0583l2 = (InterfaceC0583l) arrayDeque2.pop();
                    if (c4853l2.add(interfaceC0583l2)) {
                        C5987l c5987l5 = interfaceC14555l2.mo1173l(interfaceC0583l2) ? c5987l3 : c5987l4;
                        if (c5987l5.equals(c5987l3)) {
                            c5987l5 = null;
                        }
                        if (c5987l5 == null) {
                            continue;
                        } else {
                            Iterator it4 = interfaceC14555l2.appmetrica(interfaceC14555l2.mo1209package(interfaceC0583l2)).iterator();
                            while (it4.hasNext()) {
                                InterfaceC0583l interfaceC0583lPurchase2 = c5987l5.purchase(c5425l, (InterfaceC13789l) it4.next());
                                if (AbstractC17860l.billing(c5425l, interfaceC0583lPurchase2, interfaceC2224lMo1209package4)) {
                                    c5425l.yandex();
                                    break loop0;
                                }
                                arrayDeque2.add(interfaceC0583lPurchase2);
                            }
                        }
                    }
                }
            }
        }
        if (!interfaceC14555l.mo1167for(interfaceC0583lSignatures2) && !interfaceC14555l.mo1167for(interfaceC0583lMo1162class2)) {
            bool = null;
        } else if (amazon(interfaceC14555l, interfaceC0583lSignatures2) && amazon(interfaceC14555l, interfaceC0583lMo1162class2)) {
            bool = Boolean.TRUE;
        } else if (interfaceC14555l.mo1167for(interfaceC0583lSignatures2)) {
            if (billing(interfaceC14555l, c5425l, interfaceC0583lSignatures2, interfaceC0583lMo1162class2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (interfaceC14555l.mo1167for(interfaceC0583lMo1162class2)) {
            InterfaceC2224l interfaceC2224lMo1209package5 = interfaceC14555l.mo1209package(interfaceC0583lSignatures2);
            if (interfaceC2224lMo1209package5 instanceof C11794l) {
                Collection collectionAppmetrica3 = interfaceC14555l.appmetrica(interfaceC2224lMo1209package5);
                if (!(collectionAppmetrica3 instanceof Collection) || !collectionAppmetrica3.isEmpty()) {
                    Iterator it5 = collectionAppmetrica3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            InterfaceC0583l interfaceC0583lMo1163const2 = interfaceC14555l.mo1163const((InterfaceC13789l) it5.next());
                            if (interfaceC0583lMo1163const2 == null || !interfaceC14555l.mo1167for(interfaceC0583lMo1163const2)) {
                            }
                        } else if (!billing(interfaceC14555l, c5425l, interfaceC0583lMo1162class2, interfaceC0583lSignatures2, true)) {
                            bool = null;
                        }
                    }
                } else if (!billing(interfaceC14555l, c5425l, interfaceC0583lMo1162class2, interfaceC0583lSignatures2, true)) {
                    bool = null;
                }
            } else if (!billing(interfaceC14555l, c5425l, interfaceC0583lMo1162class2, interfaceC0583lSignatures2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC2224l interfaceC2224lMo1209package6 = interfaceC14555l.mo1209package(interfaceC0583lMo1162class2);
        if ((interfaceC14555l.mo1169import(interfaceC14555l.mo1209package(interfaceC0583lSignatures2), interfaceC2224lMo1209package6) && interfaceC14555l.mo1217switch(interfaceC2224lMo1209package6) == 0) || interfaceC14555l.mo1205l(interfaceC14555l.mo1209package(interfaceC0583lMo1162class2))) {
            return true;
        }
        if (!interfaceC14555l2.ad(interfaceC0583lSignatures2)) {
            if (interfaceC14555l2.license(interfaceC2224lMo1209package6) || interfaceC14555l2.mo1159break(interfaceC2224lMo1209package6)) {
                C5047l c5047l = new C5047l();
                c5425l.crashlytics();
                ArrayDeque arrayDeque3 = c5425l.mopub;
                C4853l c4853l3 = c5425l.admob;
                arrayDeque3.push(interfaceC0583lSignatures2);
                while (!arrayDeque3.isEmpty()) {
                    InterfaceC0583l interfaceC0583l3 = (InterfaceC0583l) arrayDeque3.pop();
                    if (c4853l3.add(interfaceC0583l3)) {
                        if (interfaceC14555l2.ad(interfaceC0583l3)) {
                            c5047l.add(interfaceC0583l3);
                            c5987l = c5987l3;
                        } else {
                            c5987l = c5987l4;
                        }
                        if (c5987l.equals(c5987l3)) {
                            c5987l = null;
                        }
                        if (c5987l != null) {
                            Iterator it6 = interfaceC14555l2.appmetrica(interfaceC14555l2.mo1209package(interfaceC0583l3)).iterator();
                            while (it6.hasNext()) {
                                arrayDeque3.add(c5987l.purchase(c5425l, (InterfaceC13789l) it6.next()));
                                z3 = z3;
                            }
                        }
                    }
                }
                z = z3;
                c5425l.yandex();
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = c5047l.iterator();
                while (it7.hasNext()) {
                    AbstractC3984l.license(arrayList2, subs(c5425l, interfaceC14555l2, (InterfaceC0583l) it7.next(), interfaceC2224lMo1209package6));
                }
                listAdmob = arrayList2;
            } else {
                listAdmob = admob(c5425l, interfaceC14555l2, interfaceC0583lSignatures2, interfaceC2224lMo1209package6);
            }
            listAdmob.size();
            arrayList = new ArrayList(AbstractC14055l.billing(listAdmob, 10));
            for (InterfaceC0583l interfaceC0583l4 : listAdmob) {
                interfaceC0583lMo1163const = interfaceC14555l.mo1163const(abstractC5832l.mopub(interfaceC0583l4));
                if (interfaceC0583lMo1163const == null) {
                    interfaceC0583l4 = interfaceC0583lMo1163const;
                }
                arrayList.add(interfaceC0583l4);
            }
            size = arrayList.size();
            if (size != 0) {
                interfaceC2224lMo1209package = interfaceC14555l.mo1209package(interfaceC0583lSignatures2);
                if (interfaceC14555l.license(interfaceC2224lMo1209package)) {
                    return interfaceC14555l.mo1203l(interfaceC2224lMo1209package);
                }
                if (interfaceC14555l.mo1203l(interfaceC14555l.mo1209package(interfaceC0583lSignatures2))) {
                    return true;
                }
                c5425l.crashlytics();
                arrayDeque = c5425l.mopub;
                c4853l = c5425l.admob;
                arrayDeque.push(interfaceC0583lSignatures2);
                while (!arrayDeque.isEmpty()) {
                    interfaceC0583l = (InterfaceC0583l) arrayDeque.pop();
                    if (!c4853l.add(interfaceC0583l)) {
                        if (interfaceC14555l.ad(interfaceC0583l)) {
                            c5987l2 = c5987l3;
                        } else {
                            c5987l2 = c5987l4;
                        }
                        if (c5987l2.equals(c5987l3)) {
                            c5987l2 = null;
                        }
                        if (c5987l2 == null) {
                            continue;
                        } else {
                            it = interfaceC14555l2.appmetrica(interfaceC14555l2.mo1209package(interfaceC0583l)).iterator();
                            while (it.hasNext()) {
                                interfaceC0583lPurchase = c5987l2.purchase(c5425l, (InterfaceC13789l) it.next());
                                if (interfaceC14555l.mo1203l(interfaceC14555l.mo1209package(interfaceC0583lPurchase))) {
                                    c5425l.yandex();
                                    return true;
                                }
                                arrayDeque.add(interfaceC0583lPurchase);
                            }
                        }
                    }
                }
                c5425l.yandex();
                return z;
            }
            if (size != 1) {
                return advert(c5425l, interfaceC14555l, interfaceC14555l.mo1174l((InterfaceC0583l) AbstractC16901l.m4248volatile(arrayList)), interfaceC0583lMo1162class2);
            }
            c8469l = new C8469l(interfaceC14555l.mo1217switch(interfaceC2224lMo1209package6));
            iMo1217switch = interfaceC14555l.mo1217switch(interfaceC2224lMo1209package6);
            r6 = z;
            while (true) {
                if (r6 < iMo1217switch) {
                    zAdvert = advert(c5425l, interfaceC14555l, c8469l, interfaceC0583lMo1162class2);
                    break;
                }
                if (interfaceC14555l.isVip(interfaceC14555l.mo1216super(interfaceC2224lMo1209package6, r6)) != 2) {
                    zAdvert = z;
                    break;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                for (InterfaceC0583l interfaceC0583l5 : arrayList) {
                    interfaceC0218lAdvert = interfaceC14555l.advert(interfaceC0583l5, r6);
                    if (interfaceC0218lAdvert != null) {
                        boolean z5 = z4;
                        if (interfaceC14555l.startapp(interfaceC0218lAdvert) != 3) {
                            interfaceC0218lAdvert = null;
                        }
                        if (interfaceC0218lAdvert == null && (interfaceC13789lAds = interfaceC14555l.ads(interfaceC0218lAdvert)) != null) {
                            arrayList3.add(interfaceC13789lAds);
                            z4 = z5;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + interfaceC0583l5 + ", subType: " + interfaceC0583lSignatures2 + ", superType: " + interfaceC0583lMo1162class2).toString());
                }
                c8469l.add(interfaceC14555l.mo1165final(interfaceC14555l.mo1214static(arrayList3)));
                r6++;
            }
            if (zAdvert) {
                return z4;
            }
            zAdvert2 = z;
            for (InterfaceC0583l interfaceC0583l6 : arrayList) {
                if (zAdvert2) {
                    zAdvert2 = advert(c5425l, interfaceC14555l, interfaceC14555l.mo1174l(interfaceC0583l6), interfaceC0583lMo1162class2);
                }
            }
            Unit unit = Unit.INSTANCE;
            return zAdvert2;
        }
        listAdmob = subs(c5425l, interfaceC14555l2, interfaceC0583lSignatures2, interfaceC2224lMo1209package6);
        z = false;
        listAdmob.size();
        arrayList = new ArrayList(AbstractC14055l.billing(listAdmob, 10));
        while (r11.hasNext()) {
            interfaceC0583lMo1163const = interfaceC14555l.mo1163const(abstractC5832l.mopub(interfaceC0583l4));
            if (interfaceC0583lMo1163const == null) {
                interfaceC0583l4 = interfaceC0583lMo1163const;
            }
            arrayList.add(interfaceC0583l4);
        }
        size = arrayList.size();
        if (size != 0) {
            interfaceC2224lMo1209package = interfaceC14555l.mo1209package(interfaceC0583lSignatures2);
            if (interfaceC14555l.license(interfaceC2224lMo1209package)) {
                return interfaceC14555l.mo1203l(interfaceC2224lMo1209package);
            }
            if (interfaceC14555l.mo1203l(interfaceC14555l.mo1209package(interfaceC0583lSignatures2))) {
                return true;
            }
            c5425l.crashlytics();
            arrayDeque = c5425l.mopub;
            c4853l = c5425l.admob;
            arrayDeque.push(interfaceC0583lSignatures2);
            while (!arrayDeque.isEmpty()) {
                interfaceC0583l = (InterfaceC0583l) arrayDeque.pop();
                if (!c4853l.add(interfaceC0583l)) {
                    if (interfaceC14555l.ad(interfaceC0583l)) {
                        c5987l2 = c5987l3;
                    } else {
                        c5987l2 = c5987l4;
                    }
                    if (c5987l2.equals(c5987l3)) {
                        c5987l2 = null;
                    }
                    if (c5987l2 == null) {
                        continue;
                    } else {
                        it = interfaceC14555l2.appmetrica(interfaceC14555l2.mo1209package(interfaceC0583l)).iterator();
                        while (it.hasNext()) {
                            interfaceC0583lPurchase = c5987l2.purchase(c5425l, (InterfaceC13789l) it.next());
                            if (interfaceC14555l.mo1203l(interfaceC14555l.mo1209package(interfaceC0583lPurchase))) {
                                c5425l.yandex();
                                return true;
                            }
                            arrayDeque.add(interfaceC0583lPurchase);
                        }
                    }
                }
            }
            c5425l.yandex();
            return z;
        }
        if (size != 1) {
            return advert(c5425l, interfaceC14555l, interfaceC14555l.mo1174l((InterfaceC0583l) AbstractC16901l.m4248volatile(arrayList)), interfaceC0583lMo1162class2);
        }
        c8469l = new C8469l(interfaceC14555l.mo1217switch(interfaceC2224lMo1209package6));
        iMo1217switch = interfaceC14555l.mo1217switch(interfaceC2224lMo1209package6);
        r6 = z;
        while (true) {
            if (r6 < iMo1217switch) {
                zAdvert = advert(c5425l, interfaceC14555l, c8469l, interfaceC0583lMo1162class2);
                break;
            }
            if (interfaceC14555l.isVip(interfaceC14555l.mo1216super(interfaceC2224lMo1209package6, r6)) != 2) {
                zAdvert = z;
                break;
            }
            ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
            while (r11.hasNext()) {
                interfaceC0218lAdvert = interfaceC14555l.advert(interfaceC0583l5, r6);
                if (interfaceC0218lAdvert != null) {
                    boolean z6 = z4;
                    if (interfaceC14555l.startapp(interfaceC0218lAdvert) != 3) {
                        interfaceC0218lAdvert = null;
                    }
                    if (interfaceC0218lAdvert == null) {
                    }
                }
                throw new IllegalStateException(("Incorrect type: " + interfaceC0583l5 + ", subType: " + interfaceC0583lSignatures2 + ", superType: " + interfaceC0583lMo1162class2).toString());
            }
            c8469l.add(interfaceC14555l.mo1165final(interfaceC14555l.mo1214static(arrayList4)));
            r6++;
        }
        if (zAdvert) {
            return z4;
        }
        zAdvert2 = z;
        while (r3.hasNext()) {
            if (zAdvert2) {
                zAdvert2 = advert(c5425l, interfaceC14555l, interfaceC14555l.mo1174l(interfaceC0583l6), interfaceC0583lMo1162class2);
            }
        }
        Unit unit2 = Unit.INSTANCE;
        return zAdvert2;
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l isPro(InterfaceC1388l interfaceC1388l, C3806l c3806l) {
        return mopub(((InterfaceC13937l) interfaceC1388l).mo1730private(), c3806l);
    }

    @Override // defpackage.InterfaceC17087l
    public List loadAd(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C4652l c4652l : componentRegistrar.getComponents()) {
            String str = c4652l.yandex;
            if (str != null) {
                c4652l = new C4652l(str, c4652l.loadAd, c4652l.crashlytics, c4652l.amazon, c4652l.purchase, new C5131l(str, c4652l, 3), c4652l.mopub);
            }
            arrayList.add(c4652l);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l mopub(Class cls, C3806l c3806l) {
        return new C1588l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable premium(List list, AbstractC0283l abstractC0283l) {
        C11312l c11312l;
        if (abstractC0283l instanceof C11312l) {
            c11312l = (C11312l) abstractC0283l;
            int i = c11312l.f22803l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11312l.f22803l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11312l = new C11312l(this, abstractC0283l);
            }
        } else {
            c11312l = new C11312l(this, abstractC0283l);
        }
        Object objApplovin = c11312l.f22802l;
        int i2 = c11312l.f22803l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objApplovin);
            c11312l.f22803l = 1;
            objApplovin = applovin(list, c11312l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objApplovin == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objApplovin);
        }
        Iterable iterable = (Iterable) objApplovin;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedTrack) it.next()).crashlytics());
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l purchase(Class cls) {
        return new C1588l();
    }

    public AbstractC6791l remoteconfig(C5978l c5978l) {
        String str = c5978l.metrica;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C5674l(i2);
                case "application/x-icy":
                    return new C16747l();
                case "application/id3":
                    return new C12516l(null);
                case "application/x-emsg":
                    return new C5674l(i);
                case "application/x-scte35":
                    return new C10497l();
            }
        }
        C8339l.metrica(AbstractC14814l.startapp("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C12189l c12189l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C7051l c7051l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C4631l c4631l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C6420l c6420l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f13006l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C12189l) {
                    c12189l = (C12189l) abstractC0283l;
                    int i2 = c12189l.f24208l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12189l.f24208l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12189l = new C12189l(this, abstractC0283l);
                    }
                } else {
                    c12189l = new C12189l(this, abstractC0283l);
                }
                Object objYandex = c12189l.f24209l;
                int i3 = c12189l.f24208l;
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
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.loadAd(C11979l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C0452l.class)))));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c12189l.f24208l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c12189l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C7051l) {
                    c7051l = (C7051l) abstractC0283l;
                    int i4 = c7051l.f14780l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7051l.f14780l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7051l = new C7051l(this, abstractC0283l);
                    }
                } else {
                    c7051l = new C7051l(this, abstractC0283l);
                }
                Object objYandex2 = c7051l.f14781l;
                int i5 = c7051l.f14780l;
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
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C2757l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c7051l.f14780l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c7051l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C4631l) {
                    c4631l = (C4631l) abstractC0283l;
                    int i6 = c4631l.f9414l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4631l.f9414l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4631l = new C4631l(this, abstractC0283l);
                    }
                } else {
                    c4631l = new C4631l(this, abstractC0283l);
                }
                Object objYandex3 = c4631l.f9415l;
                int i7 = c4631l.f9414l;
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
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C14580l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c4631l.f9414l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c4631l);
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
                if (abstractC0283l instanceof C6420l) {
                    c6420l = (C6420l) abstractC0283l;
                    int i8 = c6420l.f13436l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6420l.f13436l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6420l = new C6420l(this, abstractC0283l);
                    }
                } else {
                    c6420l = new C6420l(this, abstractC0283l);
                }
                Object objYandex4 = c6420l.f13437l;
                int i9 = c6420l.f13436l;
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
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c6420l.f13436l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c6420l);
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

    @Override // defpackage.InterfaceC4374l
    public byte[] yandex(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
