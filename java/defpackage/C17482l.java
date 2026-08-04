package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17482l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14830l f34047l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34048l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17482l(C14830l c14830l, int i) {
        super(0);
        this.f34048l = i;
        this.f34047l = c14830l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f34048l;
        boolean z = false;
        C14830l c14830l = this.f34047l;
        switch (i) {
            case 0:
                return Boolean.valueOf((((C10712l) c14830l.f29033l.getValue()) == null && ((Throwable) c14830l.f29032l.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) c14830l.f29032l.getValue()) != null);
            case 2:
                if (((C10712l) c14830l.f29033l.getValue()) == null && ((Throwable) c14830l.f29032l.getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((C10712l) c14830l.f29033l.getValue()) != null);
        }
    }
}
