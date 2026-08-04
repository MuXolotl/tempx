package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lٍۚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9798l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f19975l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4262l f19976l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19977l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C4262l f19978l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19979l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9798l(PlaybackService playbackService, C4262l c4262l, C4262l c4262l2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f19977l = i;
        this.f19975l = playbackService;
        this.f19976l = c4262l;
        this.f19978l = c4262l2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f19977l;
        C4262l c4262l = this.f19978l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C4262l c4262l2 = this.f19976l;
        switch (i) {
            case 0:
                int i2 = this.f19979l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4626l c4626l = PlaybackService.license().f31500l;
                    C10507l c10507lAdmob = PlaybackService.license().f31521l.admob(new Integer(c4262l2.loadAd));
                    long j = c4262l.billing;
                    this.f19979l = 1;
                    if (c4626l.billing(c10507lAdmob, j, EnumC8098l.f16875l, this) == enumC9342l) {
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
            default:
                int i3 = this.f19979l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4626l c4626l2 = PlaybackService.license().f31500l;
                    C10507l c10507lAdmob2 = PlaybackService.license().f31521l.admob(new Integer(c4262l2.loadAd));
                    long j2 = c4262l.billing;
                    EnumC8098l enumC8098l = c4262l.loadAd < c4262l2.loadAd ? EnumC8098l.f16876l : EnumC8098l.f16877l;
                    this.f19979l = 1;
                    if (c4626l2.billing(c10507lAdmob2, j2, enumC8098l, this) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f19977l) {
            case 0:
                return new C9798l(this.f19975l, this.f19976l, this.f19978l, interfaceC14029l, 0);
            default:
                return new C9798l(this.f19975l, this.f19976l, this.f19978l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f19977l) {
            case 0:
                break;
        }
        return ((C9798l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
