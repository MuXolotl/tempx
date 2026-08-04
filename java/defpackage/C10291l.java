package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lَّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10291l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20973l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f20974l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20975l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20976l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10291l(InterfaceC14029l interfaceC14029l, String str, boolean z) {
        super(2, interfaceC14029l);
        this.f20975l = 1;
        this.f20974l = str;
        this.f20973l = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f20975l;
        Object obj2 = this.f20974l;
        boolean z = this.f20973l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C11644l c11644l = 0;
        C3625l c3625lCrashlytics = null;
        switch (i) {
            case 0:
                int i2 = this.f20976l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3601l;
                    this.f20976l = 1;
                    if (interfaceC15829l.loadAd(new C8751l(z, c11644l, 17), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                AppActivity appActivity = (AppActivity) ((C18159l) obj2).isVip();
                AbstractC11708l.yandex(new Ctry(appActivity, new C10734l(null, appActivity.getString(R.string.notification), appActivity.getString(R.string.restart_prompt), new C8195l(appActivity.getString(R.string.restart_act), new C7282l(3)), null, 241), 4));
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f20976l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16552l c16552l = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                    C8122l c8122l = new C8122l(null, (String) obj2, z);
                    this.f20976l = 1;
                    if (AbstractC10999l.firebase(executorC6708l, c8122l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f20976l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20976l = 1;
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18523l(z, (AudioTrack) obj2, (InterfaceC14029l) null), this);
                    if (objFirebase != enumC9342l) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                int i5 = this.f20976l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (z) {
                        int i6 = C11749l.f23527l;
                        if (!((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                            C6760l c6760l = C9658l.f19699l;
                            if (Double.isNaN(3.0E8d)) {
                                C8339l.metrica("Duration value cannot be NaN.");
                                return null;
                            }
                            long jSubscription = AbstractC5573l.subscription(3.0E8d);
                            long jFirebase = (-4611686018426999999L > jSubscription || jSubscription >= 4611686018427000000L) ? AbstractC15918l.firebase(AbstractC5573l.subscription(300.0d)) : AbstractC15918l.smaato(jSubscription);
                            this.f20976l = 1;
                            if (AbstractC8532l.billing(jFirebase, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            int i7 = C11749l.f23527l;
                            interfaceC8714l.setValue(Boolean.TRUE);
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    int i8 = C11749l.f23527l;
                    interfaceC8714l.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 4:
                PlaybackService playbackService = (PlaybackService) obj2;
                int i9 = this.f20976l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (z) {
                        C4626l c4626l = PlaybackService.license().f31500l;
                        C11644l c11644l2 = playbackService.f36838l;
                        long jMo2771l = ((InterfaceC9814l) ((C9928l) (c11644l2 != null ? c11644l2 : null).f23358l).f33215l).mo2771l();
                        this.f20976l = 1;
                        if (c4626l.amazon(jMo2771l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        C4626l c4626l2 = PlaybackService.license().f31500l;
                        C11644l c11644l3 = playbackService.f36838l;
                        long jMo2771l2 = ((InterfaceC9814l) ((C9928l) (c11644l3 != null ? c11644l3 : 0).f23358l).f33215l).mo2771l();
                        this.f20976l = 2;
                        if (c4626l2.loadAd(jMo2771l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i9 != 1 && i9 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i10 = ((RadioStation) obj2).yandex;
                int i11 = this.f20976l;
                if (i11 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (z) {
                        C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                        this.f20976l = 1;
                        C17464l c17464l = new C17464l("audio.followRadioStation", C6928l.f14519l);
                        c17464l.loadAd(i10, "station_id");
                        obj = c7644lLoadAd.billing(c17464l, this);
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
                        this.f20976l = 2;
                        C17464l c17464l2 = new C17464l("audio.unfollowRadioStation", C18450l.f36037l);
                        c17464l2.loadAd(i10, "station_id");
                        obj = c7644lLoadAd2.billing(c17464l2, this);
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else if (i11 == 1) {
                    AbstractC2829l.crashlytics(obj);
                } else {
                    if (i11 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 6:
                int i12 = this.f20976l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (z) {
                        this.f20976l = 1;
                        if (AbstractC8532l.purchase(100L, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i12 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                AbstractC2812l.mopub((InterfaceC6497l) obj2);
                return Unit.INSTANCE;
            case 7:
                C16173l c16173l = (C16173l) obj2;
                int i13 = this.f20976l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (!C12814l.amazon(c16173l.vip().loadAd)) {
                        c3625lCrashlytics = AbstractC15439l.crashlytics(c16173l.vip());
                        if (z) {
                            int iBilling = C12814l.billing(c16173l.vip().loadAd);
                            c16173l.crashlytics.invoke(C16173l.purchase(c16173l.vip().yandex, AbstractC2296l.loadAd(iBilling, iBilling)));
                            c16173l.adcel(EnumC7170l.f15004l);
                        }
                    }
                    if (c3625lCrashlytics == null) {
                        return Unit.INSTANCE;
                    }
                    InterfaceC7948l interfaceC7948l = c16173l.mopub;
                    if (interfaceC7948l != null) {
                        C11848l c11848lAmazon = AbstractC3124l.amazon(c3625lCrashlytics);
                        this.f20976l = 1;
                        if (((C8231l) interfaceC7948l).yandex(c11848lAmazon) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i14 = this.f20976l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC15829l interfaceC15829l2 = (InterfaceC15829l) AbstractC16584l.crashlytics().f3601l;
                    this.f20976l = 1;
                    if (interfaceC15829l2.loadAd(new C8751l(z, c11644l, 20), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C0072l.m269abstract((C0072l) obj2);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f20975l;
        Object obj2 = this.f20974l;
        boolean z = this.f20973l;
        switch (i) {
            case 0:
                return new C10291l(z, (C18159l) obj2, interfaceC14029l, 0);
            case 1:
                return new C10291l(interfaceC14029l, (String) obj2, z);
            case 2:
                return new C10291l((AudioTrack) obj2, z, interfaceC14029l, 2);
            case 3:
                return new C10291l(z, (InterfaceC8714l) obj2, interfaceC14029l, 3);
            case 4:
                return new C10291l(z, (PlaybackService) obj2, interfaceC14029l, 4);
            case 5:
                return new C10291l(z, (RadioStation) obj2, interfaceC14029l, 5);
            case 6:
                return new C10291l(z, (InterfaceC6497l) obj2, interfaceC14029l, 6);
            case 7:
                return new C10291l((C16173l) obj2, z, interfaceC14029l, 7);
            default:
                return new C10291l(z, (C0072l) obj2, interfaceC14029l, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f20975l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((C10291l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10291l(Object obj, boolean z, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f20975l = i;
        this.f20974l = obj;
        this.f20973l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10291l(boolean z, Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f20975l = i;
        this.f20973l = z;
        this.f20974l = obj;
    }
}
