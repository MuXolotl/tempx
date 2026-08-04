package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* JADX INFO: renamed from: lؘِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16931l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33014l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33015l;

    public /* synthetic */ C16931l(int i, Object obj) {
        this.f33015l = i;
        this.f33014l = obj;
    }

    private final Object yandex(Object obj) {
        C0298l c0298l = (C0298l) this.f33014l;
        synchronized (c0298l.mopub) {
            C8080l c8080l = c0298l.subs;
            Object obj2 = c8080l.loadAd;
            int i = c8080l.amazon;
            C7661l c7661l = c8080l.crashlytics;
            if (c7661l == null) {
                c7661l = new C7661l();
                c8080l.crashlytics = c7661l;
                c8080l.billing.vip(obj2, c7661l);
                Unit unit = Unit.INSTANCE;
            }
            c8080l.loadAd(obj, i, obj2, c7661l);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.concurrent.CancellationException] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CancellationException cancellationException;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        ?? Yandex = 0;
        switch (this.f33015l) {
            case 0:
                C6148l c6148l = (C6148l) obj;
                c6148l.pro(((C7473l) this.f33014l).purchase.admob() - Float.intBitsToFloat((int) (4294967295L & c6148l.f12958l)));
                return Unit.INSTANCE;
            case 1:
                InterfaceC6477l interfaceC6477l = (InterfaceC6477l) this.f33014l;
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                if (interfaceC6477l.invoke() > 0.0f) {
                    AbstractC3668l.smaato(interfaceC17593l, new C14519l(interfaceC6477l.invoke(), new C12015l(0.0f, 1.0f), 0));
                }
                return Unit.INSTANCE;
            case 2:
                C3244l c3244l = (C3244l) this.f33014l;
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj;
                if (c3244l.yandex != ((int) (interfaceC18212l.smaato() & 4294967295L))) {
                    c3244l.yandex = (int) (4294967295L & interfaceC18212l.smaato());
                }
                return Unit.INSTANCE;
            case 3:
                C9455l c9455l = (C9455l) this.f33014l;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-797765402, true, new C9207l(c9455l, z4 ? 1 : 0)), 3);
                List list = (List) c9455l.f19313l.getValue();
                c1336l.firebase(list.size(), null, new C13512l(list, 16, z3 ? 1 : 0), new C15578l(802480018, true, new C6780l(list, c9455l, 21)));
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC4447l.admob, 3);
                return Unit.INSTANCE;
            case 4:
                C0535l c0535l = (C0535l) this.f33014l;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if (th instanceof CancellationException) {
                        cancellationException = (CancellationException) th;
                    }
                    if (Yandex == 0) {
                        String message = th.getMessage();
                        if (message == null) {
                            Yandex = cancellationException;
                            message = "Channel was cancelled";
                        }
                        Yandex = cancellationException;
                        Yandex = AbstractC4952l.yandex(message, th);
                    }
                    Yandex = cancellationException;
                    if (c0535l.crashlytics == null) {
                        c0535l.crashlytics = new C15957l(Yandex);
                        c0535l.loadAd.close();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                C15602l c15602l = (C15602l) this.f33014l;
                AbstractC10999l.mopub(c15602l, null, 0, new C7226l((AudioTrack) obj, c15602l, Yandex, 10), 3);
                return Unit.INSTANCE;
            case 6:
                ((C6931l) this.f33014l).isVip(obj);
                return Unit.INSTANCE;
            case 7:
                C4791l c4791l = (C4791l) this.f33014l;
                Throwable th2 = (Throwable) obj;
                CancellationException cancellationExceptionYandex = AbstractC4952l.yandex("Recomposer effect job completed", th2);
                synchronized (c4791l.amazon) {
                    try {
                        InterfaceC7042l interfaceC7042l = c4791l.purchase;
                        if (interfaceC7042l != null) {
                            C1008l c1008l = c4791l.license;
                            EnumC6767l enumC6767l = EnumC6767l.f14179l;
                            c1008l.getClass();
                            c1008l.remoteconfig(null, enumC6767l);
                            interfaceC7042l.ads(cancellationExceptionYandex);
                            c4791l.subscription = null;
                            interfaceC7042l.mo2154l(new C8854l(c4791l, th2, 29));
                        } else {
                            c4791l.billing = cancellationExceptionYandex;
                            C1008l c1008l2 = c4791l.license;
                            EnumC6767l enumC6767l2 = EnumC6767l.f14180l;
                            c1008l2.getClass();
                            c1008l2.remoteconfig(null, enumC6767l2);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                ((InputConnectionC8406l) this.f33014l).yandex((InterfaceC3442l) obj);
                return Unit.INSTANCE;
            case 9:
                InterfaceC10315l interfaceC10315l = (InterfaceC10315l) this.f33014l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj;
                if (interfaceC8714l instanceof InterfaceC0938l) {
                    InterfaceC0938l interfaceC0938l = (InterfaceC0938l) interfaceC8714l;
                    return new C10086l(interfaceC0938l.getValue() != null ? interfaceC10315l.billing(interfaceC0938l.getValue()) : null, interfaceC0938l.loadAd());
                }
                C8339l.metrica("Failed requirement.");
                return null;
            case 10:
                AbstractC2576l.loadAd((InterfaceC13349l) obj, (C11925l) this.f33014l);
                return Unit.INSTANCE;
            case 11:
                AbstractC2576l.loadAd((InterfaceC13349l) obj, ((C17869l) this.f33014l).mopub);
                return Unit.INSTANCE;
            case 12:
                ((C3512l) this.f33014l).mopub = (C11442l) obj;
                return Unit.INSTANCE;
            case 13:
                C2234l c2234l = (C2234l) ((InterfaceC11641l) obj);
                c2234l.f4916l.add((C11266l) this.f33014l);
                c2234l.f4919l = null;
                return Unit.INSTANCE;
            case 14:
                InterfaceC2449l interfaceC2449l = ((C8874l) this.f33014l).f18240l;
                return Boolean.valueOf(interfaceC2449l != null ? interfaceC2449l.crashlytics(obj) : true);
            case 15:
                C11194l c11194l = (C11194l) this.f33014l;
                float fFloatValue = ((Float) obj).floatValue();
                C15308l c15308l = c11194l.yandex;
                float fAdmob = c15308l.admob() + fFloatValue + c11194l.mopub;
                float fAmazon = AbstractC8576l.amazon(fAdmob, 0.0f, c11194l.billing.admob());
                boolean z5 = fAdmob == fAmazon;
                float fAdmob2 = fAmazon - c15308l.admob();
                int iRound = Math.round(fAdmob2);
                c15308l.subs(c15308l.admob() + iRound);
                c11194l.mopub = fAdmob2 - iRound;
                if (!z5) {
                    fFloatValue = fAdmob2;
                }
                return Float.valueOf(fFloatValue);
            case 16:
                C4154l c4154l = (C4154l) this.f33014l;
                return new C1187l(c4154l.amazon(c4154l.firebase, ((C1187l) obj).yandex, c4154l.isPro));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C11446l) this.f33014l).smaato.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0358l c0358l = (C0358l) this.f33014l;
                if (!((EnumC11822l) obj).loadAd()) {
                    c0358l.loadAd.premium(-1);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C15730l c15730l = (C15730l) obj;
                if (((InterfaceC17435l) this.f33014l).yandex(c15730l.crashlytics)) {
                    c15730l.yandex();
                }
                return Unit.INSTANCE;
            case 20:
                C9122l c9122l = (C9122l) this.f33014l;
                if (((C3737l) obj).billing.yandex.yandex.f7563l.length() > 0) {
                    c9122l.f18750l = false;
                }
                return Unit.INSTANCE;
            case 21:
                ((InterfaceC7042l) this.f33014l).ads(null);
                return Unit.INSTANCE;
            case 22:
                C8316l c8316l = (C8316l) this.f33014l;
                AbstractC18082l abstractC18082l = c8316l.crashlytics;
                ((C1336l) obj).firebase(abstractC18082l.pro(), null, new C13512l(abstractC18082l, 26, z2), new C15578l(802480018, true, new C6780l(abstractC18082l, c8316l, 28)));
                return Unit.INSTANCE;
            case 23:
                ShortcutBridgeActivity shortcutBridgeActivity = (ShortcutBridgeActivity) this.f33014l;
                int i = ShortcutBridgeActivity.f36646l;
                List list2 = (List) ((VKResponseWithItems) obj).yandex;
                if (list2 == null) {
                    return Unit.INSTANCE;
                }
                shortcutBridgeActivity.loadAd(new C13099l(list2));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                try {
                    Runtime.getRuntime().removeShutdownHook((C12889l) this.f33014l);
                    break;
                } catch (IllegalStateException unused) {
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C16859l c16859l = (C16859l) this.f33014l;
                InterfaceC0389l interfaceC0389l = c16859l.billing;
                if (!AbstractC8576l.yandex(interfaceC0389l, interfaceC0389l)) {
                    AbstractC5363l.loadAd("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                C6295l c6295l = c16859l.purchase;
                Object obj2 = c16859l.crashlytics;
                if (c6295l != null) {
                    if (obj2 != null) {
                        AbstractC5363l.loadAd("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    c6295l.yandex(obj);
                } else if (obj2 == null) {
                    c16859l.crashlytics = obj;
                } else {
                    C6295l c6295l2 = AbstractC13087l.yandex;
                    C6295l c6295l3 = new C6295l();
                    c6295l3.yandex(obj2);
                    c6295l3.yandex(obj);
                    c16859l.purchase = c6295l3;
                    c16859l.crashlytics = null;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C12418l c12418l = (C12418l) this.f33014l;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC12027l.amazon, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-1901994032, true, new C11299l(c12418l, z ? 1 : 0)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC12027l.billing, 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(983252622, true, new C11299l(c12418l, 2)), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(AbstractC8576l.yandex(((C5078l) obj).yandex, (C15851l) this.f33014l));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return yandex(obj);
            default:
                ((AbstractC12295l) this.f33014l).m3372continue();
                return Unit.INSTANCE;
        }
    }
}
