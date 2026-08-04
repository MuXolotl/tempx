package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17791l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C12818l f34654l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f34655l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f34656l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34657l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17791l(InterfaceC17242l interfaceC17242l, C12818l c12818l, boolean z, Function1 function1, int i) {
        super(2);
        this.f34655l = interfaceC17242l;
        this.f34654l = c12818l;
        this.f34657l = z;
        this.f34656l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function1 function1 = this.f34656l;
        AbstractC14312l.yandex(this.f34655l, this.f34654l, this.f34657l, function1, (C6956l) obj, 391);
        return Unit.INSTANCE;
    }
}
