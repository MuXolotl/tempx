package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lؙۧۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6908l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f14487l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14488l;

    public /* synthetic */ C6908l(String str, String str2) {
        this.f14488l = 17;
        this.f14487l = str;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        C7718l c7718l;
        EnumC9176l enumC9176lAdmob;
        int i = this.f14488l;
        String str = this.f14487l;
        switch (i) {
            case 0:
                ((C1932l) obj).yandex = str;
                return Unit.INSTANCE;
            case 1:
                CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC11356l.loadAd(((C3918l) obj).m1449l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{str}, 1)));
                if (cachedPlaylist == null) {
                    return null;
                }
                cachedPlaylist.m4598final(false);
                return Unit.INSTANCE;
            case 2:
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                AbstractC3668l.isPro(interfaceC17593l, 1);
                AbstractC3668l.firebase(interfaceC17593l, str);
                return Unit.INSTANCE;
            case 3:
                AbstractC3668l.mopub((InterfaceC17593l) obj, str);
                return Unit.INSTANCE;
            case 4:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                AbstractC3668l.firebase(interfaceC17593l2, str);
                C4707l c4707l = AbstractC0424l.Signature;
                InterfaceC13922l interfaceC13922l = AbstractC3668l.yandex[11];
                interfaceC17593l2.amazon(c4707l, Float.valueOf(0.0f));
                return Unit.INSTANCE;
            case 5:
                return Boolean.valueOf(AbstractC8576l.yandex(((C8195l) obj).f17098l, str));
            case 6:
                String strConcat = (String) obj;
                if (!AbstractC16648l.isVip(strConcat, "http", false)) {
                    strConcat = str.substring(0, AbstractC12024l.m3343switch(str, '/', 0, 6) + 1).concat(strConcat);
                }
                C13170l c13170l = new C13170l();
                c13170l.isPro(null, strConcat);
                return c13170l.crashlytics();
            case 7:
                AbstractC3668l.firebase((InterfaceC17593l) obj, str);
                return Unit.INSTANCE;
            case 8:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    interfaceC14742lMo668l.mo824final(1, str);
                    return Boolean.valueOf(interfaceC14742lMo668l.mo827l() && ((int) interfaceC14742lMo668l.getLong(0)) != 0);
                } finally {
                    interfaceC14742lMo668l.close();
                }
            case 9:
                InterfaceC14742l interfaceC14742lMo668l2 = ((InterfaceC0684l) obj).mo668l("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    interfaceC14742lMo668l2.mo824final(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC14742lMo668l2.mo827l()) {
                        arrayList.add(interfaceC14742lMo668l2.mo826implements(0));
                    }
                    interfaceC14742lMo668l2.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC14742lMo668l2.close();
                    throw th;
                }
            case 10:
                InterfaceC14742l interfaceC14742lMo668l3 = ((InterfaceC0684l) obj).mo668l("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    interfaceC14742lMo668l3.mo824final(1, str);
                    return Boolean.valueOf(interfaceC14742lMo668l3.mo827l() && ((int) interfaceC14742lMo668l3.getLong(0)) != 0);
                } finally {
                    interfaceC14742lMo668l3.close();
                }
            case 11:
                InterfaceC17593l interfaceC17593l3 = (InterfaceC17593l) obj;
                AbstractC3668l.mopub(interfaceC17593l3, str);
                AbstractC3668l.remoteconfig(interfaceC17593l3, 5);
                return Unit.INSTANCE;
            case 12:
                ((C9336l) obj).yandex.put(AbstractC5548l.yandex, Collections.singletonList(str));
                return Unit.INSTANCE;
            case 13:
                C3694l.amazon.remove(str);
                return Unit.INSTANCE;
            case 14:
                return Boolean.valueOf(AbstractC8576l.yandex(((Catalog2Block) obj).getYandex(), str));
            case 15:
                AbstractC3668l.mopub((InterfaceC17593l) obj, str);
                return Unit.INSTANCE;
            case 16:
                InterfaceC14742l interfaceC14742lMo668l4 = ((InterfaceC0684l) obj).mo668l("SELECT long_value FROM Preference where `key`=?");
                try {
                    interfaceC14742lMo668l4.mo824final(1, str);
                    if (interfaceC14742lMo668l4.mo827l() && !interfaceC14742lMo668l4.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC14742lMo668l4.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    interfaceC14742lMo668l4.close();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC3668l.mopub((InterfaceC17593l) obj, str);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10754l c10754l = C7718l.isVip;
                C9280l c9280lSignature = ((WorkDatabase) obj).Signature();
                return (List) c10754l.mo1368apply((List) AbstractC2021l.purchase(c9280lSignature.yandex, true, true, new C15575l(str, c9280lSignature, 16)));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                String str2 = (String) obj;
                if (AbstractC12024l.m3315catch(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case 20:
                InterfaceC14742l interfaceC14742lMo668l5 = ((InterfaceC0684l) obj).mo668l("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    interfaceC14742lMo668l5.mo824final(1, str);
                    interfaceC14742lMo668l5.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l5.close();
                }
            case 21:
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                ((InterfaceC17593l) obj).amazon(AbstractC0424l.f1550throw, str);
                return Unit.INSTANCE;
            case 22:
                InterfaceC17593l interfaceC17593l4 = (InterfaceC17593l) obj;
                AbstractC3668l.isPro(interfaceC17593l4, 1);
                AbstractC3668l.firebase(interfaceC17593l4, str);
                return Unit.INSTANCE;
            case 23:
                InterfaceC14742l interfaceC14742lMo668l6 = ((InterfaceC0684l) obj).mo668l("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    interfaceC14742lMo668l6.mo824final(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC14742lMo668l6.mo827l()) {
                        arrayList2.add(interfaceC14742lMo668l6.mo826implements(0));
                    }
                    interfaceC14742lMo668l6.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    interfaceC14742lMo668l6.close();
                    throw th2;
                }
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC14742l interfaceC14742lMo668l7 = ((InterfaceC0684l) obj).mo668l("DELETE from WorkProgress where work_spec_id=?");
                try {
                    interfaceC14742lMo668l7.mo824final(1, str);
                    interfaceC14742lMo668l7.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l7.close();
                }
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC14742l interfaceC14742lMo668l8 = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE id=?");
                try {
                    interfaceC14742lMo668l8.mo824final(1, str);
                    int iCrashlytics = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "id");
                    int iCrashlytics2 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "state");
                    int iCrashlytics3 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "worker_class_name");
                    int iCrashlytics4 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "input_merger_class_name");
                    int iCrashlytics5 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "input");
                    int iCrashlytics6 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "output");
                    int iCrashlytics7 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "initial_delay");
                    int iCrashlytics8 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "interval_duration");
                    int iCrashlytics9 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "flex_duration");
                    int iCrashlytics10 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "run_attempt_count");
                    int iCrashlytics11 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "backoff_policy");
                    int iCrashlytics12 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "backoff_delay_duration");
                    int iCrashlytics13 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "last_enqueue_time");
                    int iCrashlytics14 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "minimum_retention_duration");
                    int iCrashlytics15 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "schedule_requested_at");
                    int iCrashlytics16 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "run_in_foreground");
                    int iCrashlytics17 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "out_of_quota_policy");
                    int iCrashlytics18 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "period_count");
                    int iCrashlytics19 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "generation");
                    int iCrashlytics20 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "next_schedule_time_override");
                    int iCrashlytics21 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "next_schedule_time_override_generation");
                    int iCrashlytics22 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "stop_reason");
                    int iCrashlytics23 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "trace_tag");
                    int iCrashlytics24 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "backoff_on_system_interruptions");
                    int iCrashlytics25 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "required_network_type");
                    int iCrashlytics26 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "required_network_request");
                    int iCrashlytics27 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "requires_charging");
                    int iCrashlytics28 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "requires_device_idle");
                    int iCrashlytics29 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "requires_battery_not_low");
                    int iCrashlytics30 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "requires_storage_not_low");
                    int iCrashlytics31 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "trigger_content_update_delay");
                    int iCrashlytics32 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "trigger_max_content_delay");
                    int iCrashlytics33 = AbstractC8513l.crashlytics(interfaceC14742lMo668l8, "content_uri_triggers");
                    if (interfaceC14742lMo668l8.mo827l()) {
                        String strMo826implements = interfaceC14742lMo668l8.mo826implements(iCrashlytics);
                        EnumC9176l enumC9176lAdmob2 = AbstractC11748l.admob((int) interfaceC14742lMo668l8.getLong(iCrashlytics2));
                        String strMo826implements2 = interfaceC14742lMo668l8.mo826implements(iCrashlytics3);
                        String strMo826implements3 = interfaceC14742lMo668l8.mo826implements(iCrashlytics4);
                        byte[] blob = interfaceC14742lMo668l8.getBlob(iCrashlytics5);
                        C4279l c4279l = C4279l.loadAd;
                        C4279l c4279lLoadAd = AbstractC7280l.loadAd(blob);
                        C4279l c4279lLoadAd2 = AbstractC7280l.loadAd(interfaceC14742lMo668l8.getBlob(iCrashlytics6));
                        long j = interfaceC14742lMo668l8.getLong(iCrashlytics7);
                        long j2 = interfaceC14742lMo668l8.getLong(iCrashlytics8);
                        long j3 = interfaceC14742lMo668l8.getLong(iCrashlytics9);
                        int i2 = (int) interfaceC14742lMo668l8.getLong(iCrashlytics10);
                        int iPurchase = AbstractC11748l.purchase((int) interfaceC14742lMo668l8.getLong(iCrashlytics11));
                        long j4 = interfaceC14742lMo668l8.getLong(iCrashlytics12);
                        long j5 = interfaceC14742lMo668l8.getLong(iCrashlytics13);
                        long j6 = interfaceC14742lMo668l8.getLong(iCrashlytics14);
                        long j7 = interfaceC14742lMo668l8.getLong(iCrashlytics15);
                        boolean z = ((int) interfaceC14742lMo668l8.getLong(iCrashlytics16)) != 0;
                        int iMopub = AbstractC11748l.mopub((int) interfaceC14742lMo668l8.getLong(iCrashlytics17));
                        int i3 = (int) interfaceC14742lMo668l8.getLong(iCrashlytics18);
                        int i4 = (int) interfaceC14742lMo668l8.getLong(iCrashlytics19);
                        long j8 = interfaceC14742lMo668l8.getLong(iCrashlytics20);
                        int i5 = (int) interfaceC14742lMo668l8.getLong(iCrashlytics21);
                        int i6 = (int) interfaceC14742lMo668l8.getLong(iCrashlytics22);
                        String strMo826implements4 = interfaceC14742lMo668l8.isNull(iCrashlytics23) ? null : interfaceC14742lMo668l8.mo826implements(iCrashlytics23);
                        Integer numValueOf = interfaceC14742lMo668l8.isNull(iCrashlytics24) ? null : Integer.valueOf((int) interfaceC14742lMo668l8.getLong(iCrashlytics24));
                        c7718l = new C7718l(strMo826implements, enumC9176lAdmob2, strMo826implements2, strMo826implements3, c4279lLoadAd, c4279lLoadAd2, j, j2, j3, new C13152l(AbstractC11748l.remoteconfig(interfaceC14742lMo668l8.getBlob(iCrashlytics26)), AbstractC11748l.billing((int) interfaceC14742lMo668l8.getLong(iCrashlytics25)), ((int) interfaceC14742lMo668l8.getLong(iCrashlytics27)) != 0, ((int) interfaceC14742lMo668l8.getLong(iCrashlytics28)) != 0, ((int) interfaceC14742lMo668l8.getLong(iCrashlytics29)) != 0, ((int) interfaceC14742lMo668l8.getLong(iCrashlytics30)) != 0, interfaceC14742lMo668l8.getLong(iCrashlytics31), interfaceC14742lMo668l8.getLong(iCrashlytics32), AbstractC11748l.yandex(interfaceC14742lMo668l8.getBlob(iCrashlytics33))), i2, iPurchase, j4, j5, j6, j7, z, iMopub, i3, i4, j8, i5, i6, strMo826implements4, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        c7718l = null;
                    }
                    return c7718l;
                } finally {
                    interfaceC14742lMo668l8.close();
                }
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC14742l interfaceC14742lMo668l9 = ((InterfaceC0684l) obj).mo668l("SELECT state FROM workspec WHERE id=?");
                try {
                    interfaceC14742lMo668l9.mo824final(1, str);
                    if (interfaceC14742lMo668l9.mo827l()) {
                        Integer numValueOf2 = interfaceC14742lMo668l9.isNull(0) ? null : Integer.valueOf((int) interfaceC14742lMo668l9.getLong(0));
                        if (numValueOf2 != null) {
                            enumC9176lAdmob = AbstractC11748l.admob(numValueOf2.intValue());
                        } else {
                            enumC9176lAdmob = null;
                        }
                        break;
                    } else {
                        enumC9176lAdmob = null;
                    }
                    return enumC9176lAdmob;
                } finally {
                    interfaceC14742lMo668l9.close();
                }
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC14742l interfaceC14742lMo668l10 = ((InterfaceC0684l) obj).mo668l("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC14742lMo668l10.mo824final(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC14742lMo668l10.mo827l()) {
                        arrayList3.add(interfaceC14742lMo668l10.mo826implements(0));
                    }
                    interfaceC14742lMo668l10.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    interfaceC14742lMo668l10.close();
                    throw th3;
                }
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC0684l interfaceC0684l = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l11 = interfaceC0684l.mo668l("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    interfaceC14742lMo668l11.mo824final(1, str);
                    interfaceC14742lMo668l11.mo827l();
                    return Integer.valueOf(AbstractC16837l.crashlytics(interfaceC0684l));
                } finally {
                    interfaceC14742lMo668l11.close();
                }
            default:
                InterfaceC0684l interfaceC0684l2 = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l12 = interfaceC0684l2.mo668l("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    interfaceC14742lMo668l12.mo824final(1, str);
                    interfaceC14742lMo668l12.mo827l();
                    return Integer.valueOf(AbstractC16837l.crashlytics(interfaceC0684l2));
                } finally {
                    interfaceC14742lMo668l12.close();
                }
        }
    }

    public /* synthetic */ C6908l(String str, int i) {
        this.f14488l = i;
        this.f14487l = str;
    }
}
