package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٛؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8108l {
    public static final /* synthetic */ InterfaceC13922l[] admob = {AbstractC18202l.yandex.billing(new C0114l(C8108l.class, "isEnabled", "isEnabled()Z", 0))};
    public final /* synthetic */ Function1 amazon;
    public final /* synthetic */ Function0 billing;
    public final C17838l crashlytics;
    public Set loadAd = C5746l.f12138l;
    public final /* synthetic */ Function0 mopub;
    public final /* synthetic */ Function1 purchase;
    public final int yandex;

    public C8108l(boolean z, int i, C0382l c0382l, C17847l c17847l, C6335l c6335l, Function0 function0) {
        this.amazon = c0382l;
        this.purchase = c17847l;
        this.billing = c6335l;
        this.mopub = function0;
        this.yandex = i;
        this.crashlytics = new C17838l(Boolean.valueOf(z), this, 0);
    }
}
