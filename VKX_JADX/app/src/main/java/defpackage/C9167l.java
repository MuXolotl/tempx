package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۥؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9167l extends C11268l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14029l f18865l;

    public C9167l(InterfaceC12932l interfaceC12932l, Function2 function2) {
        super(interfaceC12932l, false);
        this.f18865l = AbstractC17082l.yandex(this, this, function2);
    }

    @Override // defpackage.C14750l
    /* JADX INFO: renamed from: try */
    public final void mo2299try() {
        try {
            AbstractC9853l.yandex(AbstractC17082l.billing(this.f18865l), Unit.INSTANCE);
        } catch (Throwable th) {
            AbstractC17764l.crashlytics(this, th);
            throw null;
        }
    }
}
