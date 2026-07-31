package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٟٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17313l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f33581l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6497l f33582l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33583l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ String f33584l;

    public /* synthetic */ C17313l(InterfaceC6497l interfaceC6497l, Function1 function1, String str, int i) {
        this.f33583l = i;
        this.f33582l = interfaceC6497l;
        this.f33581l = function1;
        this.f33584l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33583l) {
            case 0:
                AbstractC2812l.mopub(this.f33582l);
                this.f33581l.invoke(this.f33584l);
                break;
            default:
                AbstractC2812l.mopub(this.f33582l);
                this.f33581l.invoke(this.f33584l);
                break;
        }
        return Unit.INSTANCE;
    }
}
