package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؓۦؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2246l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7721l f4930l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4931l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f4932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2246l(AudioTrack audioTrack, C7721l c7721l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f4931l = i;
        this.f4932l = audioTrack;
        this.f4930l = c7721l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f4931l;
        C7721l c7721l = this.f4930l;
        AudioTrack audioTrack = this.f4932l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                audioTrack.crashlytics(true);
                c7721l.f16201l.add(AbstractC16676l.mopub(audioTrack));
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                audioTrack.crashlytics(false);
                c7721l.f16201l.remove(AbstractC16676l.mopub(audioTrack));
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f4931l) {
            case 0:
                return new C2246l(this.f4932l, this.f4930l, interfaceC14029l, 0);
            default:
                return new C2246l(this.f4932l, this.f4930l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f4931l) {
            case 0:
                break;
        }
        return ((C2246l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
