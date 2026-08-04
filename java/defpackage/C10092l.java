package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10092l {
    public final Function1 amazon;
    public final Object billing;
    public final InterfaceC6642l crashlytics;
    public final boolean loadAd;
    public boolean mopub = true;
    public final boolean purchase;
    public final AbstractC5189l yandex;

    public C10092l(AbstractC5189l abstractC5189l, Object obj, boolean z, InterfaceC6642l interfaceC6642l, Function1 function1, boolean z2) {
        this.yandex = abstractC5189l;
        this.loadAd = z;
        this.crashlytics = interfaceC6642l;
        this.amazon = function1;
        this.purchase = z2;
        this.billing = obj;
    }

    public final Object yandex() {
        if (this.loadAd) {
            return null;
        }
        Object obj = this.billing;
        if (obj != null) {
            return obj;
        }
        AbstractC2032l.loadAd("Unexpected form of a provided value");
        C17132l.firebase();
        return null;
    }
}
