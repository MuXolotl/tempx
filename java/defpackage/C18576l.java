package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18576l implements InterfaceC17955l {
    public final C8610l crashlytics;
    public final C8610l loadAd;
    public final /* synthetic */ InterfaceC17955l yandex;

    public C18576l(InterfaceC17955l interfaceC17955l, final C15271l c15271l) {
        this.yandex = interfaceC17955l;
        final int i = 0;
        this.loadAd = AbstractC8020l.mopub(new Function0() { // from class: lِٞۛ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C15271l c15271l2 = c15271l;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(c15271l2.yandex.admob() < c15271l2.loadAd.admob());
                    default:
                        return Boolean.valueOf(c15271l2.yandex.admob() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.crashlytics = AbstractC8020l.mopub(new Function0() { // from class: lِٞۛ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C15271l c15271l2 = c15271l;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(c15271l2.yandex.admob() < c15271l2.loadAd.admob());
                    default:
                        return Boolean.valueOf(c15271l2.yandex.admob() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean amazon() {
        return ((Boolean) this.loadAd.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean crashlytics() {
        return ((Boolean) this.crashlytics.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final Object loadAd(EnumC11011l enumC11011l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        return this.yandex.loadAd(enumC11011l, function2, interfaceC14029l);
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return this.yandex.purchase(f);
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return this.yandex.yandex();
    }
}
