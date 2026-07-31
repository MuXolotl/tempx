package defpackage;

import android.content.Context;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙۜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6760l implements InterfaceC11893l, InterfaceC6632l, InterfaceC9765l, InterfaceC15244l, InterfaceC14257l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14174l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14170l = new C6760l(16);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14167l = new C6760l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14172l = new C6760l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14171l = new C6760l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14173l = new C6760l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14168l = new C6760l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C6760l f14169l = new C6760l(23);

    public C6760l(C17963l c17963l, AbstractC8698l abstractC8698l) {
        this.f14174l = 2;
    }

    public static final C11414l admob(int i, String str) {
        WeakHashMap weakHashMap = C12923l.pro;
        return new C11414l(new C6777l(0, 0, 0, 0), str);
    }

    public static final C9297l amazon(int i, String str) {
        WeakHashMap weakHashMap = C12923l.pro;
        return new C9297l(i, str);
    }

    public static final int billing(int i, long j) {
        int i2 = AbstractC10549l.loadAd;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static byte[] firebase(List list) {
        C0869l c0869l = new C0869l();
        for (String str : subs(list)) {
            c0869l.m709instanceof(str.length());
            c0869l.m718l(str);
        }
        return c0869l.m725package(c0869l.f2526l);
    }

    public static C12923l smaato(C6956l c6956l) {
        View view = (View) c6956l.isPro(AbstractC1242l.billing);
        C12923l c12923lVip = vip(view);
        boolean zAdmob = c6956l.admob(c12923lVip) | c6956l.admob(view);
        Object objM2132native = c6956l.m2132native();
        if (zAdmob || objM2132native == C1867l.yandex) {
            objM2132native = new C15575l(c12923lVip, view, 13);
            c6956l.m2147try(objM2132native);
        }
        AbstractC12311l.loadAd(c12923lVip, (Function1) objM2132native, c6956l);
        return c12923lVip;
    }

    public static long startapp(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static ArrayList subs(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC9199l) obj) != EnumC9199l.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC9199l) it.next()).f18918l);
        }
        return arrayList2;
    }

    public static C12923l vip(View view) {
        C12923l c12923l;
        WeakHashMap weakHashMap = C12923l.pro;
        synchronized (weakHashMap) {
            try {
                Object c12923l2 = weakHashMap.get(view);
                if (c12923l2 == null) {
                    c12923l2 = new C12923l(view);
                    weakHashMap.put(view, c12923l2);
                }
                c12923l = (C12923l) c12923l2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12923l;
    }

    public static final C8815l yandex(String str, String str2, String str3, String str4) {
        ArrayList arrayList = AbstractC8899l.yandex;
        return new C8815l(str, C3498l.purchase(str2), str3, str4);
    }

    @Override // defpackage.InterfaceC6632l
    public C15683l crashlytics(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l isPro(InterfaceC1388l interfaceC1388l, C3806l c3806l) {
        return new C16482l();
    }

    @Override // defpackage.InterfaceC6632l
    public boolean loadAd(Class cls) {
        return false;
    }

    @Override // defpackage.InterfaceC14257l
    public C15380l metrica(Context context, String str, InterfaceC6481l interfaceC6481l) {
        C15380l c15380l = new C15380l();
        int iSubs = interfaceC6481l.subs(context, str);
        c15380l.loadAd = iSubs;
        if (iSubs != 0) {
            c15380l.amazon = -1;
            return c15380l;
        }
        int iBilling = interfaceC6481l.billing(context, str, true);
        c15380l.crashlytics = iBilling;
        if (iBilling != 0) {
            c15380l.amazon = 1;
        }
        return c15380l;
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l mopub(Class cls, C3806l c3806l) {
        purchase(cls);
        throw null;
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l purchase(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return new C13772l(0);
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f14174l) {
            case 16:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.gbraid_campaign.campaign_params_triggering_info_update", 4, "gclid,gbraid,gad_campaignid").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(600000L, 51, "measurement.sgtm.upload.retry_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(3600000L, 65, "measurement.upload.interval").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(200L, 22, "measurement.audience.filter_result_max_count").get()).longValue());
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(7200000L, 62, "measurement.redaction.app_instance_id.ttl").get();
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(90L, 55, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            default:
                List list7 = AbstractC5981l.yandex;
                return (Boolean) C18055l.yandex.get();
        }
    }

    public /* synthetic */ C6760l(int i) {
        this.f14174l = i;
    }
}
