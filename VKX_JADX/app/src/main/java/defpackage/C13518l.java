package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13518l implements InterfaceC13390l {
    public static final C3624l admob;
    public static final C3498l mopub;
    public final C2278l crashlytics;
    public final Function1 loadAd;
    public final C10202l yandex;
    public static final /* synthetic */ InterfaceC13922l[] purchase = {new C0544l(C13518l.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final C6760l amazon = new C6760l(4);
    public static final C2312l billing = AbstractC3974l.firebase;

    static {
        C16781l c16781l = AbstractC3333l.crashlytics;
        mopub = c16781l.mopub();
        C2312l c2312lSubs = c16781l.subs();
        admob = new C3624l(c2312lSubs.loadAd(), c2312lSubs.yandex.mopub());
    }

    public C13518l(C16412l c16412l, C10202l c10202l) {
        C2100l c2100l = C2100l.f4717l;
        this.yandex = c10202l;
        this.loadAd = c2100l;
        this.crashlytics = new C2278l(c16412l, new C0340l(this, c16412l, false, 26));
    }

    @Override // defpackage.InterfaceC13390l
    public final boolean crashlytics(C2312l c2312l, C3498l c3498l) {
        return c3498l.equals(mopub) && c2312l.equals(billing);
    }

    @Override // defpackage.InterfaceC13390l
    public final Collection loadAd(C2312l c2312l) {
        if (!c2312l.equals(billing)) {
            return C5746l.f12138l;
        }
        InterfaceC13922l interfaceC13922l = purchase[0];
        return Collections.singleton((C5188l) this.crashlytics.invoke());
    }

    @Override // defpackage.InterfaceC13390l
    public final InterfaceC17477l yandex(C3624l c3624l) {
        if (!c3624l.equals(admob)) {
            return null;
        }
        InterfaceC13922l interfaceC13922l = purchase[0];
        return (C5188l) this.crashlytics.invoke();
    }
}
