package defpackage;

import android.app.Application;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؘٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16222l implements InterfaceC2165l, InterfaceC1326l, InterfaceC0248l, InterfaceC17732l, InterfaceC11989l, InterfaceC9765l, InterfaceC15244l, InterfaceC10377l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31762l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31758l = new C16222l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31755l = new C16222l(18);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31760l = new C16222l(19);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31759l = new C16222l(20);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31761l = new C16222l(21);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31756l = new C16222l(22);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C16222l f31757l = new C16222l(24);

    public /* synthetic */ C16222l(int i) {
        this.f31762l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [lٔ۟ۧ] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [lٔ۟ۧ] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5, types: [lٔ۟ۧ] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l٘ٛۢ] */
    /* JADX WARN: Type inference failed for: r3v7, types: [lٔ۟ۧ] */
    /* JADX WARN: Type inference failed for: r3v8, types: [lٟٓؑ] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static C14785l admob(AbstractC14318l abstractC14318l, C3768l c3768l, int i, boolean z) {
        ?? r3;
        int i2 = 9;
        Object objPurchase = null;
        if (AbstractC11748l.subs(abstractC14318l)) {
            return new C14785l(objPurchase, 1, i2);
        }
        if (!(abstractC14318l instanceof AbstractC4317l)) {
            if (!(abstractC14318l instanceof AbstractC15211l)) {
                C18725l.billing();
                return null;
            }
            appmetrica appmetricaVarMopub = mopub((AbstractC15211l) abstractC14318l, c3768l, i, 3, false, z);
            boolean z2 = appmetricaVarMopub.f490l;
            AbstractC14318l abstractC14318lPurchase = (AbstractC15211l) appmetricaVarMopub.f492l;
            if (z2) {
                abstractC14318lPurchase = AbstractC5170l.purchase(abstractC14318l, abstractC14318lPurchase);
            }
            return new C14785l(abstractC14318lPurchase, appmetricaVarMopub.f489l, i2);
        }
        boolean z3 = abstractC14318l instanceof C6530l;
        AbstractC4317l abstractC4317l = (AbstractC4317l) abstractC14318l;
        AbstractC15211l abstractC15211l = abstractC4317l.f8856l;
        AbstractC15211l abstractC15211l2 = abstractC4317l.f8857l;
        appmetrica appmetricaVarMopub2 = mopub(abstractC15211l2, c3768l, i, 1, z3, z);
        appmetrica appmetricaVarMopub3 = mopub(abstractC4317l.f8856l, c3768l, i, 2, z3, z);
        AbstractC15211l abstractC15211l3 = (AbstractC15211l) appmetricaVarMopub3.f492l;
        ?? Subs = (AbstractC15211l) appmetricaVarMopub2.f492l;
        if (Subs != 0 || abstractC15211l3 != null) {
            if (appmetricaVarMopub2.f490l || appmetricaVarMopub3.f490l) {
                if (abstractC15211l3 != null) {
                    if (Subs == 0) {
                        Subs = abstractC15211l3;
                    }
                    Subs = AbstractC3605l.subs(Subs, abstractC15211l3);
                }
                objPurchase = AbstractC5170l.purchase(abstractC14318l, Subs);
            } else if (z3) {
                ?? r4 = Subs;
                if (Subs == 0) {
                }
                if (abstractC15211l3 != null) {
                    r4 = abstractC15211l2;
                    abstractC15211l = abstractC15211l3;
                }
                r4 = abstractC15211l2;
                objPurchase = new C6530l(r4, abstractC15211l, 0);
            } else {
                if (Subs == 0) {
                }
                if (abstractC15211l3 != null) {
                    r3 = abstractC15211l2;
                    abstractC15211l = abstractC15211l3;
                }
                r3 = abstractC15211l2;
                objPurchase = AbstractC3605l.subs(r3, abstractC15211l);
            }
        }
        return new C14785l(objPurchase, appmetricaVarMopub2.f489l, i2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    public static appmetrica mopub(AbstractC15211l abstractC15211l, C3768l c3768l, int i, int i2, boolean z, boolean z2) {
        InterfaceC17477l interfaceC17477lIsPro;
        Boolean bool;
        InterfaceC1925l interfaceC1925lMo1339native;
        C14785l c14785l;
        InterfaceC0218l interfaceC0218lIsPro;
        ?? r3 = 0;
        boolean z3 = i2 != 3;
        boolean z4 = (z2 && z) ? false : true;
        Object obj = null;
        if (!z3 && abstractC15211l.inmobi().isEmpty()) {
            return new appmetrica(null, 1, false);
        }
        InterfaceC15234l interfaceC15234lPro = abstractC15211l.mo1339native().pro();
        if (interfaceC15234lPro == null) {
            return new appmetrica(null, 1, false);
        }
        C9217l c9217l = (C9217l) c3768l.invoke(Integer.valueOf(i));
        C2172l c2172l = AbstractC6110l.yandex;
        if (i2 == 3 || !(interfaceC15234lPro instanceof InterfaceC17477l)) {
            interfaceC17477lIsPro = null;
        } else if (c9217l.loadAd == EnumC10151l.f20669l && i2 == 1) {
            InterfaceC17477l interfaceC17477l = (InterfaceC17477l) interfaceC15234lPro;
            String str = C4632l.yandex;
            C16781l c16781lBilling = AbstractC11125l.billing(interfaceC17477l);
            HashMap map = C4632l.isPro;
            if (map.containsKey(c16781lBilling)) {
                C2312l c2312l = (C2312l) map.get(AbstractC11125l.billing(interfaceC17477l));
                if (c2312l == null) {
                    C10754l.startapp(interfaceC17477l, " is not a mutable collection", "Given class ");
                    return null;
                }
                interfaceC17477lIsPro = AbstractC3759l.purchase(interfaceC17477l).isPro(c2312l);
            } else if (c9217l.loadAd == EnumC10151l.f20668l) {
                interfaceC17477lIsPro = null;
            } else {
                interfaceC17477lIsPro = null;
            }
        } else if (c9217l.loadAd == EnumC10151l.f20668l || i2 != 2) {
            interfaceC17477lIsPro = null;
        } else {
            InterfaceC17477l interfaceC17477l2 = (InterfaceC17477l) interfaceC15234lPro;
            String str2 = C4632l.yandex;
            if (C4632l.firebase.containsKey(AbstractC11125l.billing(interfaceC17477l2))) {
                C16781l c16781lBilling2 = AbstractC11125l.billing(interfaceC17477l2);
                String str3 = C4632l.yandex;
                C2312l c2312lSubs = C4632l.subs(c16781lBilling2);
                if (c2312lSubs == null) {
                    C10754l.startapp(interfaceC17477l2, " is not a read-only collection", "Given class ");
                    return null;
                }
                interfaceC17477lIsPro = AbstractC3759l.purchase(interfaceC17477l2).isPro(c2312lSubs);
            } else {
                interfaceC17477lIsPro = null;
            }
        }
        if (i2 == 3) {
            bool = null;
        } else {
            EnumC10249l enumC10249l = c9217l.yandex;
            int i3 = enumC10249l == null ? -1 : AbstractC8178l.yandex[enumC10249l.ordinal()];
            if (i3 == 1) {
                bool = Boolean.TRUE;
            } else if (i3 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (interfaceC17477lIsPro == null || (interfaceC1925lMo1339native = interfaceC17477lIsPro.metrica()) == null) {
            interfaceC1925lMo1339native = abstractC15211l.mo1339native();
        }
        int i4 = i + 1;
        List listInmobi = abstractC15211l.inmobi();
        List parameters = interfaceC1925lMo1339native.getParameters();
        Iterator it = listInmobi.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC14055l.billing(listInmobi, 10), AbstractC14055l.billing(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) it2.next();
            AbstractC4946l abstractC4946l = (AbstractC4946l) next;
            int i5 = 9;
            if (!z4) {
                c14785l = new C14785l(obj, (int) r3, i5);
            } else if (!abstractC4946l.crashlytics()) {
                c14785l = admob(abstractC4946l.loadAd().mo3847class(), c3768l, i4, z2);
            } else if (((C9217l) c3768l.invoke(Integer.valueOf(i4))).yandex == EnumC10249l.f20873l) {
                AbstractC14318l abstractC14318lMo3847class = abstractC4946l.loadAd().mo3847class();
                c14785l = new C14785l(AbstractC3605l.subs(AbstractC16570l.billing(abstractC14318lMo3847class).mo8static(r3), AbstractC16570l.mopub(abstractC14318lMo3847class).mo8static(true)), 1, 9);
            } else {
                c14785l = new C14785l((Object) null, 1, i5);
            }
            i4 += c14785l.f28908l;
            AbstractC18041l abstractC18041l = (AbstractC18041l) c14785l.f28907l;
            if (abstractC18041l != null) {
                interfaceC0218lIsPro = AbstractC12300l.amazon(abstractC18041l, abstractC4946l.yandex(), interfaceC16902l);
            } else if (interfaceC17477lIsPro == null || abstractC4946l.crashlytics()) {
                interfaceC0218lIsPro = interfaceC17477lIsPro != null ? AbstractC12008l.isPro(interfaceC16902l) : null;
            } else {
                interfaceC0218lIsPro = AbstractC12300l.amazon(abstractC4946l.loadAd(), abstractC4946l.yandex(), interfaceC16902l);
            }
            arrayList.add(interfaceC0218lIsPro);
            r3 = 0;
            obj = null;
        }
        int i6 = i4 - i;
        if (interfaceC17477lIsPro == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((AbstractC4946l) it3.next()) == null);
            }
            return new appmetrica(null, i6, false);
        }
        InterfaceC3841l annotations = abstractC15211l.getAnnotations();
        C2172l c2172l2 = AbstractC6110l.loadAd;
        if (interfaceC17477lIsPro == null) {
            c2172l2 = null;
        }
        C2172l c2172l3 = AbstractC6110l.yandex;
        if (bool == null) {
            c2172l3 = null;
        }
        ArrayList arrayListM2420volatile = AbstractC8669l.m2420volatile(new InterfaceC3841l[]{annotations, c2172l2, c2172l3});
        int size = arrayListM2420volatile.size();
        if (size == 0) {
            C8339l.smaato("At least one Annotations object expected");
            return null;
        }
        C16017l c16017lTapsense = AbstractC3058l.tapsense(size != 1 ? new C2172l(1, AbstractC16901l.m4213const(arrayListM2420volatile)) : (InterfaceC3841l) AbstractC16901l.m4208abstract(arrayListM2420volatile));
        List listInmobi2 = abstractC15211l.inmobi();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listInmobi2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC14055l.billing(arrayList, 10), AbstractC14055l.billing(listInmobi2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            AbstractC4946l abstractC4946l2 = (AbstractC4946l) it5.next();
            AbstractC4946l abstractC4946l3 = (AbstractC4946l) next2;
            if (abstractC4946l3 != null) {
                abstractC4946l2 = abstractC4946l3;
            }
            arrayList2.add(abstractC4946l2);
        }
        AbstractC15211l abstractC15211lAds = AbstractC3605l.ads(c16017lTapsense, interfaceC1925lMo1339native, arrayList2, bool != null ? bool.booleanValue() : abstractC15211l.mo1342throw());
        if (c9217l.crashlytics) {
            abstractC15211lAds = new C7530l(abstractC15211lAds);
        }
        return new appmetrica(abstractC15211lAds, i6, bool != null && c9217l.amazon);
    }

    public static /* synthetic */ void purchase(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final C17935l subs(Object obj, Object obj2) {
        C17935l c17935l = (C17935l) obj;
        C17935l c17935l2 = (C17935l) obj2;
        if (!c17935l2.isEmpty()) {
            if (!c17935l.f34907l) {
                if (c17935l.isEmpty()) {
                    c17935l = new C17935l();
                } else {
                    C17935l c17935l3 = new C17935l(c17935l);
                    c17935l3.f34907l = true;
                    c17935l = c17935l3;
                }
            }
            c17935l.loadAd();
            if (!c17935l2.isEmpty()) {
                c17935l.putAll(c17935l2);
            }
        }
        return c17935l;
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // defpackage.InterfaceC1326l
    public boolean billing(InterfaceC1925l interfaceC1925l, InterfaceC1925l interfaceC1925l2) {
        if (interfaceC1925l == null) {
            purchase(0);
            throw null;
        }
        if (interfaceC1925l2 != null) {
            return interfaceC1925l.equals(interfaceC1925l2);
        }
        purchase(1);
        throw null;
    }

    @Override // defpackage.InterfaceC17732l
    public InterfaceC12703l crashlytics() {
        return new C9828l(-9223372036854775807L);
    }

    @Override // defpackage.InterfaceC0248l
    /* JADX INFO: renamed from: extends */
    public C6871l mo368extends(C15655l c15655l, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        byte b = 0;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        int i = 20;
        C14513l c14513l = jSONObject.has("session") ? new C14513l(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), i, b) : new C14513l(new JSONObject().optInt("max_custom_exception_events", 8), i, b);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        C10458l c10458l = new C10458l(2, jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new C6871l(jCurrentTimeMillis, c14513l, c10458l, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return new C8271l((C7854l) c11644l.remoteconfig(C7854l.class));
    }

    public String toString() {
        switch (this.f31762l) {
            case 14:
                int iHashCode = hashCode();
                AbstractC8576l.loadAd(16);
                return AbstractC14814l.ads("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", AbstractC18202l.yandex.loadAd(Application.class).license(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC17732l
    public long yandex(InterfaceC10430l interfaceC10430l) {
        return -1L;
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f31762l) {
            case 16:
                return new Boolean(((Boolean) C13588l.loadAd.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                return new Boolean(((Boolean) C16993l.yandex.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(240000L, 40, "measurement.sgtm.batch.long_queuing_threshold").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(1800000L, 77, "measurement.upload.retry_time").get();
            case 20:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(27L, 23, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 21:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.event_params", 13, "value|currency").get();
            case 22:
                List list5 = AbstractC5981l.yandex;
                return (Boolean) C8775l.crashlytics.get();
        }
    }

    @Override // defpackage.InterfaceC17732l
    public void amazon(long j) {
    }
}
