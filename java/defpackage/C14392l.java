package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lٓۙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14392l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f28137l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f28138l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28139l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f28140l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f28141l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Function1 f28142l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ String f28143l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f28144l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public AudioPlaylist f28145l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14392l(InterfaceC14029l interfaceC14029l, long j, int i, String str, Function1 function1) {
        super(2, interfaceC14029l);
        this.f28138l = j;
        this.f28139l = i;
        this.f28143l = str;
        this.f28140l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i;
        AudioPlaylist audioPlaylist;
        Function1 function1;
        int i2 = this.f28141l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.f28137l;
                AbstractC2829l.crashlytics(obj);
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function1 = this.f28142l;
                audioPlaylist = this.f28145l;
                AbstractC2829l.crashlytics(obj);
            }
            function1.invoke(new C8195l(audioPlaylist, obj));
            return Unit.INSTANCE;
        }
        AbstractC2829l.crashlytics(obj);
        C16534l c16534l = new C16534l(this.f28138l, this.f28139l, this.f28143l);
        this.f28144l = null;
        i = 0;
        this.f28137l = 0;
        this.f28141l = 1;
        obj = AbstractC8189l.admob(c16534l, this);
        if (obj != enumC9342l) {
        }
        return enumC9342l;
        AudioPlaylist audioPlaylist2 = (AudioPlaylist) obj;
        C17632l c17632l = C17632l.f34315l;
        this.f28144l = null;
        this.f28145l = audioPlaylist2;
        Function1 function2 = this.f28140l;
        this.f28142l = function2;
        this.f28137l = i;
        this.f28141l = 2;
        c17632l.getClass();
        Object objYandex = c17632l.yandex(audioPlaylist2.amazon, audioPlaylist2.crashlytics, audioPlaylist2.pro, this);
        if (objYandex != enumC9342l) {
            obj = objYandex;
            audioPlaylist = audioPlaylist2;
            function1 = function2;
            function1.invoke(new C8195l(audioPlaylist, obj));
            return Unit.INSTANCE;
        }
        return enumC9342l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C14392l c14392l = new C14392l(interfaceC14029l, this.f28138l, this.f28139l, this.f28143l, this.f28140l);
        c14392l.f28144l = obj;
        return c14392l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14392l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
