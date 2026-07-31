package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؒۡؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1391l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f3549l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3550l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3551l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1391l(C9879l c9879l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f3550l = i;
        this.f3549l = c9879l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3550l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C9879l c9879l = this.f3549l;
        int i2 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f3551l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7206l c7206l = C7206l.yandex;
                    if (!C7206l.crashlytics(EnumC10788l.f21805l)) {
                        C15178l c15178l = c9879l.firebase;
                        this.f3551l = 1;
                        if (c15178l.crashlytics(EnumC11011l.f22182l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f3551l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i4 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                String str = ((UmaTrack) c9879l.isPro().loadAd).tapsense;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                C16534l c16534l = new C16534l(new String[]{str});
                this.f3551l = 1;
                obj = AbstractC8189l.admob(c16534l, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4217extends((List) obj);
                if (audioTrack != null) {
                    C16552l c16552l = AbstractC11463l.yandex;
                    C2975l c2975l = AbstractC17278l.yandex;
                    C1572l c1572l = new C1572l(c9879l, audioTrack, interfaceC14029l, 0);
                    this.f3551l = 2;
                    if (AbstractC10999l.firebase(c2975l, c1572l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f3551l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i5 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                String str2 = ((UmaTrack) c9879l.isPro().loadAd).tapsense;
                if (str2 == null) {
                    return Unit.INSTANCE;
                }
                C16534l c16534l2 = new C16534l(new String[]{str2});
                this.f3551l = 1;
                obj = AbstractC8189l.admob(c16534l2, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AudioTrack audioTrack2 = (AudioTrack) AbstractC16901l.m4217extends((List) obj);
                if (audioTrack2 != null) {
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    C2975l c2975l2 = AbstractC17278l.yandex;
                    C1572l c1572l2 = new C1572l(c9879l, audioTrack2, interfaceC14029l, i2);
                    this.f3551l = 2;
                    if (AbstractC10999l.firebase(c2975l2, c1572l2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f3550l) {
            case 0:
                return new C1391l(this.f3549l, interfaceC14029l, 0);
            case 1:
                return new C1391l(this.f3549l, interfaceC14029l, 1);
            default:
                return new C1391l(this.f3549l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f3550l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C1391l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
