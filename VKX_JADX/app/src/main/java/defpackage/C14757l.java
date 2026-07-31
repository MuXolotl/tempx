package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: lًٍٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14757l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f28826l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f28827l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f28828l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28829l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f28830l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f28831l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6940l f28832l;

    public C14757l(boolean z, float f, InterfaceC8714l interfaceC8714l, InterfaceC12244l interfaceC12244l, InterfaceC2262l interfaceC2262l, InterfaceC6940l interfaceC6940l, InterfaceC8714l interfaceC8714l2) {
        this.f28829l = z;
        this.f28828l = f;
        this.f28826l = interfaceC8714l;
        this.f28831l = interfaceC12244l;
        this.f28830l = interfaceC2262l;
        this.f28832l = interfaceC6940l;
        this.f28827l = interfaceC8714l2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC6843l interfaceC6843l, InterfaceC14029l interfaceC14029l) {
        Object objPurchase = AbstractC18112l.purchase(interfaceC6843l, new C14939l(this.f28829l, this.f28828l, this.f28826l, this.f28831l, null), new C6411l(this.f28830l, this.f28832l, this.f28827l, 8), interfaceC14029l, 3);
        return objPurchase == EnumC9342l.f19165l ? objPurchase : Unit.INSTANCE;
    }
}
