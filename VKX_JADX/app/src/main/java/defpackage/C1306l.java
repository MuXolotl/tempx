package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.MyPackageReplacedReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lؒۙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1306l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3398l;

    public /* synthetic */ C1306l(AbstractC11411l abstractC11411l) {
        this.f3398l = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13074l c13074l;
        C13074l c13074l2;
        InterfaceC12001l interfaceC12001lBilling;
        InterfaceC12001l interfaceC12001lBilling2;
        int i = 8;
        InterfaceC12001l interfaceC12001l = null;
        int i2 = 1;
        switch (this.f3398l) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object value = entry.getValue();
                return AbstractC9361l.ad(new StringBuilder("  "), ((C16033l) entry.getKey()).yandex, " = ", value instanceof byte[] ? AbstractC8669l.m2397case((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 1:
                C14354l c14354l = (C14354l) obj;
                int i3 = MyPackageReplacedReceiver.yandex;
                C12807l c12807l = (C12807l) C12807l.vip().yandex();
                c14354l.crashlytics();
                C11208l.subscription((C11208l) c14354l.f16394l, c12807l);
                return Unit.INSTANCE;
            case 2:
                throw null;
            case 3:
                int i4 = NextDockView.f36847l;
                return Boolean.TRUE;
            case 4:
                C11029l c11029l = ((C1397l) obj).yandex;
                if (c11029l != null) {
                    c11029l.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 6:
                InterfaceC9708l interfaceC9708l = (InterfaceC9708l) obj;
                if ((interfaceC9708l instanceof C0032l) || !interfaceC9708l.loadAd().admob(new C1306l(7))) {
                    return interfaceC9708l;
                }
                ArrayList<InterfaceC12001l> arrayList = new ArrayList();
                ArrayList<InterfaceC12001l> arrayList2 = new ArrayList();
                InterfaceC12001l interfaceC12001lLoadAd = interfaceC9708l.loadAd();
                boolean zAdmob = interfaceC12001lLoadAd.admob(C1490l.f3717l);
                InterfaceC12001l interfaceC12001l2 = C9885l.yandex;
                C8195l c8195l = zAdmob ? (C8195l) interfaceC12001lLoadAd.purchase(new C8195l(null, interfaceC12001l2), C15460l.f30238l) : new C8195l(null, interfaceC12001lLoadAd);
                InterfaceC15267l interfaceC15267l = (InterfaceC15267l) c8195l.f17098l;
                InterfaceC12001l interfaceC12001l3 = (InterfaceC12001l) c8195l.f17097l;
                if (interfaceC15267l == null) {
                    c13074l = null;
                } else if (interfaceC15267l instanceof C3203l) {
                    c13074l = new C13074l();
                    c13074l.yandex = AbstractC5573l.purchase(interfaceC12001l2);
                    C3203l c3203l = (C3203l) interfaceC15267l;
                    c13074l.loadAd = c3203l.yandex;
                    c13074l.purchase = 1;
                    c13074l.crashlytics = c3203l.loadAd.yandex;
                    c13074l.amazon = null;
                } else {
                    if (!(interfaceC15267l instanceof C9768l)) {
                        C18725l.billing();
                        return null;
                    }
                    arrayList2.add(interfaceC15267l);
                    c13074l = null;
                }
                if (((Number) interfaceC12001l3.purchase(0, new C8163l(false ? 1 : 0))).intValue() > 1) {
                    Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                C8195l c8195l2 = interfaceC12001l3.admob(C1490l.f3733l) ? (C8195l) interfaceC12001l3.purchase(new C8195l(null, interfaceC12001l2), C15460l.f30243l) : new C8195l(null, interfaceC12001l3);
                C10847l c10847l = (C10847l) c8195l2.f17098l;
                InterfaceC12001l interfaceC12001l4 = (InterfaceC12001l) c8195l2.f17097l;
                arrayList.add(c10847l);
                if (c10847l != null) {
                    C7552l c7552l = new C7552l(R.drawable.glance_ripple);
                    c13074l2 = new C13074l();
                    c13074l2.yandex = AbstractC5573l.purchase(interfaceC12001l2);
                    c13074l2.loadAd = c7552l;
                } else {
                    c13074l2 = null;
                }
                C17494l c17494l = interfaceC12001l4.admob(new C1306l(i)) ? (C17494l) interfaceC12001l4.purchase(new C17494l(interfaceC12001l, 3), new C8163l(i2)) : new C17494l(interfaceC12001l4, i2);
                InterfaceC12001l interfaceC12001l5 = c17494l.yandex;
                InterfaceC12001l interfaceC12001l6 = c17494l.loadAd;
                arrayList.add(interfaceC12001l5);
                arrayList2.add(AbstractC5573l.purchase(interfaceC12001l6));
                C5500l c5500l = new C5500l();
                InterfaceC12001l interfaceC12001l7 = interfaceC12001l2;
                for (InterfaceC12001l interfaceC12001l8 : arrayList) {
                    if (interfaceC12001l8 != null && (interfaceC12001lBilling2 = interfaceC12001l7.billing(interfaceC12001l8)) != null) {
                        interfaceC12001l7 = interfaceC12001lBilling2;
                    }
                }
                c5500l.crashlytics = interfaceC12001l7;
                for (InterfaceC12001l interfaceC12001l9 : arrayList2) {
                    if (interfaceC12001l9 != null && (interfaceC12001lBilling = interfaceC12001l2.billing(interfaceC12001l9)) != null) {
                        interfaceC12001l2 = interfaceC12001lBilling;
                    }
                }
                interfaceC9708l.crashlytics(interfaceC12001l2);
                ArrayList arrayList3 = c5500l.loadAd;
                if (c13074l != null) {
                    arrayList3.add(c13074l);
                }
                arrayList3.add(interfaceC9708l);
                if (c13074l2 == null) {
                    return c5500l;
                }
                arrayList3.add(c13074l2);
                return c5500l;
            case 7:
                InterfaceC0084l interfaceC0084l = (InterfaceC0084l) obj;
                return Boolean.valueOf((interfaceC0084l instanceof C3203l) || (interfaceC0084l instanceof C10847l));
            case 8:
                InterfaceC0084l interfaceC0084l2 = (InterfaceC0084l) obj;
                return Boolean.valueOf((interfaceC0084l2 instanceof C8079l) || (interfaceC0084l2 instanceof C4538l) || (interfaceC0084l2 instanceof C14646l) || (interfaceC0084l2 instanceof C8479l));
            case 9:
                return ((AbstractC18643l) obj).getYandex();
            case 10:
                ((C6148l) obj).mopub(1);
                return Unit.INSTANCE;
            case 11:
                C3366l c3366l = (C3366l) obj;
                return c3366l.yandex(new C14938l(C1083l.license(AbstractC14055l.remoteconfig(new C9735l(C9735l.purchase), new C9735l(C9735l.isPro)), 0.0f, Float.intBitsToFloat((int) (c3366l.f7169l.admob() & 4294967295L)) * 0.55f, 8), i2));
            case 12:
                C11183l c11183l = (C11183l) obj;
                long j = C9735l.loadAd;
                if (!C9735l.crashlytics(j, c11183l.f22491l)) {
                    c11183l.f22490l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    c11183l.f22491l = j;
                }
                List listSingletonList = Collections.singletonList(new C12870l(C9735l.loadAd(0.25f, j)));
                if (!listSingletonList.equals(c11183l.f22499l)) {
                    c11183l.f22490l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    c11183l.f22499l = listSingletonList;
                }
                if (0.05f != c11183l.f22501l) {
                    c11183l.f22490l |= 64;
                    c11183l.f22501l = 0.05f;
                }
                if (!C14467l.loadAd(25.0f, c11183l.f22496l)) {
                    c11183l.f22490l |= 32;
                    c11183l.f22496l = 25.0f;
                }
                InterfaceC16339l interfaceC16339l = c11183l.f22483l;
                C18501l c18501l = C18501l.yandex;
                if (!c18501l.equals(interfaceC16339l)) {
                    c11183l.f22483l = c18501l;
                    c11183l.f22490l |= 2;
                }
                if (true != c11183l.f22489l) {
                    c11183l.f22489l = true;
                    c11183l.f22490l |= 1;
                }
                c11183l.f22502l = true;
                return Unit.INSTANCE;
            case 13:
                throw AbstractC12589l.signatures(obj);
            case 14:
                C10094l c10094l = (C10094l) obj;
                c10094l.subs = false;
                c10094l.isPro = false;
                c10094l.billing = true;
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                List listM3338public = AbstractC12024l.m3338public((String) obj, new String[]{"//"}, 6);
                AbstractC7462l.loadAd.put(listM3338public.get(0), listM3338public.get(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((String) entry2.getKey()) + "//" + ((String) entry2.getValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List listM3338public2 = AbstractC12024l.m3338public((String) obj, new String[]{"||"}, 6);
                AbstractC8474l.loadAd.put(listM3338public2.get(0), listM3338public2.get(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Map.Entry entry3 = (Map.Entry) obj;
                return ((String) entry3.getKey()) + "||" + ((String) entry3.getValue());
            case 20:
                return C18454l.f36051l;
            case 21:
                return ((Genre) obj).loadAd;
            case 22:
                InterfaceC4191l interfaceC4191l = (InterfaceC4191l) obj;
                int i5 = AbstractC8058l.yandex;
                Context context = (Context) interfaceC4191l.mo539this(AbstractC1242l.loadAd);
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) interfaceC4191l.mo539this(AbstractC4751l.admob);
                C9344l c9344l = (C9344l) interfaceC4191l.mo539this(AbstractC14340l.yandex);
                if (c9344l == null) {
                    return null;
                }
                return new C13075l(context, interfaceC13490l, c9344l.yandex, c9344l.loadAd);
            case 23:
                throw AbstractC12589l.signatures(obj);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                throw AbstractC12589l.signatures(obj);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                throw AbstractC12589l.signatures(obj);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                throw AbstractC12589l.signatures(obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((AbstractC1401l) obj).yandex;
            default:
                C0876l c0876l = (C0876l) obj;
                StringBuilder sb = new StringBuilder("position ");
                sb.append(c0876l.yandex);
                sb.append(": '");
                return AbstractC2812l.tapsense(sb, (String) c0876l.loadAd.invoke(), '\'');
        }
    }

    public /* synthetic */ C1306l(int i) {
        this.f3398l = i;
    }
}
