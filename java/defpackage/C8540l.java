package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8540l extends AbstractC5189l {
    public final Object crashlytics;
    public final /* synthetic */ int loadAd = 1;

    public C8540l(Function1 function1) {
        super(new C11200l(24));
        this.crashlytics = new C3993l(function1);
    }

    @Override // defpackage.AbstractC5189l
    public InterfaceC2180l loadAd() {
        switch (this.loadAd) {
            case 0:
                return (C3993l) this.crashlytics;
            default:
                return super.loadAd();
        }
    }

    @Override // defpackage.AbstractC5189l
    public final C10092l yandex(Object obj) {
        switch (this.loadAd) {
            case 0:
                return new C10092l(this, obj, obj == null, null, null, true);
            default:
                return new C10092l(this, obj, obj == null, (InterfaceC6642l) this.crashlytics, null, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8540l(Function0 function0) {
        super(function0);
        C7472l c7472l = C7472l.f15463l;
        this.crashlytics = c7472l;
    }
}
