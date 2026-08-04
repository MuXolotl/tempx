package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؙٛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6586l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7721l f13801l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f13802l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f13803l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6586l(C7721l c7721l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f13802l = i;
        this.f13801l = c7721l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f13802l;
        Object obj2 = EnumC9342l.f19165l;
        C7721l c7721l = this.f13801l;
        switch (i) {
            case 0:
                int i2 = this.f13803l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (c7721l.f16203l.isEmpty()) {
                        this.f13803l = 1;
                        if (C7721l.m2203instanceof(c7721l, this) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f13803l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) AbstractC16901l.m4220for(c7721l.f16211l.admob(), c7721l.f16203l);
                    if (audioSnippetEntry == null) {
                        return Unit.INSTANCE;
                    }
                    AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4220for(c7721l.f16199l.admob(), audioSnippetEntry.mopub);
                    if (audioTrack == null) {
                        return Unit.INSTANCE;
                    }
                    C14004l c14004l = new C14004l(audioSnippetEntry.admob, audioSnippetEntry.loadAd);
                    C13305l c13305l = new C13305l(new C11392l(AbstractC16676l.billing(audioTrack)), 0L, null, false, false, false, 126);
                    this.f13803l = 1;
                    Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(c13305l, c14004l, (InterfaceC14029l) null, 2), this);
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
                c7721l.m2205finally();
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f13802l;
        C7721l c7721l = this.f13801l;
        switch (i) {
            case 0:
                return new C6586l(c7721l, interfaceC14029l, 0);
            default:
                return new C6586l(c7721l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f13802l) {
            case 0:
                break;
        }
        return ((C6586l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
