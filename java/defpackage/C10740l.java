package defpackage;

import android.R;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10740l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21748l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21749l;

    public /* synthetic */ C10740l(int i, Object obj) {
        this.f21749l = i;
        this.f21748l = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0;
        int iM3314case;
        C8195l c8195l;
        C8195l c8195l2;
        int i = this.f21749l;
        Object obj = this.f21748l;
        switch (i) {
            case 0:
                C1254l c1254l = (C1254l) obj;
                float fAdmob = c1254l.f3286l.admob();
                int iAdmob = c1254l.f3285l.admob();
                return Float.valueOf(fAdmob / (iAdmob >= 1 ? iAdmob : 1));
            case 1:
                C11625l c11625l = (C11625l) obj;
                if (!((Boolean) c11625l.isPro.getValue()).booleanValue() && (function0 = c11625l.crashlytics) != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                return new C8288l(((C3020l) obj).yandex, R.style.Theme.DeviceDefault.DayNight);
            case 3:
                C2169l c2169l = (C2169l) obj;
                AbstractC9092l.loadAd(c2169l.isVip(), new C13099l((InterfaceC13238l) c2169l.f4812l.getValue()), new C13305l(null, 0L, null, false, false, true, 95));
                return Unit.INSTANCE;
            case 4:
                C16042l c16042l = (C16042l) obj;
                AbstractC9092l.loadAd(c16042l.isVip(), new C13099l((InterfaceC13238l) c16042l.f31434l.getValue()), new C13305l(null, 0L, null, false, false, true, 95));
                return Unit.INSTANCE;
            case 5:
                ((InterfaceC11791l) obj).yandex();
                return Unit.INSTANCE;
            case 6:
                return (C18480l) obj;
            case 7:
                return (C6109l) ((C13177l) obj).yandex.purchase.getValue();
            case 8:
                return Integer.valueOf(((AbstractC7095l) ((C6678l) obj).yandex).pro());
            case 9:
                return "Unexpected end of input: yet to parse ".concat(((C6994l) obj).loadAd());
            case 10:
                InterfaceC4944l interfaceC4944l = (InterfaceC4944l) ((C11749l) obj).f23530l.getValue();
                C9424l c9424l = interfaceC4944l instanceof C9424l ? (C9424l) interfaceC4944l : null;
                return Integer.valueOf(c9424l != null ? c9424l.yandex.size() : 0);
            case 11:
                long ptr$cinterop_release = ((C14649l) obj).f28664l.getPtr$cinterop_release();
                int i2 = AbstractC9795l.yandex;
                return new LongPointerWrapper(realmcJNI.realm_query_find_all(ptr$cinterop_release), false, 2, null);
            case 12:
                return ((AbstractC16869l) ((AbstractC8870l) obj)).purchase();
            case 13:
                return new C11376l((C11610l) obj);
            case 14:
                return new C4912l((C16390l) obj);
            case 15:
                ((C9270l) obj).m4125private(new C7650l());
                return Unit.INSTANCE;
            case 16:
                ((C5803l) obj).subs.subscription("");
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C8583l) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC2812l.tapsense(new StringBuilder("Unexpected end of input: yet to parse '"), ((C15699l) obj).yandex, '\'');
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18225l c18225l = (C18225l) obj;
                return new C17225l(AbstractC16814l.amazon("kotlinx.serialization.Polymorphic", C0196l.amazon, new InterfaceC18035l[0], new C8250l(22, c18225l)), c18225l.yandex);
            case 20:
                ((C15435l) obj).getClass();
                return UUID.randomUUID().toString();
            case 21:
                C10530l c10530l = (C10530l) obj;
                c10530l.f21423l.invoke();
                c10530l.purchase();
                return Unit.INSTANCE;
            case 22:
                return Float.valueOf(((InterfaceC6477l) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case 23:
                return (C5765l) obj;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C1008l c1008l = ((C1253l) obj).f3284l;
                c1008l.getClass();
                c1008l.remoteconfig(null, "");
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                List listAdvert = ((C12369l) obj).yandex.yandex().advert("Cookie");
                if (listAdvert == null) {
                    return C14054l.f27396l;
                }
                HashMap map = new HashMap(listAdvert.size());
                Iterator it = listAdvert.iterator();
                while (it.hasNext()) {
                    map.putAll(AbstractC5754l.yandex((String) it.next(), true));
                }
                return map;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C18131l c18131l = (C18131l) obj;
                ClassLoader classLoader = c18131l.f35442l;
                AbstractC5921l abstractC5921l = c18131l.f35444l;
                ArrayList<URL> list = Collections.list(classLoader.getResources(""));
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    if (AbstractC8576l.yandex(url.getProtocol(), "file")) {
                        String str = C14025l.f27330l;
                        c8195l2 = new C8195l(abstractC5921l, C6162l.ads(new File(url.toURI())));
                    } else {
                        c8195l2 = null;
                    }
                    if (c8195l2 != null) {
                        arrayList.add(c8195l2);
                    }
                }
                ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String string = ((URL) it2.next()).toString();
                    if (AbstractC16648l.isVip(string, "jar:file:", false) && (iM3314case = AbstractC12024l.m3314case(0, 6, string, "!")) != -1) {
                        String str2 = C14025l.f27330l;
                        c8195l = new C8195l(AbstractC13628l.admob(C6162l.ads(new File(URI.create(string.substring(4, iM3314case)))), abstractC5921l, new C9673l(29)), C18131l.f35441l);
                    } else {
                        c8195l = null;
                    }
                    if (c8195l != null) {
                        arrayList2.add(c8195l);
                    }
                }
                return AbstractC16901l.m4232new(arrayList, arrayList2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C13161l((C0869l) ((InterfaceC1220l) ((C1080l) obj).f2971l).getValue());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4543l c4543l = (C4543l) obj;
                C6928l c6928l = InterfaceC14665l.loadAd;
                C10954l c10954l = new C10954l(13);
                c10954l.m233l(c4543l.f9184l.getParameters());
                c4543l.f9186l.isVip(new C3403l(c10954l, 1));
                return c10954l.build();
            default:
                C15543l c15543l = (C15543l) obj;
                InterfaceC10315l interfaceC10315l = c15543l.f30378l;
                Object obj2 = c15543l.f30380l;
                if (obj2 != null) {
                    return interfaceC10315l.subs(c15543l, obj2);
                }
                C8339l.metrica("Value should be initialized");
                return null;
        }
    }
}
