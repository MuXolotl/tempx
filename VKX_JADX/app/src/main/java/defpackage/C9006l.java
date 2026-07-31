package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٌۘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9006l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f18565l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18566l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18567l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9006l(AudioTrack audioTrack, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18566l = i;
        this.f18565l = audioTrack;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f18566l;
        int i2 = 9;
        AudioTrack audioTrack = this.f18565l;
        Object obj2 = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f18567l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18567l = 1;
                    C16552l c16552l = AbstractC11463l.yandex;
                    Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C15556l(audioTrack, interfaceC14029l, 17), this);
                    if (objFirebase != obj2) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == obj2) {
                        return obj2;
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
                int i4 = this.f18567l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C13602l c13602l = C13602l.yandex;
                this.f18567l = 1;
                Object objLoadAd = c13602l.loadAd(audioTrack, this);
                return objLoadAd == obj2 ? obj2 : objLoadAd;
            case 2:
                int i5 = this.f18567l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C3694l c3694l = C3694l.yandex;
                this.f18567l = 1;
                Object objAdmob = AbstractC11990l.admob(new C0469l(audioTrack, interfaceC14029l, i2), this);
                return objAdmob == obj2 ? obj2 : objAdmob;
            default:
                int i6 = this.f18567l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C3694l c3694l2 = C3694l.yandex;
                this.f18567l = 1;
                Object objAdmob2 = AbstractC11990l.admob(new C0469l(audioTrack, interfaceC14029l, i2), this);
                return objAdmob2 == obj2 ? obj2 : objAdmob2;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f18566l) {
            case 0:
                return new C9006l(this.f18565l, interfaceC14029l, 0);
            case 1:
                return new C9006l(this.f18565l, interfaceC14029l, 1);
            case 2:
                return new C9006l(this.f18565l, interfaceC14029l, 2);
            default:
                return new C9006l(this.f18565l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18566l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C9006l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
