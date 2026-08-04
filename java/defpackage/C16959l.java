package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؙٗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16959l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f33072l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33073l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33074l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16959l(PlaybackService playbackService, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33073l = i;
        this.f33072l = playbackService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        long j;
        Object obj2;
        int i = this.f33073l;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        PlaybackService playbackService = this.f33072l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C13572l c13572l = 0;
        switch (i) {
            case 0:
                int i2 = this.f33074l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) PlaybackService.license().f31520l.f3605l).yandex();
                    C7226l c7226l = new C7226l(playbackService, c13572l, 4);
                    this.f33074l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lYandex, c7226l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f33074l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l = C9658l.f19699l;
                    long jTapsense = AbstractC15918l.tapsense(200, EnumC16636l.MILLISECONDS);
                    this.f33074l = 1;
                    if (AbstractC8532l.billing(jTapsense, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C11644l c11644l = playbackService.f36838l;
                if (c11644l == null) {
                    c11644l = null;
                }
                PlaybackService.ads(playbackService, c11644l);
                C13572l c13572l2 = playbackService.f36844l;
                playbackService.isPro(c13572l2 != null ? c13572l2 : 0, true);
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f33074l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2258l c2258l = PlaybackService.license().f31521l;
                    this.f33074l = 1;
                    if (c2258l.crashlytics(this) == enumC9342l) {
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
                int i5 = this.f33074l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l2 = C9658l.f19699l;
                    long jTapsense2 = AbstractC15918l.tapsense(3, enumC16636l);
                    this.f33074l = 1;
                    if (AbstractC8532l.billing(jTapsense2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                int i6 = PlaybackService.f36828l;
                playbackService.Signature().crashlytics = false;
                C13572l c13572l3 = playbackService.f36844l;
                playbackService.isPro(c13572l3 != null ? c13572l3 : null, true);
                return Unit.INSTANCE;
            case 4:
                int i7 = this.f33074l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC17205l interfaceC17205l = PlaybackService.license().f31501l;
                    this.f33074l = 1;
                    if (((C13042l) interfaceC17205l).amazon(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i8 = this.f33074l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l3 = C9658l.f19699l;
                    long jTapsense3 = AbstractC15918l.tapsense(3, enumC16636l);
                    this.f33074l = 1;
                    if (AbstractC8532l.billing(jTapsense3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C13572l c13572l4 = playbackService.f36844l;
                if (c13572l4 == null) {
                    c13572l4 = null;
                }
                if (c13572l4.yandex().mo2792l() == 0) {
                    playbackService.Signature().crashlytics = false;
                    C13572l c13572l5 = playbackService.f36844l;
                    if (c13572l5 == null) {
                        c13572l5 = null;
                    }
                    playbackService.isPro(c13572l5, false);
                    C16076l c16076lLicense = PlaybackService.license();
                    C16811l c16811l = c16076lLicense.f31499l;
                    if (c16811l != null) {
                        c16811l.release();
                    }
                    c16076lLicense.f31499l = null;
                    playbackService.smaato();
                }
                return Unit.INSTANCE;
            case 6:
                int i9 = this.f33074l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4626l c4626l = PlaybackService.license().f31500l;
                    C11644l c11644l2 = playbackService.f36838l;
                    long jMo2771l = ((InterfaceC9814l) ((C9928l) (c11644l2 != null ? c11644l2 : null).f23358l).f33215l).mo2771l();
                    j = jMo2771l >= 0 ? jMo2771l : 0L;
                    this.f33074l = 1;
                    if (c4626l.crashlytics(j, EnumC8376l.f17337l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i9 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 7:
                int i10 = this.f33074l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4626l c4626l2 = PlaybackService.license().f31500l;
                    C11644l c11644l3 = playbackService.f36838l;
                    long jMo2771l2 = ((InterfaceC9814l) ((C9928l) (c11644l3 != null ? c11644l3 : null).f23358l).f33215l).mo2771l();
                    j = jMo2771l2 >= 0 ? jMo2771l2 : 0L;
                    this.f33074l = 1;
                    if (c4626l2.crashlytics(j, EnumC8376l.f17338l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i11 = this.f33074l;
                if (i11 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    int i12 = PlaybackService.f36828l;
                    playbackService.getClass();
                    C4816l c4816l = PlaybackService.license().f31511l;
                    C16076l c16076lLicense2 = PlaybackService.license();
                    this.f33074l = 1;
                    c4816l.getClass();
                    Object objAdmob = AbstractC11990l.admob(new C1914l(c4816l, c16076lLicense2, (InterfaceC14029l) c13572l, 9), this);
                    if (objAdmob != enumC9342l) {
                        obj2 = objAdmob;
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i11 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f33073l;
        PlaybackService playbackService = this.f33072l;
        switch (i) {
            case 0:
                return new C16959l(playbackService, interfaceC14029l, 0);
            case 1:
                return new C16959l(playbackService, interfaceC14029l, 1);
            case 2:
                return new C16959l(playbackService, interfaceC14029l, 2);
            case 3:
                return new C16959l(playbackService, interfaceC14029l, 3);
            case 4:
                return new C16959l(playbackService, interfaceC14029l, 4);
            case 5:
                return new C16959l(playbackService, interfaceC14029l, 5);
            case 6:
                return new C16959l(playbackService, interfaceC14029l, 6);
            case 7:
                return new C16959l(playbackService, interfaceC14029l, 7);
            default:
                return new C16959l(playbackService, interfaceC14029l, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f33073l) {
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
        return ((C16959l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
