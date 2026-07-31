package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3888l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8027l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ View f8028l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f8029l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2449l f8030l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0306l f8031l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f8032l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3888l(Context context, Function1 function1, C14112l c14112l, InterfaceC2449l interfaceC2449l, int i, View view) {
        super(0);
        this.f8029l = context;
        this.f8027l = function1;
        this.f8031l = c14112l;
        this.f8030l = interfaceC2449l;
        this.f8032l = i;
        this.f8028l = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C8464l(this.f8029l, this.f8027l, this.f8031l, this.f8030l, this.f8032l, (InterfaceC11218l) this.f8028l).getLayoutNode();
    }
}
