package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؕؔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3155l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C6111l f6779l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f6780l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6781l = 0;

    public /* synthetic */ C3155l(C6111l c6111l, CachedTrack cachedTrack) {
        this.f6779l = c6111l;
        this.f6780l = cachedTrack;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f6781l;
        C6111l c6111l = this.f6779l;
        CachedTrack cachedTrack = this.f6780l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z = c6111l.m2931abstract() == EnumC11447l.f23032l;
                    AbstractC18643l abstractC18643lM2933instanceof = c6111l.m2933instanceof();
                    C2287l.loadAd(z, AbstractC8576l.yandex(abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null, cachedTrack.premium()), AbstractC14566l.amazon(-1059913845, new C14219l(cachedTrack, 9), c6956l), c6956l, 384);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC5889l.crashlytics(cachedTrack.subs(), false, 0L, c6956l2, 0, 6);
                    boolean zBilling = c6956l2.billing(cachedTrack) | c6956l2.admob(c6111l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        objM2132native = new C4053l(cachedTrack, c6111l);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC11852l.mopub, c6956l2, 1572864, 62);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3155l(CachedTrack cachedTrack, C6111l c6111l) {
        this.f6780l = cachedTrack;
        this.f6779l = c6111l;
    }
}
