package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16646l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2077l f32617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32618l;

    public /* synthetic */ C16646l(InterfaceC2077l interfaceC2077l, int i) {
        this.f32618l = i;
        this.f32617l = interfaceC2077l;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        int i = this.f32618l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC2077l interfaceC2077l = this.f32617l;
        switch (i) {
            case 0:
                Object objLoadAd = C9552l.loadAd(interfaceC6843l, interfaceC2077l, interfaceC14029l);
                return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
            default:
                Object objLoadAd2 = C9552l.loadAd(interfaceC6843l, interfaceC2077l, interfaceC14029l);
                return objLoadAd2 == enumC9342l ? objLoadAd2 : Unit.INSTANCE;
        }
    }
}
