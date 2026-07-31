package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l٘ۧۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18371l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18396l f35886l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f35887l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ String f35888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18371l(boolean z, C18396l c18396l, String str) {
        super(0);
        this.f35887l = z;
        this.f35886l = c18396l;
        this.f35888l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f35887l) {
            C18396l c18396l = this.f35886l;
            String str = this.f35888l;
            C17464l c17464l = (C17464l) c18396l.f35934l;
            synchronized (((C4269l) c17464l.billing)) {
            }
        }
        return Unit.INSTANCE;
    }
}
