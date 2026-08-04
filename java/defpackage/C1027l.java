package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lْؒۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1027l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2857l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2858l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2859l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2860l;

    public /* synthetic */ C1027l(C2814l c2814l, EnumC12111l enumC12111l, boolean z) {
        this.f2859l = 1;
        this.f2857l = c2814l;
        this.f2860l = enumC12111l;
        this.f2858l = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f2859l;
        int i2 = 1;
        int i3 = 0;
        Object obj = this.f2860l;
        Object obj2 = this.f2857l;
        boolean z = this.f2858l;
        switch (i) {
            case 0:
                C7721l c7721l = (C7721l) obj2;
                AudioTrack audioTrack = (AudioTrack) obj;
                InterfaceC14029l interfaceC14029l = null;
                if (z) {
                    c7721l.getClass();
                    AbstractC10999l.mopub(c7721l, null, 0, new C2246l(audioTrack, c7721l, interfaceC14029l, i2), 3);
                } else {
                    c7721l.getClass();
                    AbstractC10999l.mopub(c7721l, null, 0, new C2246l(audioTrack, c7721l, interfaceC14029l, i3), 3);
                }
                break;
            case 1:
                C2814l c2814l = (C2814l) obj2;
                ((NextDockView) c2814l.yandex.f36640l.f15742l).loadAd(String.valueOf(AbstractC8669l.m2398catch(EnumC12111l.f24079l, (EnumC12111l[]) c2814l.loadAd.f833l)), true, false);
                c2814l.purchase((EnumC12111l) obj, z);
                break;
            default:
                C15413l c15413l = (C15413l) obj2;
                C4456l c4456l = (C4456l) obj;
                if (z) {
                    c15413l.amazon.invoke(c4456l);
                } else {
                    new C14107l().Signature(c4456l.f5081l);
                    c4456l.purchase();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1027l(boolean z, Object obj, Object obj2, int i) {
        this.f2859l = i;
        this.f2858l = z;
        this.f2857l = obj;
        this.f2860l = obj2;
    }
}
