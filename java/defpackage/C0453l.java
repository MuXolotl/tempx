package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٜٟؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0453l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f1679l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ DialogC7656l f1680l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ EnumC9931l f1681l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C9401l f1682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453l(DialogC7656l dialogC7656l, Function0 function0, C9401l c9401l, EnumC9931l enumC9931l) {
        super(0);
        this.f1680l = dialogC7656l;
        this.f1679l = function0;
        this.f1682l = c9401l;
        this.f1681l = enumC9931l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f1680l.mopub(this.f1679l, this.f1682l, this.f1681l);
        return Unit.INSTANCE;
    }
}
