package defpackage;

import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٌٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15575l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f30417l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30418l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30419l;

    public /* synthetic */ C15575l(Object obj, C6523l c6523l, int i) {
        this.f30419l = i;
        this.f30417l = obj;
        this.f30418l = c6523l;
    }

    private final Object yandex(Object obj) {
        C15252l c15252l = (C15252l) this.f30418l;
        C14750l c14750l = (C14750l) this.f30417l;
        synchronized (c15252l.firebase) {
            c15252l.pro.remove(c14750l);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = 4;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 11;
        int i3 = 6;
        int i4 = 3;
        int i5 = 2;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        int i6 = 1;
        switch (this.f30419l) {
            case 0:
                C6523l c6523l = (C6523l) this.f30418l;
                C17723l c17723l = (C17723l) this.f30417l;
                InterfaceC6442l interfaceC6442l = (InterfaceC6442l) obj;
                c6523l.crashlytics();
                if (interfaceC6442l instanceof C17043l) {
                    Function1 function1 = c17723l.crashlytics;
                    C17043l c17043l = (C17043l) interfaceC6442l;
                    int i7 = c17043l.crashlytics;
                    long j = c17043l.amazon;
                    String str = c17043l.purchase;
                    String str2 = c17043l.yandex;
                    String str3 = c17043l.billing;
                    if (str3 == null) {
                        str3 = "";
                    }
                    function1.invoke(new C0523l(i7, c17043l.loadAd, j, str, str2, str3));
                } else {
                    ((C11362l) c17723l.mopub.f29441l).add(0, new C5726l(new C17570l("New event"), new C17570l(interfaceC6442l.toString())));
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f30417l;
                C6523l c6523l2 = (C6523l) this.f30418l;
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) interfaceC12244l.getValue();
                int i8 = 25;
                ((C1336l) obj).firebase(((AbstractC7095l) interfaceC13238l).pro(), new C3768l(new C14813l(b3 == true ? 1 : 0, i8), interfaceC13238l, 29), new C5640l(interfaceC13238l, i8, b2 == true ? 1 : 0), new C15578l(2039820996, true, new C11074l(interfaceC13238l, c6523l2, i3)));
                return Unit.INSTANCE;
            case 2:
                ((C6523l) this.f30418l).crashlytics();
                ((Function1) this.f30417l).invoke((InterfaceC6442l) obj);
                return Unit.INSTANCE;
            case 3:
                C11047l c11047l = (C11047l) this.f30417l;
                C6523l c6523l3 = (C6523l) this.f30418l;
                InterfaceC13238l interfaceC13238l2 = c11047l.yandex;
                ((C1336l) obj).firebase(((AbstractC7095l) interfaceC13238l2).pro(), new C6982l(new C14813l(b6 == true ? 1 : 0, 26), interfaceC13238l2, b5 == true ? 1 : 0), new C1178l(3, interfaceC13238l2), new C15578l(2039820996, true, new C17859l(interfaceC13238l2, c6523l3, b4 == true ? 1 : 0)));
                return Unit.INSTANCE;
            case 4:
                C8856l c8856l = (C8856l) this.f30417l;
                C6523l c6523l4 = (C6523l) this.f30418l;
                InterfaceC13238l interfaceC13238l3 = c8856l.yandex;
                ((C13964l) obj).isPro(((AbstractC7095l) interfaceC13238l3).pro(), new C6982l(new C14813l(b, 27), interfaceC13238l3, i6), new C1178l(4, interfaceC13238l3), new C15578l(-1942245546, true, new C17859l(interfaceC13238l3, c6523l4, i6)));
                return Unit.INSTANCE;
            case 5:
                C18396l c18396l = (C18396l) this.f30418l;
                C16627l c16627l = (C16627l) this.f30417l;
                InterfaceC16115l interfaceC16115l = (InterfaceC16115l) obj;
                synchronized (((C14529l) c18396l.f35934l)) {
                    try {
                        boolean zYandex = interfaceC16115l.yandex();
                        C1579l c1579l = (C1579l) c18396l.f35933l;
                        if (zYandex) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                C2603l c2603l = (C2603l) this.f30418l;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f30417l;
                c2603l.f5664l.setValue(EnumC13633l.f26661l);
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C0932l(c2603l, (C12885l) obj, interfaceC14029l, i3), 3);
                return Unit.INSTANCE;
            case 7:
                C2603l c2603l2 = (C2603l) this.f30418l;
                Function1 function2 = (Function1) this.f30417l;
                C11362l c11362l = c2603l2.f5665l;
                ((C1336l) obj).firebase(c11362l.size(), null, new C1178l(7, c11362l), new C15578l(2039820996, true, new C3127l(c11362l, function2, c2603l2, i2)));
                return Unit.INSTANCE;
            case 8:
                C0113l c0113l = (C0113l) this.f30418l;
                AbstractC14165l abstractC14165l = (AbstractC14165l) this.f30417l;
                List list = (List) c0113l.f1019l.getValue();
                ((C1336l) obj).firebase(list.size(), null, new C1178l(8, list), new C15578l(802480018, true, new C3127l(list, c0113l, abstractC14165l, 12)));
                return Unit.INSTANCE;
            case 9:
                C2643l c2643l = (C2643l) this.f30418l;
                Function1 function3 = (Function1) this.f30417l;
                ((Long) obj).getClass();
                float f = c2643l.purchase;
                c2643l.purchase = 0.0f;
                function3.invoke(Float.valueOf(f));
                return Unit.INSTANCE;
            case 10:
                return yandex(obj);
            case 11:
                ((Function1) ((C8195l) this.f30418l).f17097l).invoke(((C0858l) this.f30417l).f2514l);
                ((C4456l) obj).purchase();
                return Unit.INSTANCE;
            case 12:
                String str4 = (String) this.f30418l;
                List list2 = (List) this.f30417l;
                C3918l c3918l = (C3918l) obj;
                C15825l c15825lCrashlytics = c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "albumFullId == $0", Arrays.copyOf(new Object[]{str4}, 1)).crashlytics();
                Iterator it = c15825lCrashlytics.iterator();
                while (it.hasNext()) {
                    String strPremium = ((CachedTrack) it.next()).premium();
                    if (strPremium != null) {
                        list2.add(strPremium);
                    }
                }
                c3918l.m1451l(c15825lCrashlytics);
                c3918l.m1451l(c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedAlbum.class), "uid == $0", Arrays.copyOf(new Object[]{str4}, 1)).crashlytics());
                return Unit.INSTANCE;
            case 13:
                C12923l c12923l = (C12923l) this.f30418l;
                View view = (View) this.f30417l;
                c12923l.yandex(view);
                return new C18616l(c12923l, view, i2);
            case 14:
                ((C10154l) this.f30418l).loadAd.subs((InterfaceC0684l) obj, (C17063l) this.f30417l);
                return Unit.INSTANCE;
            case 15:
                EnumC9176l enumC9176l = (EnumC9176l) this.f30418l;
                String str5 = (String) this.f30417l;
                InterfaceC0684l interfaceC0684l = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("UPDATE workspec SET state=? WHERE id=?");
                try {
                    interfaceC14742lMo668l.firebase(1, AbstractC11748l.smaato(enumC9176l));
                    interfaceC14742lMo668l.mo824final(2, str5);
                    interfaceC14742lMo668l.mo827l();
                    return Integer.valueOf(AbstractC16837l.crashlytics(interfaceC0684l));
                } finally {
                    interfaceC14742lMo668l.close();
                }
            case 16:
                String str6 = (String) this.f30418l;
                C9280l c9280l = (C9280l) this.f30417l;
                InterfaceC0684l interfaceC0684l2 = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l2 = interfaceC0684l2.mo668l("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC14742lMo668l2.mo824final(1, str6);
                    C11154l c11154l = new C11154l(0);
                    C11154l c11154l2 = new C11154l(0);
                    while (interfaceC14742lMo668l2.mo827l()) {
                        String strMo826implements = interfaceC14742lMo668l2.mo826implements(0);
                        if (!c11154l.containsKey(strMo826implements)) {
                            c11154l.put(strMo826implements, new ArrayList());
                        }
                        String strMo826implements2 = interfaceC14742lMo668l2.mo826implements(0);
                        if (!c11154l2.containsKey(strMo826implements2)) {
                            c11154l2.put(strMo826implements2, new ArrayList());
                        }
                    }
                    interfaceC14742lMo668l2.reset();
                    c9280l.loadAd(interfaceC0684l2, c11154l);
                    c9280l.yandex(interfaceC0684l2, c11154l2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC14742lMo668l2.mo827l()) {
                        String strMo826implements3 = interfaceC14742lMo668l2.mo826implements(0);
                        EnumC9176l enumC9176lAdmob = AbstractC11748l.admob((int) interfaceC14742lMo668l2.getLong(1));
                        byte[] blob = interfaceC14742lMo668l2.getBlob(i5);
                        C4279l c4279l = C4279l.loadAd;
                        arrayList.add(new C7242l(strMo826implements3, enumC9176lAdmob, AbstractC7280l.loadAd(blob), interfaceC14742lMo668l2.getLong(14), interfaceC14742lMo668l2.getLong(15), interfaceC14742lMo668l2.getLong(16), new C13152l(AbstractC11748l.remoteconfig(interfaceC14742lMo668l2.getBlob(6)), AbstractC11748l.billing((int) interfaceC14742lMo668l2.getLong(5)), ((int) interfaceC14742lMo668l2.getLong(7)) != 0, ((int) interfaceC14742lMo668l2.getLong(8)) != 0, ((int) interfaceC14742lMo668l2.getLong(9)) != 0, ((int) interfaceC14742lMo668l2.getLong(10)) != 0, interfaceC14742lMo668l2.getLong(11), interfaceC14742lMo668l2.getLong(12), AbstractC11748l.yandex(interfaceC14742lMo668l2.getBlob(13))), (int) interfaceC14742lMo668l2.getLong(i4), AbstractC11748l.purchase((int) interfaceC14742lMo668l2.getLong(17)), interfaceC14742lMo668l2.getLong(18), interfaceC14742lMo668l2.getLong(19), (int) interfaceC14742lMo668l2.getLong(20), (int) interfaceC14742lMo668l2.getLong(i), interfaceC14742lMo668l2.getLong(21), (int) interfaceC14742lMo668l2.getLong(22), (List) AbstractC8676l.smaato(interfaceC14742lMo668l2.mo826implements(0), c11154l), (List) AbstractC8676l.smaato(interfaceC14742lMo668l2.mo826implements(0), c11154l2)));
                        i = 4;
                        i4 = 3;
                        i5 = 2;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC14742lMo668l2.close();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C4279l c4279l2 = (C4279l) this.f30418l;
                String str7 = (String) this.f30417l;
                InterfaceC14742l interfaceC14742lMo668l3 = ((InterfaceC0684l) obj).mo668l("UPDATE workspec SET output=? WHERE id=?");
                try {
                    C4279l c4279l3 = C4279l.loadAd;
                    interfaceC14742lMo668l3.smaato(1, AbstractC7280l.admob(c4279l2));
                    interfaceC14742lMo668l3.mo824final(2, str7);
                    interfaceC14742lMo668l3.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l3.close();
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C9280l) this.f30418l).loadAd.subs((InterfaceC0684l) obj, (C7718l) this.f30417l);
                return Unit.INSTANCE;
            default:
                ((C0480l) this.f30418l).loadAd.subs((InterfaceC0684l) obj, (C0854l) this.f30417l);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C15575l(Object obj, Object obj2, int i) {
        this.f30419l = i;
        this.f30418l = obj;
        this.f30417l = obj2;
    }
}
